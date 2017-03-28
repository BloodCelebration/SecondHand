package com.zml.shsite.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.zml.shsite.components.exception.GoodNotFoundException;
import com.zml.shsite.components.exception.UserNotFoundException;
import com.zml.shsite.models.Good;
import com.zml.shsite.models.Goodcollect;
import com.zml.shsite.models.Shuser;
import com.zml.shsite.services.ICreateGoodViewModel;
import com.zml.shsite.services.IFileService;
import com.zml.shsite.services.IGoodCollectService;
import com.zml.shsite.services.IGoodService;
import com.zml.shsite.services.IGoodtypeService;
import com.zml.shsite.services.IUserService;
import com.zml.shsite.viewmodels.GoodViewModel;
import com.zml.shsite.viewmodels.RegisterViewModel;

@Controller
@RequestMapping("/Account")
public class AccountController {
	@Autowired
	private IGoodtypeService goodtypeService=null;
	@Autowired
	private IUserService userService=null;
	@Autowired
	private IFileService fileService=null;
	@Autowired
	private IGoodCollectService goodCollectService=null;
	@Autowired
	private IGoodService goodService=null;
	@Autowired
	private ICreateGoodViewModel createGoodViewModel=null;
	
	@RequestMapping("/PersonCenter/{id}")
	public String personCenter(@PathVariable Integer id,Model model){
		Shuser shuser=null;
		if(id==null||(shuser=userService.findById(id))==null){
			throw new UserNotFoundException();
		}
		model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("collectgoods", getGoodCollectViewModels(id));
		model.addAttribute("publishgoods", getPublishGoodViewModels(id));
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
			fileService.saveUserImage(registerViewModel.getImgFile(),shuser.getShUserId());
			return "redirect:LogOn";
		}
		return "redirect:register";
	}
	@RequestMapping("/CollectCenter/{id}")
	public String goodCollectCenter(@PathVariable Integer id,Model model){
		Shuser shuser=null;
		if(id==null||(shuser=userService.findById(id))==null){
			throw new UserNotFoundException();
		}
		List<GoodViewModel> goodViewModels = getGoodCollectViewModels(id);
		model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("goods", goodViewModels);
		return "collectcenter";
	}
	
	@RequestMapping("/PersonInfoUpdate/{id}")
	public String personInfoUpdate(@PathVariable Integer id,Model model){
		Shuser shuser=null;
		if(id==null||(shuser=userService.findById(id))==null){
			throw new UserNotFoundException();
		}
		model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("shuser", shuser);
		return "personinfoupdate";
	}
	@RequestMapping("/GoodDeal")
	public String goodDeal(Integer id,Model model){
		Good good=null;
		if(id==null||(good=goodService.findById(id))==null){
			throw new GoodNotFoundException();
		}
		model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("good",good);
		return "gooddeal";
	}
	@RequestMapping(value="/GoodDelete",
					method=RequestMethod.POST)
	public String goodDelete(Integer id,Model model,HttpSession httpSession){
		if(id==null||goodService.findById(id)==null){
			throw new GoodNotFoundException();
		}
		goodService.removeById(id);
		fileService.deleteGoodImage(id);
		Shuser shuser=(Shuser) httpSession.getAttribute("user");
	    return "redirect:/Account/PersonCenter/"+shuser.getShUserId();
	}
	@RequestMapping(value="/GoodEdit",
			method=RequestMethod.POST)
	public String edit(Good good,MultipartFile imgFile,Model model,HttpSession httpSession){
		try{
			goodService.update(good);
			if(!imgFile.isEmpty()){
				fileService.saveOrUpdateGoodImage(imgFile, good.getGoodId());
			}
			Shuser shuser=(Shuser) httpSession.getAttribute("user");
		    return "redirect:/Account/PersonCenter/"+shuser.getShUserId();
		}catch(Exception e){
			model.addAttribute("goodTypes", goodtypeService.findAll());
			return "goodmanager/edit";
		}
	}
	
	private List<GoodViewModel> getGoodCollectViewModels(Integer id) {
		List<Goodcollect> goodcollects=goodCollectService.findGoodCollectsByUserId(id);
		List<Good> goods=goodcollects.stream().map(goodcollect->goodcollect.getGood()).collect(Collectors.toList());
		List<GoodViewModel> goodViewModels=createGoodViewModel.create(goods);
		return goodViewModels;
	}
	private List<GoodViewModel> getPublishGoodViewModels(Integer id) {
		List<Good> goods=goodService.findByUserId(id);
		List<GoodViewModel> goodViewModels=createGoodViewModel.create(goods);
		return goodViewModels;
	}
}
