/*
 * <p>Title: MbAcct.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Author
 * @version V1.0
 */
package com.dcits.ensemble.dbmanage.dbmodel;

import com.dcits.galaxy.common.bean.AbstractBean;

/***
 * 账户表</br>
 * 2018-08-22 16:37:34
 *
 * @version V1.0
 * @author Author
 */
public class MbAcct extends AbstractBean {

    private static final long serialVersionUID = 1L;

    /**
     * 账户标识符<br>
     * INTERNAL_KEY<br>
     * dataType:Varchar<br>
     * length:10<br>
     */
    private String internalKey;

    /**
     * 账号<br>
     * BASE_ACCT_NO<br>
     * dataType:Varchar<br>
     * length:10<br>
     */
    private String baseAcctNo;

    /**
     * 产品类型<br>
     * PROD_TYPE<br>
     * dataType:Varchar<br>
     * length:10<br>
     */
    private String prodType;

    /**
     * 账户币种，对于AIO账户和一本通账户，账户币种为XXX<br>
     * CCY<br>
     * dataType:Varchar<br>
     * length:10<br>
     */
    private String ccy;

    /**
     * 序列号，采用顺序数字，表示在同一账号、账户类型、币种下的不同子账户，比如定期存款序列号<br>
     * SEQ_NO<br>
     * dataType:Varchar<br>
     * length:10<br>
     */
    private String seqNo;

    /**
     * 开户行<br>
     * BRANCH<br>
     * dataType:Varchar<br>
     * length:20<br>
     */
    private String branch;

    /**
     * 客户号<br>
     * CLIENT_NO<br>
     * dataType:Varchar<br>
     * length:12<br>
     */
    private String clientNo;

    /**
     * 账户状态  H：待激活 A：活动 D：睡眠  S：久悬  O：转营业外 C：关闭 P：逾期   
            以下废弃： R：撤销  C：自动关闭  E：手工关闭 M：到期已结清  B：未到期结清<br>
     * ACCT_STATUS<br>
     * dataType:Varchar<br>
     * length:10<br>
     */
    private String acctStatus;

    /**
     * 账户名称，一般指中文账户名称<br>
     * ACCT_NAME<br>
     * dataType:Varchar<br>
     * length:10<br>
     */
    private String acctName;

    /**
     * 开户渠道<br>
     * SOURCE_TYPE<br>
     * dataType:Varchar<br>
     * length:20<br>
     */
    private String sourceType;

    /**
     * 源模块<br>
     * SOURCE_MODULE<br>
     * dataType:Varchar<br>
     * length:10<br>
     */
    private String sourceModule;

    /**
     * 开户柜员ID<br>
     * USER_ID<br>
     * dataType:Varchar<br>
     * length:30<br>
     */
    private String userId;

    /**
     * 上次修改日期<br>
     * LAST_CHANGE_DATE<br>
     * dataType:Varchar<br>
     * length:8<br>
     */
    private String lastChangeDate;

    /**
     * 账户标识符<br>
     * INTERNAL_KEY
     */
    public String getInternalKey() {
        return internalKey;
    }

    /**
     * 账户标识符<br>
     * INTERNAL_KEY
     */
    public void setInternalKey(String internalKey) {
        this.internalKey = internalKey;
    }
    /**
     * 账号<br>
     * BASE_ACCT_NO
     */
    public String getBaseAcctNo() {
        return baseAcctNo;
    }

    /**
     * 账号<br>
     * BASE_ACCT_NO
     */
    public void setBaseAcctNo(String baseAcctNo) {
        this.baseAcctNo = baseAcctNo;
    }
    /**
     * 产品类型<br>
     * PROD_TYPE
     */
    public String getProdType() {
        return prodType;
    }

    /**
     * 产品类型<br>
     * PROD_TYPE
     */
    public void setProdType(String prodType) {
        this.prodType = prodType;
    }
    /**
     * 账户币种，对于AIO账户和一本通账户，账户币种为XXX<br>
     * CCY
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * 账户币种，对于AIO账户和一本通账户，账户币种为XXX<br>
     * CCY
     */
    public void setCcy(String ccy) {
        this.ccy = ccy;
    }
    /**
     * 序列号，采用顺序数字，表示在同一账号、账户类型、币种下的不同子账户，比如定期存款序列号<br>
     * SEQ_NO
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * 序列号，采用顺序数字，表示在同一账号、账户类型、币种下的不同子账户，比如定期存款序列号<br>
     * SEQ_NO
     */
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }
    /**
     * 开户行<br>
     * BRANCH
     */
    public String getBranch() {
        return branch;
    }

    /**
     * 开户行<br>
     * BRANCH
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }
    /**
     * 客户号<br>
     * CLIENT_NO
     */
    public String getClientNo() {
        return clientNo;
    }

    /**
     * 客户号<br>
     * CLIENT_NO
     */
    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }
    /**
     * 账户状态  H：待激活 A：活动 D：睡眠  S：久悬  O：转营业外 C：关闭 P：逾期   
            以下废弃： R：撤销  C：自动关闭  E：手工关闭 M：到期已结清  B：未到期结清<br>
     * ACCT_STATUS
     */
    public String getAcctStatus() {
        return acctStatus;
    }

    /**
     * 账户状态  H：待激活 A：活动 D：睡眠  S：久悬  O：转营业外 C：关闭 P：逾期   
            以下废弃： R：撤销  C：自动关闭  E：手工关闭 M：到期已结清  B：未到期结清<br>
     * ACCT_STATUS
     */
    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }
    /**
     * 账户名称，一般指中文账户名称<br>
     * ACCT_NAME
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * 账户名称，一般指中文账户名称<br>
     * ACCT_NAME
     */
    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }
    /**
     * 开户渠道<br>
     * SOURCE_TYPE
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * 开户渠道<br>
     * SOURCE_TYPE
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    /**
     * 源模块<br>
     * SOURCE_MODULE
     */
    public String getSourceModule() {
        return sourceModule;
    }

    /**
     * 源模块<br>
     * SOURCE_MODULE
     */
    public void setSourceModule(String sourceModule) {
        this.sourceModule = sourceModule;
    }
    /**
     * 开户柜员ID<br>
     * USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 开户柜员ID<br>
     * USER_ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * 上次修改日期<br>
     * LAST_CHANGE_DATE
     */
    public String getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * 上次修改日期<br>
     * LAST_CHANGE_DATE
     */
    public void setLastChangeDate(String lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }
}
