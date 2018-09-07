/*
 * <p>Title: ICore14008841.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Author
 * @version V1.0
 */
package com.dcits.ensemble.rb.api.mbsdcore;

import com.dcits.ensemble.rb.model.mbsdcore.Core14008841In;
import com.dcits.galaxy.business.api.BusinessProcess;
import com.dcits.galaxy.common.data.BeanResult;

/***
 * 转账服务</br>
 * 2018-09-06 21:03:01
 *
 * @version V1.0
 * @author Author
 */
public interface ICore14008841 extends BusinessProcess {
    public BeanResult getManyToOther(Core14008841In core14008841in);

}
