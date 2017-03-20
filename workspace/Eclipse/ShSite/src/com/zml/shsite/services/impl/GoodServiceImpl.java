package com.zml.shsite.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zml.shsite.daos.GoodDAO;
import com.zml.shsite.daos.GoodcollectDAO;
import com.zml.shsite.daos.GoodcommentDAO;
import com.zml.shsite.models.Good;
import com.zml.shsite.models.Goodcomment;
import com.zml.shsite.services.IGoodService;
@Service
public class GoodServiceImpl implements IGoodService {
	@Autowired
	private GoodcollectDAO goodcollectDAO=null;
	@Autowired 
	private GoodcommentDAO goodcommentDAO=null;
	@Autowired
	private GoodDAO goodDao=null;
	@Override
	public Good findById(int id) {
		return goodDao.findById(id);
	}

	@Override
	public List<Good> findAll() {
		return goodDao.findAll();
	}

	@Override
	public List<Good> findTopN(int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeById(int id) {
		goodDao.delete(id);
	}

	@Override
	public void removeAll() {
		goodcollectDAO.deleteAll();
		goodcommentDAO.deleteAll();
		goodDao.deleteAll();
	}

	@Override
	public Good save(Good good) {
		goodDao.save(good);
		return good;
	}

	@Override
	public Good update(Good good) {
		goodDao.update(good);
		return good;
	}

	@Override
	public List<Good> findByGoodType(int goodTypeId) {
		return goodDao.findBygoodTypeId(goodTypeId);
	}

}
