/**   
 * <p>Title: ICore10000203.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Tim
 * @update 20150926
 * @version V1.0
 */
package com.dcits.ensemble.cl.api.mbsdcore;

import com.dcits.galaxy.business.api.BusinessProcess;
import com.dcits.galaxy.common.data.BeanResult;

import java.math.BigDecimal;

/***
 * @description 贷款发放（demo）
 * @version V1.0
 * @author Tim
 * @update 20150926
 */
public interface ICore10000203 extends BusinessProcess {

    BeanResult drawdown(String acctNo, BigDecimal bal);

}
