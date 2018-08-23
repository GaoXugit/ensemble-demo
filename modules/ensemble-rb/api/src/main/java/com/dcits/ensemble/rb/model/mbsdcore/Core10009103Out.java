/**   
 * <p>Title: Core10009103Out.java</p>
 * <p>Description: 存款存入（demo）</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author nick
 * @update 20170215
 * @version V1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import com.dcits.galaxy.common.data.Response;

import java.math.BigDecimal;

/***
 * @description 存款存入（demo）
 * @version V1.0
 * @author nick
 * @update 20170215
 */
public class Core10009103Out extends Response {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 账号名称<br>
	 * ACCT_NAME<br>
	 * seqNo:1<br>
	 * dataType:String<br>
	 * length:50<br>
     
	 * cons:
	 */
	private String acctName;

	/**
	 * 创建时间<br>
	 * CREATE_TIME<br>
	 * seqNo:2<br>
	 * dataType:String<br>
	 * length:50<br>
     
	 * cons:
	 */
	private String createTime;

	/**
	 * 创建日期<br>
	 * CREATE_DATE<br>
	 * seqNo:3<br>
	 * dataType:String<br>
	 * length:8<br>
     
	 * cons:
	 */
	private String createDate;

	/**
	 * 金额<br>
	 * BAL<br>
	 * seqNo:4<br>
	 * dataType:Double<br>
	 * length:17<br>
     * length:2<br>
	 * cons:
	 */
	private BigDecimal bal;


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

	/**
	 * 金额<br>
	 * BAL
	 */
	public BigDecimal getBal() {
		return bal;
	}

	/**
	 * 金额<br>
	 * BAL
	 */
	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}
}
