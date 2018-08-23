package com.dcits.ensemble.business;

import com.dcits.galaxy.business.common.Context;
import com.dcits.galaxy.business.support.AbstractProcess;
import com.dcits.galaxy.common.data.BaseRequest;
import com.dcits.galaxy.common.data.BaseResponse;

/**
 * Created by Tim on 2015/8/26.
 */
public abstract class AbstractService extends AbstractProcess<BaseRequest, BaseResponse> {

    /**
     * 服务前处理
     *
     * @param request
     */
    @Override
    public void beforeProcess(BaseRequest request) {
        // 设置
        Context.getInstance().setDtpFlag(request.getDtpFlag());
    }

    /**
     * 服务后处理
     *
     * @param request
     * @param response
     */
    @Override
    public void afterProcess(BaseRequest request, BaseResponse response) {
    }
}
