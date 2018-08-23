/**
 * <p>Title: Core10000203In.java</p>
 * <p>Description: 贷款发放（demo）</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 *
 * @author Tim
 * @update 20150926
 * @version V1.0
 */
package com.dcits.ensemble.cl.model.mbsdcore;

import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.common.validate.V;

import java.io.Serializable;
import java.math.BigDecimal;

/***
 * @description 贷款发放（demo）
 * @version V1.0
 * @author Tim
 * @update 20150926
 */
public class Core10000203In extends Request {

    /***
     * @fields serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @V(desc = "报文体")
    private Body body;

    /**
     * @return body : return the property body.
     */
    public Body getBody() {
        return body;
    }

    /**
     * @param body
     *            : set the property body.
     */
    public void setBody(Body body) {
        this.body = body;
    }

    public static class Body implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 账号<br>
         * ACCT_NO<br>
         * seqNo:1<br>
         * dataType:String<br>
         * length:50<br>
         * cons:
         */
        @V(desc = "账号", notNull = true, notEmpty = true)
        private String acctNo;

        /**
         * 存款账号<br>
         * RB_ACCT_NO<br>
         * seqNo:2<br>
         * dataType:String<br>
         * length:50<br>
         * cons:
         */
        @V(desc = "存款账号", notNull = true, notEmpty = true)
        private String rbAcctNo;

        /**
         * 余额<br>
         * BAL<br>
         * seqNo:3<br>
         * dataType:Double<br>
         * cons:
         */
        @V(desc = "余额", notNull = true, notEmpty = true)
        private BigDecimal bal;

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
         * 存款账号<br>
         * RB_ACCT_NO
         */
        public String getRbAcctNo() {
            return rbAcctNo;
        }

        /**
         * 存款账号<br>
         * RB_ACCT_NO
         */
        public void setRbAcctNo(String rbAcctNo) {
            this.rbAcctNo = rbAcctNo;
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
    }
}
