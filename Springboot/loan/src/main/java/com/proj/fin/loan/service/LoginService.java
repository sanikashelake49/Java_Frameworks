package com.proj.fin.loan.service;

import org.springframework.stereotype.Service;
//auth done separately-ease of maintainance and re-usability
@Service
public class LoginService {
	public Boolean auth(String userName,String userPwd) {
		Boolean isValidUser=userName.equalsIgnoreCase("spring");
		Boolean isValidPwd=userPwd.equalsIgnoreCase("java");
		return isValidUser && isValidPwd;
	}

}
