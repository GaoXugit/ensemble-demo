package com.dcits.ensemble.dbmanage.handle;

import javax.annotation.Resource;

import com.dcits.ensemble.dbmanage.dbmodel.CifClient9101;
import com.dcits.ensemble.dbmanage.dao.CifClient9101Dao;
import org.springframework.stereotype.Service;

/**
 * Created by daiduan on 2017/4/8.
 */
@Service
public class CifClient9101Handle {
    @Resource
    CifClient9101Dao cifClient9101Dao;

    public void addClientInfo(CifClient9101 cifClient9101) {
        cifClient9101Dao.insert(cifClient9101);
    }
}
