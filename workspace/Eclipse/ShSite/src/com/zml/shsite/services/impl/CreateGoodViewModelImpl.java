package com.zml.shsite.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zml.shsite.daos.CommonStatistics;
import com.zml.shsite.models.Good;
import com.zml.shsite.services.ICreateGoodViewModel;
import com.zml.shsite.viewmodels.GoodViewModel;
@Service
public class CreateGoodViewModelImpl implements ICreateGoodViewModel {
	@Autowired
	private CommonStatistics commonStatistics=null;
	@Override
	public GoodViewModel create(Good good) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GoodViewModel> create(List<Good> goods) {
		// TODO Auto-generated method stub
		return null;
	}

}
