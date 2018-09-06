/*
 * <p>Title: Core14003006.java</p>
 * <p>Description: 账户查询服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-04 19:58:44</p>
 * @author Author
 * @version v1.0
 */
package com.dcits.ensemble.rb.service.mbsdcore;

import com.dcits.ensemble.dbmanage.dao.GaoxuDemoDao;
import com.dcits.ensemble.dbmanage.dbmodel.GaoxuDemo;
import com.dcits.ensemble.rb.model.mbsdcore.Core14003006Out;
import com.dcits.galaxy.common.data.BeanResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.rb.api.mbsdcore.ICore14003006;
import com.dcits.galaxy.common.data.Request;
import com.dcits.ensemble.rb.model.mbsdcore.Core14003006In;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/***
 * 账户查询服务</br>
 * 2018-09-04 19:58:44
 *
 * @version v1.0
 * @since v1.0
 * @author Author
 */
@Service
public class Core14003006 extends AbstractService implements ICore14003006 {
	private static final Logger LOG = LoggerFactory.getLogger(Core14003006.class);

	@Resource
	private GaoxuDemoDao gaoxuDemoDao;
	@Override
	public Class<? extends Request> getRequestModel() {
		return Core14003006In.class;
	}

	public BeanResult query(Core14003006In core14003006in) {
		Core14003006In.Body body = core14003006in.getBody();
		String acctNo = body.getAcctNo();
		String acctName=body.getAcctName();
		BigDecimal bal=body.getBal();
		String create_time=body.getCreate_time();
		String create_date=body.getCreate_date();
		Core14003006Out core14003006Out = new Core14003006Out();
		List<Core14003006Out.Map> arrayList = new ArrayList<>();
		gaoxuDemoDao.insert(acctNo,acctName,bal,create_time,create_date);
		List<GaoxuDemo> acctInfoByAcctNo = gaoxuDemoDao.getAcctInfoByAcctNoList(acctNo);
		for (GaoxuDemo demoAcct : acctInfoByAcctNo) {
			Core14003006Out.Map array = new Core14003006Out.Map();
			array.setAcctName(demoAcct.getAcctName());
			array.setCreateDate(demoAcct.getCreateDate());
			arrayList.add(array);
		}
		core14003006Out.setMap(arrayList);
		return new BeanResult(core14003006Out);
	}


}
