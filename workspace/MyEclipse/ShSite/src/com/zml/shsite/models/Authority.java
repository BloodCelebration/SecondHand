package com.zml.shsite.models;

/**
 * Authority entity. @author MyEclipse Persistence Tools
 */

public class Authority implements java.io.Serializable {

	// Fields

	private Integer authorityId;
	private Shuser shuser;
	private Shrole shrole;

	// Constructors

	/** default constructor */
	public Authority() {
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

}