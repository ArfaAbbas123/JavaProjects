package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password= "admin@123";
		
		String query = "create table employee(name varchar(20), employeeId int primary key, city varchar(20),salary float)";		
		
		
		boolean result;
		try (Connection connection =  DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();){
			result = statement.execute(query);
			System.out.println("Table Created"+result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
