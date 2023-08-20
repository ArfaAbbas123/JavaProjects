package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password= "admin@123";
		
		
		String sql = "Select * from employee";		
		
		try (Connection connection =  DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();
			    ResultSet rs = statement.executeQuery(sql)){
			while(rs.next()) {
				String name = rs.getString("name");
				int employeeId = rs.getInt("employeeId");
				String city = rs.getString("city");
				float salary = rs.getFloat("salary");
				System.out.println(name+ "\t" +employeeId+"\t"+city+"\t"+salary);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
