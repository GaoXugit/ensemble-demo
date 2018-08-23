package com.dcits.ensemble.dbmanage.inquiry;

import com.dcits.ensemble.dbmanage.dao.CifClientDao;
import com.dcits.ensemble.dbmanage.dbmodel.CifClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by daiduan on 2017/4/8.
 */
@Service
public class CifClientInquiry {
    @Resource
    CifClientDao cifClientDao;

    public CifClient selectCifClientByClientNo(String clientNo) {
        return cifClientDao.selectCifClientByClientNo(clientNo);
    }
}
