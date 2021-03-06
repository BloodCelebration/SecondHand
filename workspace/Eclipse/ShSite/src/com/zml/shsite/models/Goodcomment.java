package com.zml.shsite.models;

import java.sql.Timestamp;

/**
 * Goodcomment entity. @author MyEclipse Persistence Tools
 */

public class Goodcomment implements java.io.Serializable {

	// Fields

	private Integer goodCommentId;
	private Integer shUserId;
	private Integer goodId;
	private Timestamp comTime;
	private String comContent;
	private Shuser shuser;
	private Good good;
	// Constructors

	/** default constructor */
	public Goodcomment() {
	}

	/** full constructor */
	public Goodcomment(Integer shUserId,Integer goodId, Timestamp comTime, String comContent) {
		this.shUserId = shUserId;
		this.goodId = goodId;
		this.comTime = comTime;
		this.comContent = comContent;
	}
	public Goodcomment(Shuser shuser, Good good, Timestamp comTime, String comContent) {
		this.shuser = shuser;
		this.good = good;
		this.comTime = comTime;
		this.comContent = comContent;
	}

	// Property accessors

	public Integer getGoodCommentId() {
		return this.goodCommentId;
	}

	public void setGoodCommentId(Integer goodCommentId) {
		this.goodCommentId = goodCommentId;
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

	public Timestamp getComTime() {
		return this.comTime;
	}

	public void setComTime(Timestamp comTime) {
		this.comTime = comTime;
	}

	public String getComContent() {
		return this.comContent;
	}

	public void setComContent(String comContent) {
		this.comContent = comContent;
	}

	public Integer getShUserId() {
		return shUserId;
	}

	public void setShUserId(Integer shUserId) {
		this.shUserId = shUserId;
	}

	public Integer getGoodId() {
		return goodId;
	}

	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}

}