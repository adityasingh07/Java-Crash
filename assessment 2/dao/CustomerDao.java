package com.mydemos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.mydemos.dbutil.DbConn;
import com.mydemos.pojo.Customer;

public class CustomerDao {
	
	public static String fetchSeqCounter(){
		try
		{
		Connection con= DbConn.getConnection();

		String sql="select counter.nextval from dual";
		PreparedStatement stat=con.prepareStatement(sql);

		ResultSet rs=stat.executeQuery();
		String ctr = "";
		if(rs.next()) {
			ctr = rs.getString(1);
			System.out.println("Counter is " + ctr);
			if((3-ctr.length())==2)
				ctr = "00" + ctr;

			else if(3-ctr.length() == 1)
				ctr = "0" + ctr;
			
		}
		System.out.println(ctr);
		return ctr;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public void setId(Customer customer){
		try{
			Connection con= DbConn.getConnection();
			String sql2="insert into customer values(?, ?, ?, ?)";
			PreparedStatement stat2=con.prepareStatement(sql2);

			String id = (customer.getCustName()).substring(0,2) +
			   (customer.getCustLastName()).substring(0,2) +
			   fetchSeqCounter();

			stat2.setString(1, customer.getCustName());
			stat2.setString(2, customer.getCustLastName());
			stat2.setString(3, id);
			stat2.setString(4, customer.getAddress());


			stat2.executeUpdate();
			
			}
		 catch (Exception e) {
			e.printStackTrace();
		}
	}
}
