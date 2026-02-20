package com.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Assignment.StudentData;

public class DemoStdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		  StudentData st=ctx.getBean("std", StudentData.class);
		  
	        //invoke the method
	        st.dispData();
	}

}
