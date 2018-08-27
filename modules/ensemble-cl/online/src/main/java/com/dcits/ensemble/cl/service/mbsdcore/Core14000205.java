/*
 * <p>Title: Core14000205.java</p>
 * <p>Description: 查询交易</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-08-27 14:06:59</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.cl.service.mbsdcore;

import com.dcits.ensemble.cl.model.mbsdcore.Core14000205Out;
import com.dcits.ensemble.dbmanage.dao.DemoAcctDao;
import com.dcits.ensemble.dbmanage.dbmodel.DemoAcct;
import com.dcits.galaxy.common.data.BeanResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.cl.api.mbsdcore.ICore14000205;
import com.dcits.galaxy.common.data.Request;
import com.dcits.ensemble.cl.model.mbsdcore.Core14000205In;

import javax.annotation.Resource;

/***
 * 查询交易</br>
 * 2018-08-27 14:06:59
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
@Service
public class Core14000205 extends AbstractService implements ICore14000205 {
    private static final Logger LOG = LoggerFactory.getLogger(Core14000205.class);

    @Resource
    private DemoAcctDao demoAcctDao;

    @Override
    public Class<? extends Request> getRequestModel() {
        return Core14000205In.class;
    }

    public BeanResult query(Core14000205In core14000205in) {
        Core14000205In.Body body = core14000205in.getBody();
        String baseAcctNo = body.getBaseAcctNo();
        DemoAcct acctInfoByAcctNo = demoAcctDao.getAcctInfoByAcctNo(baseAcctNo);
        Core14000205Out core14000205Out = new Core14000205Out();
        core14000205Out.setAcctName(acctInfoByAcctNo.getAcctName());
        core14000205Out.setCreateDate(acctInfoByAcctNo.getCreateDate());
        core14000205Out.setCreateTime(acctInfoByAcctNo.getCreateTime());
        return new BeanResult(core14000205Out);
    }
}
