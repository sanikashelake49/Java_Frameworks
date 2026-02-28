package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.EmployeeBean;
import com.dao.EmployeeEntity_I;

@Service("serv")
public class EmployeeService_impl implements EmployeeService_I {
	@Autowired
	EmployeeEntity_I emp_dao;

	@Override
	@Transactional //only used in service l
	public boolean create(EmployeeBean eb) {
		// TODO Auto-generated method stub
		return emp_dao.create(eb);
	}

	@Override
	@Transactional                  //it avoids repetative code in hibernate i.e. trnsaction.commit 
	public List<EmployeeBean> getAllRecs() {
		// TODO Auto-generated method stub
		return emp_dao.getAllRecs();
		//return null;
	}
	

}
