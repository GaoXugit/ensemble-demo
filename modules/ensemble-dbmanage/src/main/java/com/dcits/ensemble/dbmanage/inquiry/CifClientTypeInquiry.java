package com.dcits.ensemble.dbmanage.inquiry;

import javax.annotation.Resource;

import com.dcits.ensemble.dbmanage.dao.CifClientTypeDao;
import com.dcits.ensemble.dbmanage.dbmodel.CifClientType;
import org.springframework.stereotype.Service;

/**
 * Created by daiduan on 2017/4/8.
 */
@Service
public class CifClientTypeInquiry {
    @Resource
    CifClientTypeDao cifClientTypeDao;

    public CifClientType selectByClientType(String clientType) {
        return cifClientTypeDao.selectByPrimaryKey(new CifClientType(), clientType);
    }
}
