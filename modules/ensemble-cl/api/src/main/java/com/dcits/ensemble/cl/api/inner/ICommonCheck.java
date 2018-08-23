package com.dcits.ensemble.cl.api.inner;

import com.dcits.galaxy.common.data.BeanResult;

import java.math.BigDecimal;

/**
 * Created by Tim on 2015/9/28.
 */
public interface ICommonCheck {

    BeanResult checkAcctName(String acctName);

    BeanResult checkAcctNo(String acctNo);

    BeanResult checkAcctBal(String acctNo, BigDecimal bal);

    BeanResult checkResource(String acctNo);

}
