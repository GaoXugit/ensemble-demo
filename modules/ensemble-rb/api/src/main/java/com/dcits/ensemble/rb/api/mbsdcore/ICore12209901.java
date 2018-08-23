/**
 * <p>Title: IFil12209901.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 *
 * @author Tim
 * @update 20160201
 * @version V1.0
 */
package com.dcits.ensemble.rb.api.mbsdcore;

import com.dcits.galaxy.business.api.BusinessProcess;
import com.dcits.galaxy.common.data.BeanResult;

/***
 * @description 批量文件处理
 * @version V1.0
 * @author Tim
 * @update 20160201
 */
public interface ICore12209901 extends BusinessProcess {

    BeanResult executeFile(String filePath);

}
