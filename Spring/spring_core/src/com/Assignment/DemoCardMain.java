package com.Assignment;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.PaymentAppClass;

public class DemoCardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		  PaymentAppClass std=ctx.getBean("p",PaymentAppClass.class);
	      
	        
	        //invoke the method
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter choice");
		  System.out.println("1.mastercard"+"\n"+"2.visacard");
		  int choice1=sc.nextInt();
		  switch (choice1) {
		case 1:
			std.pay("1", 1000);
			break;

		default:
			break;
		}
	        //std.pay("1", 1000);

	}
}
