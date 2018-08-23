package com.dcits.ensemble.dbmanage.dbmodel;

import com.dcits.galaxy.common.bean.AbstractBean;
import com.dcits.galaxy.dal.annotation.TablePk;

import java.math.BigDecimal;

/**
 * Created by Tim on 2015/09/26 10:24:57.
 */
public class DemoAcct extends AbstractBean {

    // serialVersionUID
    private static final long serialVersionUID = 1L;

    /**
     * This field is DEMO_ACCT.UUID 唯一编号
     */
    @TablePk(index = 1)
    private String uuid;

    /**
     * This field is DEMO_ACCT.ACCT_NO 账号
     */
    private String acctNo;

    /**
     * This field is DEMO_ACCT.ACCT_NAME 账号名称
     */
    private String acctName;

    /**
     * This field is DEMO_ACCT.CREATE_TIME 创建时间
     */
    private String createTime;

    /**
     * This field is DEMO_ACCT.CRAETE_DATE 创建日期
     */
    private String createDate;

    /**
     * This field is DEMO_ACCT.BAL 余额
     */
    private BigDecimal bal;

    /**
     * This field is DEMO_ACCT.STATUS 状态A-活动，C-销户
     */
    private String status;

    /**
     * @return the value of  DEMO_ACCT.UUID 唯一编号
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid the value for DEMO_ACCT.UUID 唯一编号
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * @return the value of  DEMO_ACCT.ACCT_NO 账号
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * @param acctNo the value for DEMO_ACCT.ACCT_NO 账号
     */
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    /**
     * @return the value of  DEMO_ACCT.ACCT_NAME 账号名称
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * @param acctName the value for DEMO_ACCT.ACCT_NAME 账号名称
     */
    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    /**
     * @return the value of  DEMO_ACCT.CREATE_TIME 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime the value for DEMO_ACCT.CREATE_TIME 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * @return the value of  DEMO_ACCT.CRAETE_DATE 创建日期
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate the value for DEMO_ACCT.CRAETE_DATE 创建日期
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    /**
     * @return the value of  DEMO_ACCT.BAL 余额
     */
    public BigDecimal getBal() {
        return bal;
    }

    /**
     * @param bal the value for DEMO_ACCT.BAL 余额
     */
    public void setBal(BigDecimal bal) {
        this.bal = bal;
    }

    /**
     * @return the value of  DEMO_ACCT.STATUS 状态A-活动，C-销户
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the value for DEMO_ACCT.STATUS 状态A-活动，C-销户
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}