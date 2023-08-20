package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreUpdateDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password= "admin@123";
		
		String q4 = "update newmovie set language=? where movieId=?";		

		try (Connection connection =  DriverManager.getConnection(url, username, password);){
			PreparedStatement preparedStatement  = connection.prepareStatement(q4);
					preparedStatement.setString(1,"French");
					preparedStatement.setInt(2, 15);
					preparedStatement.execute();
		}
			
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

