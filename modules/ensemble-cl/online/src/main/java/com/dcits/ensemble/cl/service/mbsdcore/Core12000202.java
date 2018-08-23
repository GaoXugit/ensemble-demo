/**
 * <p>Title: Core12000202.java</p>
 * <p>Description: 贷款账户创建（demo）</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 *
 * @author Tim
 * @update 20150926
 * @version V1.0
 */
package com.dcits.ensemble.cl.service.mbsdcore;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.cl.api.mbsdcore.ICore12000202;
import com.dcits.ensemble.cl.model.mbsdcore.Core12000202Out;
import com.dcits.ensemble.cl.model.mbsdcore.Core12000202In;
import com.dcits.ensemble.dbmanage.dao.DemoClacctDao;
import com.dcits.ensemble.dbmanage.dbmodel.DemoClacct;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.dtp.annotation.SubmitLog;
import com.dcits.galaxy.util.BeanUtils;
import com.dcits.galaxy.util.DateUtils;
import com.dcits.galaxy.util.SeqUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Tim
 * @version V1.0
 * @description 贷款账户创建（demo）
 * @update 20150926
 */
@Service
public class Core12000202 extends AbstractService implements ICore12000202 {
    private static final Logger log = LoggerFactory.getLogger(Core12000202.class);

    @Resource
    private DemoClacctDao demoClacctDao;

    @Override
    public Class<? extends Request> getRequestModel() {
        return Core12000202In.class;
    }

    public BeanResult createAcct(String acctName) {
        Core12000202Out out = new Core12000202Out();
        DemoClacct da = new DemoClacct();
        da.setAcctName(acctName);
        da.setUuid(SeqUtils.getStringSeq());
        da.setAcctNo(SeqUtils.getRandomNumber(20));
        da.setBal(new BigDecimal(500000.00)); //初始额度50万
        da.setCreateDate(DateUtils.getDate());
        da.setCreateTime(DateUtils.getDateTime("HHmmssSSS"));
        da.setStatus("A");
        doSubmit(da);
        BeanUtils.copy(da, out);
        return new BeanResult(out);
    }

    @SubmitLog
    public void doSubmit(DemoClacct da) {
        demoClacctDao.insert(da);
    }
}
