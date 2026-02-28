package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.EmployeeBean;
import com.entity.Employee_Entity_Bean;


@Repository("emp_dao")
public class EmployeeEntityDAO implements EmployeeEntity_I {

	@Autowired
	SessionFactory	sf;
	@Override
	public boolean create(EmployeeBean eb) {
		// TODO Auto-generated method stub
		try {
			Session s=sf.getCurrentSession();
			Employee_Entity_Bean bean=new Employee_Entity_Bean();
			bean.setEmpId(eb.getEmpId()); //injecting the values entered by the user into the entity bean
            bean.setEmpName(eb.getEmpName());
            bean.setEmpMobNo(eb.getEmpMobNo());
            s.persist(bean);//save and persist
            return true;
            
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return false;
	}
	@Override
	public List<EmployeeBean> getAllRecs() {
		// TODO Auto-generated method stub
		List<EmployeeBean> ebean=new ArrayList<>();
		try {
			Session s2=sf.getCurrentSession();
			Query<Employee_Entity_Bean> q=s2.createQuery("from Employee_Entity_Bean",Employee_Entity_Bean.class);
			
			//get all the records from the db and inject into entity beans
			List<Employee_Entity_Bean> list=q.getResultList(); 
			//looping through collection of entity bean
			for(int i=0;i<list.size();i++) {
				Employee_Entity_Bean eb=list.get(i);//returns the entity object
				EmployeeBean emp=new EmployeeBean();
				emp.setEmpId(eb.getEmpId());//injecting values from 
				emp.setEmpName(eb.getEmpName());//entity to POJO
				emp.setEmpMobNo(eb.getEmpMobNo());
				//add the POJO to the collection
				ebean.add(emp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ebean;
	}

}
