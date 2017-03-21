package com.zml.shsite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zml.shsite.components.exception.UserNotFoundException;
import com.zml.shsite.models.Shuser;
import com.zml.shsite.services.IGoodtypeService;
import com.zml.shsite.services.IUserService;
@Controller
@RequestMapping("/UserManager")
public class UserManagerContrlloer {
	@Autowired
	private IGoodtypeService goodtypeService=null;
	@Autowired
	private IUserService userService=null;
	@RequestMapping
	public String index(Model model){
		model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("users", userService.findAll());
		return "usermanager/index";
	}
	@RequestMapping("/Details")
	public String details(Integer id,Model model){
		Shuser shuser = null;
		if(id==null||(shuser = userService.findById(id))==null){
			throw new UserNotFoundException();
		}
        model.addAttribute("goodTypes", goodtypeService.findAll());
        model.addAttribute("shuser",shuser);
        return "usermanager/details";
	}
	@RequestMapping("/Create")
	public String create(Model model){
		model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("shuser",new Shuser());
		return "usermanager/create";
	}
	@RequestMapping(value="/Create",
					method=RequestMethod.POST)
	public String create(Shuser shuser,Model model){
		try{
			userService.save(shuser,(short)2);
	        return "redirect:/UserManager";
		}catch(Exception e){
			model.addAttribute("goodTypes", goodtypeService.findAll());
			return "usermanager/create";
		}
	}
	@RequestMapping("/Edit")
	public String edit(Model model,Integer id){
		Shuser shuser = null;
		if(id==null||(shuser = userService.findById(id))==null){
			throw new UserNotFoundException();
		}
        model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("shuser",shuser);
		return "usermanager/edit";
	}
	@RequestMapping(value="/Edit",
			method=RequestMethod.POST)
	public String edit(Shuser shuser,Model model){
		try{
			userService.update(shuser);
		    return "redirect:/UserManager";
		}catch(Exception e){
			model.addAttribute("goodTypes", goodtypeService.findAll());
			return "usermanager/edit";
		}
	}
	@RequestMapping("/Delete")
    public String Delete(Model model,Integer id){
		Shuser shuser = null;
		if(id==null||(shuser = userService.findById(id))==null){
			throw new UserNotFoundException();
		}
        model.addAttribute("goodTypes", goodtypeService.findAll());
        model.addAttribute("shuser",shuser);
        return "usermanager/delete";
    }
	@RequestMapping(value="/Delete",
			method=RequestMethod.POST)
    public String DeleteConfirmed(Shuser shuser)
    {
        userService.removeById(shuser.getShUserId());
        return "redirect:/UserManager";
    }
	
}
