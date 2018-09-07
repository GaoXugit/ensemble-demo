/*
 * <p>Title: Bs.java</p>
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
 * 银行流水账单</br>
 * 2018-09-06 21:15:09
 *
 * @version V1.0
 * @author Author
 */
public class Bs extends AbstractBean {

    private static final long serialVersionUID = 1L;

    /**
     * 流水单号<br>
     * BS_ID<br>
     * dataType:Integer<br>
     * length:8<br>
     */
    @TablePk(index = 1)
    private Integer bsId;

    /**
     * 银行卡号<br>
     * CD_ID<br>
     * dataType:Integer<br>
     * length:8<br>
     */
    private Integer cdId;

    /**
     * 操作流水时间<br>
     * BS_TIME<br>
     * dataType:Varchar<br>
     * length:30<br>
     */
    private String bsTime;

    /**
     * 存款额度<br>
     * DEPOSIT<br>
     * dataType:Number<br>
     * length:17<br>
     * scale:2<br>
     */
    private BigDecimal deposit;

    /**
     * 取款额度<br>
     * WITHDRAWAL<br>
     * dataType:Number<br>
     * length:17<br>
     * scale:2<br>
     */
    private BigDecimal withdrawal;

    /**
     * 取款方式<br>
     * PUT_WAY<br>
     * dataType:Integer<br>
     * length:1<br>
     */
    private Integer putWay;

    /**
     * 存款方式<br>
     * SAVE_WAY<br>
     * dataType:Integer<br>
     * length:1<br>
     */
    private Integer saveWay;

    /**
     * 流水单号<br>
     * BS_ID
     */
    public Integer getBsId() {
        return bsId;
    }

    /**
     * 流水单号<br>
     * BS_ID
     */
    public void setBsId(Integer bsId) {
        this.bsId = bsId;
    }
    /**
     * 银行卡号<br>
     * CD_ID
     */
    public Integer getCdId() {
        return cdId;
    }

    /**
     * 银行卡号<br>
     * CD_ID
     */
    public void setCdId(Integer cdId) {
        this.cdId = cdId;
    }
    /**
     * 操作流水时间<br>
     * BS_TIME
     */
    public String getBsTime() {
        return bsTime;
    }

    /**
     * 操作流水时间<br>
     * BS_TIME
     */
    public void setBsTime(String bsTime) {
        this.bsTime = bsTime;
    }
    /**
     * 存款额度<br>
     * DEPOSIT
     */
    public BigDecimal getDeposit() {
        return deposit;
    }

    /**
     * 存款额度<br>
     * DEPOSIT
     */
    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }
    /**
     * 取款额度<br>
     * WITHDRAWAL
     */
    public BigDecimal getWithdrawal() {
        return withdrawal;
    }

    /**
     * 取款额度<br>
     * WITHDRAWAL
     */
    public void setWithdrawal(BigDecimal withdrawal) {
        this.withdrawal = withdrawal;
    }
    /**
     * 取款方式<br>
     * PUT_WAY
     */
    public Integer getPutWay() {
        return putWay;
    }

    /**
     * 取款方式<br>
     * PUT_WAY
     */
    public void setPutWay(Integer putWay) {
        this.putWay = putWay;
    }
    /**
     * 存款方式<br>
     * SAVE_WAY
     */
    public Integer getSaveWay() {
        return saveWay;
    }

    /**
     * 存款方式<br>
     * SAVE_WAY
     */
    public void setSaveWay(Integer saveWay) {
        this.saveWay = saveWay;
    }
}
