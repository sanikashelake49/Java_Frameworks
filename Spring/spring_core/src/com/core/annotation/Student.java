package com.core.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud1")
public class Student {
	@Value("10")
	private Integer id;
	@Value("java")
	private String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
