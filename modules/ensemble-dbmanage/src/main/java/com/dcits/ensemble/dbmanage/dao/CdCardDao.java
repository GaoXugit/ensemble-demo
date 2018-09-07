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
import java.util.Date;

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
     * 开卡功能
     * @param password
     * @param username
     * @param document_id
     * @param BAL
     * @param CREATE_TIME
     * @param card_type
     * @return
     */
    public String insert(String password, String username, String document_id, BigDecimal BAL, String CREATE_TIME, int card_type){
        CdCard da = new CdCard();
        da.setPassword(password);
        da.setUserName(username);
        da.setDocumentId(document_id);
        da.setBal(BAL);
        da.setCreateTime(CREATE_TIME);
        da.setCardType(card_type);
        return super.selectOne(DEFAULT_NAME_SPACE, "insert", da);
    }

    /**
     * 获取卡信息
     * @param cdid
     * @param pass
     * @return
     */

    public CdCard getCardInfo(int cdid,String pass) {
        CdCard cdCard = new CdCard();
        cdCard.setCdId(cdid);
        cdCard.setPassword(pass);
        return super.selectOne(DEFAULT_NAME_SPACE, "selectCardInfo",cdCard);
    }

    /**
     * 更新卡信息
     * @param cdid
     * @param temp
     * @return
     */
    public int updateCardInfo(int cdid,BigDecimal temp) {
        CdCard cdCard = new CdCard();
        cdCard.setBal(temp);
        cdCard.setCdId(cdid);
        return super.update("updateCardInfo",cdCard);
    }

    //TODO 根据账号、密码查询卡信息
    public CdCard selectCardInfo(Integer cdId, String passWord) {
        CdCard cdCard = new CdCard();
        cdCard.setCdId(cdId);
        cdCard.setPassword(passWord);
        return super.selectOne(DEFAULT_NAME_SPACE, "selectCardInfo", cdCard);
    }
    //TODO 根据取款金额更新卡内余额
    public int updateUserBal(BigDecimal bal, Integer id) {
        CdCard cdCard = new CdCard();
        cdCard.setCdId(id);
        cdCard.setBal(bal);
        return update("updateToBal", cdCard);
    }
}
