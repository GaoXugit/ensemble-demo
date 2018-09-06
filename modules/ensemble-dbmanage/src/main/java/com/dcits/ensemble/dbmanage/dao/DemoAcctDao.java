package com.dcits.ensemble.dbmanage.dao;

import com.dcits.ensemble.dbmanage.dbmodel.DemoAcct;
import com.dcits.galaxy.business.dao.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Tim on 2015/09/26 10:24:57.
 */
@Repository
public class DemoAcctDao extends BaseDao {

    //Mapper文件定义的NameSpace
    private final String DEFAULT_NAME_SPACE = "com.dcits.ensemble.rb.demo.dao.DemoAcctDao";

    /**
     * This method corresponds to the database table DEMO_ACCT
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }


    public DemoAcct  getAcctInfoByAcctNo(String acctNo) {
        DemoAcct da = new DemoAcct();
        da.setAcctNo(acctNo);
        return super.selectOne(DEFAULT_NAME_SPACE, "selectAcctInfoByAcctNo", da);
    }

    public DemoAcct getAcctInfoByPage(String acctNo) {
        DemoAcct da = new DemoAcct();
        da.setAcctNo(acctNo);
        List<DemoAcct> demoAcct = super.selectByPage(DEFAULT_NAME_SPACE, "selectAcctInfoByPage", da);
        if (null != demoAcct) {
            return demoAcct.get(0);
        }
        return null;
    }

    public DemoAcct getAcctBal(String acctNo) {
        DemoAcct da = new DemoAcct();
        da.setAcctNo(acctNo);
        return super.selectOne(DEFAULT_NAME_SPACE, "selectAcctBal", da);
}

    public DemoAcct getAcctInfoByName(String acctName) {
        DemoAcct da = new DemoAcct();
        da.setAcctName(acctName);
        return super.selectOne(DEFAULT_NAME_SPACE, "selectAcctInfoByName", da);
    }

    public List<DemoAcct> getAcctInfoByAcctNoList(String acctNo) {
        HashMap<String ,String> map = new HashMap<>();
        map.put("acctNo",acctNo);
        return super.selectList("selectAcctInfoByAcctNoList", map);
    }

}