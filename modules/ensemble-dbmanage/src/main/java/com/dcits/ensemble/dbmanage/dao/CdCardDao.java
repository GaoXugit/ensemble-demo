/*
 * <p>Title: CdCardDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Author
 * @version V1.0
 */
package com.dcits.ensemble.dbmanage.dao;

import com.dcits.ensemble.dbmanage.dbmodel.CdCard;
import com.dcits.galaxy.business.dao.BaseDao;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/***
 * 卡表</br>
 * 2018-09-05 18:27:32
 *
 * @version V1.0
 * @author Author
 */
@Repository
public class CdCardDao extends BaseDao {
    private final String DEFAULT_NAME_SPACE = "com.dcits.ensemble.dbmanage.dao.CdCardDao";

    /**
     * This method corresponds to the database table CD_CARD
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }

    /**
     * 开卡功能的具体实现方法
     * @param password
     * @param username
     * @param document_id
     * @param BAL
     * @param CREATE_TIME
     * @param card_type
     * @return
     */
    public String insert(String password, String username,String document_id, BigDecimal BAL, String CREATE_TIME, int card_type){
        CdCard da = new CdCard();
        da.setPassword(password);
        da.setUserName(username);
        da.setDocumentId(document_id);
        da.setBal(BAL);
        da.setCreateTime(CREATE_TIME);
        da.setCardType(card_type);
        return super.selectOne(DEFAULT_NAME_SPACE, "insert", da);
    }
}
