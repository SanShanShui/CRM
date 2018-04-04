package com.zy.vo;

public class User_Role {
	private Integer UId;
	private String UUsername;
	private String UPassword;
	private String UName;
	private String UTel;
	private String UEmail;
	
	private Integer RId;
	private String RName;
	private String RDesc;
	
	
	
	
	public User_Role() {
		super();
	}
	
	public User_Role(Integer uId, String uUsername, String uPassword,
			String uName, String uTel, String uEmail, Integer rId,
			String rName, String rDesc) {
		super();
		UId = uId;
		UUsername = uUsername;
		UPassword = uPassword;
		UName = uName;
		UTel = uTel;
		UEmail = uEmail;
		RId = rId;
		RName = rName;
		RDesc = rDesc;
	}






	public Integer getUId() {
		return UId;
	}
	public void setUId(Integer uId) {
		UId = uId;
	}
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getUPassword() {
		return UPassword;
	}
	public void setUPassword(String uPassword) {
		UPassword = uPassword;
	}
	public String getUTel() {
		return UTel;
	}
	public void setUTel(String uTel) {
		UTel = uTel;
	}
	public String getUEmail() {
		return UEmail;
	}
	public void setUEmail(String uEmail) {
		UEmail = uEmail;
	}
	public Integer getRId() {
		return RId;
	}
	public void setRId(Integer rId) {
		RId = rId;
	}
	public String getRName() {
		return RName;
	}
	public void setRName(String rName) {
		RName = rName;
	}
	public String getRDesc() {
		return RDesc;
	}
	public void setRDesc(String rDesc) {
		RDesc = rDesc;
	}

	public String getUUsername() {
		return UUsername;
	}



	public void setUUsername(String uUsername) {
		UUsername = uUsername;
	}

	@Override
	public String toString() {
		return "User_Role [UId=" + UId + ", UUsername=" + UUsername
				+ ", UPassword=" + UPassword + ", UName=" + UName + ", UTel="
				+ UTel + ", UEmail=" + UEmail + ", RId=" + RId + ", RName="
				+ RName + ", RDesc=" + RDesc + "]";
	}


	
}
