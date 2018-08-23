/**
 * <p>Title: Fil12209901.java</p>
 * <p>Description: 批量文件处理</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 *
 * @author Tim
 * @update 20160201
 * @version V1.0
 */
package com.dcits.ensemble.rb.service.mbsdcore;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.rb.api.inner.IFileProcess;
import com.dcits.ensemble.rb.api.mbsdcore.ICore12209901;
import com.dcits.ensemble.rb.model.mbsdcore.Core12209901In;
import com.dcits.ensemble.rb.model.mbsdcore.Core12209901Out;
import com.dcits.galaxy.client.ServiceProxy;
import com.dcits.galaxy.client.builder.Attributes;
import com.dcits.galaxy.client.builder.AttributesBuilderSupport;
import com.dcits.galaxy.client.builder.ServiceAttributesBuilder;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Tim
 * @version V1.0
 * @description 批量文件处理
 * @update 20160201
 */
@Service
public class Core12209901 extends AbstractService implements ICore12209901 {
    private static final Logger log = LoggerFactory.getLogger(Core12209901.class);

    //使用异步配置的服务引用
    @Resource
    IFileProcess asyncFileProcess;

    @Override
    public Class<? extends Request> getRequestModel() {
        return Core12209901In.class;
    }

    /**
     * 异步处理实现的主函数入口
     *
     * @param filePath
     * @return
     */
    @Override
    public BeanResult executeFile(String filePath) {

        log.debug("服务执行开始");
        // 生成批量处理文件流水号，这里给默认值
        String batchNo = "File00001";

        // 这里读取文件，将记录插入批量主表与子表处理
        // 业务处理部分省略

        // 异步处理具体的业务，使用RPC服务的异步处理机制完成异步处理功能
        //asyncFileProcess.file9901Process(batchNo);

        /** API调用方式
         */
        Attributes attributes = new ServiceAttributesBuilder()
                .setLoadbalance(AttributesBuilderSupport.LOADBALANCE_RANDOM)
                .setCheck(false)
                .setAsync(true)
                .setScope(ServiceAttributesBuilder.SCOPE_REMOTE)
//                .setRemote(true)
                .build();
        IFileProcess ifp = ServiceProxy.getInstance().getService(IFileProcess.class, attributes);
        ifp.file9901Process(batchNo);

        log.debug("服务执行完毕");
        // 异步调起后，不等待处理结果，直接返回批次处理流水号
        Core12209901Out out = new Core12209901Out();
        out.setBatchNo(batchNo);
        BeanResult br = new BeanResult(out);
        return br;
    }
}
