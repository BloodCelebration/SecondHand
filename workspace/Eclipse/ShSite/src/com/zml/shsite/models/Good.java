package com.zml.shsite.models;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Good entity. @author MyEclipse Persistence Tools
 */

public class Good implements java.io.Serializable {

	// Fields

	private Integer goodId;
	private Shuser shuser;
	private Goodtype goodtype;
	private Timestamp desTime;
	private String description;
	private String imageUrl;
	private Short isSell;
	private Float goodPrice;
	private String goodName;
	// Constructors

	/** default constructor */
	public Good() {
	}

	/** minimal constructor */
	public Good(Shuser shuser, Goodtype goodtype, Timestamp desTime, String description, String imageUrl,
			Short isSell, Float goodPrice,String goodName) {
		this.shuser = shuser;
		this.goodtype = goodtype;
		this.desTime = desTime;
		this.description = description;
		this.imageUrl = imageUrl;
		this.isSell = isSell;
		this.goodPrice = goodPrice;
		this.goodName=goodName;
	}

	/** full constructor */
	public Good(Shuser shuser, Goodtype goodtype, Timestamp desTime, String description,String goodName,String imageUrl,
			Short isSell, Float goodPrice) {
		this.shuser = shuser;
		this.goodtype = goodtype;
		this.desTime = desTime;
		this.description = description;
		this.imageUrl = imageUrl;
		this.goodName=goodName;
		this.isSell = isSell;
		this.goodPrice = goodPrice;
	}

	// Property accessors

	public Integer getGoodId() {
		return this.goodId;
	}

	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}

	public Shuser getShuser() {
		return this.shuser;
	}

	public void setShuser(Shuser shuser) {
		this.shuser = shuser;
	}

	public Goodtype getGoodtype() {
		return this.goodtype;
	}

	public void setGoodtype(Goodtype goodtype) {
		this.goodtype = goodtype;
	}

	public Timestamp getDesTime() {
		return this.desTime;
	}

	public void setDesTime(Timestamp desTime) {
		this.desTime = desTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Short getIsSell() {
		return this.isSell;
	}

	public void setIsSell(Short isSell) {
		this.isSell = isSell;
	}

	public Float getGoodPrice() {
		return this.goodPrice;
	}

	public void setGoodPrice(Float goodPrice) {
		this.goodPrice = goodPrice;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

}