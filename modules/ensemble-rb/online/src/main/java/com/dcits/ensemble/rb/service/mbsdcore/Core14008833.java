/*
 * <p>Title: Core14008833.java</p>
 * <p>Description: 存款服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-06 11:32:04</p>
 * @author
 * @version v1.0
 */
package com.dcits.ensemble.rb.service.mbsdcore;

import com.dcits.ensemble.dbmanage.dao.BsDao;
import com.dcits.ensemble.dbmanage.dao.CdCardDao;
import com.dcits.ensemble.dbmanage.dbmodel.Bs;
import com.dcits.ensemble.dbmanage.dbmodel.CdCard;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008832In;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008832Out;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008833Out;
import com.dcits.galaxy.common.data.BeanResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.rb.api.mbsdcore.ICore14008833;
import com.dcits.galaxy.common.data.Request;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008833In;

import javax.annotation.Resource;
import java.math.BigDecimal;

/***
 * 存款服务</br>
 * 2018-09-06 11:32:04
 *
 * @version v1.0
 * @since v1.0
 * @author
 */
@Service
public class Core14008833 extends AbstractService implements ICore14008833 {
	private static final Logger LOG = LoggerFactory.getLogger(Core14008833.class);

	@Resource
	private CdCardDao cdCardDao;
	@Resource
	private BsDao bsDao;
	@Override
	public Class<? extends Request> getRequestModel() {
		return Core14008833In.class;
	}
	/**
	 * TODO ****************8833存款流程*****************
	 * 1.根据上送输入的（账号，密码）查询卡信息、存款金额
	 *       if（账号&密码 != null）
	 *       1.1（查询数据库是否有该信息 有：返回结果 没有：返回空）
	 *       else
	 *      （提示错误信息）
	 * 2.将输入的存款金额与0进行校验
	 * 		 if(存款金额 > 0)
	 * 		 2.1（可以存款---》存款完成，更新账户余额）
	 * 		 else
	 *      （无法存款）
	 * 3.插入流水信息
	 * 		 3.1将存款金额、卡号等信息插入到流水表
	 * 4.下送输出
	 * 		 4.1 显示卡内信息，例如：姓名、余额等
	 * 	     4.2 打印流水信息，例如：卡号、存款额度、存款时间等
	 */
	@Override
	public BeanResult saveMoney(Core14008833In core14008833in) {
		//获取上送输入对象
		Core14008833In.Body body = core14008833in.getBody();
		Core14008833Out core14008833Out = new Core14008833Out();
		//获取上送输入的账号，密码，存款金额
		Integer cdId = body.getCdId();
		String passWord = body.getPassword();
		BigDecimal sal = body.getSal();
		//上送输入信息格式校验
		if (cdId != null) {
			if (passWord != null) {
				if (sal != null && sal.compareTo(BigDecimal.ZERO)>0) {
					//1.根据输入的账号，密码查询卡信息,返回一个CdCard对象
					CdCard cdCardInfo = cdCardDao.selectCardInfo(cdId, passWord);
					//数据库信息校验
					if (cdCardInfo != null) {
						//2.存款金额与0进行校验
						if (sal.compareTo(BigDecimal.ZERO) >= 1) {
							//账户余额的更新---计算操作
							BigDecimal bal = cdCardInfo.getBal().add(sal);
							int i = cdCardDao.updateUserBal(bal, cdCardInfo.getCdId());
							if (i != 0) {
								//更新操作完成后，再次查询显示当前的卡信息（余额）
								cdCardInfo = cdCardDao.selectCardInfo(cdId, passWord);
								//3.存款插入流水信息
								Bs bs = new Bs();
								bs.setCdId(cdCardInfo.getCdId());
								bs.setDeposit(sal);
								int flag = bsDao.insertCardInfos(bs);
								//flag = 1 表示插入流水信息成功
								if (flag != 0) {
									//查询显示本次存款的流水信息
									Bs bs1 = bsDao.selectBsInfos(bs);
									//4.下送输出
									core14008833Out.setUserName("用户姓名：" + cdCardInfo.getUserName());
									core14008833Out.setDocumentId("身份证号码：" + cdCardInfo.getDocumentId());
									core14008833Out.setBal(cdCardInfo.getBal());
									core14008833Out.setInfo("存款"+sal+"成功,稍后会有短信提示！");
									core14008833Out.setBsInfo(bs1.toString());
									return new BeanResult(core14008833Out);
								} else {
									core14008833Out.setInfo("流水生成失败！");
									return new BeanResult(core14008833Out);
								}
							} else {
								//存款失败
								core14008833Out.setUserName("用户姓名：" + cdCardInfo.getUserName());
								core14008833Out.setDocumentId("身份证号码：" + cdCardInfo.getDocumentId());
								core14008833Out.setBal(cdCardInfo.getBal());
								core14008833Out.setInfo("存款失败！");
								return new BeanResult(core14008833Out);
							}
						} else {
							//存款金额大于0
							core14008833Out.setInfo("存款金额必须大于0！");
							return new BeanResult(core14008833Out);
						}
					} else {
						//数据库没有该账户信息
						core14008833Out.setInfo("您输入的账号或密码不正确！");
						return new BeanResult(core14008833Out);
					}
				}
				else{
					//输入信息不合法，信息为空、非法等等
					core14008833Out.setInfo("存款金额不能为空&并且大于0！");
					return new BeanResult(core14008833Out);
				}

			} else {
				//输入信息不合法，信息为空、非法等等
				core14008833Out.setInfo("密码不能为空！");
				return new BeanResult(core14008833Out);
			}
		}
		else{
			//输入信息不合法，信息为空、非法等等
			core14008833Out.setInfo("账号不能为空！");
			return new BeanResult(core14008833Out);
		}
	}
}
