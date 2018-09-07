/*
 * <p>Title: ICore14008822.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author
 * @version V1.0
 */
package com.dcits.ensemble.rb.api.mbsdcore;


import com.dcits.ensemble.rb.model.mbsdcore.Core14008821In;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008822In;
import com.dcits.galaxy.business.api.BusinessProcess;
import com.dcits.galaxy.common.data.BeanResult;

/***
 * 查询流水服务</br>
 * 2018-09-06 08:07:00
 *
 * @version V1.0
 * @author
 */
public interface ICore14008822 extends BusinessProcess {

    /**
     * 根据账号、密码、起始时间、终止时间查询流水
     *
     * @param core14008822In
     * @return
     */
    public BeanResult queryCdIdInfoBS(Core14008822In core14008822In);
}
