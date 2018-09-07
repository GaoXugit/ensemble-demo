/*
 * <p>Title: Core14008821.java</p>
 * <p>Description: 查询余额服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-05 19:13:40</p>
 * @author
 * @version v1.0
 */
package com.dcits.ensemble.rb.service.mbsdcore;

import com.dcits.ensemble.dbmanage.dao.CdCardDao;
import com.dcits.ensemble.dbmanage.dbmodel.CdCard;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008821Out;
import com.dcits.ensemble.util.BusiUtil;
import com.dcits.galaxy.common.data.BeanResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.rb.api.mbsdcore.ICore14008821;
import com.dcits.galaxy.common.data.Request;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008821In;

import javax.annotation.Resource;

/***
 * 查询余额服务</br>
 * 2018-09-05 19:13:40
 *
 * @version v1.0
 * @since v1.0
 * @author
 */
@Service
public class Core14008821 extends AbstractService implements ICore14008821 {
	private static final Logger LOG = LoggerFactory.getLogger(Core14008821.class);
	@Resource
	private CdCardDao cdCardDao;

	@Override
	public Class<? extends Request> getRequestModel() {
		return Core14008821In.class;
	}

	/**
	 * 根据账号密码查询账户信息
	 *
	 * @param core14008821In
	 * @return
	 */
	@Override
	public BeanResult queryCdIdPassWord(Core14008821In core14008821In) {
		//获取报文Body内容
		Core14008821In.Body body = core14008821In.getBody();
		Integer cdId = body.getCdId();
		String passWord = body.getPassword();
		Core14008821Out core14008821Out = new Core14008821Out();
		//根据cdId查询该账号是否存在，返回CdCard对象
		CdCard cdCard = cdCardDao.getSelectByCdId(cdId);
		//判断账号是否存在
		if(!BusiUtil.isNotNull(cdCard)){
			core14008821Out.setUserName("账号不存在，请核对后重新输入！");
			return new BeanResult(core14008821Out);
		}
		//判断密码是否正确
		if (!passWord.equals(cdCard.getPassword())){
			core14008821Out.setUserName("密码输入错误！");
			return new BeanResult(core14008821Out);
		}
		core14008821Out.setBal(cdCard.getBal());
		core14008821Out.setCardType(cdCard.getCardType());
		core14008821Out.setCreateTime(cdCard.getCreateTime());
		core14008821Out.setDocumentId(cdCard.getDocumentId());
		core14008821Out.setUserName(cdCard.getUserName());
		return new BeanResult(core14008821Out);
	}
}
