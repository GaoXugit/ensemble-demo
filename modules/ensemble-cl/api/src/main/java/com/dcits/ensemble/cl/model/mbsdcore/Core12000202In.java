/**
 * <p>Title: Core12000202In.java</p>
 * <p>Description: 贷款账户创建（demo）</p>
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

/***
 * @description 贷款账户创建（demo）
 * @version V1.0
 * @author Tim
 * @update 20150926
 */
public class Core12000202In extends Request {

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
         * 账户名称<br>
         * ACCT_NAME<br>
         * seqNo:1<br>
         * dataType:String<br>
         * length:120<br>
         * cons:
         */
        @V(desc = "账户名称", notNull = true, notEmpty = true)
        private String acctName;

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
    }
}
