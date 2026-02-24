package com.proj.fin.loan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.proj.fin.loan.bean.LoanBean;
import com.proj.fin.loan.service.LoanService;


@SessionAttributes("username")
@Controller
public class LoanController {

	@Autowired
	LoanService loanServ;
	
	//when the url pattern matches the below,it should return a 
	//list of objects to the view page
	@GetMapping("list_all")
	public String getAllRecs(ModelMap model) {
		//invoke the service layer
		
		List<LoanBean> list=loanServ.getAllRecs();
		model.put("list",list);
		return "list_all";
	}

	 @GetMapping("add_data")
	 public String showAddDataPage() {
		 return "add_data";
	 }
	 
	 @GetMapping("add_action")
	 public String confirmNewData(ModelMap model,@RequestParam String mobileNo,@RequestParam String loanDesc) {
		 //now,retrieve the username from the model
		// String username=(String) model.get("username");
		 loanServ.addLoanData((String) model.get("username"), mobileNo, loanDesc);
		 return "redirect:list_all";
	 }
	 
	 @GetMapping("delete_loan")
	 public String deleteRecById(@RequestParam Integer id)  {
		 loanServ.findById(id);
		 return "redirect:list_all";
	 }
	 //TO show the update page for changes
	 @GetMapping("update_loan")
	 public String showUpdPage(@RequestParam Integer id,ModelMap model) {
		 LoanBean lb=loanServ.upById(id);
		// System.out.println(lb);
		 //inject the bean into the model
		 model.put("ln_bn",lb);
		 return "update";
		 
	 }
	 //to confirm the changes
	 @GetMapping("update_action")
	 public String revisedUpdPage(LoanBean lb) {//here lb contains the revised changes
		 loanServ.revisedChanges(lb);
	 System.out.println("sanika"+lb);
		 return "redirect:list_all";
	 }
}
