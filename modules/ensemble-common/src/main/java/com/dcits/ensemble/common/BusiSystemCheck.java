package com.dcits.ensemble.common;

import com.dcits.galaxy.business.api.SystemCheck;
import com.dcits.galaxy.business.common.Context;
import com.dcits.galaxy.common.data.BaseRequest;
import com.dcits.galaxy.common.data.BeanResult;
import org.springframework.stereotype.Service;

/**
 * Created by Tim on 2015/9/26.
 */

@Service
public class BusiSystemCheck implements SystemCheck<BaseRequest> {
    @Override
    public BeanResult systemCheck(BaseRequest request) {
        // 设置上下文全局缓存
        Context context = Context.getInstance();
        // 设置系统头上下文
        context.setSysHead(request.getSysHead());
        // 在这里为系统投的runDate赋值，响应可以输出运行日期
        request.getSysHead().setRunDate("20190101");
  /*      context.setProperty("haha", "heihei");
        String bb = context.getProperty("haha");

        context.setObject("haha","heihei");

        String aa = (String) context.getObject("haha");*/

        return new BeanResult();
    }
}
