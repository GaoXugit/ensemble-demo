/*
 * <p>Title: GaoxuDemo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Author
 * @version V1.0
 */
package com.dcits.ensemble.dbmanage.dbmodel;

import com.dcits.galaxy.business.dao.BaseDao;
import com.dcits.galaxy.common.bean.AbstractBean;
import com.dcits.galaxy.dal.annotation.TablePk;
import java.math.BigDecimal;
/***
 * 高旭的表</br>
 * 2018-09-04 14:06:43
 *
 * @version V1.0
 * @author Author
 */
public class GaoxuDemo extends BaseDao {

    private static final long serialVersionUID = 1L;

    /**
     * 账号<br>
     * ACCT_NO<br>
     * dataType:Varchar<br>
     * length:50<br>
     */
    @TablePk(index = 1)
    private String acctNo;

    /**
     * 账号名称<br>
     * ACCT_NAME<br>
     * dataType:Varchar<br>
     * length:10<br>
     */
    private String acctName;

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
     * 创建日期<br>
     * CREATE_DATE<br>
     * dataType:Varchar<br>
     * length:8<br>
     */
    private String createDate;

    /**
     * 账号<br>
     * ACCT_NO
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * 账号<br>
     * ACCT_NO
     */
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }
    /**
     * 账号名称<br>
     * ACCT_NAME
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * 账号名称<br>
     * ACCT_NAME
     */
    public void setAcctName(String acctName) {
        this.acctName = acctName;
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

    @Override
    protected String getNameSpace() {
        return null;
    }
}
