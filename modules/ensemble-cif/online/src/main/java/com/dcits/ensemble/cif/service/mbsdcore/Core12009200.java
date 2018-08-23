/**   
 * <p>Title: Non12009200.java</p>
 * <p>Description: 客户信息维护</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author admin
 * @update 20170410
 * @version V1.0
 */
package com.dcits.ensemble.cif.service.mbsdcore;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.cif.api.mbsdcore.ICore12009200;
import com.dcits.ensemble.cif.model.mbsdcore.Core12009200In;
import com.dcits.ensemble.cif.model.mbsdcore.Core12009200Out;
import com.dcits.ensemble.dbmanage.dbmodel.CifClient;
import com.dcits.ensemble.dbmanage.dbmodel.CifClientDocument;
import com.dcits.ensemble.dbmanage.dbmodel.CifClientType;
import com.dcits.ensemble.dbmanage.handle.CifClientDocumentHandle;
import com.dcits.ensemble.dbmanage.handle.CifClientHandle;
import com.dcits.ensemble.dbmanage.inquiry.CifClientInquiry;
import com.dcits.ensemble.dbmanage.inquiry.CifClientTypeInquiry;
import com.dcits.ensemble.util.BusiUtil;
import com.dcits.galaxy.business.util.BusinessUtils;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.util.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/***
 * @description 客户信息维护
 * @version V1.0
 * @author admin
 * @update 20170410
 */
@Service
public class Core12009200 extends AbstractService implements ICore12009200 {
	private static final Logger log = LoggerFactory.getLogger(Core12009200.class);

	@Resource
    CifClientTypeInquiry cifClientTypeInquiry;
	@Resource
    CifClientInquiry cifClientInquiry;
	@Resource
    CifClientHandle cifClientHandle;
	@Resource
    CifClientDocumentHandle cifClientDocumentHandle;

	@Override
	public Class<? extends Request> getRequestModel() {
		return Core12009200In.class;
	}

	public BeanResult updateClientInfo(Core12009200In in) {
		CifClient cifClient = check(in);
		CifClient newCifClient = new CifClient();
		BeanUtils.copy(in.getBody(), newCifClient);
		newCifClient.setClientKey(cifClient.getClientKey());
		newCifClient.setClientNo(cifClient.getClientNo());
//		newCifClient.setClientName(in.getBody().getClientName());
//		newCifClient.setClientType(in.getBody().getClientType());
//		//.....
//		newCifClient.setUpdateUser(Context.getInstance().getUserId());
//		newCifClient.setUpdateDate(DateUtils.getDate());
		cifClientHandle.updateClientInfo(newCifClient);

		List<Core12009200In.Body.DocumentInfo> documentInfos = in.getBody().getDocumentInfo();
		if (BusiUtil.isNotNull(documentInfos)) {
			for (Core12009200In.Body.DocumentInfo documentInfo : documentInfos) {
				processDocument(cifClient.getClientNo(), documentInfo);
			}
		}

		Core12009200Out out = new Core12009200Out();
		out.setClientNo(cifClient.getClientNo());
		return new BeanResult(out);
	}

	private void processDocument(String clientNo, Core12009200In.Body.DocumentInfo documentInfo) {
		CifClientDocument cifClientDocument = new CifClientDocument();
		BeanUtils.copy(documentInfo, cifClientDocument);
		cifClientDocument.setClientNo(clientNo);
//		cifClientDocument.setDocumentType(documentInfo.getDocumentType());
//		cifClientDocument.setDocumentId(documentInfo.getDocumentId());
//		cifClientDocument.setExpiryDate(documentInfo.getExpiryDate());
		//....
		cifClientDocumentHandle.autoUpdate(cifClientDocument);
	}

	private CifClient check(Core12009200In in) {
		if (BusiUtil.isNotNull(in.getBody().getClientType())) {
			CifClientType cifClientType = cifClientTypeInquiry.selectByClientType(in.getBody().getClientType());
			if (null == cifClientType) {
				throw BusinessUtils.createBusinessException("CI4000");
			}
		}

		String clientNo = in.getBody().getClientNo();
		CifClient cifClient = cifClientInquiry.selectCifClientByClientNo(clientNo);
		if (null == cifClient) {
			throw BusiUtil.createBusinessException("CI4003");
		}
		return cifClient;
	}
}
