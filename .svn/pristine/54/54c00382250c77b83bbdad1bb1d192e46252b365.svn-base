package com.zy.vo;

/**
 * Positions entity. @author MyEclipse Persistence Tools
 */

public class Positions implements java.io.Serializable {

	// Fields

	/**
	 * 职务管理
	 */
	private static final long serialVersionUID = 1L;
	private Integer PId;
	private Department department;
	private String PName;
	private String PDesc;

	// Constructors

	/** default constructor */
	public Positions() {
	}

	/** minimal constructor */
	public Positions(Department department) {
		this.department = department;
	}

	/** full constructor */
	public Positions(Department department, String PName, String PDesc) {
		this.department = department;
		this.PName = PName;
		this.PDesc = PDesc;
	}

	// Property accessors

	public Integer getPId() {
		return this.PId;
	}

	public void setPId(Integer PId) {
		this.PId = PId;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getPName() {
		return this.PName;
	}

	public void setPName(String PName) {
		this.PName = PName;
	}

	public String getPDesc() {
		return this.PDesc;
	}

	public void setPDesc(String PDesc) {
		this.PDesc = PDesc;
	}

	@Override
	public String toString() {
		return "Positions [PId=" + PId + ", department=" + department
				+ ", PName=" + PName + ", PDesc=" + PDesc + "]";
	}

}