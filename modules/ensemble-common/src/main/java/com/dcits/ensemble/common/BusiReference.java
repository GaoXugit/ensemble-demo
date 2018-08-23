package com.dcits.ensemble.common;

import com.dcits.ensemble.sequences.Sequences;
import com.dcits.galaxy.business.api.BusinessTraceNo;
import com.dcits.galaxy.util.DateUtils;
import org.springframework.stereotype.Service;

/**
 * Created by Tim on 2015/9/26.
 */
@Service("businessTraceNo")
public class BusiReference implements BusinessTraceNo {

    @Override
    public String generator() {
        return Sequences.getReferenceNo(DateUtils.getDate());
    }

}
