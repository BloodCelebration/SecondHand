package com.zml.shsite.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zml.shsite.daos.GoodtypeDAO;
import com.zml.shsite.models.Goodtype;
import com.zml.shsite.services.IGoodtypeService;
@Service
public class GoodtypeServiceImpl implements IGoodtypeService {
	@Autowired
	private GoodtypeDAO goodtypeDAO=null;
	
	@Override
	public Goodtype findById(int id) {
		return goodtypeDAO.findById(id);
	}

	@Override
	public List<Goodtype> findAll() {
		return goodtypeDAO.findAll();
	}

}