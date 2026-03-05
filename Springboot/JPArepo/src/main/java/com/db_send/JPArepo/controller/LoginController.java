package com.db_send.JPArepo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.db_send.JPArepo.bean.StudentBean;
import com.db_send.JPArepo.entitybean.Std_EntityBean;
import com.db_send.JPArepo.service.StudentService;

@Controller
public class LoginController {
	
	@Autowired
	StudentService serv;
	
	@GetMapping("/")
	public String getHomePage() {
		return "index";
	}
	
	@GetMapping("loginpage")
	public String getLoginPage() {
		return "login";
	}
	
	@GetMapping("submitform")
	public String getInfo(ModelMap m,@RequestParam String id,@RequestParam String name) {
		StudentBean sb=new StudentBean(Integer.parseInt(id),name);
		
		m.put("std_id", sb);
		//serv.insert(sb);
		return "submitform";
	}
	
	
	

	@GetMapping("list_all")
	public String getAllInfo(ModelMap model) {

	    List<Std_EntityBean> list =new ArrayList<Std_EntityBean>();
        serv.show();
		
	   model.addAttribute("list", list);
	  //  model.addAttribute("list", serv.show());
 
	    return "list_all";
	
	}
	
	@GetMapping("check_auth")
	public String getAuthDetails() {
		
		return "auth";
	}
	
	@GetMapping("chkauth")
	public String getLoginCredential(@RequestParam int id,@RequestParam String name) {
		boolean isValid=serv.chkAuth(id, name);
		if(isValid)
		return "redirect:submitform";
		else 
		  return "login";
		
	}
	
	

}
