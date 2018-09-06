/*
 * <p>Title: Core14009999.java</p>
 * <p>Description: 1111</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-04 19:28:43</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.cif.service.mbsdcore;

import com.dcits.ensemble.cif.model.mbsdcore.Core14009999Out;
import com.dcits.ensemble.dbmanage.dao.DemoAcctDao;
import com.dcits.ensemble.dbmanage.dbmodel.DemoAcct;
import com.dcits.galaxy.business.api.BusinessProcess;
import com.dcits.galaxy.common.data.BeanResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.galaxy.common.data.Request;
import com.dcits.ensemble.cif.model.mbsdcore.Core14009999In;

import javax.annotation.Resource;

/***
 * 1111</br>
 * 2018-09-04 19:28:43
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
@Service
public class Core14009999 extends AbstractService implements BusinessProcess {
	private static final Logger LOG = LoggerFactory.getLogger(Core14009999.class);
	@Resource
	private DemoAcctDao demoAcctDao;

	@Override
	public Class<? extends Request> getRequestModel() {
		return Core14009999In.class;
	}
	public BeanResult query(Core14009999In core14009999In) {
		Core14009999In.Body body = core14009999In.getBody();
		String baseAcctNo = body.getAcctNo();
		DemoAcct acctInfoByAcctNo = demoAcctDao.getAcctInfoByAcctNo(baseAcctNo);
		Core14009999Out core14009999Out = new Core14009999Out();
		core14009999Out.setCreateTime(acctInfoByAcctNo.getCreateTime());
		return new BeanResult(core14009999Out);
	}

}
