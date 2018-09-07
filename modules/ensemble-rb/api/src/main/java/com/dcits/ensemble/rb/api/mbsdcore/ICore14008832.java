/*
 * <p>Title: ICore14008832.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author
 * @version V1.0
 */
package com.dcits.ensemble.rb.api.mbsdcore;


import com.dcits.ensemble.rb.model.mbsdcore.Core14008832In;
import com.dcits.galaxy.business.api.BusinessProcess;
import com.dcits.galaxy.common.data.BeanResult;

/***
 * 取款服务</br>
 * 2018-09-06 11:27:29
 *
 * @version V1.0
 * @author
 */
public interface ICore14008832 extends BusinessProcess {
    //TODO 取款服务
    public BeanResult putMoney(Core14008832In core14008832in);

}
