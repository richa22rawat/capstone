package com.project.bicycleRentalApp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.bicycleRentalApp.model.inputModel.BookCycleInputModel;
import com.project.bicycleRentalApp.model.outputModel.Bicycle;
import com.project.bicycleRentalApp.model.outputModel.BookedCycleOutputModel;

@Repository
public class BicycleRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Bicycle> getAllBicycle()
	{
		List<Bicycle> bicycleList = new ArrayList<>();
			
		String selectQuery="select name,color,price,description,available from bicycle";
		
		List<Map<String,Object>> result = jdbcTemplate.queryForList(selectQuery);
		
		for(Map<String,Object> row : result)
		{
			Bicycle obj = new Bicycle();
			obj.setName((String)row.get("name"));
			obj.setColour((String)row.get("color"));
			obj.setPrice((Double)row.get("price"));
			obj.setDesc((String)row.get("description"));
			obj.setAvailable((int)row.get("available"));
			
			bicycleList.add(obj);
			
		}
		
		/*
		 * Bicycle obj = new Bicycle("hero",20,"2020","blue","good bicycle"); Bicycle
		 * obj2 = new Bicycle("hero2",230,"2020","blu234e","good bicyclesf"); Bicycle
		 * obj3 = new Bicycle("hero3",230,"2021","blusdfe","good bicyclsfe"); Bicycle
		 * obj4 = new Bicycle("hero4",230,"2022","bludfse","good bifsdfcycle"); Bicycle
		 * obj5 = new Bicycle("hero5",2340,"2020","blusdfe","gofsdfod bicycle"); Bicycle
		 * obj6 = new Bicycle("hero6",204,"2040","blusdfe","sdfgood bicycle");
		 * 
		 * 
		 * bicycleList.add(obj); bicycleList.add(obj2); bicycleList.add(obj3);
		 * bicycleList.add(obj4); bicycleList.add(obj5); bicycleList.add(obj6);
		 */
		
		
		return bicycleList;
		
		
	}
	public void insertBookingDetails(BookCycleInputModel bookingInfo)
	{
		String insertQuery = "insert into bookingdetails (user_id, bicycle_id, Total_time) values (?, ?, ?)";
		
		try
		{
			jdbcTemplate.update( insertQuery,bookingInfo.getUserId(),bookingInfo.getBicycleId(), bookingInfo.getTotalTime());
			System.out.println("row inserted");
		}
		catch(Exception e)
		{
		   System.out.printf("exception while inserting booking detils : {} ", e.getMessage());	
		}
		
	}
	public void updateBookingDetails(int available, int id)
	{
		String updateQuery = "update bicycle set available = ? where id = ?";
		
		try
		{
			int result=jdbcTemplate.update(updateQuery, available, id);	
		}
		catch(Exception e)
		{
			System.out.printf("exception while updating  booking detils : {} ", e.getMessage());	
		}
		
		
		
	}

}
