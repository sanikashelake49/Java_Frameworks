package com.db.database.springDataJpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.database.springDataJpa.bean.StudentBean;
import com.db.database.springDataJpa.dao.StudentEntity_I;

@Service("serv")
public class StudentService_Impl implements StudentService_I {
	
	@Autowired
	StudentEntity_I emp_dao;

	@Override
	public boolean create(StudentBean sb) {
		// TODO Auto-generated method stub
	//	System.out.println(sb);
		return emp_dao.create(sb);
	}

}
