package com.DAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAOMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcPersonDAO jd=ctx.getBean("pdao", JdbcPersonDAO.class);
		//sjd.create(new Person(3,"sanika"));
		System.out.println(jd.retrieve(1));
	

	}

}
