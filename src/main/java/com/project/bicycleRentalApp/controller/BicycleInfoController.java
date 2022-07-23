package com.project.bicycleRentalApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bicycleRentalApp.model.inputModel.BookCycleInputModel;
import com.project.bicycleRentalApp.model.outputModel.Bicycle;
import com.project.bicycleRentalApp.model.outputModel.BookedCycleOutputModel;
import com.project.bicycleRentalApp.service.BicycleService;

@RestController
@RequestMapping(value="/bicycle")
public class BicycleInfoController {
	
	@Autowired
	BicycleService bservice;
	
	
	@GetMapping("/getAllInfo")
	public List<Bicycle> getAllBicycleInfo()
	{	
		return  bservice.getAllBicycleInfo(); 		
	}
	
	@PostMapping("/bookbicycle")
	public BookedCycleOutputModel bookCycle(@RequestBody BookCycleInputModel bookinginfo)
	{		
		return  bservice.bookCycle(bookinginfo); 		
	}
	
	@PostMapping("/cancelBooking")
	public BookedCycleOutputModel cancelBooking( ) {
		return null;}
	



}
