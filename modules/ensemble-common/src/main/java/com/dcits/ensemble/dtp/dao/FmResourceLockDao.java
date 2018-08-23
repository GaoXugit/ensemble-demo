package com.dcits.ensemble.dtp.dao;

import com.dcits.galaxy.business.dao.BaseDao;
import com.dcits.ensemble.dtp.dbmodule.FmResourceLock;
import com.dcits.galaxy.business.util.BusinessUtils;
import org.springframework.stereotype.Repository;

/**
 * Created by Tim on 2015/08/21 13:26:49.
 */
@Repository
public class FmResourceLockDao extends BaseDao {

    //Mapper文件定义的NameSpace
    private final String DEFAULT_NAME_SPACE = "com.dcits.ensemble.dtp.dao.FmResourceLockDao";

    /**
     * This method corresponds to the database table FM_RESOURCE_LOCK
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }

    /**
     * 检查资源是否上锁
     *
     * @param moduleId
     * @param txid
     * @param resourceId
     * @return
     */
    public boolean checkResourceLock(String moduleId, String resourceId, String txid) {
        FmResourceLock out = super.selectByPrimaryKey(new FmResourceLock(), moduleId, resourceId);
        if (BusinessUtils.isNull(out)) {
            // 资源锁定不存在
            return false;
        } else {
            // 资源锁定存在，如果同事务id，认为为同一事务内的事务处理，检查为未加锁
            if (out.getTxid().equals(txid)) {
                return false;
            }
            return true;
        }
    }

    public boolean unLockResource(String txid, String resourceId) {
        FmResourceLock unLock = new FmResourceLock();
        unLock.setTxid(txid);
        unLock.setResourceId(resourceId);
        int i = super.delete(getNameSpace(), "unLockResource", unLock);
        if (i != 1) {
            return false;
        }
        return true;
    }
}