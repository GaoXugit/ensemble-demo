package com.dcits.ensemble.common;

import com.dcits.galaxy.business.api.AfterService;
import com.dcits.galaxy.business.common.Context;
import com.dcits.galaxy.common.data.BaseRequest;
import com.dcits.galaxy.common.data.BeanResult;
import org.springframework.stereotype.Service;

/**
 * Created by Tim on 2015/9/26.
 */

@Service
public class BusiAfterService implements AfterService<BaseRequest> {
    @Override
    public void afterProcess(BaseRequest request, BeanResult beanResult) {
        Context context = Context.getInstance();
        //清理上下文内容
        context.cleanResource();
    }
}
