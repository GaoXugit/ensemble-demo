/**   
 * <p>Title: Core12009200Out.java</p>
 * <p>Description: 客户信息维护</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author admin
 * @update 20170410
 * @version V1.0
 */
package com.dcits.ensemble.cif.model.mbsdcore;

import com.dcits.galaxy.common.data.Response;

/***
 * @description 客户信息维护
 * @version V1.0
 * @author admin
 * @update 20170410
 */
public class Core12009200Out extends Response {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 客户号<br>
	 * CLIENT_NO<br>
	 * seqNo:1<br>
	 * dataType:String<br>
	 * length:12<br>
     
	 * cons:
	 */
	private String clientNo;


	/**
	 * 客户号<br>
	 * CLIENT_NO
	 */
	public String getClientNo() {
		return clientNo;
	}

	/**
	 * 客户号<br>
	 * CLIENT_NO
	 */
	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}
}
