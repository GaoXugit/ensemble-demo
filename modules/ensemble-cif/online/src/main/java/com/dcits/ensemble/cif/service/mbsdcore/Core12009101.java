/**   
 * <p>Title: Non12009101.java</p>
 * <p>Description: 快速建立客户信息</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author admin
 * @update 20170408
 * @version V1.0
 */
package com.dcits.ensemble.cif.service.mbsdcore;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.cif.api.mbsdcore.ICore12009101;
import com.dcits.ensemble.cif.model.mbsdcore.Core12009101In;
import com.dcits.ensemble.dbmanage.dbmodel.CifClient9101;
import com.dcits.ensemble.dbmanage.dbmodel.CifClientDocument9101;
import com.dcits.ensemble.dbmanage.handle.CifClient9101Handle;
import com.dcits.ensemble.dbmanage.handle.CifClientDocument9101Handle;
import com.dcits.ensemble.dbmanage.inquiry.CifClient9101Inquiry;
import com.dcits.ensemble.sequences.CifSequences;
import com.dcits.galaxy.business.util.BusinessUtils;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
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
public class Core12009101 extends AbstractService implements ICore12009101 {
	private static final Logger log = LoggerFactory.getLogger(Core12009101.class);

	@Resource
    CifClient9101Inquiry cifClient9101Inquiry;
	@Resource
    CifClient9101Handle cifClient9101Handle;
	@Resource
    CifClientDocument9101Handle cifClientDocument9101Handle;

	@Override
	public Class<? extends Request> getRequestModel() {
		return Core12009101In.class;
	}

	public BeanResult createClient(Core12009101In in) {
		// 检查
		String clientNo = in.getBody().getClientNo();
		if (null != clientNo && !"".equals(clientNo)) {
			CifClient9101 cifClient9101 = cifClient9101Inquiry.selectCifClientByClientNo(clientNo);
			if (null != cifClient9101) {
				throw BusinessUtils.createBusinessException("该客户号已存在！");
			}
		} else {
			clientNo = CifSequences.generatePrivateClientNo();
		}

		CifClient9101 cifClient9101 = new CifClient9101();
//		cifClient9101.setClientKey(CifSequences.generatePrivateClientKey());
		cifClient9101.setClientNo(clientNo);
		cifClient9101.setClientType(in.getBody().getClientType());
		cifClient9101.setClientName(in.getBody().getClientName());

		List<CifClientDocument9101> document9101s = new ArrayList<>();
		CifClientDocument9101 document;
		boolean hasPrefFlag = false;
		document = new CifClientDocument9101();
		for (Core12009101In.Body.DocumentInfo documentInfo : in.getBody().getDocumentInfo()) {
			document.setClientNo(clientNo);
			document.setDocumentId(documentInfo.getDocumentId());
			document.setDocumentType(documentInfo.getDocumentType());
			document.setIssCountry(documentInfo.getIssCountry());
			if ("Y".equals(documentInfo.getPrefFlag())) {
//				cifClient9101.setGlobalId(documentInfo.getDocumentId());
//				cifClient9101.setGlobalIdType(documentInfo.getDocumentType());
				hasPrefFlag = true;
			}
			document9101s.add(document);
		}
		if (!hasPrefFlag) {
			throw BusinessUtils.createBusinessException("无首选证件！");
		}

		cifClient9101Handle.addClientInfo(cifClient9101);
		cifClientDocument9101Handle.addDocumentInfo(document9101s);

		return new BeanResult();
	}
}
