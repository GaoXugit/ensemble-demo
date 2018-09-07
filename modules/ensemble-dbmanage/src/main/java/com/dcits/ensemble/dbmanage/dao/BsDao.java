/*
 * <p>Title: BsDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author Author
 * @version V1.0
 */
package com.dcits.ensemble.dbmanage.dao;

import com.dcits.ensemble.dbmanage.dbmodel.Bs;
import com.dcits.galaxy.business.dao.BaseDao;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 银行流水账单</br>
 * 2018-09-06 21:15:09
 *
 * @version V1.0
 * @author Author
 */
@Repository
public class BsDao extends BaseDao {
    private final String DEFAULT_NAME_SPACE = "com.dcits.ensemble.dbmanage.dao.BsDao";

    /**
     * This method corresponds to the database table BS
     */
    protected String getNameSpace() {
        return DEFAULT_NAME_SPACE;
    }

    /**
     * 转账业务
     * @param cdidin
     * @param sal
     * @param sal1
     * @param address
     * @return
     */
    public int addStreamInfo(int cdidin, BigDecimal sal, BigDecimal sal1, int address){
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Bs bs = new Bs();
        bs.setBsTime(sdf.format(date));
        bs.setCdId(cdidin);
        bs.setDeposit(sal);
        bs.setWithdrawal(sal1);
        bs.setPutWay(address);
        bs.setSaveWay(address);
        return super.insert("insertBsInfo",bs);
    }

    //TODO 取款  插入流水信息
    public int insertCardInfo(Bs bs) {

        bs.setDeposit(BigDecimal.ZERO);
        bs.setSaveWay(0);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        bs.setBsTime(sdf.format(date));

        bs.setPutWay(1);
        return super.insert("insertCardInfo", bs);
    }

    //TODO 存款 插入流水信息
    public int insertCardInfos(Bs bs) {

        bs.setWithdrawal(BigDecimal.ZERO);
        bs.setSaveWay(1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        bs.setBsTime(sdf.format(date));

        bs.setPutWay(0);
        return super.insert("insertCardInfos", bs);
    }
    //TODO 取款查询流水信息
    public Bs selectBsInfo(Bs bs) {
        return super.selectOne(DEFAULT_NAME_SPACE, "selectBsInfo", bs);
    }
    //TODO 存款查询流水信息
    public Bs selectBsInfos(Bs bs) {
        return super.selectOne(DEFAULT_NAME_SPACE, "selectBsInfos", bs);
    }

}
