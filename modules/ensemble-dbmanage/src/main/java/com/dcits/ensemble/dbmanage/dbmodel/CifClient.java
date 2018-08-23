package com.dcits.ensemble.dbmanage.dbmodel;

import com.dcits.galaxy.common.bean.AbstractBean;
import com.dcits.galaxy.dal.annotation.TablePk;

/**
 * Created by admin on 2017/04/08 00:12:21.
 */
public class CifClient extends AbstractBean {

    // serialVersionUID
    private static final long serialVersionUID = 1L;

    /**
     * This field is CIF_CLIENT.CLIENT_KEY 内部Key
     */
    @TablePk(index = 1)
    private String clientKey;

    /**
     * This field is CIF_CLIENT.CLIENT_NO 客户号
     */
    private String clientNo;

    /**
     * This field is CIF_CLIENT.GLOBAL_ID 证件号码
     */
    private String globalId;

    /**
     * This field is CIF_CLIENT.GLOBAL_ID_TYPE 证件类型，参数表：
            CIF_DOCUMENT_TYPE
            
     */
    private String globalIdType;

    /**
     * This field is CIF_CLIENT.CLIENT_TYPE 客户类型
     */
    private String clientType;

    /**
     * This field is CIF_CLIENT.CLIENT_NAME 客户名称（英）
     */
    private String clientName;

    /**
     * This field is CIF_CLIENT.LOCATION 地址
     */
    private String location;

    /**
     * This field is CIF_CLIENT.ACCT_EXEC 客户经理
     */
    private String acctExec;

    /**
     * This field is CIF_CLIENT.COUNTRY_LOC 国籍
     */
    private String countryLoc;

    /**
     * This field is CIF_CLIENT.STATE_LOC 省、州
     */
    private String stateLoc;

    /**
     * This field is CIF_CLIENT.CLIENT_CITY 城市代码
     */
    private String clientCity;

    /**
     * This field is CIF_CLIENT.COUNTRY_CITIZEN 居住国家
     */
    private String countryCitizen;

    /**
     * This field is CIF_CLIENT.NARRATIVE 备注
     */
    private String narrative;

    /**
     * This field is CIF_CLIENT.POSTAL_CODE 邮政代码
     */
    private String postalCode;

    /**
     * This field is CIF_CLIENT.CREATION_USER 创建用户
     */
    private String creationUser;

    /**
     * This field is CIF_CLIENT.CREATION_DATE 创建日期
     */
    private String creationDate;

    /**
     * This field is CIF_CLIENT.UPDATE_USER 更新用户
     */
    private String updateUser;

    /**
     * This field is CIF_CLIENT.UPDATE_DATE 更新日期
     */
    private String updateDate;

    /**
     * @return the value of  CIF_CLIENT.CLIENT_KEY 内部Key
     */
    public String getClientKey() {
        return clientKey;
    }

    /**
     * @param clientKey the value for CIF_CLIENT.CLIENT_KEY 内部Key
     */
    public void setClientKey(String clientKey) {
        this.clientKey = clientKey == null ? null : clientKey.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.CLIENT_NO 客户号
     */
    public String getClientNo() {
        return clientNo;
    }

    /**
     * @param clientNo the value for CIF_CLIENT.CLIENT_NO 客户号
     */
    public void setClientNo(String clientNo) {
        this.clientNo = clientNo == null ? null : clientNo.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.GLOBAL_ID 证件号码
     */
    public String getGlobalId() {
        return globalId;
    }

    /**
     * @param globalId the value for CIF_CLIENT.GLOBAL_ID 证件号码
     */
    public void setGlobalId(String globalId) {
        this.globalId = globalId == null ? null : globalId.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.GLOBAL_ID_TYPE 证件类型，参数表：
            CIF_DOCUMENT_TYPE
            
     */
    public String getGlobalIdType() {
        return globalIdType;
    }

    /**
     * @param globalIdType the value for CIF_CLIENT.GLOBAL_ID_TYPE 证件类型，参数表：
            CIF_DOCUMENT_TYPE
            
     */
    public void setGlobalIdType(String globalIdType) {
        this.globalIdType = globalIdType == null ? null : globalIdType.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.CLIENT_TYPE 客户类型
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * @param clientType the value for CIF_CLIENT.CLIENT_TYPE 客户类型
     */
    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.CLIENT_NAME 客户名称（英）
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName the value for CIF_CLIENT.CLIENT_NAME 客户名称（英）
     */
    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.LOCATION 地址
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the value for CIF_CLIENT.LOCATION 地址
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.ACCT_EXEC 客户经理
     */
    public String getAcctExec() {
        return acctExec;
    }

    /**
     * @param acctExec the value for CIF_CLIENT.ACCT_EXEC 客户经理
     */
    public void setAcctExec(String acctExec) {
        this.acctExec = acctExec == null ? null : acctExec.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.COUNTRY_LOC 国籍
     */
    public String getCountryLoc() {
        return countryLoc;
    }

    /**
     * @param countryLoc the value for CIF_CLIENT.COUNTRY_LOC 国籍
     */
    public void setCountryLoc(String countryLoc) {
        this.countryLoc = countryLoc == null ? null : countryLoc.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.STATE_LOC 省、州
     */
    public String getStateLoc() {
        return stateLoc;
    }

    /**
     * @param stateLoc the value for CIF_CLIENT.STATE_LOC 省、州
     */
    public void setStateLoc(String stateLoc) {
        this.stateLoc = stateLoc == null ? null : stateLoc.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.CLIENT_CITY 城市代码
     */
    public String getClientCity() {
        return clientCity;
    }

    /**
     * @param clientCity the value for CIF_CLIENT.CLIENT_CITY 城市代码
     */
    public void setClientCity(String clientCity) {
        this.clientCity = clientCity == null ? null : clientCity.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.COUNTRY_CITIZEN 居住国家
     */
    public String getCountryCitizen() {
        return countryCitizen;
    }

    /**
     * @param countryCitizen the value for CIF_CLIENT.COUNTRY_CITIZEN 居住国家
     */
    public void setCountryCitizen(String countryCitizen) {
        this.countryCitizen = countryCitizen == null ? null : countryCitizen.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.NARRATIVE 备注
     */
    public String getNarrative() {
        return narrative;
    }

    /**
     * @param narrative the value for CIF_CLIENT.NARRATIVE 备注
     */
    public void setNarrative(String narrative) {
        this.narrative = narrative == null ? null : narrative.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.POSTAL_CODE 邮政代码
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the value for CIF_CLIENT.POSTAL_CODE 邮政代码
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.CREATION_USER 创建用户
     */
    public String getCreationUser() {
        return creationUser;
    }

    /**
     * @param creationUser the value for CIF_CLIENT.CREATION_USER 创建用户
     */
    public void setCreationUser(String creationUser) {
        this.creationUser = creationUser == null ? null : creationUser.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.CREATION_DATE 创建日期
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the value for CIF_CLIENT.CREATION_DATE 创建日期
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate == null ? null : creationDate.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.UPDATE_USER 更新用户
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * @param updateUser the value for CIF_CLIENT.UPDATE_USER 更新用户
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * @return the value of  CIF_CLIENT.UPDATE_DATE 更新日期
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate the value for CIF_CLIENT.UPDATE_DATE 更新日期
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }
}