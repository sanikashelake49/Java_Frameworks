package com.DAO.jt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("pdao1")
public class JdbcPersonDAO implements PersonDAO {
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int create(Person p) {
		// TODO Auto-generated method stub
		int r=jt.update("insert into data values(?,?)",p.getPer_id(),p.getPer_name());
		return r;
	}

	@Override
	public Person retrieve(int id) {
		// TODO Auto-generated method stub
		
		Person p=jt.queryForObject("select * from data where per_id=?", BeanPropertyRowMapper.newInstance(Person.class),id);
		
		return p;
	}

}
