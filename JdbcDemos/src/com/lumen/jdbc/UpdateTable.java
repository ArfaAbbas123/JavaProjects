package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password= "admin@123";
		
		String query1 = "update employee set city='Hyd' where name='Arfa'";		
		
		
		boolean result;
		try (Connection connection =  DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();){
			result = statement.execute(query1);
			System.out.println("Table Created"+result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
