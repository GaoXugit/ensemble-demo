package com.dcits.ensemble.sequences;

/**
 * @description 
 * @version V1.0
 * @author Tim
 * @update 2014年11月21日 下午1:35:20 
 */

public class CifSequences {

	/**
	 * @return
	 * @description 生成对公客户号
	 * @version 1.0
	 * @author Tim
	 * @update 2014年11月19日 下午3:02:10
	 */
	public static String generatePublicClientNo() {
		return new CifClientNoSeq().generatePublicClientNo();
	}

	/**
	 * @return
	 * @description 生成对私客户号
	 * @version 1.0
	 * @author Tim
	 * @update 2014年11月19日 下午3:02:10
	 */
	public static String generatePrivateClientNo() {
		return new CifClientNoSeq().generatePrivateClientNo();
	}

	/**
	 * @return
	 * @description 生成client_key
	 * @version 1.0
	 * @author Tim
	 * @update 2014年11月19日 下午3:02:10
	 */
	public static String generatePrivateClientKey() {
		return new CifClientKeySeq().generatePrivateClientKey();
	}
}
