/**   
 * <p>Title: Core14008001Out.java</p>
 * <p>Description: 客户信息查询</p>
 * <p>Copyright: Copyright (c) 2014-2015</p>
 * <p>Company: dcits</p>
 * @author admin
 * @update 20170410
 * @version V1.0
 */
package com.dcits.ensemble.cif.model.mbsdcore;

import com.dcits.galaxy.common.data.Response;

import java.io.Serializable;
import java.util.List;

/***
 * @description 客户信息查询
 * @version V1.0
 * @author admin
 * @update 20170410
 */
public class Core14008001Out extends Response {

	/***
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 客户类型<br>
	 * CLIENT_TYPE<br>
	 * seqNo:1<br>
	 * dataType:String<br>
	 * length:3<br>
     
	 * cons:
	 */
	private String clientType;

	/**
	 * 邮政代码<br>
	 * POSTAL_CODE<br>
	 * seqNo:10<br>
	 * dataType:String<br>
	 * length:6<br>
     
	 * cons:
	 */
	private String postalCode;

	/**
	 * 证件明细<br>
	 * DOCUMENT_INFO<br>
	 * seqNo:11<br>
	 * dataType:Array<br>
	 
     
	 * cons:
	 */
	private List<DocumentInfo> documentInfo;

	/**
	 * 客户名称<br>
	 * CLIENT_NAME<br>
	 * seqNo:2<br>
	 * dataType:String<br>
	 * length:100<br>
     
	 * cons:
	 */
	private String clientName;

	/**
	 * 地址<br>
	 * LOCATION<br>
	 * seqNo:3<br>
	 * dataType:String<br>
	 * length:140<br>
     
	 * cons:
	 */
	private String location;

	/**
	 * 客户经理<br>
	 * ACCT_EXEC<br>
	 * seqNo:4<br>
	 * dataType:String<br>
	 * length:30<br>
     
	 * cons:
	 */
	private String acctExec;

	/**
	 * 国籍<br>
	 * COUNTRY_LOC<br>
	 * seqNo:5<br>
	 * dataType:String<br>
	 * length:3<br>
     
	 * cons:
	 */
	private String countryLoc;

	/**
	 * 省、州<br>
	 * STATE_LOC<br>
	 * seqNo:6<br>
	 * dataType:String<br>
	 * length:10<br>
     
	 * cons:
	 */
	private String stateLoc;

	/**
	 * 城市代码<br>
	 * CLIENT_CITY<br>
	 * seqNo:7<br>
	 * dataType:String<br>
	 * length:8<br>
     
	 * cons:
	 */
	private String clientCity;

	/**
	 * 居住国家<br>
	 * COUNTRY_CITIZEN<br>
	 * seqNo:8<br>
	 * dataType:String<br>
	 * length:3<br>
     
	 * cons:
	 */
	private String countryCitizen;

	/**
	 * 备注<br>
	 * NARRATIVE<br>
	 * seqNo:9<br>
	 * dataType:String<br>
	 * length:300<br>
     
	 * cons:
	 */
	private String narrative;


	/**
	 * 客户类型<br>
	 * CLIENT_TYPE
	 */
	public String getClientType() {
		return clientType;
	}

	/**
	 * 客户类型<br>
	 * CLIENT_TYPE
	 */
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	/**
	 * 邮政代码<br>
	 * POSTAL_CODE
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * 邮政代码<br>
	 * POSTAL_CODE
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * 证件明细<br>
	 * DOCUMENT_INFO
	 */
	public List<DocumentInfo> getDocumentInfo() {
		return documentInfo;
	}

	/**
	 * 证件明细<br>
	 * DOCUMENT_INFO
	 */
	public void setDocumentInfo(List<DocumentInfo> documentInfo) {
		this.documentInfo = documentInfo;
	}

	/**
	 * @description 证件明细
	 * @version V1.0
	 * @author admin
	 * @update 20170410
	 */
	public static class DocumentInfo implements Serializable {
		
		private static final long serialVersionUID = 1L;

		/**
		 * 证件类型<br>
		 * DOCUMENT_TYPE<br>
		 * seqNo:11.11.1<br>
		 * dataType:String<br>
	     * length:3<br>
		 * cons:
		 */
		private String documentType;

		/**
		 * 证件号码<br>
		 * DOCUMENT_ID<br>
		 * seqNo:11.11.2<br>
		 * dataType:String<br>
	     * length:25<br>
		 * cons:
		 */
		private String documentId;

		/**
		 * 签发国家<br>
		 * ISS_COUNTRY<br>
		 * seqNo:11.11.3<br>
		 * dataType:String<br>
	     * length:3<br>
		 * cons:
		 */
		private String issCountry;

		/**
		 * 是否首选证件Y/N<br>
		 * PREF_FLAG<br>
		 * seqNo:11.11.4<br>
		 * dataType:String<br>
	     * length:1<br>
		 * cons:
		 */
		private String prefFlag;

		/**
		 * 签发地<br>
		 * ISS_PLACE<br>
		 * seqNo:11.11.5<br>
		 * dataType:String<br>
	     * length:30<br>
		 * cons:
		 */
		private String issPlace;

