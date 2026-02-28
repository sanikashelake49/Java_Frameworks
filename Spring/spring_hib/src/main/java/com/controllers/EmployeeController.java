
package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.EmployeeBean;
import com.service.EmployeeService_I;

@Controller
public class EmployeeController {
	
	@Autowired  
	EmployeeService_I serv;
	
	@GetMapping("/")
	public String getHomePage() {
		return "index";
	}
	
	@GetMapping("register")
	public String getEmpRegPage() {  //controller method
		return "register";
	}
	
	@GetMapping("submitform")
	public String registerProces(@RequestParam("empId") Integer empId,@RequestParam("empName") String empName,@RequestParam("empMobNo") Long empMobNo,Model m) {
	
		EmployeeBean eb=new EmployeeBean();
		eb.setEmpId(empId);
		eb.setEmpName(empName);
		eb.setEmpMobNo(empMobNo);
		if(serv.create(eb)) {
			//return "success"; //return "redirect:list"
           return "redirect:list";		
		}
		else {
			return "failure";
		}
		//return serv.create(eb);

}
	@GetMapping("list")
	public String showAllRecs(Model m) {
		List<EmployeeBean> l=serv.getAllRecs();
		System.out.println(l);
		m.addAttribute("li",l);
		return "list";
	}
}
