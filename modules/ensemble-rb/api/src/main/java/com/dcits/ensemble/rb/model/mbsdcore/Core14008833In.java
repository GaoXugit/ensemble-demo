/*
 * <p>Title: Core14008833In.java</p>
 * <p>Description: 存款服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-07 10:13:23</p>
 * @author 
 * @version v1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import java.io.Serializable;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.common.validate.V;

import java.math.BigDecimal;


/***
 * 存款服务</br>
 * 2018-09-07 10:13:23
 *
 * @version v1.0
 * @since v1.0
 * @author 
 */
public class Core14008833In extends Request {

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
		 * length:10<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "银行卡号", notNull = true)
		private Integer cdId;

		/**
		 * 密码<br>
		 * PASSWORD<br>
		 * seqNo:2<br>
		 * dataType:String<br>
		 * length:6<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "密码", notNull = true)
		private String password;

		/**
		 * 金额<br>
		 * SAL<br>
		 * seqNo:3<br>
		 * dataType:Double<br>
		 * length:17<br>
		 * scale:2<br>
		 * cons:
		 */
        @V(desc = "金额", notNull = true)
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
