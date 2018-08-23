/**
 * <p>Title: Core10000203.java</p>
 * <p>Description: 贷款发放（demo）</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 *
 * @author Tim
 * @update 20150926
 * @version V1.0
 */
package com.dcits.ensemble.cl.service.mbsdcore;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.cl.api.mbsdcore.ICore10000203;
import com.dcits.ensemble.cl.model.mbsdcore.Core10000203In;
import com.dcits.ensemble.cl.model.mbsdcore.Core10000203Out;
import com.dcits.ensemble.dbmanage.dao.DemoClacctDao;
import com.dcits.ensemble.dbmanage.dbmodel.DemoClacct;
import com.dcits.galaxy.business.util.BusinessUtils;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.common.data.Response;
import com.dcits.galaxy.dtp.annotation.SubmitLog;
import com.dcits.galaxy.util.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/***
 * @description 贷款发放（demo）
 * @version V1.0
 * @author Tim
 * @update 20150926
 */
@Service
public class Core10000203 extends AbstractService implements ICore10000203 {
    private static final Logger log = LoggerFactory
            .getLogger(Core10000203.class);

    @Resource
    private DemoClacctDao demoClacctDao;

    @Override
    public Class<? extends Request> getRequestModel() {
        return Core10000203In.class;
    }

    @Override
    @Transactional
    public BeanResult drawdown(String acctNo, BigDecimal bal) {
        Core10000203Out out = new Core10000203Out();
        DemoClacct demoAcct = demoClacctDao.getAcctInfoByAcctNo(acctNo);
        if (BusinessUtils.isNull(demoAcct))
            throw BusinessUtils.createBusinessException("RB1001");

        DemoClacct update = new DemoClacct();
        update.setUuid(demoAcct.getUuid());
        update.setAcctNo(demoAcct.getAcctNo());
        update.setBal(demoAcct.getBal().subtract(bal));
        doSubmit(update);
        BeanUtils.copy(demoAcct, out);
        out.setBal(update.getBal());
        return new BeanResult(out);
    }

    @SubmitLog
    public void doSubmit(DemoClacct da) {
        demoClacctDao.updateByPrimaryKey(da);
    }

    public BeanResult out(Response out) {
        return new BeanResult(out);
    }
}
