/**
 * <p>Title: Core10000204Out.java</p>
 * <p>Description: 贷款还款（demo）</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 *
 * @author Tim
 * @update 20150926
 * @version V1.0
 */
package com.dcits.ensemble.cl.model.mbsdcore;

import com.dcits.galaxy.common.data.Response;

import java.math.BigDecimal;

/**
 * @author Tim
 * @version V1.0
 * @description 贷款还款（demo）
 * @update 20150926
 */
public class Core10000204Out extends Response {
    /**
     * @fields serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 账户名称<br>
     * ACCT_NAME<br>
     * seqNo:1<br>
     * dataType:String<br>
     * length:120<br>
     * <p/>
     * cons:
     */
    private String acctName;

    /**
     * 创建时间<br>
     * CREATE_TIME<br>
     * seqNo:2<br>
     * dataType:String<br>
     * length:50<br>
     * <p/>
     * cons:
     */
    private String createTime;

    /**
     * 创建日期<br>
     * CREATE_DATE<br>
     * seqNo:3<br>
     * dataType:String<br>
     * length:8<br>
     * <p/>
     * cons:
     */
    private String createDate;

    /**
     * 余额<br>
     * BAL<br>
     * seqNo:4<br>
     * dataType:Double<br>
     * <p/>
     * <p/>
     * cons:
     */
    private BigDecimal bal;

    /**
     * 账户状态<br>
     * STATUS<br>
     * seqNo:5<br>
     * dataType:String<br>
     * length:1<br>
     * <p/>
     * cons:
     */
    private String status;


    /**
     * 账户名称<br>
     * ACCT_NAME
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * 账户名称<br>
     * ACCT_NAME
     */
    public void setAcctName(String acctName) {
        this.acctName = acctName;
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
     * 创建日期<br>
     * CREATE_DATE
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * 创建日期<br>
     * CREATE_DATE
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
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
     * 账户状态<br>
     * STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * 账户状态<br>
     * STATUS
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
