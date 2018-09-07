/*
 * <p>Title: Core14008832.java</p>
 * <p>Description: 取款服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-05 19:16:07</p>
 * @author
 * @version v1.0
 */
package com.dcits.ensemble.rb.service.mbsdcore;

import com.dcits.ensemble.dbmanage.dao.BsDao;
import com.dcits.ensemble.dbmanage.dao.CdCardDao;
import com.dcits.ensemble.dbmanage.dbmodel.Bs;
import com.dcits.ensemble.dbmanage.dbmodel.CdCard;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008832Out;
import com.dcits.galaxy.common.data.BeanResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.rb.api.mbsdcore.ICore14008832;
import com.dcits.galaxy.common.data.Request;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008832In;

import javax.annotation.Resource;
import java.math.BigDecimal;

/***
 * 取款服务</br>
 * 2018-09-05 19:16:07
 *
 * @version v1.0
 * @since v1.0
 * @author
 */
@Service
public class Core14008832 extends AbstractService implements ICore14008832 {
	private static final Logger LOG = LoggerFactory.getLogger(Core14008832.class);

	@Resource
	private CdCardDao cdCardDao;
	@Resource
	private BsDao bsDao;
	@Override
	public Class<? extends Request> getRequestModel() {
		return Core14008832In.class;
	}

	/**
	 * TODO ****************8832取款流程*****************
	 *  1.根据上送输入的（账号，密码）查询卡信息、取款金额
	 *       if（账号&密码 != null）
	 *        1.1（查询数据库是否有该信息 有：返回结果 没有：返回空）
	 *       else
	 *      （提示错误信息）
	 *  2.将输入的取款金额与账户余额进行校验
	 * 		 if(取款金额 <= 账户余额)
	 * 		  2.1（可以取款---》取款完成，更新账户余额）
	 * 		 else
	 *      （余额不足，无法取款）
	 *  3.插入流水信息
	 * 		  3.1将取款金额、卡号等信息插入到流水表
	 *  4.下送输出
	 * 		  4.1 显示卡内信息，例如：姓名、余额等
	 * 	      4.2 打印流水信息，例如：卡号、取款额度、取款时间等
	 */
	@Override
	public BeanResult putMoney(Core14008832In core14008832in) {
		//获取上送输入对象
		Core14008832In.Body body = core14008832in.getBody();
		Core14008832Out core14008832Out = new Core14008832Out();
		//获取上送输入的账号，密码，金额
		Integer cdId = body.getCdId();
		String passWord = body.getPassword();
		BigDecimal sal = body.getSal();
		//上送输入信息格式校验
		if (cdId != null  ){
			if (passWord != null) {
				if (sal != null && sal.compareTo(BigDecimal.ZERO)>0) {
					//1.根据输入的账号，密码查询卡信息,返回一个CdCard对象
					CdCard cdCardInfo = cdCardDao.selectCardInfo(cdId, passWord);
					//检测数据库是否存在该银行卡
					if (cdCardInfo != null) {
						//2.金额校验、取款业务
						//卡内余额大于等于取款金额
						if (cdCardInfo.getBal().compareTo(sal) >= 0) {
							//取款业务
							BigDecimal bal = cdCardInfo.getBal().subtract(sal);
							int i = cdCardDao.updateUserBal(bal, cdCardInfo.getCdId());
							if (i != 0) {
								//取款成功，再次查询显示当前的卡信息（余额）
								cdCardInfo = cdCardDao.selectCardInfo(cdId, passWord);
								//3.取款插入流水信息
								Bs bs = new Bs();
								//设置流水的卡号
								bs.setCdId(cdCardInfo.getCdId());
								//设置流水的取款额度
								bs.setWithdrawal(sal);
								//flag = 1 表示插入流水信息成功
								int flag = bsDao.insertCardInfo(bs);
								if (flag!=0) {
									//查询显示本次取款的流水信息
									Bs bs1 = bsDao.selectBsInfo(bs);
									//4.下送输出
									core14008832Out.setUserName("用户姓名：" + cdCardInfo.getUserName());
									core14008832Out.setDocumentId("身份证号码：" + cdCardInfo.getDocumentId());
									core14008832Out.setBal(cdCardInfo.getBal());
									core14008832Out.setInfo("取款"+sal+"成功,稍后会有短信提示！");
									core14008832Out.setBsInfo(bs1.toString());
									return new BeanResult(core14008832Out);
								}
								else{
									core14008832Out.setInfo("流水生成失败！");
									return new BeanResult(core14008832Out);
								}
							} else {
								//取款失败
								core14008832Out.setUserName("用户姓名：" + cdCardInfo.getUserName());
								core14008832Out.setDocumentId("身份证号码：" + cdCardInfo.getDocumentId());
								core14008832Out.setBal(cdCardInfo.getBal());
								core14008832Out.setInfo("取款失败！");
								return new BeanResult(core14008832Out);
							}
						} else {
							//取款金额大于账户余额
							core14008832Out.setInfo("取款金额大于账户余额！");
							return new BeanResult(core14008832Out);
						}
					} else {
						//数据库没有该账户信息
						core14008832Out.setInfo("您输入的账号或密码不正确！");
						return new BeanResult(core14008832Out);
					}
				}
				else{
					//输入信息不合法，信息为空、非法等等
					core14008832Out.setInfo("取款金额不能为空&并且大于0！");
					return new BeanResult(core14008832Out);
				}

			}
			else{
				//输入信息不合法，信息为空、非法等等
				core14008832Out.setInfo("密码不能为空！");
				return new BeanResult(core14008832Out);
			}
		}
		else{
			//输入信息不合法，信息为空、非法等等
			core14008832Out.setInfo("账号不能为空！");
			return new BeanResult(core14008832Out);
		}
	}
}
