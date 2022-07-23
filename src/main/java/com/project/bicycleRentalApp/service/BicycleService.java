package com.project.bicycleRentalApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bicycleRentalApp.model.inputModel.BookCycleInputModel;
import com.project.bicycleRentalApp.model.outputModel.Bicycle;
import com.project.bicycleRentalApp.model.outputModel.BookedCycleOutputModel;
import com.project.bicycleRentalApp.repository.BicycleRepository;

@Service
public class BicycleService {
	
	@Autowired
	BicycleRepository bicycleRepository;
	
	
	public List<Bicycle> getAllBicycleInfo()
	{
		return bicycleRepository.getAllBicycle();	
	}

	public BookedCycleOutputModel bookCycle(BookCycleInputModel bookingInfo) {
	
		//insert into booking details 
		
		bicycleRepository.insertBookingDetails(bookingInfo);
		
		//updste cycle tablr abvabilty 0
		
		bicycleRepository.updateBookingDetails(0, bookingInfo.getBicycleId());
		
		BookedCycleOutputModel bookedCycleOutputmodel = new BookedCycleOutputModel();
		bookedCycleOutputmodel.setBicycleId(bookingInfo.getBicycleId());
		bookedCycleOutputmodel.setUserId(bookingInfo.getUserId());
		bookedCycleOutputmodel.setTotalTime(bookingInfo.getTotalTime());
		bookedCycleOutputmodel.setTotalPrice(bookingInfo.getTotalTime()*bookingInfo.getPricePerHour());
		bookedCycleOutputmodel.setMessage("Booked");
		
		
		return bookedCycleOutputmodel;
	}
	
	
	

}
