/*
 * <p>Title: ICore14008833.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author 
 * @version V1.0
 */
package com.dcits.ensemble.rb.api.mbsdcore;


import com.dcits.ensemble.rb.model.mbsdcore.Core14008833In;
import com.dcits.galaxy.business.api.BusinessProcess;
import com.dcits.galaxy.common.data.BeanResult;

/***
 * 存款服务</br>
 * 2018-09-07 10:13:23
 *
 * @version V1.0
 * @author 
 */
public interface ICore14008833 extends BusinessProcess {
    public BeanResult saveMoney(Core14008833In core14008833in);
}
