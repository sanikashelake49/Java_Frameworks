package com.proj.fin.loan.controllers;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.proj.fin.loan.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@SessionAttributes("username")
@Controller
public class LoginController {
  
	@Autowired
	LoginService loginServ;
	/*LoginService loginServ;
	LoginController(LoginService loginServ){
		this.loginServ=loginServ;
	}*/
	//create a mapping for login
	@GetMapping("login")
	public String goToLoginPage() {
		return "login";
	}
	//create a mapping for capturing the login data
	@GetMapping("loginaction")
	public String loginAuth(@RequestParam String userName,@RequestParam String userPwd,ModelMap model){
		if(loginServ.auth(userName, userPwd)) {
			model.put("username", userName);
			
			
			
			return "welcome";
		}
		else
			model.put("errMsg", "invalid credentials,please login again");
		return "login";
	} 
}
