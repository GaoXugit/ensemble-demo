/*
 * <p>Title: CdCard.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Author
 * @version V1.0
 */
package com.dcits.ensemble.dbmanage.dbmodel;

import com.dcits.galaxy.common.bean.AbstractBean;
import com.dcits.galaxy.dal.annotation.TablePk;
import java.math.BigDecimal;
/***
 * 卡表</br>
 * 2018-09-05 18:27:32
 *
 * @version V1.0
 * @author Author
 */
public class CdCard extends AbstractBean {

    private static final long serialVersionUID = 1L;

    /**
     * 银行卡号<br>
     * CD_ID<br>
     * dataType:Number<br>
     * length:8<br>
     */
    @TablePk(index = 1)
    private int cdId;

    /**
     * 密码<br>
     * PASSWORD<br>
     * dataType:Varchar<br>
     * length:6<br>
     */
    private String password;

    /**
     * 客户姓名<br>
     * USER_NAME<br>
     * dataType:Varchar<br>
     * length:50<br>
     */
    private String userName;

    /**
     * 证件号码<br>
     * DOCUMENT_ID<br>
     * dataType:Varchar<br>
     * length:25<br>
     */
    private String documentId;

    /**
     * 余额<br>
     * BAL<br>
     * dataType:Number<br>
     * length:17<br>
     * scale:2<br>
     */
    private BigDecimal bal;

    /**
     * 创建时间<br>
     * CREATE_TIME<br>
     * dataType:Varchar<br>
     * length:17<br>
     */
    private String createTime;

    /**
     * 卡种类<br>
     * CARD_TYPE<br>
     * dataType:Number<br>
     * length:1<br>
     */
    private int cardType;

    /**
     * 银行卡号<br>
     * CD_ID
     */
    public int getCdId() {
        return cdId;
    }

    /**
     * 银行卡号<br>
     * CD_ID
     */
    public void setCdId(int cdId) {
        this.cdId = cdId;
    }
    /**
     * 密码<br>
     * PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码<br>
     * PASSWORD
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 客户姓名<br>
     * USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 客户姓名<br>
     * USER_NAME
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * 证件号码<br>
     * DOCUMENT_ID
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * 证件号码<br>
     * DOCUMENT_ID
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
    /**
     * 余额<br>
     * BAL
     */
    public BigDecimal getBal() {
        return bal;
    }

    /**
     * 余额<br>
     * BAL
     */
    public void setBal(BigDecimal bal) {
        this.bal = bal;
    }
    /**
     * 创建时间<br>
     * CREATE_TIME
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间<br>
     * CREATE_TIME
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    /**
     * 卡种类<br>
     * CARD_TYPE
     */
    public int getCardType() {
        return cardType;
    }

    /**
     * 卡种类<br>
     * CARD_TYPE
     */
    public void setCardType(int cardType) {
        this.cardType = cardType;
    }
}
