package com.zml.shsite.controllers;

import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.zml.shsite.components.exception.GoodNotFoundException;
import com.zml.shsite.components.exception.UserNotFoundException;
import com.zml.shsite.models.Good;
import com.zml.shsite.models.Shuser;
import com.zml.shsite.services.IFileService;
import com.zml.shsite.services.IGoodCollectService;
import com.zml.shsite.services.IGoodCommentService;
import com.zml.shsite.services.IGoodService;
import com.zml.shsite.services.IGoodtypeService;
import com.zml.shsite.services.IUserService;
import com.zml.shsite.services.impl.FileServiceImpl;
/**
 * 商品管理控制器
 * @author zml
 *
 */
@Controller
@RequestMapping("/GoodManager")
public class GoodManagerController {
	@Autowired
	private IGoodtypeService goodtypeService=null;
	@Autowired
	private IGoodService goodService=null;
	@Autowired
	private IUserService userService=null;
	@Autowired
	private IFileService fileService=null;
	@Autowired
	private IGoodCollectService goodCollectService=null;
	@Autowired
	private IGoodCommentService goodCommentService=null;
	//商品管理主页面请求
	@RequestMapping
	public String index(Model model){
		model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("goods", goodService.findAll());
		return "goodmanager/index";
	}
	//商品详细页面请求
	@RequestMapping("/Details")
	public String detail(Integer id,Model model,HttpSession httpSession){
		Good good=null;
		if(id==null||(good=goodService.findById(id))==null){
			throw new GoodNotFoundException();
		}
		model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("good", good);
		model.addAttribute("comments",goodCommentService.findGoodCommentByGoodId(id));
		if(httpSession.getValue("user")!=null){
			Shuser shuser=(Shuser)httpSession.getValue("user");
			int collectId=goodCollectService.isCollect(id,shuser.getShUserId());
			model.addAttribute("iscollect",collectId>0);
			model.addAttribute("collectId",collectId);
		}
		else{
			model.addAttribute("iscollect",false);
		}
		return "goodmanager/details";
	}
	//商品创建页面请求
	@RequestMapping("/Create")
	public String create(Model model){
		model.addAttribute("users",userService.findAll());
		model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("good",new Good());
		return "goodmanager/create";
	}
	//商品创建
	@RequestMapping(value="/Create",
					method=RequestMethod.POST)
	public String create(Good good,MultipartFile imgFile,Model model){
		try {
			good.setDesTime(new Timestamp(System.currentTimeMillis()));
			goodService.save(good);
			if (!imgFile.isEmpty()) {
				fileService.saveOrUpdateGoodImage(imgFile, good.getGoodId());
			}
			return "redirect:/GoodManager";
		} catch (Exception e) {
			model.addAttribute("goodTypes", goodtypeService.findAll());
			return "goodmanager/create";
		}
	}
	//商品编辑页面请求
	@RequestMapping("/Edit")
	public String edit(Model model,Integer id){
		Good good=null;
		if(id==null||(good = goodService.findById(id))==null){
			throw new UserNotFoundException();
		}
		model.addAttribute("users",userService.findAll());
        model.addAttribute("goodTypes", goodtypeService.findAll());
		model.addAttribute("good",good);
		return "goodmanager/edit";
	}
	//商品编辑
	@RequestMapping(value="/Edit",
			method=RequestMethod.POST)
	public String edit(Good good,MultipartFile imgFile,Model model){
		try{
			goodService.update(good);
			if(!imgFile.isEmpty()){
				fileService.saveOrUpdateGoodImage(imgFile, good.getGoodId());
			}
		    return "redirect:/GoodManager";
		}catch(Exception e){
			model.addAttribute("goodTypes", goodtypeService.findAll());
			return "goodmanager/edit";
		}
	}
	//商品删除页面请求
	@RequestMapping("/Delete")
    public String delete(Model model,Integer id){
		Good good=null;
		if(id==null||(good = goodService.findById(id))==null){
			throw new UserNotFoundException();
		}
        model.addAttribute("goodTypes", goodtypeService.findAll());
        model.addAttribute("good",good);
        return "goodmanager/delete";
    }
	//商品删除
	@RequestMapping(value="/Delete",
			method=RequestMethod.POST)
    public String deleteConfirmed(Integer id)
    {
		goodService.removeById(id);
		fileService.deleteGoodImage(id);
        //采用重定向
        return "redirect:/GoodManager";
    }
}
