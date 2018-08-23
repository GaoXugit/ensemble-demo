/**   
 * <p>Title: Core10009103In.java</p>
 * <p>Description: 存款存入（demo）</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author nick
 * @update 20170215
 * @version V1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.common.validate.V;

import java.io.Serializable;
import java.math.BigDecimal;

/***
 * @description 存款存入（demo）
 * @version V1.0
 * @author nick
 * @update 20170215
 */
public class Core10009103In extends Request {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@V(desc = "body")
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
		@V(desc = "账号", notNull = true)
		private String acctNo;

		/**
		 * 金额<br>
		 * BAL<br>
		 * seqNo:2<br>
		 * dataType:Double<br>
		 * length:17<br>
		 * length:2<br>
		 * cons:
		 */
		@V(desc = "金额", notNull = true)
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
		 * 金额<br>
		 * BAL
		 */
		public BigDecimal getBal() {
			return bal;
		}
	
		/**
		 * 金额<br>
		 * BAL
		 */
		public void setBal(BigDecimal bal) {
			this.bal = bal;
		}
	}
}
