/*
 * <p>Title: Core14003006Out.java</p>
 * <p>Description: 账户查询服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-04 19:58:44</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import com.dcits.galaxy.common.data.Response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


/***
 * 账户查询服务</br>
 * 2018-09-04 19:58:44
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
public class Core14003006Out extends Response {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * aaaaa<br>
	 * map<br>
	 * seqNo:1<br>
	 * dataType:List<br>
	 * length:20<br>
     * scale:0<br>
	 * cons:
	 */
	private List<Map> map;


	/**
	 * aaaaa<br>
	 * map
	 */
	public List<Map> getMap() {
		return map;
	}

	/**
	 * aaaaa<br>
	 * map
	 */
	public void setMap(List<Map> map) {
		this.map = map;
	}





	/**
	 * @description aaaaa
	 * @since v1.0
	 */
	public static class Map implements Serializable {

		private static final long serialVersionUID = 1L;

		/**
		 * 账号名称<br>
		 * ACCT_NAME<br>
		 * seqNo:1.1<br>
		 * dataType:String<br>
	     * length:10<br>
         * scale:0<br>
		 * cons:
		 */
		private String acctName;

		/**
		 * 余额<br>
		 * BAL<br>
		 * seqNo:1.2<br>
		 * dataType:Double<br>
	     * length:17<br>
         * scale:2<br>
		 * cons:
		 */
		private BigDecimal bal;

		/**
		 * 创建时间<br>
		 * CREATE_TIME<br>
		 * seqNo:1.3<br>
		 * dataType:String<br>
	     * length:17<br>
         * scale:0<br>
		 * cons:
		 */
		private String createTime;

		/**
		 * 创建日期<br>
		 * CREATE_DATE<br>
		 * seqNo:1.4<br>
		 * dataType:String<br>
	     * length:8<br>
         * scale:0<br>
		 * cons:
		 */
		private String createDate;


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
		 * 创建时间<br>
		 * CREATE_TIME
		 */
		public String getCreateTime() {
			return createTime;
		}

		/**
		 * 创建时间<br>
		 * CREATE_TIME
		 */
		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		/**
		 * 创建日期<br>
		 * CREATE_DATE
		 */
		public String getCreateDate() {
			return createDate;
		}

		/**
		 * 创建日期<br>
		 * CREATE_DATE
		 */
		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}
	}
}
