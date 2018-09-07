/*
 * <p>Title: Core14008841In.java</p>
 * <p>Description: 转账服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-06 21:03:01</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import java.io.Serializable;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.common.validate.V;

import java.math.BigDecimal;

/***
 * 转账服务</br>
 * 2018-09-06 21:03:01
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
public class Core14008841In extends Request {

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
		 * 银行卡号<br>
		 * CD_ID<br>
		 * seqNo:1<br>
		 * dataType:Integer<br>
		 * length:8<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "银行卡号")
		private Integer cdId;

		/**
		 * 银行卡号<br>
		 * CD_ID_IN<br>
		 * seqNo:2<br>
		 * dataType:Integer<br>
		 * length:8<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "银行卡号")
		private Integer cdIdIn;

		/**
		 * 密码<br>
		 * PASSWORD<br>
		 * seqNo:3<br>
		 * dataType:String<br>
		 * length:6<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "密码")
		private String password;

		/**
		 * 转入账户密码<br>
		 * PASSWORD_IN<br>
		 * seqNo:4<br>
		 * dataType:String<br>
		 * length:6<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "转入账户密码")
		private String passwordIn;

		/**
		 * 金额<br>
		 * SAL<br>
		 * seqNo:5<br>
		 * dataType:Double<br>
		 * length:17<br>
		 * scale:2<br>
		 * cons:
		 */
        @V(desc = "金额")
		private BigDecimal sal;

		/**
		 * 银行卡号<br>
		 * CD_ID
		 */
		public Integer getCdId() {
			return cdId;
		}

		/**
		 * 银行卡号<br>
		 * CD_ID
		 */
		public void setCdId(Integer cdId) {
			this.cdId = cdId;
		}

		/**
		 * 银行卡号<br>
		 * CD_ID_IN
		 */
		public Integer getCdIdIn() {
			return cdIdIn;
		}

		/**
		 * 银行卡号<br>
		 * CD_ID_IN
		 */
		public void setCdIdIn(Integer cdIdIn) {
			this.cdIdIn = cdIdIn;
		}

		/**
		 * 密码<br>
		 * PASSWORD
		 */
		public String getPassword() {
			return password;
		}

		/**
		 * 密码<br>
		 * PASSWORD
		 */
		public void setPassword(String password) {
			this.password = password;
		}

		/**
		 * 转入账户密码<br>
		 * PASSWORD_IN
		 */
		public String getPasswordIn() {
			return passwordIn;
		}

		/**
		 * 转入账户密码<br>
		 * PASSWORD_IN
		 */
		public void setPasswordIn(String passwordIn) {
			this.passwordIn = passwordIn;
		}

		/**
		 * 金额<br>
		 * SAL
		 */
		public BigDecimal getSal() {
			return sal;
		}

		/**
		 * 金额<br>
		 * SAL
		 */
		public void setSal(BigDecimal sal) {
			this.sal = sal;
		}
	}
}
