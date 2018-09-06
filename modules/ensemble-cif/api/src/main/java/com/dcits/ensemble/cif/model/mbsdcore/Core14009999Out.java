/*
 * <p>Title: Core14009999Out.java</p>
 * <p>Description: 1111</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-04 19:28:43</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.cif.model.mbsdcore;


import com.dcits.galaxy.common.data.Response;

/***
 * 1111</br>
 * 2018-09-04 19:28:43
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
public class Core14009999Out extends Response {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 创建时间<br>
	 * CREATE_TIME<br>
	 * seqNo:1<br>
	 * dataType:String<br>
	 * length:17<br>
     * scale:0<br>
	 * cons:
	 */
	private String createTime;


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
