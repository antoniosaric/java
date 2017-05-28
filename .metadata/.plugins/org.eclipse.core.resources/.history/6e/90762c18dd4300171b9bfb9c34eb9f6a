package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connectToDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
			try{
				Class.forName("org.sqlite.JDBC");
				c=DriverManager.getConnection("test.db");
				
				String SQLAdd= "insert into"
						+" admins(user_name, password) "
						+ "values('ahmed','12345'";
				Statement stmt=c.createStatement();
				stmt.executeUpdate(SQLAdd);
				
			}catch (Exception ex){
				System.out.println("cannot connect");
			}
			

						
	}

}

