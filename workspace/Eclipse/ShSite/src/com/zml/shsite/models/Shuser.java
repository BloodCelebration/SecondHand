package com.zml.shsite.models;

/**
 * Shuser entity. @author MyEclipse Persistence Tools
 */

public class Shuser implements java.io.Serializable {

	// Fields
	private Integer shUserId;
	private String shUserName;
	private String password;
	private Short gender;
	private String introduce;
	private String phone;
	private String address;
	// Constructors

	/** default constructor */
	public Shuser() {
	}

	/** minimal constructor */
	public Shuser(String shUserName, String password, Short gender, String introduce, String phone, String address) {
		this.shUserName = shUserName;
		this.password = password;
		this.gender = gender;
		this.introduce = introduce;
		this.phone = phone;
		this.address = address;
	}

	// Property accessors

	public Integer getShUserId() {
		return this.shUserId;
	}

	public void setShUserId(Integer shUserId) {
		this.shUserId = shUserId;
	}

	public String getShUserName() {
		return this.shUserName;
	}

	public void setShUserName(String shUserName) {
		this.shUserName = shUserName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Short getGender() {
		return this.gender;
	}

	public void setGender(Short gender) {
		this.gender = gender;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}