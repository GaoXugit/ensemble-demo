/*
 * <p>Title: Core14000205Out.java</p>
 * <p>Description: 查询交易</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-08-27 14:19:30</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.cl.model.mbsdcore;

import java.io.Serializable;
import com.dcits.galaxy.common.data.Response;

/***
 * 查询交易</br>
 * 2018-08-27 14:19:30
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
public class Core14000205Out extends Response {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 账号名称<br>
	 * ACCT_NAME<br>
	 * seqNo:1<br>
	 * dataType:String<br>
	 * length:10<br>
     * scale:0<br>
	 * cons:
	 */
	private String acctName;

	/**
	 * 创建日期<br>
	 * CREATE_DATE<br>
	 * seqNo:2<br>
	 * dataType:String<br>
	 * length:8<br>
     * scale:0<br>
	 * cons:
	 */
	private String createDate;

	/**
	 * 创建时间<br>
	 * CREATE_TIME<br>
	 * seqNo:3<br>
	 * dataType:String<br>
	 * length:17<br>
     * scale:0<br>
	 * cons:
	 */
	private String createTime;


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
}
