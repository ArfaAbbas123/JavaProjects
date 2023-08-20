package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreInsertScanDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password= "admin@123";
		
		String q4 = "insert into newmovie values(?,?,?,?)";		

		try (Connection connection =  DriverManager.getConnection(url, username, password);){
			PreparedStatement preparedStatement1  = connection.prepareStatement(q4);
			Scanner scanner = new Scanner(System.in);
				for(int i=0; i<1; i++) {
					System.out.println("Enter movie name");
					String moviename = scanner.next();
					System.out.println("Enter movieId");
					int movieId = scanner.nextInt();
					System.out.println("Enter genre");
					String genre = scanner.next();
					System.out.println("Enter language");
					String language = scanner.next();
//					="insert into employee values('Hani',1029,'Dharwad',23456)
					String sql = "insert into new movie values('"+moviename+"',"+movieId+",'"+genre+"',"+language+")";
					preparedStatement1.setString(1,moviename);
					preparedStatement1.setInt(2, movieId);
					preparedStatement1.setString(3, genre);
					preparedStatement1.setString(4, language);
					preparedStatement1.execute();
				}
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
