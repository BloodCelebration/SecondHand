package com.zml.shsite.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zml.shsite.models.Good;
import com.zml.shsite.services.IAnnouncementService;
import com.zml.shsite.services.ICreateGoodViewModel;
import com.zml.shsite.services.IGoodService;
import com.zml.shsite.services.IGoodtypeService;
/**
 * 主页面控制器
 * @author fhr
 *
 */
@Controller
public class HomeController {
	private final static Logger logger = Logger.getLogger(HomeController.class);
	@Autowired
	private IGoodtypeService goodtypeService=null;
	@Autowired
	private IAnnouncementService announcementService=null;
	@Autowired
	private IGoodService goodService=null;
	@Autowired
	private ICreateGoodViewModel createGoodViewModel=null;
	//站点默认页面 返回主页
	@RequestMapping("/")
	public String home(Model model){
		dealModels(model);
		return "index";
	}
	//也是主页
	@RequestMapping("/index")
	public String index(Model model){
		dealModels(model);
		return "index";
	}
	private void dealModels(Model model) {
		model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("announcements", announcementService.findAll());
		List<Good> goods=goodService.findTopOrderByTime(10);
		model.addAttribute("goods",createGoodViewModel.create(goods));
	}
}
