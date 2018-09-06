/*
 * <p>Title: GaoxuDemoDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Author
 * @version V1.0
 */
package com.dcits.ensemble.dbmanage.dao;

import com.dcits.ensemble.dbmanage.dbmodel.GaoxuDemo;
import com.dcits.galaxy.business.dao.BaseDao;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;


/***
 * 高旭的表</br>
 * 2018-09-04 14:06:43
 *
 * @version V1.0
 * @author Author
 */
@Repository
public class GaoxuDemoDao extends BaseDao {
    private final String DEFAULT_NAME_SPACE = "com.dcits.ensemble.dbmanage.dao.GaoxuDemoDao";

    /**
     * This method corresponds to the database table GAOXU_DEMO
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }

    public GaoxuDemo getAcctInfoByAcctNo(String acctNo) {
        GaoxuDemo da = new GaoxuDemo();
        da.setAcctNo(acctNo);
        return super.selectOne(DEFAULT_NAME_SPACE, "selectAcctInfoByAcctNo", da);
    }

    public String insert(String ACCT_NO, String ACCT_NAME, BigDecimal BAL, String CREATE_TIME, String CREATE_DATE){
        GaoxuDemo da = new GaoxuDemo();
        da.setAcctNo(ACCT_NO);
        da.setAcctName(ACCT_NAME);
        da.setBal(BAL);
        da.setCreateTime(CREATE_TIME);
        da.setCreateDate(CREATE_DATE);
        return super.selectOne(DEFAULT_NAME_SPACE, "insert", da);
    }

    public List<GaoxuDemo> getAcctInfoByAcctNoList(String acctNo) {
        HashMap<String ,String> map = new HashMap<>();
        map.put("acctNo",acctNo);
        return super.selectList("selectAcctInfoByAcctNoList", map);
    }
}

