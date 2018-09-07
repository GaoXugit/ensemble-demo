/*
 * <p>Title: Core14008841Out.java</p>
 * <p>Description: 转账服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-06 21:03:01</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import java.io.Serializable;
import com.dcits.galaxy.common.data.Response;

/***
 * 转账服务</br>
 * 2018-09-06 21:03:01
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
public class Core14008841Out extends Response {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 返回结果信息<br>
	 * RESULT_INFO<br>
	 * seqNo:1<br>
	 * dataType:String<br>
	 * length:255<br>
     * scale:0<br>
	 * cons:
	 */
	private String resultInfo;


	/**
	 * 返回结果信息<br>
	 * RESULT_INFO
	 */
	public String getResultInfo() {
		return resultInfo;
	}

	/**
	 * 返回结果信息<br>
	 * RESULT_INFO
	 */
	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}
}
