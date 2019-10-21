package com.training.myapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.training.myapp.util.DBUtil;

public class CarDao {
	  
	  
private static final String Car = null;
public boolean addBike(Car b) {
String query="Insert into cars(car_id,car_name,car_colour,car_price) values(?,?,?,?) ";
	try(Connection connection=DBUtil.getConnection();
	PreparedStatement statement=connection.prepareStatement(query)){
	statement.setInt(1, b.getCarid());
	statement.setString(2, b.getCarname()); 
	statement.setString(3, b.getCarcolour());
	statement.setDouble(4, b.getCarprice());
	statement.executeUpdate();
	return true;
		}
	catch(Exception e) 
	{
	e.printStackTrace();
	}		
				return false; 
}
public boolean deleteCar(int id)
{
	
	Car cars= findCarById(id);
	if(Car == null)
		return false;
	else {
		String query = "DELETE FROM cars WHERE car_id =? " + id;
		
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			int count = statement.executeUpdate();
			if(count == 1)
				return true;				
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}		
	
}
private Car findCarById(int id) {
	// TODO Auto-generated method stub
	return null;
}

}