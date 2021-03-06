package com.zml.shsite.services;

import java.util.List;

import com.zml.shsite.models.Announcement;
import com.zml.shsite.models.Authority;
import com.zml.shsite.models.Good;
import com.zml.shsite.models.Shuser;

/**
 * 用户服务:权限、角色、用户
 * @author zml
 *
 */
public interface IUserService {
	Shuser findById(int id);
	Shuser findByUserName(String name);
	List<Shuser> findByRoleId(int roleId);
	List<Authority> findAuthoritys(int userId);
	List<Shuser> findAll();
	void removeById(int id);
	//保存用户时 同时会增加权限
	Shuser save(Shuser shuser,short roleId);
	Shuser update(Shuser shuser);
}
