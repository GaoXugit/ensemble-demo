/*
 * <p>Title: Core12008811.java</p>
 * <p>Description: 开卡</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-05 19:32:35</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.rb.service.mbsdcore;

import com.dcits.ensemble.dbmanage.dao.CdCardDao;
import com.dcits.ensemble.rb.model.mbsdcore.Core12008811Out;
import com.dcits.ensemble.util.BusiUtil;
import com.dcits.galaxy.common.data.BeanResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.rb.api.mbsdcore.ICore12008811;
import com.dcits.galaxy.common.data.Request;
import com.dcits.ensemble.rb.model.mbsdcore.Core12008811In;
import javax.annotation.Resource;
import java.math.BigDecimal;

/***
 * 开卡</br>
 * 2018-09-05 19:32:35
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
@Service
public class Core12008811 extends AbstractService implements ICore12008811 {
	private static final Logger LOG = LoggerFactory.getLogger(Core12008811.class);

	@Resource
	private CdCardDao cdCardDao;
	@Override
	public Class<? extends Request> getRequestModel() {
		return Core12008811In.class;
	}

	/**
	 * 开卡功能的具体实现方法
	 * @param core12008811in
	 * @return
	 */
	public BeanResult createcard(Core12008811In core12008811in) {
		Core12008811In.Body body = core12008811in.getBody();
		Core12008811Out core14003006Out = new Core12008811Out();
		String Password = body.getPassword();	//获取密码
		String UserName = body.getUserName();	//获取姓名
		String DocumentId = body.getDocumentId();	//获取身份证号
		String CreateTime = body.getCreateTime();	//获取开卡时间
		BigDecimal bal = body.getBal();	//获取金额
		int CardType=body.getCardType();	//获取卡类型

		if(Password.length()!=6){
			core14003006Out.setResultInfo("密码为空或长度出错，请重新输入！");
			return new BeanResult(core14003006Out);
		}
		if(BusiUtil.isNull(UserName) || UserName.length()>50){
			core14003006Out.setResultInfo("姓名不能为空或姓名过长，请重新输入！");
			return new BeanResult(core14003006Out);
		}
		if(BusiUtil.isNull(DocumentId) || DocumentId.length()!=18){
			core14003006Out.setResultInfo("身份证号不能为空或身份证号过长，请重新输入！");
			return new BeanResult(core14003006Out);
		}
			cdCardDao.insert(Password,UserName,DocumentId,bal,CreateTime,CardType);
			core14003006Out.setResultInfo("恭喜您，开卡成功！"+Password.length());
			return new BeanResult(core14003006Out);
	}
}
