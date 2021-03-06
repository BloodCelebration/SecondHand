package com.zml.shsite.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zml.shsite.daos.AuthorityDAO;
import com.zml.shsite.daos.GoodDAO;
import com.zml.shsite.daos.GoodcollectDAO;
import com.zml.shsite.daos.GoodcommentDAO;
import com.zml.shsite.daos.ShroleDAO;
import com.zml.shsite.daos.ShuserDAO;
import com.zml.shsite.models.Authority;
import com.zml.shsite.models.Shuser;
import com.zml.shsite.services.IUserService;
/**
 * 用户信息的增加删除修改查询
 * @author ASUS
 *
 */
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private ShuserDAO shuserDAO=null;
	@Autowired
	private ShroleDAO shroleDAO=null;
	@Autowired
	private AuthorityDAO authorityDAO=null;
	@Autowired
	private GoodDAO goodDAO=null;
	@Autowired
	private GoodcommentDAO goodcommentDAO=null;
	@Autowired
	private GoodcollectDAO goodcollectDAO=null;
	@Override
	public Shuser findById(int id) {
		return shuserDAO.findById(id);
	}

	@Override
	public Shuser findByUserName(String name) {
		return (Shuser) shuserDAO.findByShUserName(name).stream().findFirst().get();
	}

	@Override
	public List<Shuser> findAll() {
		return shuserDAO.findAll();
	}

	@Override
	public void removeById(int id) {
		authorityDAO.deleteByShUserId(id);
		goodDAO.deleteByShUserId(id);
		goodcommentDAO.deleteByShUserId(id);
		goodcollectDAO.deleteByShUserId(id);
		shuserDAO.delete(id);
	}

	@Override
	public Shuser save(Shuser shuser,short roleId){
		shuserDAO.save(shuser);
		Authority authority=new Authority(roleId,shuser.getShUserId());
		authorityDAO.save(authority);
		return shuser;
	}

	@Override
	public Shuser update(Shuser shuser) {
		shuserDAO.update(shuser);
		return shuser;
	}

	@Override
	public List<Authority> findAuthoritys(int userId) {
		return authorityDAO.findByShUserId(userId);
	}

	@Override
	public List<Shuser> findByRoleId(int roleId){
		return shuserDAO.findByHQL("select shuser "
				+ "from Shuser as shuser,Authority as authority,Shrole as shrole "
				+ "where shuser.shUserId = authority.shUserId "
				+ "and authority.shRoleId = shrole.shRoleId "
				+ "and shrole.shRoleId = "+roleId);
	}

}
