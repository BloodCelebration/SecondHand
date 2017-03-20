package com.zml.shsite.services;

import java.util.List;

import com.zml.shsite.models.Goodcollect;

public interface IGoodCollectService {
	List<Goodcollect> findGoodCollectsByUserId(Integer userId);
	Goodcollect saveGoodCollect(Goodcollect goodcollect);
	void remove(int id);
}
