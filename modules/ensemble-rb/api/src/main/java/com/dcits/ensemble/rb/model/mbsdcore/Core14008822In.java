/*
 * <p>Title: Core14008822In.java</p>
 * <p>Description: 查询流水服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-06 08:07:00</p>
 * @author
 * @version v1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import java.io.Serializable;
import com.dcits.galaxy.common.data.Request;

import com.dcits.galaxy.common.validate.V;

/***
 * 查询流水服务</br>
 * 2018-09-06 08:07:00
 *
 * @version v1.0
 * @since v1.0
 * @author
 */
public class Core14008822In extends Request {

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
		 * 密码<br>
		 * PASSWORD<br>
		 * seqNo:2<br>
		 * dataType:String<br>
		 * length:6<br>
		 * scale:0<br>
		 * cons:
		 */
		@V(desc = "密码")
		private String password;

		/**
		 * 开始日期<br>
		 * START_DATE<br>
		 * seqNo:3<br>
		 * dataType:String<br>
		 * length:8<br>
		 * scale:0<br>
		 * cons:
		 */
		@V(desc = "开始日期")
		private String startDate;

		/**
		 * 终止日期<br>
		 * END_DATE<br>
		 * seqNo:4<br>
		 * dataType:String<br>
		 * length:8<br>
		 * scale:0<br>
		 * cons:
		 */
		@V(desc = "终止日期")
		private String endDate;

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
		 * 开始日期<br>
		 * START_DATE
		 */
		public String getStartDate() {
			return startDate;
		}

		/**
		 * 开始日期<br>
		 * START_DATE
		 */
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		/**
		 * 终止日期<br>
		 * END_DATE
		 */
		public String getEndDate() {
			return endDate;
		}

		/**
		 * 终止日期<br>
		 * END_DATE
		 */
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
	}
}
