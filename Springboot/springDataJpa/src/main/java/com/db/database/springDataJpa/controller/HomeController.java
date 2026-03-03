package com.db.database.springDataJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.db.database.springDataJpa.bean.StudentBean;
import com.db.database.springDataJpa.service.StudentService_I;

@Controller
public class HomeController {
	
	@Autowired
	StudentService_I serv;
	
	@RequestMapping("/")
	public String getHomePage() {
		return "index";
	}
	
	@GetMapping("submitform")
	public String getSubmitPage(@RequestParam int std_id,@RequestParam String std_name) {
		
		StudentBean sb=new StudentBean();
		sb.setStdId(std_id);
		//System.out.println(std_id);
		sb.setStdName(std_name);
		
		if(serv.create(sb)) {
			return "submitform";
		}
		else {
		
		return "submitform";
		}
	}

}
