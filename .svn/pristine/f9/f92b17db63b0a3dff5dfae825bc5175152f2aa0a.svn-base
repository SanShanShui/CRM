package com.zy.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private Integer RId;
	private String RName;
	private String RDesc;
	private Set privileges = new HashSet(0);
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	public Role(Integer rId, String rName, String rDesc) {
		super();
		RId = rId;
		RName = rName;
		RDesc = rDesc;
	}
	/** full constructor */
	public Role(String RName, String RDesc, Set privileges, Set users) {
		this.RName = RName;
		this.RDesc = RDesc;
		this.privileges = privileges;
		this.users = users;
	}

	// Property accessors

	public Integer getRId() {
		return this.RId;
	}

	public void setRId(Integer RId) {
		this.RId = RId;
	}

	public String getRName() {
		return this.RName;
	}

	public void setRName(String RName) {
		this.RName = RName;
	}

	public String getRDesc() {
		return this.RDesc;
	}

	public void setRDesc(String RDesc) {
		this.RDesc = RDesc;
	}

	public Set getPrivileges() {
		return this.privileges;
	}

	public void setPrivileges(Set privileges) {
		this.privileges = privileges;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Role [RId=" + RId + ", RName=" + RName + ", RDesc=" + RDesc
				+ "]";
	}

}