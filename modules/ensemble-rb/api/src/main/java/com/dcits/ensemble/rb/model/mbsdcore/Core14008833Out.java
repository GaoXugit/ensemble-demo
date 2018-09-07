/*
 * <p>Title: Core14008833Out.java</p>
 * <p>Description: 存款服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-07 10:13:23</p>
 * @author 
 * @version v1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import com.dcits.galaxy.common.data.Response;

import java.io.Serializable;
import java.math.BigDecimal;


/***
 * 存款服务</br>
 * 2018-09-07 10:13:23
 *
 * @version v1.0
 * @since v1.0
 * @author 
 */
public class Core14008833Out extends Response {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 客户姓名<br>
	 * USER_NAME<br>
	 * seqNo:1<br>
	 * dataType:String<br>
	 * length:50<br>
     * scale:0<br>
	 * cons:
	 */
	private String userName;

	/**
	 * 证件号码<br>
	 * DOCUMENT_ID<br>
	 * seqNo:2<br>
	 * dataType:String<br>
	 * length:25<br>
     * scale:0<br>
	 * cons:
	 */
	private String documentId;

	/**
	 * 流水信息<br>
	 * BS_INFO<br>
	 * seqNo:3<br>
	 * dataType:String<br>
	 * length:200<br>
     * scale:0<br>
	 * cons:
	 */
	private String bsInfo;

	/**
	 * 余额<br>
	 * BAL<br>
	 * seqNo:4<br>
	 * dataType:Double<br>
	 * length:17<br>
     * scale:2<br>
	 * cons:
	 */
	private BigDecimal bal;
	private String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
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
	 * 流水信息<br>
	 * BS_INFO
	 */
	public String getBsInfo() {
		return bsInfo;
	}

	/**
	 * 流水信息<br>
	 * BS_INFO
	 */
	public void setBsInfo(String bsInfo) {
		this.bsInfo = bsInfo;
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
}
