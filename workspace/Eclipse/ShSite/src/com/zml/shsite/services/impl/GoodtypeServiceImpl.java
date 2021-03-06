package com.zml.shsite.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.zml.shsite.daos.GoodtypeDAO;
import com.zml.shsite.models.Goodtype;
import com.zml.shsite.services.IGoodtypeService;
/**
 * 商品类型服务 主要包含商品类型的查询
 * @author zml
 *
 */
@Service
public class GoodtypeServiceImpl implements IGoodtypeService {
	@Autowired
	private GoodtypeDAO goodtypeDAO=null;
	@Cacheable(value="goodtype",key="#id")
	@Override
	public Goodtype findById(int id) {
		return goodtypeDAO.findById(id);
	}
	@Cacheable(value="goodtype",key="#root.methodName")
	@Override
	public List<Goodtype> findAll() {
		return goodtypeDAO.findAll();
	}

}
