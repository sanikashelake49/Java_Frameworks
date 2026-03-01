package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bean.PaymentRequest;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String payInfo() {
		return "index";
	}
	
	
	@GetMapping("pay")
  public String payDetail(Model m) {
	  PaymentRequest req=new PaymentRequest();
	  m.addAttribute("payment", req);
	  return "payment_request";
  }
}
