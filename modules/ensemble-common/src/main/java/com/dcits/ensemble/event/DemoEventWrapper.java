package com.dcits.ensemble.event;

import com.dcits.galaxy.business.api.EventWrapper;
import com.dcits.galaxy.business.model.EventNode;
import com.dcits.galaxy.business.model.EventRequest;
import org.springframework.stereotype.Repository;

/**
 * Created by Tim on 2016/4/22.
 */
@Repository("eventWrapper")
public class DemoEventWrapper implements EventWrapper {
    /**
     * 获取事件检查方法
     *
     * @param eventType   事件类型
     * @param prodType    产品类型
     * @param eventNodeId 事件节点ID
     * @return
     */
    @Override
    public EventNode getEventCalc(String eventType, String prodType, String eventNodeId) {
        EventNode eventNode = new EventNode();
        //eventNode.setAlias("haha");
        eventNode.setArgumentsSPEL(new String[]{"*"});
        eventNode.setArgumentsClazz(new Class[]{EventRequest.class});
        eventNode.setEventClazz(DemoEeventNode.class);
        eventNode.setMethod("calc");
        return eventNode;
    }

    /**
     * 获取事件提交方法
     *
     * @param eventType   事件类型
     * @param prodType    产品类型
     * @param eventNodeId 事件节点ID
     * @return
     */
    @Override
    public EventNode getEventSubmit(String eventType, String prodType, String eventNodeId) {
        EventNode eventNode = new EventNode();
        eventNode.setArgumentsSPEL(new String[]{"*"});
        eventNode.setArgumentsClazz(new Class[]{EventRequest.class});
        eventNode.setEventClazz(DemoEeventNode.class);
        eventNode.setMethod("submit");
        return eventNode;
    }

    /**
     * 获取产品类型的基础类型
     *
     * @param prodType
     * @return
     */
    @Override
    public String getBaseProdType(String prodType) {
        return null;
    }
}
