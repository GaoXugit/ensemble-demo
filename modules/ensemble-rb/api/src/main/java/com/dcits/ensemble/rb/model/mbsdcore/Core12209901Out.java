/**   
 * <p>Title: Core12209901Out.java</p>
 * <p>Description: 批量文件处理</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Tim
 * @update 20160201
 * @version V1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import com.dcits.galaxy.common.data.Response;

/***
 * @description 批量文件处理
 * @version V1.0
 * @author Tim
 * @update 20160201
 */
public class Core12209901Out extends Response {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 批处理流水号<br>
	 * BATCH_NO<br>
	 * seqNo:1<br>
	 * dataType:String<br>
	 * length:50<br>
     
	 * cons:
	 */
	private String batchNo;


	/**
	 * 批处理流水号<br>
	 * BATCH_NO
	 */
	public String getBatchNo() {
		return batchNo;
	}

	/**
	 * 批处理流水号<br>
	 * BATCH_NO
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
}
