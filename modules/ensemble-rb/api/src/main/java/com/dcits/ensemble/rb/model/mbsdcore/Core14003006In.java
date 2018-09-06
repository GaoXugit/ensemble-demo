/*
 * <p>Title: Core14003006In.java</p>
 * <p>Description: 账户查询服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-04 19:58:44</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import java.io.Serializable;
import java.math.BigDecimal;

import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.common.validate.V;


/***
 * 账户查询服务</br>
 * 2018-09-04 19:58:44
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
public class Core14003006In extends Request {

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
		@V(desc = "姓名")
		private String acctName;
		@V(desc = "余额")
		private BigDecimal bal;
		@V(desc = "创建日期")
		private String create_date;
		@V(desc = "创建时间")
		private String create_time;

		public String getAcctName() {
			return acctName;
		}

		public void setAcctName(String acctName) {
			this.acctName = acctName;
		}

		public BigDecimal getBal() {
			return bal;
		}

		public void setBal(BigDecimal bal) {
			this.bal = bal;
		}

		public String getCreate_date() {
			return create_date;
		}

		public void setCreate_date(String create_date) {
			this.create_date = create_date;
		}

		public String getCreate_time() {
			return create_time;
		}

		public void setCreate_time(String create_time) {
			this.create_time = create_time;
		}

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
