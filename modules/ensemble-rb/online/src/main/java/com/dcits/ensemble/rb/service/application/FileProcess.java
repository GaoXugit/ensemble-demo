package com.dcits.ensemble.rb.service.application;

import com.dcits.ensemble.rb.api.inner.IFileProcess;
import com.dcits.galaxy.util.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Tim on 2016/2/1.
 */
public class FileProcess implements IFileProcess {
    private static final Logger log = LoggerFactory
            .getLogger(FileProcess.class);

    /**
     * 9901文件处理接口
     *
     * @param batchNo
     */
    @Override
    public void file9901Process(String batchNo) {
        if (log.isDebugEnabled())
            log.debug("批量文件处理流水号 [" + batchNo + "]！");

        for (int i = 0; i < 10; i++) {
            if (log.isDebugEnabled())
                log.debug("第 [" + i + "] 次，等待 [1] 秒！");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                log.error(ExceptionUtils.getStackTrace(e));
            }
        }
    }
}
