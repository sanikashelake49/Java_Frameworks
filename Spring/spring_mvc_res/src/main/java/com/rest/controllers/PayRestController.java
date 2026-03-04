package com.rest.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.PaymentRequest;
import com.bean.PaymentResponse;

@RestController
@RequestMapping("payment")
public class PayRestController{
	
	private static final String SUCCESS_STATUS="success";
	private static final String DECLINED_STATUS="failure";
	
	@PostMapping("pay")
	public PaymentResponse details(@ModelAttribute("payment")PaymentRequest req) {
		PaymentResponse pr=new PaymentResponse();
		if(req.getCustId().equals("123")) {
			pr.setAuth_status(SUCCESS_STATUS);
		}
		else {
			pr.setAuth_status(DECLINED_STATUS);;
		}
		
		return pr;
		
	}
}


