/*
 * <p>Title: ICore14008821.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author
 * @version V1.0
 */
package com.dcits.ensemble.rb.api.mbsdcore;


import com.dcits.ensemble.rb.model.mbsdcore.Core14008821In;
import com.dcits.galaxy.business.api.BusinessProcess;
import com.dcits.galaxy.common.data.BeanResult;

/***
 * 查询余额服务</br>
 * 2018-09-05 19:13:40
 *
 * @version V1.0
 * @author
 */
public interface ICore14008821 extends BusinessProcess {

    /**
     * 根据账号密码查询账户信息
     *
     * @param core14008821In
     * @return
     */
    public BeanResult queryCdIdPassWord(Core14008821In core14008821In);
}
