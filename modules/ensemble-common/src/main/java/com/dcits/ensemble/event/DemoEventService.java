package com.dcits.ensemble.event;

import com.dcits.galaxy.common.bean.AbstractBean;
import com.dcits.galaxy.common.tuple.ThreeTuple;
import org.springframework.stereotype.Repository;

/**
 * Created by Tim on 2016/4/22.
 */
@Repository
public class DemoEventService {
    public ThreeTuple<String, String, AbstractBean> getEeventInfo() {
        return new ThreeTuple<>("RB203", "WTD", null);
    }
}
