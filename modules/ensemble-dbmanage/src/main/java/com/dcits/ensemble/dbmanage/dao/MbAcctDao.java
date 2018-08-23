/*
 * <p>Title: MbAcctDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Author
 * @version V1.0
 */
package com.dcits.ensemble.dbmanage.dao;

import org.springframework.stereotype.Repository;
import com.dcits.galaxy.business.dao.BaseDao;

/***
 * 账户表</br>
 * 2018-08-22 16:37:34
 *
 * @version V1.0
 * @author Author
 */
@Repository
public class MbAcctDao extends BaseDao {
    private final String DEFAULT_NAME_SPACE = "MbAcctDao";

    /**
     * This method corresponds to the database table MB_ACCT
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }
}
