package com.dcits.ensemble.dbmanage.dbmodel;

import com.dcits.galaxy.common.bean.AbstractBean;
import com.dcits.galaxy.dal.annotation.TablePk;

/**
 * Created by admin on 2017/04/10 08:40:48.
 */
public class CifClientType extends AbstractBean {

    // serialVersionUID
    private static final long serialVersionUID = 1L;

    /**
     * This field is CIF_CLIENT_TYPE.CLIENT_TYPE 客户类型
     */
    @TablePk(index = 1)
    private String clientType;

    /**
     * This field is CIF_CLIENT_TYPE.CLIENT_TYPE_DESC 类型描述
     */
    private String clientTypeDesc;

    /**
     * This field is CIF_CLIENT_TYPE.IS_INDIVIDUAL 是否个体客户 Y-是 N-不是
     */
    private String isIndividual;

    /**
     * This field is CIF_CLIENT_TYPE.COMPANY 法人代码
     */
    private String company;

    /**
     * @return the value of  CIF_CLIENT_TYPE.CLIENT_TYPE 客户类型
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * @param clientType the value for CIF_CLIENT_TYPE.CLIENT_TYPE 客户类型
     */
    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_TYPE.CLIENT_TYPE_DESC 类型描述
     */
    public String getClientTypeDesc() {
        return clientTypeDesc;
    }

    /**
     * @param clientTypeDesc the value for CIF_CLIENT_TYPE.CLIENT_TYPE_DESC 类型描述
     */
    public void setClientTypeDesc(String clientTypeDesc) {
        this.clientTypeDesc = clientTypeDesc == null ? null : clientTypeDesc.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_TYPE.IS_INDIVIDUAL 是否个体客户 Y-是 N-不是
     */
    public String getIsIndividual() {
        return isIndividual;
    }

    /**
     * @param isIndividual the value for CIF_CLIENT_TYPE.IS_INDIVIDUAL 是否个体客户 Y-是 N-不是
     */
    public void setIsIndividual(String isIndividual) {
        this.isIndividual = isIndividual == null ? null : isIndividual.trim();
    }

    /**
     * @return the value of  CIF_CLIENT_TYPE.COMPANY 法人代码
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the value for CIF_CLIENT_TYPE.COMPANY 法人代码
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}