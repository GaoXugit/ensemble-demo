package com.dcits.ensemble.common;

import com.dcits.galaxy.common.GalaxyConstants;

/**
 * Connector的常量
 * 
 * @author xuecy
 * 
 */
public class EnsembleConstants extends GalaxyConstants {

	/**
	 * 共享内存bean id
	 * 
	 * @fields SHARED_JEDIS_POOL
	 */
	public static final String SHARED_JEDIS_POOL = "sharedJedisPool";

	/**
	 * ensemble序列号KEY
	 * 
	 * @fields ENSEMBLE_SEQUENCES
	 */
	public static final String ENSEMBLE_SEQUENCES = "ensemble.sequences";

	public static final String TRAN_TYPE = "tranType";

	public static final String TRAN_CODE = "tranCode";

	/**
	 * 中文
	 */
	public static final String ZH_LANGUAGE = "CHINESE";

	/**
	 * 英文
	 */
	public static final String EN_LANGUAGE = "AMERICAN/ENGLISH";

	/** 
	 * AIO产品参数配置
	 * 
	 * @fields PROD_A 
	 */ 
	public static final String PROD_A = "com.dcits.ensemble.prod.A";

	/** 
	 * 活期产品参数配置
	 * 
	 * @fields PROD_C 
	 */ 
	public static final String PROD_C = "com.dcits.ensemble.prod.C";

	/** 
	 * 定期产品参数配置
	 * 
	 * @fields PROD_T 
	 */ 
	public static final String PROD_T = "com.dcits.ensemble.prod.T";

	/** 
	 * 往来帐产品参数配置
	 * 
	 * @fields PROD_N 
	 */ 
	public static final String PROD_N = "com.dcits.ensemble.prod.N";

	/** 
	 * 来帐产品参数配置
	 * 
	 * @fields PROD_V 
	 */ 
	public static final String PROD_V = "com.dcits.ensemble.prod.V";

	/**
	 *  内部帐产品参数配置
	 *  
	 * @fields PROD_I 
	 */ 
	public static final String PROD_I = "com.dcits.ensemble.prod.I";

}
