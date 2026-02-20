package com.DAO.jt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAOMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcPersonDAO jd=ctx.getBean("pdao1",JdbcPersonDAO.class);
		jd.create(new Person(7,"python"));
		System.out.println(jd.retrieve(5));

	}

}
