package com.dcits.ensemble.dtp.dbmodule;

import com.dcits.galaxy.common.bean.AbstractBean;
import com.dcits.galaxy.dal.annotation.TablePk;

/**
 * Created by guotao on 2015/08/21 13:26:49.
 */
public class FmResourceLock extends AbstractBean {

    // serialVersionUID
    private static final long serialVersionUID = 1L;

    /**
     * This field is FM_RESOURCE_LOCK.MODULE_ID 模块
     */
    @TablePk(index = 1)
    private String moduleId;
    /**
     * This field is FM_RESOURCE_LOCK.RESOURCE_ID 资源ID
     */
    @TablePk(index = 2)
    private String resourceId;

    /**
     * This field is FM_RESOURCE_LOCK.STATUS 状态 L-锁定
     */
    private String status;
    /**
     * This field is FM_RESOURCE_LOCK.TXID 事务ID
     */
    private String txid;

    /**
     * @return the value of  FM_RESOURCE_LOCK.MODULE_ID 模块
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * @param moduleId the value for FM_RESOURCE_LOCK.MODULE_ID 模块
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }
    /**
     * @return the value of  FM_RESOURCE_LOCK.RESOURCE_ID 资源ID
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * @param resourceId the value for FM_RESOURCE_LOCK.RESOURCE_ID 资源ID
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }
    /**
     * @return the value of  FM_RESOURCE_LOCK.STATUS 状态 L-锁定
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the value for FM_RESOURCE_LOCK.STATUS 状态 L-锁定
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
    /**
     * @return the value of  FM_RESOURCE_LOCK.TXID 事务ID
     */
    public String getTxid() {
        return txid;
    }

    /**
     * @param txid the value for FM_RESOURCE_LOCK.TXID 事务ID
     */
    public void setTxid(String txid) {
        this.txid = txid == null ? null : txid.trim();
    }
}