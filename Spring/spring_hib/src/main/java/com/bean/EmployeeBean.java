package com.bean;

public class EmployeeBean {
	private Integer empId;
	private String empName;
	private Long empMobNo;
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeBean(Integer empId, String empName, Long empMobNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMobNo = empMobNo;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getEmpMobNo() {
		return empMobNo;
	}
	public void setEmpMobNo(Long empMobNo) {
		this.empMobNo = empMobNo;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empMobNo=" + empMobNo + "]";
	}
	

}
