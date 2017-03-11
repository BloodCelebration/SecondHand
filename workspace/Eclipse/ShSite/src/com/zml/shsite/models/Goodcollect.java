package com.zml.shsite.models;

/**
 * Goodcollect entity. @author MyEclipse Persistence Tools
 */

public class Goodcollect implements java.io.Serializable {

	// Fields

	private Integer goodCollectId;
	private Shuser shuser;
	private Good good;

	// Constructors

	/** default constructor */
	public Goodcollect() {
	}

	/** full constructor */
	public Goodcollect(Shuser shuser, Good good) {
		this.shuser = shuser;
		this.good = good;
	}

	// Property accessors

	public Integer getGoodCollectId() {
		return this.goodCollectId;
	}

	public void setGoodCollectId(Integer goodCollectId) {
		this.goodCollectId = goodCollectId;
	}

	public Shuser getShuser() {
		return this.shuser;
	}

	public void setShuser(Shuser shuser) {
		this.shuser = shuser;
	}

	public Good getGood() {
		return this.good;
	}

	public void setGood(Good good) {
		this.good = good;
	}

}