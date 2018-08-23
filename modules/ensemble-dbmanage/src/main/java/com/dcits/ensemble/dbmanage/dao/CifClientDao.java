package com.dcits.ensemble.dbmanage.dao;

import com.dcits.ensemble.dbmanage.dbmodel.CifClient;
import com.dcits.galaxy.business.dao.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/04/08 00:12:21.
 */
@Repository
public class CifClientDao extends BaseDao {

    //The nameSpace that is defined in the mapper file
    private final String DEFAULT_NAME_SPACE = "CifClientDao";

    /**
     * This method corresponds to the database table CIF_CLIENT
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }

    public CifClient selectCifClientByClientNo(String clientNo) {
        Map<String, String> param = new HashMap();
        param.put("clientNo", clientNo);
        return selectOne("selectCifClientByClientNo", param);
    }
}