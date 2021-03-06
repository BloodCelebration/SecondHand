package com.zml.shsite.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zml.shsite.models.Good;
import com.zml.shsite.services.ICreateGoodViewModel;
import com.zml.shsite.viewmodels.GoodViewModel;
@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class CreateGoodViewModelTestCase {
	@Autowired
	private ICreateGoodViewModel createGoodViewModelTestCase=null;
	@Test
	public void testCreateGood() {
		Good good=new Good();
		good.setGoodId(101);
		GoodViewModel goodViewModel=createGoodViewModelTestCase.create(good);
		assertEquals(0, goodViewModel.getCollectCount());
	}

	@Test
	public void testCreateListOfGood() {
		fail("Not yet implemented");
	}

}
