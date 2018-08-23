package com.dcits.ensemble.dbmanage.dbmodel;

import com.dcits.galaxy.common.bean.AbstractBean;
import com.dcits.galaxy.dal.annotation.TablePk;

/**
 * Created by admin on 2017/04/10 08:27:31.
 */
public class CifClientDocument extends AbstractBean {

    // serialVersionUID
    private static final long serialVersionUID = 1L;

    /**
     * This field is CIF_CLIENT_DOCUMENT.CLIENT_NO 
     */
    @TablePk(index = 1)
    private String clientNo;

    /**
     * This field is CIF_CLIENT_DOCUMENT.DOCUMENT_TYPE 
     */
    @TablePk(index = 2)
    private String documentType;

    /**
     * This field is CIF_CLIENT_DOCUMENT.DOCUMENT_ID 
     */
    private String documentId;

    /**
     * This field is CIF_CLIENT_DOCUMENT.ISS_COUNTRY 
     */
    private String issCountry;

    /**
     * This field is CIF_CLIENT_DOCUMENT.PREF_FLAG 
     */
    private String prefFlag;

    /**
     * This field is CIF_CLIENT_DOCUMENT.ISS_PLACE 
     */
    private String issPlace;

    /**
     * This field is CIF_CLIENT_DOCUMENT.ISS_AUTHORITY 
     */
    private String issAuthority;

    /**
     * This field is CIF_CLIENT_DOCUMENT.ISS_DATE 
     */
    private String issDate;

    /**
     * This field is CIF_CLIENT_DOCUMENT.EXPIRY_DATE 
     */
    private String expiryDate;

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT.CLIENT_NO 
     */
    public String getClientNo() {
        return clientNo;
    }

    /**
     * @param clientNo the value for CIF_CLIENT_DOCUMENT.CLIENT_NO 
     */
    public void setClientNo(String clientNo) {
        this.clientNo = clientNo == null ? null : clientNo.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT.DOCUMENT_TYPE 
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * @param documentType the value for CIF_CLIENT_DOCUMENT.DOCUMENT_TYPE 
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType == null ? null : documentType.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT.DOCUMENT_ID 
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * @param documentId the value for CIF_CLIENT_DOCUMENT.DOCUMENT_ID 
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId == null ? null : documentId.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT.ISS_COUNTRY 
     */
    public String getIssCountry() {
        return issCountry;
    }

    /**
     * @param issCountry the value for CIF_CLIENT_DOCUMENT.ISS_COUNTRY 
     */
    public void setIssCountry(String issCountry) {
        this.issCountry = issCountry == null ? null : issCountry.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT.PREF_FLAG 
     */
    public String getPrefFlag() {
        return prefFlag;
    }

    /**
     * @param prefFlag the value for CIF_CLIENT_DOCUMENT.PREF_FLAG 
     */
    public void setPrefFlag(String prefFlag) {
        this.prefFlag = prefFlag == null ? null : prefFlag.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT.ISS_PLACE 
     */
    public String getIssPlace() {
        return issPlace;
    }

    /**
     * @param issPlace the value for CIF_CLIENT_DOCUMENT.ISS_PLACE 
     */
    public void setIssPlace(String issPlace) {
        this.issPlace = issPlace == null ? null : issPlace.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT.ISS_AUTHORITY 
     */
    public String getIssAuthority() {
        return issAuthority;
    }

    /**
     * @param issAuthority the value for CIF_CLIENT_DOCUMENT.ISS_AUTHORITY 
     */
    public void setIssAuthority(String issAuthority) {
        this.issAuthority = issAuthority == null ? null : issAuthority.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT.ISS_DATE 
     */
    public String getIssDate() {
        return issDate;
    }

    /**
     * @param issDate the value for CIF_CLIENT_DOCUMENT.ISS_DATE 
     */
    public void setIssDate(String issDate) {
        this.issDate = issDate == null ? null : issDate.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT.EXPIRY_DATE 
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the value for CIF_CLIENT_DOCUMENT.EXPIRY_DATE 
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate == null ? null : expiryDate.trim();
    }
}