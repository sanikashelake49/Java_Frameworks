package com.db_send.JPArepo.spring.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db_send.JPArepo.entitybean.Std_EntityBean;

public interface Jdbc_SpringDataJpa_I extends JpaRepository<Std_EntityBean, Integer> {

	       Std_EntityBean findByIdAndName(int id,String name);
}
