package com.hmn.ym.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController extends BaseController{
	
	@RequestMapping("login")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		logger.info("login");
		return "login";
	}
	
	

}
