/*
 * <p>Title: Core14008822.java</p>
 * <p>Description: 查询流水服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-06 08:07:00</p>
 * @author
 * @version v1.0
 */
package com.dcits.ensemble.rb.service.mbsdcore;

import com.dcits.ensemble.dbmanage.dao.BsDao;
import com.dcits.ensemble.dbmanage.dao.CdCardDao;
import com.dcits.ensemble.dbmanage.dbmodel.Bs;
import com.dcits.ensemble.dbmanage.dbmodel.CdCard;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008821In;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008821Out;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008822Out;
import com.dcits.ensemble.util.BusiUtil;
import com.dcits.galaxy.common.data.BeanResult;
import org.apache.commons.collections.BagUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dcits.ensemble.business.AbstractService;
import com.dcits.ensemble.rb.api.mbsdcore.ICore14008822;
import com.dcits.galaxy.common.data.Request;
import com.dcits.ensemble.rb.model.mbsdcore.Core14008822In;
import sun.font.BidiUtils;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/***
 * 查询流水服务</br>
 * 2018-09-06 08:07:00
 *
 * @version v1.0
 * @since v1.0
 * @author
 */
@Service
public class Core14008822 extends AbstractService implements ICore14008822 {
	private static final Logger LOG = LoggerFactory.getLogger(Core14008822.class);

	@Resource
	private CdCardDao cdCardDao;

	@Resource
	private BsDao bsDao;

	@Override
	public Class<? extends Request> getRequestModel() {
		return Core14008822In.class;
	}

	/**
	 * 根据账号、密码、起始时间、终止时间查询流水
	 *
	 * @param core14008822In
	 * @return
	 */
	@Override
	public BeanResult queryCdIdInfoBS(Core14008822In core14008822In) {
		//获取报文body内容
		Core14008822In.Body body = core14008822In.getBody();
		Integer cdId = body.getCdId();
		String passWord = body.getPassword();
		String startDate = body.getStartDate();
		String endDate = body.getEndDate();
		Core14008822Out core14008822Out = new Core14008822Out();
		//根据cdId查找该账号，并返回CdCard对象
		CdCard cdCard = cdCardDao.getSelectByCdId(cdId);
		List<Core14008822Out.Array> arrayList = new ArrayList<>();
		Core14008822Out.Array array = new Core14008822Out.Array();

		//判断密码输入是否正确
		if (!passWord.equals(cdCard.getPassword())) {
			array.setBsTime("密码输入错误，请核对后重新操作！");
			arrayList.add(array);
			return new BeanResult(core14008822Out);
		}
		//判断输入的起止日期格式是否正确
		if (startDate.length() != 8 || endDate.length() != 8) {
			array.setBsTime("起止日期输入错误，请输入八位数字"+startDate.compareTo(endDate));
			arrayList.add(array);
			return new BeanResult(core14008822Out);
		}
		//判断输入的起止日期是否合法
		if(startDate.compareTo(endDate)==0){
			array.setBsTime("日期输入不合法，起始日期不能大于终止日期！");
			arrayList.add(array);
			return new BeanResult(core14008822Out);
		}
		List<Bs> list = bsDao.getSelectAll(cdId, startDate, endDate);
		//遍历list数组
		for (Bs bs : list) {
			Core14008822Out.Array array1 = new Core14008822Out.Array();
			array1.setBsId(bs.getBsId());
			array1.setBsTime(bs.getBsTime());
			array1.setDeposit(bs.getDeposit());
			array1.setPutWay(bs.getPutWay());
			array1.setSaveWay(bs.getSaveWay());
			array1.setWithdrawal(bs.getWithdrawal());
			arrayList.add(array1);
		}
		core14008822Out.setArray(arrayList);
		return new BeanResult(core14008822Out);
	}
}
