package com.zml.shsite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zml.shsite.models.Announcement;
import com.zml.shsite.services.IAnnouncementService;
import com.zml.shsite.services.IGoodService;
import com.zml.shsite.services.IGoodtypeService;
import com.zml.shsite.services.impl.GoodServiceImpl;
import com.zml.shsite.services.impl.GoodtypeServiceImpl;

@Controller
public class HomeController {
	@Autowired
	private IGoodtypeService goodtypeService=null;
	@Autowired
	private IAnnouncementService announcementService=null;
	@Autowired
	private IGoodService goodService=null;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("announcements", announcementService.findAll());
		model.addAttribute("goods",goodService.findAll());
		return "index";
	}
}
