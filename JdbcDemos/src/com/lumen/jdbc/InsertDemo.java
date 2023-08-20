package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password= "admin@123";
		
		String q1 = "insert into employee values('Mumtaz',10009,'Bangalore',55567)";		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter employee details name empId city salary");
		
		boolean result;
		try (Connection connection =  DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			Scanner scanner = new Scanner(System.in)){
			for(int i=0; i<4; i++) {
				System.out.println("Enter employee name");
				String name = scanner.next();
				System.out.println("Enter employeeId");
				int employeeId = scanner.nextInt();
				System.out.println("Enter employee city");
				String city = scanner.next();
				System.out.println("Enter employee salary");
				double salary = scanner.nextDouble();
//				="insert into employee values('Hani',1029,'Dharwad',23456)
				String sql = "insert into employee values('"+name+"',"+employeeId+",'"+city+"',"+salary+")";
				int result1 = statement.executeUpdate(sql);
				System.out.println("Inserted"+result1);
			}
			result = statement.execute(q1);
			System.out.println("Table Created"+result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
