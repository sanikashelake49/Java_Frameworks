package com.db.database.DataJPA_CLR.spring.data.jpa.clr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.db.database.DataJPA_CLR.bean.StudentBean;
import com.db.database.DataJPA_CLR.repo.spring.data.jpa.Student_SpringDataJPA;

@Component
public class StudentDataJPA_CLR implements CommandLineRunner{
	
	@Autowired
	Student_SpringDataJPA jpa;
	
	@Override
	public void run (String...args) throws Exception{
		
//		StudentBean s1=new StudentBean(1,"springboot");
//		StudentBean s2=new StudentBean(2,"spring");
//		StudentBean s3=new StudentBean(3,"hibernate");
//		StudentBean s4=new StudentBean(4,"spring_mvc");
//		StudentBean s5=new StudentBean(5,"spring_mvc");
        StudentBean sb=new StudentBean();
        System.out.println(sb);
        jpa.save(sb);
      //  jpa.save(sb);
		
//		jpa.save(s1);
//		jpa.save(s2);
//		jpa.
//		jpa.save(s3);
//		jpa.save(s4);
//		jpa.save(s5);
//		jpa.deleteById(1);
//		System.out.println(jpa.findById(3));
		
		
	}

}
