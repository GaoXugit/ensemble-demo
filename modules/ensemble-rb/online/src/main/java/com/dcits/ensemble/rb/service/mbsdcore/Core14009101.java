/**   
 * <p>Title: Core14009101.java</p>
 * <p>Description: 存款账户查询（demo）</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author nick
 * @update 20170215
 * @version V1.0
 */
package com.dcits.ensemble.rb.service.mbsdcore;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.dbmanage.dao.DemoAcctDao;
import com.dcits.ensemble.dbmanage.dbmodel.DemoAcct;
import com.dcits.ensemble.rb.api.mbsdcore.ICore14009101;
import com.dcits.ensemble.rb.model.mbsdcore.Core14009101In;
import com.dcits.ensemble.rb.model.mbsdcore.Core14009101Out;
import com.dcits.ensemble.rb.service.application.CommonCheck;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.util.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/***
 * @description 存款账户查询（demo）
 * @version V1.0
 * @author nick
 * @update 20170215
 */
@Service
public class Core14009101 extends AbstractService implements ICore14009101 {
	private static final Logger log = LoggerFactory
			.getLogger(Core14009101.class);
	@Resource
	private DemoAcctDao demoAcctDao;
	@Resource
	private CommonCheck commonCheck;
			
	@Override
	public Class<? extends Request> getRequestModel() {
		return Core14009101In.class;
	}

	public BeanResult getAcct(String acctNo){
		Core14009101Out out = new Core14009101Out();
		commonCheck.checkAcctNo(acctNo);
		DemoAcct ad = demoAcctDao.getAcctInfoByPage(acctNo);
		BeanUtils.copy(ad,out);
		return new BeanResult(out);
	}
}
