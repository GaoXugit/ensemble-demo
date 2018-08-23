/**   
 * <p>Title: Non12009100.java</p>
 * <p>Description: 快速建立客户信息</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author admin
 * @update 20170408
 * @version V1.0
 */
package com.dcits.ensemble.cif.service.mbsdcore;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.cif.api.mbsdcore.ICore12009100;
import com.dcits.ensemble.cif.model.mbsdcore.Core12009100In;
import com.dcits.ensemble.cif.model.mbsdcore.Core12009100Out;
import com.dcits.ensemble.dbmanage.dbmodel.CifClient;
import com.dcits.ensemble.dbmanage.dbmodel.CifClientDocument;
import com.dcits.ensemble.dbmanage.dbmodel.CifClientType;
import com.dcits.ensemble.dbmanage.handle.CifClientDocumentHandle;
import com.dcits.ensemble.dbmanage.handle.CifClientHandle;
import com.dcits.ensemble.dbmanage.inquiry.CifClientInquiry;
import com.dcits.ensemble.dbmanage.inquiry.CifClientTypeInquiry;
import com.dcits.ensemble.sequences.CifSequences;
import com.dcits.ensemble.util.BusiUtil;
import com.dcits.galaxy.business.common.Context;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.util.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/***
 * @description 快速建立客户信息
 * @version V1.0
 * @author admin
 * @update 20170408
 */
@Service
public class Core12009100 extends AbstractService implements ICore12009100 {
	private static final Logger log = LoggerFactory.getLogger(Core12009100.class);

	@Resource
    CifClientHandle cifClientHandle;
	@Resource
    CifClientInquiry cifClientInquiry;
	@Resource
    CifClientDocumentHandle cifClientDocumentHandle;
	@Resource
    CifClientTypeInquiry cifClientTypeInquiry;

	@Override
	public Class<? extends Request> getRequestModel() {
		return Core12009100In.class;
	}

	public BeanResult createClient(Core12009100In in) {
		// 检查
		createCheck(in);
		String clientNo = createProcess(in);

		// 返回
		Core12009100Out out = new Core12009100Out();
		out.setClientNo(clientNo);
		return new BeanResult(out);
	}

	private String createProcess(Core12009100In in) {
		String clientNo = in.getBody().getClientNo();
		if (BusiUtil.isNull(clientNo)) {
			clientNo = CifSequences.generatePrivateClientNo();
		}

		// 数据组装
		// 客户信息组建
		CifClient cifClient = new CifClient();
		cifClient.setClientKey(CifSequences.generatePrivateClientKey());
		cifClient.setClientNo(clientNo);
		cifClient.setClientType(in.getBody().getClientType());
		cifClient.setClientName(in.getBody().getClientName());
		cifClient.setLocation(in.getBody().getLocation());
		cifClient.setAcctExec(in.getBody().getAcctExec());
		cifClient.setCountryLoc(in.getBody().getCountryLoc());
		cifClient.setStateLoc(in.getBody().getStateLoc());
		cifClient.setClientCity(in.getBody().getClientCity());
		cifClient.setCountryCitizen(in.getBody().getCountryCitizen());
		cifClient.setNarrative(in.getBody().getNarrative());
		cifClient.setPostalCode(in.getBody().getPostalCode());
		cifClient.setCreationUser(Context.getInstance().getUserId());
		cifClient.setCreationDate(DateUtils.getDate());

		// 证件信息组装
		List<CifClientDocument> documents = new ArrayList<>();
		CifClientDocument document;
		document = new CifClientDocument();
		for (Core12009100In.Body.DocumentInfo documentInfo : in.getBody().getDocumentInfo()) {
			document.setClientNo(clientNo);
			document.setDocumentId(documentInfo.getDocumentId());
			document.setDocumentType(documentInfo.getDocumentType());
			document.setIssCountry(documentInfo.getIssCountry());
			document.setPrefFlag(documentInfo.getPrefFlag());
			document.setIssPlace(documentInfo.getIssPlace());
			document.setIssAuthority(documentInfo.getIssAuthority());
			document.setIssDate(documentInfo.getIssDate());
			document.setExpiryDate(documentInfo.getExpiryDate());
			if ("Y".equals(documentInfo.getPrefFlag())) {
				cifClient.setGlobalId(documentInfo.getDocumentId());
				cifClient.setGlobalIdType(documentInfo.getDocumentType());
			}
			documents.add(document);
		}

		cifClientHandle.addClientInfo(cifClient);
		cifClientDocumentHandle.addDocumentInfo(documents);
		return clientNo;
	}

	private void createCheck(Core12009100In in) {
		String clientNo = in.getBody().getClientNo();
		if (BusiUtil.isNotNull(clientNo)) {
			CifClient cifClient = cifClientInquiry.selectCifClientByClientNo(clientNo);
			if (null != cifClient) {
				throw BusiUtil.createBusinessException("CI4001");
			}
		}

		if (BusiUtil.isNotNull(in.getBody().getClientType())) {
			CifClientType cifClientType = cifClientTypeInquiry.selectByClientType(in.getBody().getClientType());
			if (null == cifClientType) {
				throw BusiUtil.createBusinessException("CI4000");
			}
		}


		int i = 0;
		for (Core12009100In.Body.DocumentInfo documentInfo : in.getBody().getDocumentInfo()) {
			if ("Y".equals(documentInfo.getPrefFlag())) {
				i++;
			}
		}
		if (i == 0) {
			throw BusiUtil.createBusinessException("CI4002");
		}
		if (i > 1) {
			throw BusiUtil.createBusinessException("CI6000");
		}
	}
}
