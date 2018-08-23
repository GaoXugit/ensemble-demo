/**
 * <p>Title: Core14000201.java</p>
 * <p>Description: 贷款账户查询（demo）</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 *
 * @author Tim
 * @update 20150926
 * @version V1.0
 */
package com.dcits.ensemble.cl.service.mbsdcore;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.cl.api.mbsdcore.ICore14000201;
import com.dcits.ensemble.cl.model.mbsdcore.Core14000201In;
import com.dcits.ensemble.cl.model.mbsdcore.Core14000201Out;
import com.dcits.ensemble.cl.service.application.CommonCheck;
import com.dcits.ensemble.dbmanage.dao.DemoClacctDao;
import com.dcits.ensemble.dbmanage.dbmodel.DemoClacct;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.util.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/***
 * @description 贷款账户查询（demo）
 * @version V1.0
 * @author Tim
 * @update 20150926
 */
@Service
public class Core14000201 extends AbstractService implements ICore14000201 {
    private static final Logger log = LoggerFactory.getLogger(Core14000201.class);

    @Resource
    private DemoClacctDao demoClacctDao;

    @Resource
    private CommonCheck commonCheck;

    @Override
    public Class<? extends Request> getRequestModel() {
        return Core14000201In.class;
    }

    public BeanResult getAcct(String acctNo) {
        Core14000201Out out = new Core14000201Out();
        commonCheck.checkAcctNo(acctNo);
        DemoClacct demoAcct = demoClacctDao.getAcctInfoByAcctNo(acctNo);
        BeanUtils.copy(demoAcct, out);
        return new BeanResult(out);
    }
}