		/**
		 * 签发机关<br>
		 * ISS_AUTHORITY<br>
		 * seqNo:11.11.6<br>
		 * dataType:String<br>
	     * length:30<br>
		 * cons:
		 */
		private String issAuthority;

		/**
		 * 签发日期<br>
		 * ISS_DATE<br>
		 * seqNo:11.11.7<br>
		 * dataType:String<br>
	     * length:8<br>
		 * cons:
		 */
		private String issDate;

		/**
		 * 到期日期<br>
		 * EXPIRY_DATE<br>
		 * seqNo:11.11.8<br>
		 * dataType:String<br>
	     * length:8<br>
		 * cons:
		 */
		private String expiryDate;


		/**
		 * 证件类型<br>
		 * DOCUMENT_TYPE
		 */
		public String getDocumentType() {
			return documentType;
		}
	
		/**
		 * 证件类型<br>
		 * DOCUMENT_TYPE
		 */
		public void setDocumentType(String documentType) {
			this.documentType = documentType;
		}

		/**
		 * 证件号码<br>
		 * DOCUMENT_ID
		 */
		public String getDocumentId() {
			return documentId;
		}
	
		/**
		 * 证件号码<br>
		 * DOCUMENT_ID
		 */
		public void setDocumentId(String documentId) {
			this.documentId = documentId;
		}

		/**
		 * 签发国家<br>
		 * ISS_COUNTRY
		 */
		public String getIssCountry() {
			return issCountry;
		}
	
		/**
		 * 签发国家<br>
		 * ISS_COUNTRY
		 */
		public void setIssCountry(String issCountry) {
			this.issCountry = issCountry;
		}

		/**
		 * 是否首选证件Y/N<br>
		 * PREF_FLAG
		 */
		public String getPrefFlag() {
			return prefFlag;
		}
	
		/**
		 * 是否首选证件Y/N<br>
		 * PREF_FLAG
		 */
		public void setPrefFlag(String prefFlag) {
			this.prefFlag = prefFlag;
		}

		/**
		 * 签发地<br>
		 * ISS_PLACE
		 */
		public String getIssPlace() {
			return issPlace;
		}
	
		/**
		 * 签发地<br>
		 * ISS_PLACE
		 */
		public void setIssPlace(String issPlace) {
			this.issPlace = issPlace;
		}

		/**
		 * 签发机关<br>
		 * ISS_AUTHORITY
		 */
		public String getIssAuthority() {
			return issAuthority;
		}
	
		/**
		 * 签发机关<br>
		 * ISS_AUTHORITY
		 */
		public void setIssAuthority(String issAuthority) {
			this.issAuthority = issAuthority;
		}

		/**
		 * 签发日期<br>
		 * ISS_DATE
		 */
		public String getIssDate() {
			return issDate;
		}
	
		/**
		 * 签发日期<br>
		 * ISS_DATE
		 */
		public void setIssDate(String issDate) {
			this.issDate = issDate;
		}

		/**
		 * 到期日期<br>
		 * EXPIRY_DATE
		 */
		public String getExpiryDate() {
			return expiryDate;
		}
	
		/**
		 * 到期日期<br>
		 * EXPIRY_DATE
		 */
		public void setExpiryDate(String expiryDate) {
			this.expiryDate = expiryDate;
		}
	}

	/**
	 * 客户名称<br>
	 * CLIENT_NAME
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * 客户名称<br>
	 * CLIENT_NAME
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * 地址<br>
	 * LOCATION
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * 地址<br>
	 * LOCATION
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * 客户经理<br>
	 * ACCT_EXEC
	 */
	public String getAcctExec() {
		return acctExec;
	}

	/**
	 * 客户经理<br>
	 * ACCT_EXEC
	 */
	public void setAcctExec(String acctExec) {
		this.acctExec = acctExec;
	}

	/**
	 * 国籍<br>
	 * COUNTRY_LOC
	 */
	public String getCountryLoc() {
		return countryLoc;
	}

	/**
	 * 国籍<br>
	 * COUNTRY_LOC
	 */
	public void setCountryLoc(String countryLoc) {
		this.countryLoc = countryLoc;
	}

	/**
	 * 省、州<br>
	 * STATE_LOC
	 */
	public String getStateLoc() {
		return stateLoc;
	}

	/**
	 * 省、州<br>
	 * STATE_LOC
	 */
	public void setStateLoc(String stateLoc) {
		this.stateLoc = stateLoc;
	}

	/**
	 * 城市代码<br>
	 * CLIENT_CITY
	 */
	public String getClientCity() {
		return clientCity;
	}

	/**
	 * 城市代码<br>
	 * CLIENT_CITY
	 */
	public void setClientCity(String clientCity) {
		this.clientCity = clientCity;
	}

	/**
	 * 居住国家<br>
	 * COUNTRY_CITIZEN
	 */
	public String getCountryCitizen() {
		return countryCitizen;
	}

	/**
	 * 居住国家<br>
	 * COUNTRY_CITIZEN
	 */
	public void setCountryCitizen(String countryCitizen) {
		this.countryCitizen = countryCitizen;
	}

	/**
	 * 备注<br>
	 * NARRATIVE
	 */
	public String getNarrative() {
		return narrative;
	}

	/**
	 * 备注<br>
	 * NARRATIVE
	 */
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
}
