/**   
 * <p>Title: Fin10009102.java</p>
 * <p>Description: 存款账户创建（demo）</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author nick
 * @update 20170215
 * @version V1.0
 */
package com.dcits.ensemble.rb.service.mbsdcore;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.dbmanage.dao.DemoAcctDao;
import com.dcits.ensemble.dbmanage.dbmodel.DemoAcct;
import com.dcits.ensemble.rb.api.mbsdcore.ICore10009102;
import com.dcits.ensemble.rb.model.mbsdcore.Core10009102In;
import com.dcits.ensemble.rb.model.mbsdcore.Core10009102Out;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.dtp.annotation.SubmitLog;
import com.dcits.galaxy.exception.BusinessException;
import com.dcits.galaxy.util.BeanUtils;
import com.dcits.galaxy.util.DateUtils;
import com.dcits.galaxy.util.SeqUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/***
 * @description 存款账户创建（demo）
 * @version V1.0
 * @author nick
 * @update 20170215
 */
@Service
public class Core10009102 extends AbstractService implements ICore10009102 {
	private static final Logger log = LoggerFactory
			.getLogger(Core10009102.class);

	@Resource
	private DemoAcctDao demoAcctDao;

	@Override
	public Class<? extends Request> getRequestModel() {
		return Core10009102In.class;
	}
	public BeanResult createAcct(String acctName){
		Core10009102Out out = new Core10009102Out();
		DemoAcct ad = new DemoAcct();
		ad.setUuid(SeqUtils.getStringSeq());
		ad.setAcctName(acctName);
		ad.setAcctNo(SeqUtils.getRandomNumber(20));
		ad.setBal(new BigDecimal(0));
		ad.setCreateDate(DateUtils.getDate());
		ad.setCreateTime(DateUtils.getDateTime("HHmmssSSS"));
		doSubmit(ad);
		BeanUtils.copy(ad,out);
		if (false)
			throw new BusinessException("999999", "aaaaaaaaa");
		return new BeanResult(out);
	}
	@SubmitLog
	public void doSubmit(DemoAcct ad) {
		demoAcctDao.insert(ad);
	}
}


