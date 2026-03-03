package com.db.database.springDataJpa.clr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.db.database.springDataJpa.bean.StudentBean;
import com.db.database.springDataJpa.repo.jpa.StudentRepo_JPA;

@Component
public class Student_JPA implements CommandLineRunner {
	
	@Autowired
	StudentRepo_JPA jpa;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		StudentBean s1=new StudentBean(1,"gauri");
//		StudentBean s2=new StudentBean(2,"java");
		StudentBean sb=new StudentBean();
		System.out.println(sb);
		jpa.create(sb);
//		jpa.insert(s1);
//		jpa.insert(s2);
//		jpa.findById(1);
//		jpa.deleteByid(1);
		
		

	}

}
