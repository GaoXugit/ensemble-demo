/*
 * <p>Title: ZxbDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Author
 * @version V1.0
 */
package com.dcits.ensemble.dbmanage.dao;

import com.dcits.ensemble.dbmanage.dbmodel.Zxb;
import com.dcits.galaxy.business.dao.BaseDao;
import org.springframework.stereotype.Repository;


/***
 * 最新版</br>
 * 2018-08-27 14:38:49
 *
 * @version V1.0
 * @author Author
 */
@Repository
public class ZxbDao extends BaseDao {
    private final String DEFAULT_NAME_SPACE = "com.dcits.ensemble.dbmanage.dao.ZxbDao";

    /**
     * This method corresponds to the database table ZXB
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }

    public Zxb getAcctInfoByAcctNo(String acctNo) {
        Zxb zxb = new Zxb();
        zxb.setAaa("11");

        return super.selectOne(DEFAULT_NAME_SPACE, "selectByAAA", zxb);
    }
}
