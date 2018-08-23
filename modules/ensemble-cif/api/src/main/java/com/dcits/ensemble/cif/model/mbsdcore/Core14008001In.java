/**   
 * <p>Title: Core14008001In.java</p>
 * <p>Description: 客户信息查询</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author admin
 * @update 20170410
 * @version V1.0
 */
package com.dcits.ensemble.cif.model.mbsdcore;

import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.common.validate.V;

import java.io.Serializable;

/***
 * @description 客户信息查询
 * @version V1.0
 * @author admin
 * @update 20170410
 */
public class Core14008001In extends Request {

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
		 * 客户号<br>
		 * CLIENT_NO<br>
		 * seqNo:1<br>
		 * dataType:String<br>
		 * length:12<br>
		 * cons:
		 */
		@V(desc = "客户号", notNull = true)
		private String clientNo;

		/**
		 * 客户号<br>
		 * CLIENT_NO
		 */
		public String getClientNo() {
			return clientNo;
		}
	
		/**
		 * 客户号<br>
		 * CLIENT_NO
		 */
		public void setClientNo(String clientNo) {
			this.clientNo = clientNo;
		}
	}
}
