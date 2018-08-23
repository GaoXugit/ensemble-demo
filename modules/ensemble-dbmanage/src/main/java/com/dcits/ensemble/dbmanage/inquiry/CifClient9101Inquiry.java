package com.dcits.ensemble.dbmanage.inquiry;

import javax.annotation.Resource;

import com.dcits.ensemble.dbmanage.dao.CifClient9101Dao;
import com.dcits.ensemble.dbmanage.dbmodel.CifClient9101;
import com.dcits.galaxy.business.util.BusinessUtils;
import org.springframework.stereotype.Service;

/**
 * Created by daiduan on 2017/4/8.
 */
@Service
public class CifClient9101Inquiry {
    @Resource
    CifClient9101Dao cifClient9101Dao;

    public CifClient9101 selectCifClientByClientNo(String clientNo) {
        if (null == clientNo) {
            throw BusinessUtils.createBusinessException("客户号不能为空！");
        }
        return cifClient9101Dao.selectCifClientByClientNo(clientNo);
    }
}
