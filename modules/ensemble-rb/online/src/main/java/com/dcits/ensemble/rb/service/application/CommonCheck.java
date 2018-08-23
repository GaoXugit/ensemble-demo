package com.dcits.ensemble.rb.service.application;


import com.dcits.ensemble.dbmanage.dao.DemoAcctDao;
import com.dcits.ensemble.dbmanage.dbmodel.DemoAcct;
import com.dcits.ensemble.rb.api.inner.ICommonCheck;
import com.dcits.galaxy.business.common.Context;
import com.dcits.galaxy.business.util.BusinessUtils;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.dtp.DtpContext;
import com.dcits.galaxy.dtp.resource.DtpResource;
import com.dcits.galaxy.exception.WithoutAuthorizationException;
import com.dcits.galaxy.exception.WithoutConfirmationException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Created by Tim on 2015/9/28.
 */
@Service("RBcommonCheck")
public class CommonCheck implements ICommonCheck {

	@Resource
	private DemoAcctDao demoAcctDao;

	@Override
	public BeanResult checkAuth(String acctNo) {
		if (false)
			throw new WithoutAuthorizationException("999999", "测试授权");
		return new BeanResult();
	}

	@Override
	public BeanResult checkConfirm(String acctNo) {
		if (false)
			throw new WithoutConfirmationException("999999", "测试确认");
		return new BeanResult();
	}

	@Override
	public BeanResult checkAcctNo(String acctNo) {
		if (false)
			throw new WithoutAuthorizationException("999999", "账户检查强制报错");
		DemoAcct demoAcct = demoAcctDao.getAcctInfoByAcctNo(acctNo);
		if (BusinessUtils.isNull(demoAcct))
			throw BusinessUtils.createBusinessException("RB1001", acctNo);
		
//		checkResource(acctNo + "iii");
		return new BeanResult();
	}

	@Override
	public BeanResult checkAcctName(String acctName) {
		DemoAcct demoAcct = demoAcctDao.getAcctInfoByName(acctName);
		if (BusinessUtils.isNotNull(demoAcct))
			throw BusinessUtils.createBusinessException("RB1002", acctName);
		return new BeanResult();
	}

	@Override
	public BeanResult checkAcctBal(String acctNo, BigDecimal bal) {
		if (false)
			throw new WithoutAuthorizationException("999999", "checkAcctBal检查强制报错");
		checkAcctNo(acctNo);
		DemoAcct demoAcct = demoAcctDao.getAcctBal(acctNo);
		if (demoAcct.getBal().subtract(bal).compareTo(new BigDecimal(0)) < 0)
			throw BusinessUtils.createBusinessException("RB1003", acctNo);
		return new BeanResult();
	}

	@Override
	public BeanResult checkResource(String acctNo) {
		// 判断是否开启了全局事务控制
		if (DtpContext.isInDtp()) {
			String resourceId = acctNo;
			String txid = Context.getInstance().getReference();
			// 检查并锁定资源
			if (DtpResource
					.lock("MB_RB_ACCT", "BASE_ACCT_NO", resourceId, txid)) {
				return new BeanResult();
			} else {
				throw BusinessUtils.createBusinessException("FM7001", acctNo);
			}
		}
		return new BeanResult();
	}

}
