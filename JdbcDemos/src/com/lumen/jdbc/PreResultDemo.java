package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreResultDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password= "admin@123";
		
//		String q5 = "select * from newmovie";		
//
//		try (Connection connection =  DriverManager.getConnection(url, username, password);
//				PreparedStatement preparedStatement = connection.prepareStatement(q5);
//			    ResultSet resultSet = preparedStatement.executeQuery();){
//			while(resultSet.next()) {
//				String moviename = resultSet.getString("moviename");
//				int movieId = resultSet.getInt("movieId");
//				String genre = resultSet.getString("genre");
//				String language = resultSet.getString("language");
//				System.out.println(moviename+ "\t" +movieId+"\t"+genre+"\t"+language);
//			}
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		String q5 = "select * from newmovie where language=?";		

		try (Connection connection =  DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(q5);){
			    
			preparedStatement.setString(1, "English");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				String moviename = resultSet.getString("moviename");
				int movieId = resultSet.getInt("movieId");
				String genre = resultSet.getString("genre");
				String language = resultSet.getString("language");
				System.out.println(moviename+ "\t" +movieId+"\t"+genre+"\t"+language);
			}
		
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	
	}

}
