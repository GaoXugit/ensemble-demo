package com.dcits.ensemble.dbmanage.dao;

import com.dcits.ensemble.dbmanage.dbmodel.DemoClacct;
import com.dcits.galaxy.business.dao.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * Created by Tim on 2015/09/26 10:26:40.
 */
@Repository
public class DemoClacctDao extends BaseDao {

    //Mapper文件定义的NameSpace
    private final String DEFAULT_NAME_SPACE = "com.dcits.ensemble.cl.demo.dao.DemoClacctDao";

    /**
     * This method corresponds to the database table DEMO_CLACCT
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }

    public DemoClacct getAcctInfoByAcctNo(String acctNo) {
        DemoClacct da = new DemoClacct();
        da.setAcctNo(acctNo);
        return super.selectOne(DEFAULT_NAME_SPACE, "selectAcctInfoByAcctNo", da);
    }

    public DemoClacct getAcctInfoByName(String acctName) {
        DemoClacct da = new DemoClacct();
        da.setAcctName(acctName);
        return super.selectOne(DEFAULT_NAME_SPACE, "selectAcctInfoByName", da);
    }
}