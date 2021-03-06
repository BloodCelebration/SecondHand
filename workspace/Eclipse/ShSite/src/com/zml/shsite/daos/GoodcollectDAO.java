package com.zml.shsite.daos;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.zml.shsite.models.Goodcollect;

/**
 * A data access object (DAO) providing persistence and search support for
 * Goodcollect entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zml.shsite.models.Goodcollect
 * @author MyEclipse Persistence Tools
 */
@Repository
public class GoodcollectDAO extends HibernateBaseDao<Goodcollect> {
	private static final Logger log = LoggerFactory.getLogger(GoodcollectDAO.class);
	public  static final String Sh_USER_Id = "shUserId";
	public  static final String GOOD_Id =" goodId";
	// property constants
	@Autowired
	public GoodcollectDAO(SessionFactory sessionFactory){
		super();
		this.setSessionFactory(sessionFactory);
	}
	public List<Goodcollect> findByShUserId(int id){
		return findByProperty(Sh_USER_Id, id);
	}
	public List<Goodcollect> findByGoodId(int id){
		return findByProperty(GOOD_Id, id);
	}
	public void deleteByShUserId(int id){
		 deleteByProperty(Sh_USER_Id, id);
	}
	public void deleteByGoodId(int id){
		 deleteByProperty(GOOD_Id, id);
	}
	public static GoodcollectDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GoodcollectDAO) ctx.getBean("GoodcollectDAO");
	}
}