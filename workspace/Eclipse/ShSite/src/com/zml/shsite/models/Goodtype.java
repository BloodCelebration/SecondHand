package com.zml.shsite.models;

import java.util.HashSet;
import java.util.Set;

/**
 * Goodtype entity. @author MyEclipse Persistence Tools
 */

public class Goodtype implements java.io.Serializable {

	// Fields

	private Integer goodTypeId;
	private String goodTypeName;
	private Set goods = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goodtype() {
	}

	/** minimal constructor */
	public Goodtype(String goodTypeName) {
		this.goodTypeName = goodTypeName;
	}

	/** full constructor */
	public Goodtype(String goodTypeName, Set goods) {
		this.goodTypeName = goodTypeName;
		this.goods = goods;
	}

	// Property accessors

	public Integer getGoodTypeId() {
		return this.goodTypeId;
	}

	public void setGoodTypeId(Integer goodTypeId) {
		this.goodTypeId = goodTypeId;
	}

	public String getGoodTypeName() {
		return this.goodTypeName;
	}

	public void setGoodTypeName(String goodTypeName) {
		this.goodTypeName = goodTypeName;
	}

	public Set getGoods() {
		return this.goods;
	}

	public void setGoods(Set goods) {
		this.goods = goods;
	}

}