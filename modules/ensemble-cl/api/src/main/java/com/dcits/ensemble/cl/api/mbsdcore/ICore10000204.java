/**
 * <p>Title: ICore10000204.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 *
 * @author Tim
 * @update 20150926
 * @version V1.0
 */
package com.dcits.ensemble.cl.api.mbsdcore;

import com.dcits.galaxy.business.api.BusinessProcess;
import com.dcits.galaxy.common.data.BeanResult;

import java.math.BigDecimal;

/**
 * @author Tim
 * @version V1.0
 * @description 贷款还款（demo）
 * @update 20150926
 */
public interface ICore10000204 extends BusinessProcess {

    BeanResult recycle(String acctNo, BigDecimal bal);

}
