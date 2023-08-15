package com.lenskartapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lenskartapp.exceptions.LensNotFoundException;
import com.lenskartapp.model.Lens;
import com.lenskartapp.util.Queries;

public class LensDaoImpl implements ILensDao{

	@Override
	public void addLens(Lens lens) {
		try (Connection connection= DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.INSERTQUERY);){
					statement.setInt(1, lens.getLensId());
					statement.setString(2, lens.getLensBrand());
					statement.setString(3, lens.getCategory());
					statement.setDouble(4, lens.getPrice());
					statement.execute();
			}
			catch(SQLException e) {
				e.getMessage();
			}
		
	}

	@Override
	public void updateLens(int lensId, double price) {
		try (Connection connection= DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);){
			statement.setInt(1, lensId);
			statement.setDouble(2,price);
			statement.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteLens(int lensId) {
		try (Connection connection= DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.DELETEQUERY);){
			statement.setInt(1, lensId);
			statement.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public List<Lens> findAll() {
		List<Lens> listOfLens=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERY);
				ResultSet rs=statement.executeQuery()){
			while(rs.next()){
				String lensBrand =rs.getString("lensBrand");
				String category=rs.getString("category");
				int lensId=rs.getInt("lensId");
				double price=rs.getDouble("price");
				Lens lens = new Lens(lensBrand,category,lensId,price);
				listOfLens.add(lens);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfLens;
	}

	@Override
	public List<Lens> findByLensBrand(String lensBrand) throws LensNotFoundException {
		List<Lens> listOfLens=new ArrayList<>();
		try{
			Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYLENSBRAND);
				
			statement.setString(1, "%"+lensBrand+"%");
			statement.execute();
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				String lensBrand1=rs.getString("lensBrand");
				String category=rs.getString("category");
				int lensId=rs.getInt("lensId");
				double price=rs.getDouble("price");
				Lens lens=new Lens(lensBrand1,category,lensId,price);
				listOfLens.add(lens);	
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfLens;		
	}

	@Override
	public List<Lens> findByCategory(String category) throws LensNotFoundException {
		List<Lens> listOfLens=new ArrayList<>();
		try{
			Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYCATEGORY);
				
			statement.setString(1, "%"+category+"%");
			statement.execute();
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				String lensBrand=rs.getString("lensBrand");
				String category1=rs.getString("category");
				int lensId=rs.getInt("lensId");
				double price=rs.getDouble("price");
				Lens lens=new Lens(lensBrand,category1,lensId,price);
				listOfLens.add(lens);	
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfLens;		
	}

	@Override
	public List<Lens> findByLensBrandAndCategory(String lensBrand, String category) throws LensNotFoundException {
		List<Lens> listOfLens=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYLENSBRANDANDCATEGORY);
				ResultSet rs=statement.executeQuery()){
			statement.setString(1, lensBrand);
			statement.setString(2, category);
			statement.execute();
			while(rs.next()) {
				String lensBrand1=rs.getString("lensBrand");
				String category1=rs.getString("category");
				int lensId=rs.getInt("lensId");
				double price=rs.getDouble("price");
				Lens lens=new Lens(lensBrand1,category1,lensId,price);
				listOfLens.add(lens);	
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfLens;
	}
	

	@Override
	public List<Lens> findByLensBrandAndPrice(String lensBrand, String price) throws LensNotFoundException {
		List<Lens> listOfLens=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYLENSBRANDANDPRICE);
				ResultSet rs=statement.executeQuery()){
			statement.setString(1, lensBrand);
			statement.setString(2, price);
			statement.execute();
			while(rs.next()) {
				String lensBrand1=rs.getString("lensBrand");
				String category=rs.getString("category");
				int lensId=rs.getInt("lensId");
				double price1=rs.getDouble("price");
				Lens lens=new Lens(lensBrand1,category,lensId,price1);
				listOfLens.add(lens);	
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfLens;		
	}

	@Override
	public Lens findById(int lensId) throws LensNotFoundException {
		Lens listOfLens=new Lens();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYID);){
			statement.setInt(1, lensId);
			statement.execute();
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				String lensBrand=rs.getString("lensBrand");
				String category=rs.getString("category");
				int lensId1=rs.getInt("lensId");
				double price=rs.getDouble("price");
				Lens lens=new Lens(lensBrand,category,lensId1,price);
					
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfLens;
	}
}	
