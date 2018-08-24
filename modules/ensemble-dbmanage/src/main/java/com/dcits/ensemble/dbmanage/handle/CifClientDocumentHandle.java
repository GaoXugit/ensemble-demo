package com.dcits.ensemble.dbmanage.handle;

import java.util.List;

import javax.annotation.Resource;

import com.dcits.ensemble.dbmanage.dbmodel.CifClientDocument;
import com.dcits.ensemble.dbmanage.dao.CifClientDocumentDao;
import org.springframework.stereotype.Service;

/**
 * Created by daiduan on 2017/4/8.
 */
@Service
public class CifClientDocumentHandle {
    @Resource
    CifClientDocumentDao cifClientDocumentDao;

    public void addDocumentInfo(List<CifClientDocument> documents) {
        for (CifClientDocument document : documents) {
            cifClientDocumentDao.insert(document);
        }
    }
    public void autoUpdate(CifClientDocument cifClientDocument) {
        CifClientDocument oldCifClientDocument = cifClientDocumentDao.selectByPrimaryKey(new CifClientDocument(), cifClientDocument.getClientNo(), cifClientDocument.getDocumentType());
        if (null == oldCifClientDocument) {
            cifClientDocumentDao.insert(cifClientDocument);
        } else {
            cifClientDocumentDao.updateByPrimaryKey(cifClientDocument);
        }
    }
}
