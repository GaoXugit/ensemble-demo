/**
 * <p>Title: Fin10009103.java</p>
 * <p>Description: 存款存入（demo）</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 *
 * @author nick
 * @update 20170215
 * @version V1.0
 */
package com.dcits.ensemble.rb.service.mbsdcore;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.dbmanage.dao.DemoAcctDao;
import com.dcits.ensemble.dbmanage.dbmodel.DemoAcct;
import com.dcits.ensemble.rb.api.mbsdcore.ICore10009103;
import com.dcits.ensemble.rb.model.mbsdcore.Core10009103In;
import com.dcits.ensemble.rb.model.mbsdcore.Core10009103Out;
import com.dcits.galaxy.business.util.BusinessUtils;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.dtp.annotation.SubmitLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/***
 * @description 存款存入（demo）
 * @version V1.0
 * @author nick
 * @update 20170215
 */
@Service
public class Core10009103 extends AbstractService implements ICore10009103 {
    private static final Logger log = LoggerFactory.getLogger(Core10009103.class);

    @Resource
    private DemoAcctDao demoAcctDao;

    @Override
    public Class<? extends Request> getRequestModel() {
        return Core10009103In.class;
    }

    public BeanResult deposit(String acctNo, BigDecimal bal) {
        Core10009103Out out = new Core10009103Out();
        DemoAcct acctDemo = demoAcctDao.getAcctInfoByAcctNo(acctNo);
        if (BusinessUtils.isNull(acctDemo))
            throw BusinessUtils.createBusinessException("RB1001");
        DemoAcct update = new DemoAcct();
        update.setAcctNo(acctDemo.getAcctNo());
        update.setBal(acctDemo.getBal().add(bal));
        doSubmit(update);
        out.setBal(update.getBal());
        return new BeanResult(out);
    }

    @SubmitLog
    public void doSubmit(DemoAcct ad) {
        demoAcctDao.updateByPrimaryKey(ad);
    }

}
