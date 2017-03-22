package com.zml.shsite.daos;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository
public class CommonStatistics extends HibernateBaseDao {
	
	private static final Logger logger=Logger.getLogger(CommonStatistics.class);
	
	public Object statisUniqueResult(String hql,List<Object> params){
		try {
			Query query = this.getSession().createQuery(hql);
			if(params!=null){
				for (int i = 0; i < params.size(); i++) {
					query.setParameter(i, params.get(i));
				}
			}
			Object result=query.uniqueResult();
			this.getSession().close();
			return result;
		} catch (RuntimeException e) {
			logger.error(e);
			return null;
		}
	}
	
	public List statisMoreResult(String hql,List<Object> params){
		try {
			Query query = this.getSession().createQuery(hql);
			if(params!=null){
				for (int i = 0; i < params.size(); i++) {
					query.setParameter(i, params.get(i));
				}
			}
			List results=query.list();
			this.getSession().close();
			return results;
		} catch (RuntimeException e) {
			logger.error(e);
			return null;
		}
	}
	
	
}
