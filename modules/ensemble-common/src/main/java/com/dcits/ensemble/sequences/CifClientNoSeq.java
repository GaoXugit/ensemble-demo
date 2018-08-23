/**   
 * <p>Title: FmClientNoSeq.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: dcits</p>
 * @author Tim
 * @update 2014年11月19日 下午2:14:27
 * @version V1.0
 */
package com.dcits.ensemble.sequences;

import com.dcits.galaxy.business.sequences.AbstractGenerateSeq;
import com.dcits.galaxy.util.StringUtils;

/**
 * clientNo序列号生成器
 * 
 * @description
 * @version V1.0
 * @author Tim
 * @update 2014年11月19日 下午2:14:27
 */

public class CifClientNoSeq extends AbstractGenerateSeq {


	/**
	 * 对父类sequenceName赋值
	 * 
	 * 类的构造方法
	 */
	protected CifClientNoSeq() {
		super("cif.clientNo");
	}

	/**
	 * @return
	 * @description 生成对公客户号
	 * @version 1.0
	 * @author Tim
	 * @update 2014年11月19日 下午3:02:10
	 */
	protected String generatePublicClientNo() {
		String seqNo = null;
		long seq = generateSeqNo();
		seqNo = String.valueOf(seq);
		seqNo = "2" + StringUtils.lfillStr(seqNo, 9, "0");
		return seqNo;
	}

	/**
	 * @return
	 * @description 生成对私客户号
	 * @version 1.0
	 * @author Tim
	 * @update 2014年11月19日 下午3:02:10
	 */
	protected String generatePrivateClientNo() {
		String seqNo = null;
		long seq = generateSeqNo();
		seqNo = String.valueOf(seq);
		seqNo = "1" + StringUtils.lfillStr(seqNo, 9, "0");
		return seqNo;
	}
}
