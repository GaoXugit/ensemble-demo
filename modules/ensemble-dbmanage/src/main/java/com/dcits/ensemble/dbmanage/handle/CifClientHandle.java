package com.dcits.ensemble.dbmanage.handle;

import com.dcits.ensemble.dbmanage.dbmodel.CifClient;
import com.dcits.ensemble.dbmanage.dao.CifClientDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by daiduan on 2017/4/8.
 */
@Service
public class CifClientHandle {
    @Resource
    CifClientDao cifClientDao;

    public void addClientInfo(CifClient cifClient) {
        cifClientDao.insert(cifClient);
    }

    public void updateClientInfo(CifClient newCifClient) {
        cifClientDao.updateByPrimaryKey(newCifClient);
    }
}
