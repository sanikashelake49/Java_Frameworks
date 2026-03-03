package com.db.database.springDataJpa.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp1")
public class StudentBean {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer stdId;
	@Column
	private String stdName;
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(Integer stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	@Override
	public String toString() {
		return "StudentBean [stdId=" + stdId + ", stdName=" + stdName + "]";
	}
	

}
