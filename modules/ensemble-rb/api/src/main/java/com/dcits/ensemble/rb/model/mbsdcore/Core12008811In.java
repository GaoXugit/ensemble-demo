/*
 * <p>Title: Core12008811In.java</p>
 * <p>Description: 开卡</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-07 11:19:47</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import java.io.Serializable;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.common.validate.V;

import java.math.BigDecimal;


/***
 * 开卡</br>
 * 2018-09-07 11:19:47
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
public class Core12008811In extends Request {

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
		 * 密码<br>
		 * PASSWORD<br>
		 * seqNo:1<br>
		 * dataType:String<br>
		 * length:6<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "密码", notNull = true)
		private String password;

		/**
		 * 确认密码<br>
		 * RPASSWORD<br>
		 * seqNo:2<br>
		 * dataType:String<br>
		 * length:6<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "确认密码")
		private String rpassword;

		/**
		 * 客户姓名<br>
		 * USER_NAME<br>
		 * seqNo:3<br>
		 * dataType:String<br>
		 * length:50<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "客户姓名", notNull = true)
		private String userName;

		/**
		 * 证件号码<br>
		 * DOCUMENT_ID<br>
		 * seqNo:4<br>
		 * dataType:String<br>
		 * length:25<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "证件号码", notNull = true)
		private String documentId;

		/**
		 * 余额<br>
		 * BAL<br>
		 * seqNo:5<br>
		 * dataType:Double<br>
		 * length:17<br>
		 * scale:2<br>
		 * cons:
		 */
        @V(desc = "余额", notNull = true)
		private BigDecimal bal;

		/**
		 * 卡种类<br>
		 * CARD_TYPE<br>
		 * seqNo:6<br>
		 * dataType:Integer<br>
		 * length:10<br>
		 * scale:0<br>
		 * cons:
		 */
        @V(desc = "卡种类", notNull = true)
		private Integer cardType;

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
		 * 确认密码<br>
		 * RPASSWORD
		 */
		public String getRpassword() {
			return rpassword;
		}

		/**
		 * 确认密码<br>
		 * RPASSWORD
		 */
		public void setRpassword(String rpassword) {
			this.rpassword = rpassword;
		}

		/**
		 * 客户姓名<br>
		 * USER_NAME
		 */
		public String getUserName() {
			return userName;
		}

		/**
		 * 客户姓名<br>
		 * USER_NAME
		 */
		public void setUserName(String userName) {
			this.userName = userName;
		}

		/**
		 * 证件号码<br>
		 * DOCUMENT_ID
		 */
		public String getDocumentId() {
			return documentId;
		}

		/**
		 * 证件号码<br>
		 * DOCUMENT_ID
		 */
		public void setDocumentId(String documentId) {
			this.documentId = documentId;
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

		/**
		 * 卡种类<br>
		 * CARD_TYPE
		 */
		public Integer getCardType() {
			return cardType;
		}

		/**
		 * 卡种类<br>
		 * CARD_TYPE
		 */
		public void setCardType(Integer cardType) {
			this.cardType = cardType;
		}
	}
}
