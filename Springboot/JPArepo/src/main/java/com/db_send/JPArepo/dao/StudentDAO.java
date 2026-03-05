package com.db_send.JPArepo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import com.db_send.JPArepo.bean.StudentBean;
import com.db_send.JPArepo.entitybean.Std_EntityBean;
import com.db_send.JPArepo.spring.data.jpa.Jdbc_SpringDataJpa_I;

 
@Repository
public class StudentDAO {
	
	
	@Autowired
	Jdbc_SpringDataJpa_I jpa;
	
	public void insert(StudentBean sd) {
		Std_EntityBean seb=new Std_EntityBean();
		seb.setId(sd.getId());
		seb.setName(sd.getName());
		//StudentBean sd1=new StudentBean(1,"java");
		//jpa.insert(seb);
		
		jpa.save(seb);
		
		System.out.println(jpa.findById(seb.getId()));
	}

	
	
	public List<Std_EntityBean> show() {
		
		return jpa.findAll();
		
}
	public boolean chkAuth(int id,String name) {
		Std_EntityBean se=jpa.findByIdAndName(id, name);
		
		if(se!=null) {
			//jpa.findById(id);
			return true;
		}
		else {
			return false;
		}
	}
	
}
