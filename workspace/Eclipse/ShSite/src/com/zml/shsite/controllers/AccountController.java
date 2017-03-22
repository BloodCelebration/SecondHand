package com.zml.shsite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zml.shsite.components.FileComponentUtil;
import com.zml.shsite.models.Shuser;
import com.zml.shsite.services.IFileService;
import com.zml.shsite.services.IGoodtypeService;
import com.zml.shsite.services.IUserService;
import com.zml.shsite.viewmodels.RegisterViewModel;

@Controller
@RequestMapping("/Account")
public class AccountController {
	@Autowired
	private IGoodtypeService goodtypeService=null;
	@Autowired
	private IUserService userService=null;
	@Autowired
	private IFileService fileSaveService=null;
	
	@RequestMapping("/PersonCenter")
	public String personCenter(Model model){
		model.addAttribute("goodTypes", goodtypeService.findAll());
		return "personcenter";
	}
	@RequestMapping("/LogOn")
	public String logOn(Model model){
		model.addAttribute("goodTypes", goodtypeService.findAll());
		return "logon";
	}
	@RequestMapping("/Register")
	public String register(Model model){
		model.addAttribute("goodTypes", goodtypeService.findAll());
		//Shuser shuser=new Shuser();
		//model.addAttribute("shuser", shuser);
		return "register";
	}
	@RequestMapping(value="/Register",
			method=RequestMethod.POST)
	public String registerPost(RegisterViewModel registerViewModel){
		Shuser shuser=registerViewModel.toShuser();
		if(userService.save(shuser,(short)2)!=null){
			fileSaveService.saveUserImage(registerViewModel.getImgFile(),shuser.getShUserId());
			return "redirect:LogOn";
		}
		return "redirect:register";
	}
}
