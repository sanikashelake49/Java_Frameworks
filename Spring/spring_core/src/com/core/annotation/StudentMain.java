package com.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s=ctx.getBean("stud1", Student.class);
	  System.out.println(s);

	}

}
