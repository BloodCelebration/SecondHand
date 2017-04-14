package com.zml.shsite.services.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zml.shsite.daos.GoodcommentDAO;
import com.zml.shsite.models.Goodcomment;
import com.zml.shsite.services.IGoodCommentService;
/**
 * 商品评论服务
 * 主要包含评论信息的增删改查
 * @author zml
 *
 */
@Service
public class GoodCommentServiceImpl implements IGoodCommentService{
	private static final Logger logger=Logger.getLogger(GoodCommentServiceImpl.class);
	@Autowired
	private GoodcommentDAO goodcommentDAO=null;
	@Override
	public List<Goodcomment> findGoodCommentByUserId(int id) {
		return goodcommentDAO.findByShUserId(id);
	}

	@Override
	public List<Goodcomment> findGoodCommentByGoodId(int id) {
		String hql="from Goodcomment goodcomment order by goodcomment.comTime desc"; 
		return goodcommentDAO.findByHQL(hql);
		//return goodcommentDAO.findByGoodId(id);
	}

	@Override
	public Goodcomment save(Goodcomment goodcomment) {
		try {
			goodcommentDAO.save(goodcomment);
			return goodcomment;
		} catch (Exception e) {
			logger.error(e);
			return null;
		}
	}

}
