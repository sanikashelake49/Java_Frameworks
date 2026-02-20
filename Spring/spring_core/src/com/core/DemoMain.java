package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//start the container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from the container
		//HelloWorld hello=(HelloWorld)ctx.getBean("h");
        HelloWorld hello=ctx.getBean("h",HelloWorld.class);
        HelloWorld hello1=ctx.getBean("h",HelloWorld.class);

        
      
        
        //invoke the method
        System.out.println(hello.sayHello("java"));
       

        
	}

}
