
package com.dcits.ensemble.sequences;

import com.dcits.galaxy.business.sequences.AbstractGenerateSeq;


/**
 * @description
 * @version V1.0
 * @author Liang
 * @update 2015年2月2日 下午2:53:19
 */

public class CifClientKeySeq extends AbstractGenerateSeq {

	/**
	 * 类的构造方法
	 *
	 */
	public CifClientKeySeq() {
		super("cif.clientKey");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return
	 * @description 生成client_key
	 * @version 1.0
	 * @author Tim
	 * @update 2014年11月19日 下午3:02:10
	 */
	protected String generatePrivateClientKey() {
		String seqNo = null;
		long seq = generateSeqNo();
		seqNo = String.valueOf(seq);
		return seqNo;
	}
}
