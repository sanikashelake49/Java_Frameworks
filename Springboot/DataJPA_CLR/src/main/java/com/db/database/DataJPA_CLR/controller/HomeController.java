package com.db.database.DataJPA_CLR.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.db.database.DataJPA_CLR.bean.StudentBean;
import com.db.database.DataJPA_CLR.repo.spring.data.jpa.Student_SpringDataJPA;

@Controller
public class HomeController {
	
	@Autowired
	Student_SpringDataJPA jpa;
	
	@GetMapping("/")
	public String getHomePage() {
		return "index";
	}
	
	@GetMapping("submitform")
	public String getSubmitPage(@RequestParam int id,@RequestParam String name) {
		StudentBean sb=new StudentBean();
		sb.setStdId(id);
		sb.setStdName(name);
		//System.out.println(sb);
		if(jpa.save(sb) != null) {
		return "redirect:submitform";
	}
		else {
			return "redirect:submitform";
		}
		
         //return "redirect:submitform";

	
	}

}
