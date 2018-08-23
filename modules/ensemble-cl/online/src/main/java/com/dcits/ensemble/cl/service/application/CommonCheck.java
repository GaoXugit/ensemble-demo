package com.dcits.ensemble.cl.service.application;

import com.dcits.ensemble.cl.api.inner.ICommonCheck;
import com.dcits.ensemble.dbmanage.dao.DemoClacctDao;
import com.dcits.ensemble.dbmanage.dbmodel.DemoClacct;
import com.dcits.galaxy.business.common.Context;
import com.dcits.galaxy.business.util.BusinessUtils;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.dtp.DtpContext;
import com.dcits.galaxy.dtp.resource.DtpResource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Created by Tim on 2015/9/28.
 */
@Service("CLcommonCheck")
public class CommonCheck implements ICommonCheck {
    @Resource
    private DemoClacctDao demoClacctDao;

    @Override
    public BeanResult checkAcctNo(String acctNo) {
        DemoClacct demoAcct = demoClacctDao.getAcctInfoByAcctNo(acctNo);
        if (BusinessUtils.isNull(demoAcct))
            throw BusinessUtils.createBusinessException("CL1001");
        return new BeanResult();
    }

    @Override
    public BeanResult checkAcctName(String acctName) {
        DemoClacct demoAcct = demoClacctDao.getAcctInfoByName(acctName);
        if (BusinessUtils.isNotNull(demoAcct))
            throw BusinessUtils.createBusinessException("CL1002");
        return new BeanResult();
    }

    @Override
    public BeanResult checkAcctBal(String acctNo, BigDecimal bal) {
        checkAcctNo(acctNo);
        DemoClacct demoAcct = demoClacctDao.getAcctInfoByAcctNo(acctNo);
        if (demoAcct.getBal().subtract(bal).compareTo(new BigDecimal(0)) < 0)
            throw BusinessUtils.createBusinessException("CL1003");
        return new BeanResult();
    }

    @Override
    public BeanResult checkResource(String acctNo) {
    	 // 判断是否开启了全局事务控制
        if (DtpContext.isInDtp()) {
            String resourceId = acctNo;
            String txid = Context.getInstance().getReference();
            // 检查并锁定资源
            if(DtpResource.lock("MB_CL_ACCT", "BASE_ACCT_NO", resourceId, txid)) {
            	return new BeanResult();
            } else {
            	throw BusinessUtils.createBusinessException("FM7001", acctNo);
            }
        }
        return new BeanResult();
    }

}
