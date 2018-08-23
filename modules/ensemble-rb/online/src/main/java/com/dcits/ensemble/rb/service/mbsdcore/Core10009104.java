/**   
 * <p>Title: Fin10009104.java</p>
 * <p>Description: 存款支取（demo）</p>
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
import com.dcits.ensemble.rb.api.mbsdcore.ICore10009104;
import com.dcits.ensemble.rb.model.mbsdcore.Core10009104In;
import com.dcits.ensemble.rb.model.mbsdcore.Core10009104Out;
import com.dcits.ensemble.rb.service.application.CommonCheck;
import com.dcits.galaxy.business.util.BusinessUtils;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.data.Request;
import com.dcits.galaxy.dtp.annotation.SubmitLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/***
 * @description 存款支取（demo）
 * @version V1.0
 * @author nick
 * @update 20170215
 */
@Service
public class Core10009104 extends AbstractService implements ICore10009104 {
	private static final Logger log = LoggerFactory
			.getLogger(Core10009104.class);
	@Resource
	private DemoAcctDao demoAcctDao;
	@Resource
	private CommonCheck commonCheck;
	@Override
	public Class<? extends Request> getRequestModel() {
		return Core10009104In.class;
	}

	public BeanResult withDraw(String acctNo, BigDecimal bal){
		Core10009104Out out = new Core10009104Out();
		DemoAcct acctDemo = demoAcctDao.getAcctInfoByAcctNo(acctNo);
		if (BusinessUtils.isNull(acctDemo))
			throw BusinessUtils.createBusinessException("RB1001");
		//commonCheck.checkAcctBal(acctNo,bal);
		DemoAcct update = new DemoAcct();
		update.setAcctNo(acctDemo.getAcctNo());
		update.setBal(acctDemo.getBal().subtract(bal));
        doSubmit(update);
		update.setBal(bal);
		return new BeanResult(out);
	}
	@SubmitLog
	public void doSubmit(DemoAcct ad){demoAcctDao.selectByPrimaryKey(ad);}
}
