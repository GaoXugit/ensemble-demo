/**   
 * <p>Title: Core14009101In.java</p>
 * <p>Description: 存款账户查询（demo）</p>
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

/***
 * @description 存款账户查询（demo）
 * @version V1.0
 * @author nick
 * @update 20170215
 */
public class Core14009101In extends Request {

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
	}
}
