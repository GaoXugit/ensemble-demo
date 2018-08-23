/**   
 * <p>Title: ModelTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: dcits</p>
 * @author Tim
 * @update 2014年12月31日 下午3:34:59
 * @version V1.0
 */
package com.dcits.ensemble.test.model;

import com.dcits.ensemble.test.TestBase;
import com.dcits.galaxy.business.util.BusinessUtils;

/**
 * @description
 * @version V1.0
 * @author Tim
 * @update 2014年12月31日 下午3:34:59
 */

public class ModelTest extends TestBase {

	public void testModel() {
		try {

			throw BusinessUtils.createBusinessException("111");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
