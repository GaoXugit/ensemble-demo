package com.dcits.ensemble.dbmanage.dao;

import com.dcits.galaxy.business.dao.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2017/04/10 08:40:48.
 */
@Repository
public class CifClientTypeDao extends BaseDao {

    //The nameSpace that is defined in the mapper file
    private final String DEFAULT_NAME_SPACE = "CifClientTypeDao";

    /**
     * This method corresponds to the database table CIF_CLIENT_TYPE
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }
}