package com.dcits.ensemble.dbmanage.inquiry;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dcits.ensemble.dbmanage.dao.CifClientDocument9101Dao;
import com.dcits.ensemble.dbmanage.dbmodel.CifClientDocument9101;

/**
 * Created by daiduan on 2017/4/8.
 */
@Service
public class CifClientDocument9101Inquiry {

	@Resource
	CifClientDocument9101Dao cifClientDocument9101Dao;

	public List<CifClientDocument9101> selectDocumentsByClientNo(String clientNo) {
		return cifClientDocument9101Dao.selectDocumentsByClientNo(clientNo);
	}

	public CifClientDocument9101 selectByKey(String clientNo, String documentType) {
        return cifClientDocument9101Dao.selectByPrimaryKey(new CifClientDocument9101(), clientNo, documentType);
    }

    public void updateByKey(CifClientDocument9101 cifClientDocument9101) {
        cifClientDocument9101Dao.updateByPrimaryKey(cifClientDocument9101);
    }

    public void updateByKey2(CifClientDocument9101 cifClientDocument9101) {
        cifClientDocument9101Dao.updateCifClientDocument(cifClientDocument9101);
    }
}
