package com.zy.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Privilege entity. @author MyEclipse Persistence Tools
 */

public class Privilege implements java.io.Serializable {

	// Fields

	private Integer PId;
	private String PName;
	private String PDesc;
	private Set roles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Privilege() {
	}

	public Privilege(Integer pId, String pName, String pDesc) {
		super();
		PId = pId;
		PName = pName;
		PDesc = pDesc;
	}
	/** full constructor */
	public Privilege(String PName, String PDesc, Set roles) {
		this.PName = PName;
		this.PDesc = PDesc;
		this.roles = roles;
	}

	// Property accessors

	public Integer getPId() {
		return this.PId;
	}

	public void setPId(Integer PId) {
		this.PId = PId;
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

	public Set getRoles() {
		return this.roles;
	}

	public void setRoles(Set roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Privilege [PId=" + PId + ", PName=" + PName + ", PDesc="
				+ PDesc + "]";
	}

}