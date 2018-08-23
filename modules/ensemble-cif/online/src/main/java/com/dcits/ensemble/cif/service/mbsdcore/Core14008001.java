/**   
 * <p>Title: Inq14008001.java</p>
 * <p>Description: 客户信息查询</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author admin
 * @update 20170410
 * @version V1.0
 */
package com.dcits.ensemble.cif.service.mbsdcore;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.cif.api.mbsdcore.ICore14008001;
import com.dcits.ensemble.cif.model.mbsdcore.Core14008001In;
import com.dcits.ensemble.cif.model.mbsdcore.Core14008001Out;
import com.dcits.ensemble.dbmanage.dbmodel.CifClient9101;
import com.dcits.ensemble.dbmanage.dbmodel.CifClientDocument9101;
import com.dcits.ensemble.dbmanage.inquiry.CifClient9101Inquiry;
import com.dcits.ensemble.dbmanage.inquiry.CifClientDocument9101Inquiry;
import com.dcits.ensemble.util.BusiUtil;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/***
 * @description 客户信息查询
 * @version V1.0
 * @author admin
 * @update 20170410
 */
@Service
public class Core14008001 extends AbstractService implements ICore14008001 {
	private static final Logger log = LoggerFactory.getLogger(Core14008001.class);

	@Resource
    CifClient9101Inquiry cifClient9101Inquiry;
	@Resource
    CifClientDocument9101Inquiry cifClientDocument9101Inquiry;

	@Override
	public Class<? extends Request> getRequestModel() {
		return Core14008001In.class;
	}

	public BeanResult queryClientInfo(Core14008001In in) {
		String clientNo = in.getBody().getClientNo();
		CifClient9101 cifClient = cifClient9101Inquiry.selectCifClientByClientNo(clientNo);
		if (null == cifClient) {
			throw BusiUtil.createBusinessException("CI4003");
		}
		List<CifClientDocument9101> document9101s = cifClientDocument9101Inquiry.selectDocumentsByClientNo(clientNo);

		Core14008001Out out = new Core14008001Out();
		out.setClientName(cifClient.getClientName());
		out.setClientType(cifClient.getClientType());

//		BeanUtils.copy(cifClient, out);

		List<Core14008001Out.DocumentInfo> documentInfos = new ArrayList<>();
		Core14008001Out.DocumentInfo documentInfo;
		for (CifClientDocument9101 document9101 : document9101s) {
			documentInfo = new Core14008001Out.DocumentInfo();
//			documentInfo.setDocumentId(document9101.getDocumentId());
			documentInfo.setDocumentId(document9101.getDocumentId());
			documentInfo.setDocumentType(document9101.getDocumentType());
//			BeanUtils.copy(document9101, documentInfo);
			documentInfos.add(documentInfo);
		}
		out.setDocumentInfo(documentInfos);
		return new BeanResult(out);
	}
}
