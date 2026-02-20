package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ResourceInjection Ri=ctx.getBean("r", ResourceInjection.class);
		Ri.process();
		

	}

}
