package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbsPersonDAO jd=ctx.getBean("pdao",JdbsPersonDAO.class);
		Person p=new Person();
		p.setId(2);
		p.setName("Sanika");
		
		jd.create(p);
		System.out.println(jd.retrieve(1));
		 

	}

}
