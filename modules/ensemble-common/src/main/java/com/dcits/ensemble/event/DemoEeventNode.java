package com.dcits.ensemble.event;

import com.dcits.galaxy.business.model.EventRequest;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Tim on 2016/4/22.
 */
public class DemoEeventNode {

    private static final Logger log = LoggerFactory.getLogger(DemoEeventNode.class);

    public BeanResult calc(EventRequest request) {
        if (log.isDebugEnabled())
            log.debug("~~~~~~~~This is calc~~~~~~~~");
        if (false)
            throw new BusinessException("999999","This is error!");
        return new BeanResult();
    }


    public BeanResult submit(EventRequest request) {
        if (log.isDebugEnabled())
            log.debug("~~~~~~~~This is submit~~~~~~~~");
        return new BeanResult();
    }
}
