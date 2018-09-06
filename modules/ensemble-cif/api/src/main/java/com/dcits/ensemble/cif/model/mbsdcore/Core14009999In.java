/*
 * <p>Title: Core14009999In.java</p>
 * <p>Description: 1111</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-04 19:28:43</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.cif.model.mbsdcore;

import java.io.Serializable;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.common.validate.V;


/***
 * 1111</br>
 * 2018-09-04 19:28:43
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
public class Core14009999In extends Request {

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
	 * @param body : set the property body.
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
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "账号")
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
