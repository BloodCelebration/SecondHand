package com.zml.shsite.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zml.shsite.daos.AuthorityDAO;
import com.zml.shsite.daos.ShroleDAO;
import com.zml.shsite.daos.ShuserDAO;
import com.zml.shsite.models.Authority;
import com.zml.shsite.models.Shuser;
import com.zml.shsite.services.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private ShuserDAO shuserDAO=null;
	@Autowired
	private ShroleDAO shroleDAO=null;
	@Autowired
	private AuthorityDAO authorityDAO=null;
	
	@Override
	public Shuser findById(int id) {
		return shuserDAO.findById(id);
	}

	@Override
	public Shuser findByUserName(String name) {
		return (Shuser) shuserDAO.findByShUserName(name).stream()
											   .findFirst()
											   .get();
	}

	@Override
	public List<Shuser> findAll() {
		return shuserDAO.findAll();
	}

	@Override
	public void removeById(int id) {
		shuserDAO.delete(id);
	}

	@Override
	public Shuser save(Shuser shuser) {
		shuserDAO.save(shuser);
		return shuser;
	}

	@Override
	public Shuser update(Shuser shuser) {
		shuserDAO.update(shuser);
		return shuser;
	}

}