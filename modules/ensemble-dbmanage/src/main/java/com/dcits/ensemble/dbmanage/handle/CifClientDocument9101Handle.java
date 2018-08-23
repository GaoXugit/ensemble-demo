package com.dcits.ensemble.dbmanage.handle;

import java.util.List;

import javax.annotation.Resource;

import com.dcits.ensemble.dbmanage.dbmodel.CifClientDocument9101;
import com.dcits.ensemble.dbmanage.dao.CifClientDocument9101Dao;
import org.springframework.stereotype.Service;

/**
 * Created by daiduan on 2017/4/8.
 */
@Service
public class CifClientDocument9101Handle {
    @Resource
    CifClientDocument9101Dao cifClientDocument9101Dao;

    public void addDocumentInfo(List<CifClientDocument9101> document9101s) {
        for (CifClientDocument9101 document9101 : document9101s) {
            cifClientDocument9101Dao.insert(document9101);
        }
    }
}
