package com.db_send.JPArepo.entitybean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student1")
public class Std_EntityBean {
	@Id
	private Integer id;
	@Column
	private String name;
	public Std_EntityBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Std_EntityBean(Integer id, String name) {
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
		return "Std_EntityBean [id=" + id + ", name=" + name + "]";
	}
	

}
