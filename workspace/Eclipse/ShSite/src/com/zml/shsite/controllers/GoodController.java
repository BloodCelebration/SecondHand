package com.zml.shsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Good")
public class GoodController {
	@RequestMapping("/Browse")
	public String browse(Integer id){
		return "index";
	}
}
