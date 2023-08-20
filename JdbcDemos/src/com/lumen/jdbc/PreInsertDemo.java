package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreInsertDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password= "admin@123";
		
		String q3 = "insert into newmovie values(?,?,?,?)";		

		try (Connection connection =  DriverManager.getConnection(url, username, password);){
			PreparedStatement preparedStatement1  = connection.prepareStatement(q3);
			//set values for the place holders
			preparedStatement1.setString(1, "24");
			preparedStatement1.setInt(2, 15);
			preparedStatement1.setString(3, "Thriller");
			preparedStatement1.setString(4, "English");
			
		//execute
			preparedStatement1.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
