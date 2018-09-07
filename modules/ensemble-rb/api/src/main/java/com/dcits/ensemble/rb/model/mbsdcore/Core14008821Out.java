/*
 * <p>Title: Core14008821Out.java</p>
 * <p>Description: 查询余额服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-05 19:13:40</p>
 * @author
 * @version v1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import com.dcits.galaxy.common.data.Response;

import java.math.BigDecimal;


/***
 * 查询余额服务</br>
 * 2018-09-05 19:13:40
 *
 * @version v1.0
 * @since v1.0
 * @author
 */
public class Core14008821Out extends Response {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户姓名<br>
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
	 * 余额<br>
	 * BAL<br>
	 * seqNo:3<br>
	 * dataType:Double<br>
	 * length:17<br>
	 * scale:2<br>
	 * cons:
	 */
	private BigDecimal bal;

	/**
	 * 创建时间<br>
	 * CREATE_TIME<br>
	 * seqNo:4<br>
	 * dataType:String<br>
	 * length:17<br>
	 * scale:0<br>
	 * cons:
	 */
	private String createTime;

	/**
	 * 卡种类<br>
	 * CARD_TYPE<br>
	 * seqNo:5<br>
	 * dataType:Double<br>
	 * length:1<br>
	 * scale:0<br>
	 * cons:
	 */
	private int cardType;


	/**
	 * 用户姓名<br>
	 * USER_NAME
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 用户姓名<br>
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
	 * 卡种类<br>
	 * CARD_TYPE
	 */
	public int getCardType() {
		return cardType;
	}

	/**
	 * 卡种类<br>
	 * CARD_TYPE
	 */
	public void setCardType(int cardType) {
		this.cardType = cardType;
	}
}
