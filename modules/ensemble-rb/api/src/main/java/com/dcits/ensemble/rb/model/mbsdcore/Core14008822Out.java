/*
 * <p>Title: Core14008822Out.java</p>
 * <p>Description: 查询流水服务</p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: dcits</p>
 * <p>2018-09-06 08:07:00</p>
 * @author
 * @version v1.0
 */
package com.dcits.ensemble.rb.model.mbsdcore;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import com.dcits.galaxy.common.data.Response;

/***
 * 查询流水服务</br>
 * 2018-09-06 08:07:00
 *
 * @version v1.0
 * @since v1.0
 * @author
 */
public class Core14008822Out extends Response {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 查询返回Array<br>
	 * ARRAY<br>
	 * seqNo:1<br>
	 * dataType:List<br>
	 * length:55<br>
	 * scale:0<br>
	 * cons:
	 */
	private List<Array> array;


	/**
	 * 查询返回Array<br>
	 * ARRAY
	 */
	public List<Array> getArray() {
		return array;
	}

	/**
	 * 查询返回Array<br>
	 * ARRAY
	 */
	public void setArray(List<Array> array) {
		this.array = array;
	}

	/**
	 * @description 查询返回Array
	 * @since v1.0
	 */
	public static class Array implements Serializable {

		private static final long serialVersionUID = 1L;

		/**
		 * 流水单号<br>
		 * BS_ID<br>
		 * seqNo:1.1<br>
		 * dataType:Integer<br>
		 * length:8<br>
		 * scale:0<br>
		 * cons:
		 */
		private Integer bsId;

		/**
		 * 操作流水时间<br>
		 * BS_TIME<br>
		 * seqNo:1.2<br>
		 * dataType:String<br>
		 * length:30<br>
		 * scale:0<br>
		 * cons:
		 */
		private String bsTime;

		/**
		 * 银行卡号<br>
		 * CD_ID<br>
		 * seqNo:1.3<br>
		 * dataType:Integer<br>
		 * length:8<br>
		 * scale:0<br>
		 * cons:
		 */
		private Integer cdId;

		/**
		 * 存款额度<br>
		 * DEPOSIT<br>
		 * seqNo:1.4<br>
		 * dataType:Double<br>
		 * length:17<br>
		 * scale:2<br>
		 * cons:
		 */
		private BigDecimal deposit;

		/**
		 * 取款额度<br>
		 * WITHDRAWAL<br>
		 * seqNo:1.5<br>
		 * dataType:Double<br>
		 * length:17<br>
		 * scale:2<br>
		 * cons:
		 */
		private BigDecimal withdrawal;

		/**
		 * 取款地点<br>
		 * PUT_WAY<br>
		 * seqNo:1.6<br>
		 * dataType:Integer<br>
		 * length:1<br>
		 * scale:0<br>
		 * cons:
		 */
		private Integer putWay;

		/**
		 * 存款地点<br>
		 * SAVE_WAY<br>
		 * seqNo:1.7<br>
		 * dataType:Integer<br>
		 * length:1<br>
		 * scale:0<br>
		 * cons:
		 */
		private Integer saveWay;


		/**
		 * 流水单号<br>
		 * BS_ID
		 */
		public Integer getBsId() {
			return bsId;
		}

		/**
		 * 流水单号<br>
		 * BS_ID
		 */
		public void setBsId(Integer bsId) {
			this.bsId = bsId;
		}

		/**
		 * 操作流水时间<br>
		 * BS_TIME
		 */
		public String getBsTime() {
			return bsTime;
		}

		/**
		 * 操作流水时间<br>
		 * BS_TIME
		 */
		public void setBsTime(String bsTime) {
			this.bsTime = bsTime;
		}

		/**
		 * 银行卡号<br>
		 * CD_ID
		 */
		public Integer getCdId() {
			return cdId;
		}

		/**
		 * 银行卡号<br>
		 * CD_ID
		 */
		public void setCdId(Integer cdId) {
			this.cdId = cdId;
		}

		/**
		 * 存款额度<br>
		 * DEPOSIT
		 */
		public BigDecimal getDeposit() {
			return deposit;
		}

		/**
		 * 存款额度<br>
		 * DEPOSIT
		 */
		public void setDeposit(BigDecimal deposit) {
			this.deposit = deposit;
		}

		/**
		 * 取款额度<br>
		 * WITHDRAWAL
		 */
		public BigDecimal getWithdrawal() {
			return withdrawal;
		}

		/**
		 * 取款额度<br>
		 * WITHDRAWAL
		 */
		public void setWithdrawal(BigDecimal withdrawal) {
			this.withdrawal = withdrawal;
		}

		/**
		 * 取款地点<br>
		 * PUT_WAY
		 */
		public Integer getPutWay() {
			return putWay;
		}

		/**
		 * 取款地点<br>
		 * PUT_WAY
		 */
		public void setPutWay(Integer putWay) {
			this.putWay = putWay;
		}

		/**
		 * 存款地点<br>
		 * SAVE_WAY
		 */
		public Integer getSaveWay() {
			return saveWay;
		}

		/**
		 * 存款地点<br>
		 * SAVE_WAY
		 */
		public void setSaveWay(Integer saveWay) {
			this.saveWay = saveWay;
		}
	}
}
