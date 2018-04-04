package com.zy.vo;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer UId;
	private Role role;
	private String UUsername;
	private String UPassword;
	private String UName;
	private String UTel;
	private String UEmail;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String UUsername) {
		this.UUsername = UUsername;
	}

	/** full constructor */
	public User(Role role, String UUsername, String UPassword, String UName,
			String UTel, String UEmail) {
		this.role = role;
		this.UUsername = UUsername;
		this.UPassword = UPassword;
		this.UName = UName;
		this.UTel = UTel;
		this.UEmail = UEmail;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUUsername() {
		return this.UUsername;
	}

	public void setUUsername(String UUsername) {
		this.UUsername = UUsername;
	}

	public String getUPassword() {
		return this.UPassword;
	}

	public void setUPassword(String UPassword) {
		this.UPassword = UPassword;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getUTel() {
		return this.UTel;
	}

	public void setUTel(String UTel) {
		this.UTel = UTel;
	}

	public String getUEmail() {
		return this.UEmail;
	}

	public void setUEmail(String UEmail) {
		this.UEmail = UEmail;
	}

	@Override
	public String toString() {
		return "User [UId=" + UId + ", UUsername=" + UUsername + ", UPassword="
				+ UPassword + ", UName=" + UName + ", UTel=" + UTel
				+ ", UEmail=" + UEmail + "]";
	}

	
}