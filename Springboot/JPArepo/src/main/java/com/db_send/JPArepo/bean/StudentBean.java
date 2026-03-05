package com.db_send.JPArepo.bean;

public class StudentBean {
	private Integer id;
	private String name;
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + "]";
	}
	

}
