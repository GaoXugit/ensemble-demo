package com.dcits.ensemble.dbmanage.dbmodel;

import com.dcits.galaxy.common.bean.AbstractBean;
import com.dcits.galaxy.dal.annotation.TablePk;

/**
 * Created by admin on 2017/04/08 16:12:53.
 */
public class CifClientDocument9101 extends AbstractBean {

    // serialVersionUID
    private static final long serialVersionUID = 1L;

    /**
     * This field is CIF_CLIENT_DOCUMENT_9101.CLIENT_NO 客户号
     */
    @TablePk(index = 1)
    private String clientNo;

    /**
     * This field is CIF_CLIENT_DOCUMENT_9101.DOCUMENT_TYPE 证件类型
     */
    @TablePk(index = 2)
    private String documentType;

    /**
     * This field is CIF_CLIENT_DOCUMENT_9101.DOCUMENT_ID 证件号码
     */
    private String documentId;

    /**
     * This field is CIF_CLIENT_DOCUMENT_9101.ISS_COUNTRY 签发国家
     */
    private String issCountry;

    /**
     * This field is CIF_CLIENT_DOCUMENT_9101.PREF_FLAG 是否首选证件Y/N:
     */
    private String prefFlag;

    /**
     * This field is CIF_CLIENT_DOCUMENT_9101.ISS_PLACE 签发地
     */
    private String issPlace;

    /**
     * This field is CIF_CLIENT_DOCUMENT_9101.ISS_AUTHORITY 签发机关
     */
    private String issAuthority;

    /**
     * This field is CIF_CLIENT_DOCUMENT_9101.ISS_DATE 签发日期
     */
    private String issDate;

    /**
     * This field is CIF_CLIENT_DOCUMENT_9101.EXPIRY_DATE 到期日期
     */
    private String expiryDate;

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT_9101.DOCUMENT_TYPE 证件类型
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * @param documentType the value for CIF_CLIENT_DOCUMENT_9101.DOCUMENT_TYPE 证件类型
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType == null ? null : documentType.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT_9101.DOCUMENT_ID 证件号码
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * @param documentId the value for CIF_CLIENT_DOCUMENT_9101.DOCUMENT_ID 证件号码
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId == null ? null : documentId.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT_9101.ISS_COUNTRY 签发国家
     */
    public String getIssCountry() {
        return issCountry;
    }

    /**
     * @param issCountry the value for CIF_CLIENT_DOCUMENT_9101.ISS_COUNTRY 签发国家
     */
    public void setIssCountry(String issCountry) {
        this.issCountry = issCountry == null ? null : issCountry.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT_9101.PREF_FLAG 是否首选证件Y/N:
     */
    public String getPrefFlag() {
        return prefFlag;
    }

    /**
     * @param prefFlag the value for CIF_CLIENT_DOCUMENT_9101.PREF_FLAG 是否首选证件Y/N:
     */
    public void setPrefFlag(String prefFlag) {
        this.prefFlag = prefFlag == null ? null : prefFlag.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT_9101.ISS_PLACE 签发地
     */
    public String getIssPlace() {
        return issPlace;
    }

    /**
     * @param issPlace the value for CIF_CLIENT_DOCUMENT_9101.ISS_PLACE 签发地
     */
    public void setIssPlace(String issPlace) {
        this.issPlace = issPlace == null ? null : issPlace.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT_9101.ISS_AUTHORITY 签发机关
     */
    public String getIssAuthority() {
        return issAuthority;
    }

    /**
     * @param issAuthority the value for CIF_CLIENT_DOCUMENT_9101.ISS_AUTHORITY 签发机关
     */
    public void setIssAuthority(String issAuthority) {
        this.issAuthority = issAuthority == null ? null : issAuthority.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT_9101.ISS_DATE 签发日期
     */
    public String getIssDate() {
        return issDate;
    }

    /**
     * @param issDate the value for CIF_CLIENT_DOCUMENT_9101.ISS_DATE 签发日期
     */
    public void setIssDate(String issDate) {
        this.issDate = issDate == null ? null : issDate.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT_9101.EXPIRY_DATE 到期日期
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the value for CIF_CLIENT_DOCUMENT_9101.EXPIRY_DATE 到期日期
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate == null ? null : expiryDate.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_DOCUMENT_9101.CLIENT_NO 客户号
     */
    public String getClientNo() {
        return clientNo;
    }

    /**
     * @param clientNo the value for CIF_CLIENT_DOCUMENT_9101.CLIENT_NO 客户号
     */
    public void setClientNo(String clientNo) {
        this.clientNo = clientNo == null ? null : clientNo.trim();
    }
}