package com.zy.vo;

public class Stu_Fo_Remove {

	private Integer SId;
	private String SName;
	private String SSex;
	private String SQq;
	private String SClasses;
	private String SStatus;
	private String SZxr;
	private String SDate;
	private String SCome;//来源
	private String STel;
	private Integer SAge;
	private String SEmail;
	private String SAddress;
	private String SSchool;
	private String SDegree;//学位
	private String SProvince;//省份
	private String SWorklife;//工作年限
	private String SReference;//介绍人
	private String SIntroducestu;//介绍学员
	private String SProblem;//关注问题
	private String SRemarks;//备注
	
	private Integer FId;
	private String FDate;
	private String FWay;
	private String FZxr;
	private String FStatus;
	private String FContent;
	
	private Integer RId;
	private String ROldzxr;
	private String RNewzxr;
	private String RDate;
	private String RCase;
	
	
	
	
	public Stu_Fo_Remove() {
		super();
	}
    
//remove
	
	public Stu_Fo_Remove(Integer sId, String sName, String sQq, String sStatus,
			String sZxr,String sTel, Integer rId, String rOldzxr, String rNewzxr,
			String rDate, String rCase) {
		super();
		SId = sId;
		SName = sName;
		SQq = sQq;
		SStatus = sStatus;
		SZxr=sZxr;
		STel = sTel;
		RId = rId;
		ROldzxr = rOldzxr;
		RNewzxr = rNewzxr;
		RDate = rDate;
		RCase = rCase;
	}
	
    
//follow	
	
	public Stu_Fo_Remove(Integer sId, String sName, Integer fId, String fDate,
			String fWay, String fZxr, String fStatus, String fContent) {
		super();
		SId = sId;
		SName = sName;
		FId = fId;
		FDate = fDate;
		FWay = fWay;
		FZxr = fZxr;
		FStatus = fStatus;
		FContent = fContent;
	}

//student    
	public Stu_Fo_Remove(Integer sId, String sName, String sSex, String sQq,
			String sClasses, String sStatus, String sZxr, String sTel) {
		super();
		SId = sId;
		SName = sName;
		SSex = sSex;
		SQq = sQq;
		SClasses = sClasses;
		SStatus = sStatus;
		SZxr = sZxr;
		STel = sTel;
	}



	public Stu_Fo_Remove(Integer sId, String sName, String sSex, String sQq,
			String sClasses, String sStatus, String sZxr, String sDate,
			String sCome, String sTel, Integer sAge, String sEmail,
			String sAddress, String sSchool, String sDegree, String sProvince,
			String sWorklife, String sReference, String sIntroducestu,
			String sProblem, String sRemarks, Integer fId, String fDate,
			String fWay, String fZxr, String fStatus, Integer rId,
			String rOldzxr, String rNewzxr, String rCase) {
		super();
		SId = sId;
		SName = sName;
		SSex = sSex;
		SQq = sQq;
		SClasses = sClasses;
		SStatus = sStatus;
		SZxr = sZxr;
		SDate = sDate;
		SCome = sCome;
		STel = sTel;
		SAge = sAge;
		SEmail = sEmail;
		SAddress = sAddress;
		SSchool = sSchool;
		SDegree = sDegree;
		SProvince = sProvince;
		SWorklife = sWorklife;
		SReference = sReference;
		SIntroducestu = sIntroducestu;
		SProblem = sProblem;
		SRemarks = sRemarks;
		FId = fId;
		FDate = fDate;
		FWay = fWay;
		FZxr = fZxr;
		FStatus = fStatus;
		RId = rId;
		ROldzxr = rOldzxr;
		RNewzxr = rNewzxr;
		RCase = rCase;
	}


	public Integer getSId() {
		return SId;
	}


	public void setSId(Integer sId) {
		SId = sId;
	}


	public String getSName() {
		return SName;
	}


	public void setSName(String sName) {
		SName = sName;
	}


	public String getSSex() {
		return SSex;
	}


	public void setSSex(String sSex) {
		SSex = sSex;
	}


	public String getSQq() {
		return SQq;
	}


	public void setSQq(String sQq) {
		SQq = sQq;
	}


	public String getSClasses() {
		return SClasses;
	}


	public void setSClasses(String sClasses) {
		SClasses = sClasses;
	}


	public String getSStatus() {
		return SStatus;
	}


	public void setSStatus(String sStatus) {
		SStatus = sStatus;
	}


	public String getSZxr() {
		return SZxr;
	}


	public void setSZxr(String sZxr) {
		SZxr = sZxr;
	}


