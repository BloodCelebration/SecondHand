package com.zml.shsite.models;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Shuser entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zml.shsite.models.Shuser
 * @author MyEclipse Persistence Tools
 */
public class ShuserDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(ShuserDAO.class);
	// property constants
	public static final String SH_USER_NAME = "shUserName";
	public static final String PASSWORD = "password";
	public static final String GENDER = "gender";
	public static final String INTRODUCE = "introduce";
	public static final String PHONE = "phone";
	public static final String ADDRESS = "address";

	protected void initDao() {
		// do nothing
	}

	public void save(Shuser transientInstance) {
		log.debug("saving Shuser instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Shuser persistentInstance) {
		log.debug("deleting Shuser instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Shuser findById(java.lang.Integer id) {
		log.debug("getting Shuser instance with id: " + id);
		try {
			Shuser instance = (Shuser) getHibernateTemplate().get("com.zml.shsite.models.Shuser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Shuser instance) {
		log.debug("finding Shuser instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Shuser instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Shuser as model where model." + propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByShUserName(Object shUserName) {
		return findByProperty(SH_USER_NAME, shUserName);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByGender(Object gender) {
		return findByProperty(GENDER, gender);
	}

	public List findByIntroduce(Object introduce) {
		return findByProperty(INTRODUCE, introduce);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findAll() {
		log.debug("finding all Shuser instances");
		try {
			String queryString = "from Shuser";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Shuser merge(Shuser detachedInstance) {
		log.debug("merging Shuser instance");
		try {
			Shuser result = (Shuser) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Shuser instance) {
		log.debug("attaching dirty Shuser instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Shuser instance) {
		log.debug("attaching clean Shuser instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ShuserDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ShuserDAO) ctx.getBean("ShuserDAO");
	}
}