package com.db.database.repo.jpa;

import org.springframework.stereotype.Repository;

import com.db.database.repo.bean.StudentBean;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepo_JPA {
	@PersistenceContext
	EntityManager em;
	
	//to add
	public void insert(StudentBean s) {
		//to insert the object
		em.merge(s);
	}
	//to delete
	public void deleteById(int id) {
		//get the record first
		StudentBean s=findById(id);
		//now delete the object
		em.remove(s);
	}
	//to retrieve
	
	public StudentBean findById(int id) {
		return em.find(StudentBean.class, id);
	}
	

}
