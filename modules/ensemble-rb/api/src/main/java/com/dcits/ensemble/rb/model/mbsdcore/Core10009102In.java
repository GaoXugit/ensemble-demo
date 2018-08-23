/**   
 * <p>Title: Core10009102In.java</p>
 * <p>Description: 存款账户创建（demo）</p>
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
 * @description 存款账户创建（demo）
 * @version V1.0
 * @author nick
 * @update 20170215
 */
public class Core10009102In extends Request {

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
		 * 账号名称<br>
		 * ACCT_NAME<br>
		 * seqNo:1<br>
		 * dataType:String<br>
		 * length:50<br>
		 * cons:
		 */
		@V(desc = "账号名称", notNull = true)
		private String acctName;

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
}
