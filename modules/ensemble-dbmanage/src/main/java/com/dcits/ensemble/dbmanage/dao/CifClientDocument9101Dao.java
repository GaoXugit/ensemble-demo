package com.dcits.ensemble.dbmanage.dao;

import com.dcits.ensemble.dbmanage.dbmodel.CifClientDocument9101;
import com.dcits.galaxy.business.dao.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/04/08 16:12:53.
 */
@Repository
public class CifClientDocument9101Dao extends BaseDao {

    //The nameSpace that is defined in the mapper file
    private final String DEFAULT_NAME_SPACE = "CifClientDocument9101Dao";

    /**
     * This method corresponds to the database table CIF_CLIENT_DOCUMENT_9101
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }

    public List<CifClientDocument9101> selectDocumentsByClientNo(String clientNo) {
        Map<String, String> map = new HashMap<>();
        map.put("clientNo", clientNo);
        return selectList("selectDocumentsByClientNo", map);
    }

    public void updateCifClientDocument(CifClientDocument9101 cifClientDocument9101) {
        update("updateCifClientDocument", cifClientDocument9101);
    }
}