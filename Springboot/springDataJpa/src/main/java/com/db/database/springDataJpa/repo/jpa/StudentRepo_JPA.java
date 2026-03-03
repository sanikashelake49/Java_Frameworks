package com.db.database.springDataJpa.repo.jpa;


import org.springframework.stereotype.Repository;

import com.db.database.springDataJpa.bean.StudentBean;
import com.db.database.springDataJpa.dao.StudentEntity_I;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository("emp_dao")
@Transactional
public class StudentRepo_JPA implements StudentEntity_I{
	
	@PersistenceContext
	EntityManager em;
	
	public void insert(StudentBean s) {
		System.out.println(s);
		em.merge(s);
		//em.persist(s);
		
	}
	
	
	public StudentBean findById(int stdId) {
		return em.find(StudentBean.class, stdId);
		
	}
	
	public void deleteById(int stdId) {
		StudentBean s=findById(stdId);
		
		em.remove(s);
	}
	
	public void deleteByid(int stdId) {
		StudentBean s=new StudentBean();
		em.remove(s);
	}


	@Override
	public boolean create(StudentBean sb) {
		// TODO Auto-generated method stub
		//System.out.println(sb);
//		StudentBean bean=new StudentBean();
//		bean.setStdId(sb.getStdId());
//		bean.setStdName(sb.getStdName());
		//System.out.println(bean);
		//System.out.println(sb);
		em.merge(sb);
		
		
		
		return true;
	}

}
