package com.dcits.ensemble.dbmanage.dao;

import com.dcits.ensemble.dbmanage.dbmodel.CifClient9101;
import com.dcits.galaxy.business.dao.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/04/08 10:40:24.
 */
@Repository
public class CifClient9101Dao extends BaseDao {

    //The nameSpace that is defined in the mapper file
    private final String DEFAULT_NAME_SPACE = "CifClient9101Dao";

    /**
     * This method corresponds to the database table CIF_CLIENT_9101
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }

    public CifClient9101 selectCifClientByClientNo(String clientNo) {
        Map<String, String> param = new HashMap();
        param.put("clientNo", clientNo);
        return selectOne("selectCifClientByClientNo", param);
    }
}