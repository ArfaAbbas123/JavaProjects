package com.lumen.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreCreateDemo {
	public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306/mysql";
			String username="root";
			String password= "admin@123";
			
			String q2 = "create table newmovie(moviename varchar(20),movieId int primary key, genre varchar(20),language varchar(20))";		

			try (Connection connection =  DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(q2);){
				boolean result = preparedStatement.execute();
				System.out.println(result);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
