//package com.db.database.spring.data.jpa.clr;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.db.database.repo.bean.StudentBean;
//import com.db.database.repo.spring.data.jpa.Student_SpringDataJPA;
//
//@Component
//public class StudentDataJPA_CLR implements CommandLineRunner {
//	
//	@Autowired
//	Student_SpringDataJPA data;
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		StudentBean t1=new StudentBean(1,"java");
//		StudentBean t2=new StudentBean(2,"sanika");
//
//		StudentBean t3=new StudentBean(3,"hibernate");
//		//to insert
//		data.save(t1);
//		data.save(t2);
//		data.save(t3);
//		
//		//to retrieve
//		System.out.println(data.findById(2));
//		//to remove
//		data.deleteById(3);
//
//		
//
//	}
//
//}
