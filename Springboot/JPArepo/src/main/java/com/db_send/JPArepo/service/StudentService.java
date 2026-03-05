package com.db_send.JPArepo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db_send.JPArepo.bean.StudentBean;
import com.db_send.JPArepo.dao.StudentDAO;
import com.db_send.JPArepo.entitybean.Std_EntityBean;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO sdao;
	
	public void insert(StudentBean st) {
		sdao.insert(st);
	}
	
	public List<Std_EntityBean> show(){
		return sdao.show();
	}
	
	public boolean chkAuth(int id,String name) {
	return sdao.chkAuth(id, name);
	
	}

}
