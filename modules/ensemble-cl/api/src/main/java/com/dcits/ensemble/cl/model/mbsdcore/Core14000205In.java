/*
 * <p>Title: Core14000205In.java</p>
 * <p>Description: 查询交易</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-08-27 14:06:59</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.cl.model.mbsdcore;

import java.io.Serializable;
import com.dcits.galaxy.common.data.Request;

import com.dcits.galaxy.common.validate.V;

import static javafx.scene.input.KeyCode.V;

/***
 * 查询交易</br>
 * 2018-08-27 14:06:59
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
public class Core14000205In extends Request {

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
		 * BASE_ACCT_NO<br>
		 * seqNo:1<br>
		 * dataType:String<br>
		 * length:10<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "账号")
		private String baseAcctNo;

		/**
		 * 账号<br>
		 * BASE_ACCT_NO
		 */
		public String getBaseAcctNo() {
			return baseAcctNo;
		}

		/**
		 * 账号<br>
		 * BASE_ACCT_NO
		 */
		public void setBaseAcctNo(String baseAcctNo) {
			this.baseAcctNo = baseAcctNo;
		}
	}
}
