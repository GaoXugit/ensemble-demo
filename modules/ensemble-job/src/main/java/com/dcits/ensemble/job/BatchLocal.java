package com.dcits.ensemble.job;

import com.dcits.galaxy.business.batch.api.IBatchLocal;
import com.dcits.galaxy.business.common.Context;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.util.SeqUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BatchLocal implements IBatchLocal {

    private static Logger logger = LoggerFactory.getLogger(BatchLocal.class);

    @Override
    public Map getSystemParam() {
        Map map = new HashMap();
        map.put("runDate", "20150111");
        map.put("lastRunDate", "20150110");
        map.put("nextRunDate", "20150112");
        return map;
    }

    @Override
    public void taskInit() {
        Context.getInstance().setPlatformId(SeqUtils.getStringSeq());
        Context.getInstance().setRunDate((String) getSystemParam().get("runDate"));
        Context.getInstance().setLastRunDate((String) getSystemParam().get("lastRunDate"));
    }

    @Override
    public void taskRelease() {
        Context.getInstance().cleanResource();
    }

    @Override
    public BeanResult updateSystemDate(String s, String s1, String s2) {
        return null;
    }
}
