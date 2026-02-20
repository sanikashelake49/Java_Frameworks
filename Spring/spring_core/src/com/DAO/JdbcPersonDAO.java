package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("pdao")
public class JdbcPersonDAO implements PersonDAO {
	@Autowired
	private DataSource ds;//interface:at runtime drivermanager take it 

	@Override
	public boolean create(Person p) {
		// TODO Auto-generated method stub
		try {
		Connection conn=ds.getConnection();
		PreparedStatement prp=conn.prepareStatement("insert into data values(?,?)");
	
		prp.setInt(1, p.getPer_id());
		prp.setString(2,p.getPer_name());
		
		int row=prp.executeUpdate();
		if(row>0) {
			System.out.println("done");
		}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		return true;
	}

	@Override
	public Person retrieve(int id) {
		// TODO Auto-generated method stub
		Person p=new Person();
		try {
		Connection conn=ds.getConnection();
		PreparedStatement prp=conn.prepareStatement("select * from data where per_id=?");
		
		prp.setInt(1, id);

		ResultSet rs=prp.executeQuery();
		//Person p=new Person();
		if(rs.next()) {
			//Person p=new Person();
			
			p.setPer_id(rs.getInt(1));
			p.setPer_name(rs.getString(2));
			
			//return p;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		//return p;
		return p;
		
	}

}
