package com.db.database.DataJPA_CLR.repo.spring.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.database.DataJPA_CLR.bean.StudentBean;


public interface Student_SpringDataJPA extends JpaRepository<StudentBean, Integer> {
	
	
	

}
