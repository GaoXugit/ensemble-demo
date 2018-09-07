/*
 * <p>Title: Core14008841.java</p>
 * <p>Description: 转账服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-06 21:03:01</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.rb.service.mbsdcore;

import com.dcits.ensemble.dbmanage.dao.BsDao;
import com.dcits.ensemble.dbmanage.dao.CdCardDao;
import com.dcits.ensemble.dbmanage.dbmodel.CdCard;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008841Out;
import com.dcits.galaxy.common.data.BeanResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.rb.api.mbsdcore.ICore14008841;
import com.dcits.galaxy.common.data.Request;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008841In;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/***
 * 转账服务</br>
 * 2018-09-06 21:03:01
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
@Service
public class Core14008841 extends AbstractService implements ICore14008841 {
	private static final Logger LOG = LoggerFactory.getLogger(Core14008841.class);
	@Resource
	private CdCardDao cdCardDao;
	@Resource
	private BsDao bsDao;

	@Override
	public Class<? extends Request> getRequestModel() {
		return Core14008841In.class;
	}

	/**
	 * 这里要搞事情，进行转账的服务
	 * 1.首先判断要转入账户以及转出账户是否存在，（查询服务传入账号，传出账号信息）
	 * 		如果存在就继续执行，不存在信息就直接返回报表信息
	 * 2.因为本张卡转账，所以判断自己的卡里的余额够不够（因为已经从数据层返回账号的信息了，就查询账号信息内的余额够不够）
	 * 3.转账，执行更新操作（修改自己卡内的余额，修改转入卡内的余额）
	 * 4.如果都成功了那么就进行流水表中的增加操作（添加流水信息）
	 * @param core14008841in 穿入上送的内容
	 * @return 返回报文的信息
	 */
	@Override
	public BeanResult getManyToOther(Core14008841In core14008841in) {
		Core14008841In.Body body = core14008841in.getBody();//上送参数
		Core14008841Out core14008841Out = new Core14008841Out();//下送参数对象

		int cdidin = body.getCdIdIn();//获取传入卡号（给那个卡转钱）
		int cdid = body.getCdId();//获取自己账号
		BigDecimal sal = body.getSal();//获取转账金额（要转多少钱）
		String pass = body.getPassword();//输入自己的密码
		String passin = body.getPasswordIn();//输入对方卡的密码
//		int putway = body.getPutWay();//用户转账地点
		/**
		 * 以下是对上送的字段的验证
		 */
		if (sal==null){
			core14008841Out.setResultInfo("您输入的转账金额不正确");
			return new BeanResult(core14008841Out);//返回报文信息
		}
		if (cdidin==0 || cdid==0){
			core14008841Out.setResultInfo("您的卡号的格式不正确");
			return new BeanResult(core14008841Out);//返回报文信息
		}
		if (pass==null || "".equals(pass)){
			core14008841Out.setResultInfo("您的密码不能为空");
			return new BeanResult(core14008841Out);//返回报文信息
		}
		if (passin==null || "".equals(passin)){
			core14008841Out.setResultInfo("密码不能为空");
			return new BeanResult(core14008841Out);//返回报文信息
		}
		/**
		 * 以下是对数据库进行查询然后进行下一步的验证
		 */
		BigDecimal salargs = sal.subtract(sal);
		CdCard cdcard = cdCardDao.getCardInfo(cdid,pass);//获取卡的信息
		CdCard cdcard_in = cdCardDao.getCardInfo(cdidin,passin);//获取卡的信息
		if (cdcard ==null){
			core14008841Out.setResultInfo("没有检测到您的卡的信息，请确认您的账户是否冻结或者--》密码输入错误");
			return new BeanResult(core14008841Out);//返回报文信息
		}
		if (cdcard_in ==null){
			core14008841Out.setResultInfo("信息有误-》请核对好转账的账户信息");
			return new BeanResult(core14008841Out);//返回报文信息
		}
		BigDecimal bal = cdcard.getBal();//查询账户余额返回
		BigDecimal bal_in = cdcard_in.getBal();//查询转入账户余额返回

		if(bal.compareTo(sal)<0){//如果余额小于要转账的金额
			core14008841Out.setResultInfo("您当前余额不足，无法转账");
			return new BeanResult(core14008841Out);//返回报文信息
		}else{
			/**
			 * 1算出转入账户增加余额以及转出账户减少的余额
			 * 2两次更新表操作更改2个账户余额数据
			 */
			BigDecimal temp = bal.subtract(sal);
			BigDecimal temp1 = bal_in.add(sal);
			int result = cdCardDao.updateCardInfo(cdid,temp);
			int result1 = cdCardDao.updateCardInfo(cdidin,temp1);
			if (!(result==1 && result1==1)){//两次操作都不成功
				BigDecimal temp2 = bal.add(sal);
				int result2 = cdCardDao.updateCardInfo(cdid,temp);
				core14008841Out.setResultInfo("转账失败，金额已经退回");
				return new BeanResult(core14008841Out);//返回报文信息
			}else {
				/*
				 * 转账成功在报文表里打印报文信息
				 */
				int result3 = bsDao.addStreamInfo(cdidin,salargs,sal,1);
				int result4 = bsDao.addStreamInfo(cdid,sal,salargs,1);
				if (result3==1 && result4==1){
					core14008841Out.setResultInfo("转账成功,用户:"+cdid+"  在"+new Date().toString()+"  转账"+sal+"钱");
					return new BeanResult(core14008841Out);//返回报文信息
				}else{
					core14008841Out.setResultInfo("转账成功，但报表打印失败");
					return new BeanResult(core14008841Out);//返回报文信息
				}

			}
		}
	}
}
