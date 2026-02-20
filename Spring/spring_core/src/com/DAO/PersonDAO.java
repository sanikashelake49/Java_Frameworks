package com.DAO;

public interface PersonDAO {
	boolean create(Person p);
	Person retrieve(int id);

}
