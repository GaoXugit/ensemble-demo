/*
 * <p>Title: Zxb.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Author
 * @version V1.0
 */
package com.dcits.ensemble.dbmanage.dbmodel;


import com.dcits.galaxy.common.bean.AbstractBean;
import com.dcits.galaxy.dal.annotation.TablePk;
/***
 * 最新版</br>
 * 2018-08-27 14:47:27
 *
 * @version V1.0
 * @author Author
 */
public class Zxb extends AbstractBean {

    private static final long serialVersionUID = 1L;

    /**
     * 111<br>
     * AAA<br>
     * dataType:Varchar<br>
     * length:20<br>
     */
    private String aaa;

    /**
     * 客户经理<br>
     * ACCT_EXEC<br>
     * dataType:Varchar<br>
     * length:30<br>
     */
    private String acctExec;

    /**
     * 账号名称<br>
     * ACCT_NAME<br>
     * dataType:Varchar<br>
     * length:10<br>
     */
    private String acctName;

    /**
     * 111<br>
     * AAA
     */
    public String getAaa() {
        return aaa;
    }

    /**
     * 111<br>
     * AAA
     */
    public void setAaa(String aaa) {
        this.aaa = aaa;
    }
    /**
     * 客户经理<br>
     * ACCT_EXEC
     */
    public String getAcctExec() {
        return acctExec;
    }

    /**
     * 客户经理<br>
     * ACCT_EXEC
     */
    public void setAcctExec(String acctExec) {
        this.acctExec = acctExec;
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
}
