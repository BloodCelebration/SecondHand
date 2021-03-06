package com.zml.shsite.models;

/**
 * Authority entity. @author MyEclipse Persistence Tools
 */

public class Authority implements java.io.Serializable {

	// Fields

	private Integer authorityId;
	private Short shRoleId;
	private Integer shUserId;
	private Shuser shuser;
	private Shrole shrole;

	// Constructors

	/** default constructor */
	public Authority() {
	}
	public Authority(Short shRoleId,Integer shUserId){
		this.shRoleId=shRoleId;
		this.shUserId=shUserId;
	}
	/** full constructor */
	public Authority(Shuser shuser, Shrole shrole) {
		this.shuser = shuser;
		this.shrole = shrole;
	}

	// Property accessors

	public Integer getAuthorityId() {
		return this.authorityId;
	}

	public void setAuthorityId(Integer authorityId) {
		this.authorityId = authorityId;
	}

	public Shuser getShuser() {
		return this.shuser;
	}

	public void setShuser(Shuser shuser) {
		this.shuser = shuser;
	}

	public Shrole getShrole() {
		return this.shrole;
	}

	public void setShrole(Shrole shrole) {
		this.shrole = shrole;
	}

	public Integer getShUserId() {
		return shUserId;
	}

	public void setShUserId(Integer shUserId) {
		this.shUserId = shUserId;
	}

	public Short getShRoleId() {
		return shRoleId;
	}

	public void setShRoleId(Short shRoleId) {
		this.shRoleId = shRoleId;
	}

}