	public String getSDate() {
		return SDate;
	}


	public void setSDate(String sDate) {
		SDate = sDate;
	}


	public String getSCome() {
		return SCome;
	}


	public void setSCome(String sCome) {
		SCome = sCome;
	}


	public String getSTel() {
		return STel;
	}


	public void setSTel(String sTel) {
		STel = sTel;
	}


	public Integer getSAge() {
		return SAge;
	}


	public void setSAge(Integer sAge) {
		SAge = sAge;
	}


	public String getSEmail() {
		return SEmail;
	}


	public void setSEmail(String sEmail) {
		SEmail = sEmail;
	}


	public String getSAddress() {
		return SAddress;
	}


	public void setSAddress(String sAddress) {
		SAddress = sAddress;
	}


	public String getSSchool() {
		return SSchool;
	}


	public void setSSchool(String sSchool) {
		SSchool = sSchool;
	}


	public String getSDegree() {
		return SDegree;
	}


	public void setSDegree(String sDegree) {
		SDegree = sDegree;
	}


	public String getSProvince() {
		return SProvince;
	}


	public void setSProvince(String sProvince) {
		SProvince = sProvince;
	}


	public String getSWorklife() {
		return SWorklife;
	}


	public void setSWorklife(String sWorklife) {
		SWorklife = sWorklife;
	}


	public String getSReference() {
		return SReference;
	}


	public void setSReference(String sReference) {
		SReference = sReference;
	}


	public String getSIntroducestu() {
		return SIntroducestu;
	}


	public void setSIntroducestu(String sIntroducestu) {
		SIntroducestu = sIntroducestu;
	}


	public String getSProblem() {
		return SProblem;
	}


	public void setSProblem(String sProblem) {
		SProblem = sProblem;
	}


	public String getSRemarks() {
		return SRemarks;
	}


	public void setSRemarks(String sRemarks) {
		SRemarks = sRemarks;
	}


	public Integer getFId() {
		return FId;
	}


	public void setFId(Integer fId) {
		FId = fId;
	}


	public String getFDate() {
		return FDate;
	}


	public void setFDate(String fDate) {
		FDate = fDate;
	}


	public String getFWay() {
		return FWay;
	}


	public void setFWay(String fWay) {
		FWay = fWay;
	}


	public String getFZxr() {
		return FZxr;
	}


	public void setFZxr(String fZxr) {
		FZxr = fZxr;
	}


	public String getFStatus() {
		return FStatus;
	}


	public void setFStatus(String fStatus) {
		FStatus = fStatus;
	}


	public Integer getRId() {
		return RId;
	}


	public void setRId(Integer rId) {
		RId = rId;
	}


	public String getROldzxr() {
		return ROldzxr;
	}


	public void setROldzxr(String rOldzxr) {
		ROldzxr = rOldzxr;
	}


	public String getRNewzxr() {
		return RNewzxr;
	}


	public void setRNewzxr(String rNewzxr) {
		RNewzxr = rNewzxr;
	}


	public String getRCase() {
		return RCase;
	}


	public void setRCase(String rCase) {
		RCase = rCase;
	}

	public String getFContent() {
		return FContent;
	}

	public void setFContent(String fContent) {
		FContent = fContent;
	}

	public String getRDate() {
		return RDate;
	}

	public void setRDate(String rDate) {
		RDate = rDate;
	}

	@Override
	public String toString() {
		return "Stu_Fo_Remove [SId=" + SId + ", SName=" + SName + ", SSex="
				+ SSex + ", SQq=" + SQq + ", SClasses=" + SClasses
				+ ", SStatus=" + SStatus + ", SZxr=" + SZxr + ", SDate="
				+ SDate + ", SCome=" + SCome + ", STel=" + STel + ", SAge="
				+ SAge + ", SEmail=" + SEmail + ", SAddress=" + SAddress
				+ ", SSchool=" + SSchool + ", SDegree=" + SDegree
				+ ", SProvince=" + SProvince + ", SWorklife=" + SWorklife
				+ ", SReference=" + SReference + ", SIntroducestu="
				+ SIntroducestu + ", SProblem=" + SProblem + ", SRemarks="
				+ SRemarks + ", FId=" + FId + ", FDate=" + FDate + ", FWay="
				+ FWay + ", FZxr=" + FZxr + ", FStatus=" + FStatus
				+ ", FContent=" + FContent + ", RId=" + RId + ", ROldzxr="
				+ ROldzxr + ", RNewzxr=" + RNewzxr + ", RDate=" + RDate
				+ ", RCase=" + RCase + "]";
	}
	
	
	
}
