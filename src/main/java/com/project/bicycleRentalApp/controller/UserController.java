package com.project.bicycleRentalApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bicycleRentalApp.model.outputModel.User;
import com.project.bicycleRentalApp.service.UserService;



@RestController
@RequestMapping(value="/user")
public class UserController
{
	@Autowired
	UserService uService;
	
	@GetMapping("/getalluser")
	public List<User> getAllUser()
	{
		//UserService obj= new UserService();
		
		return  uService.listAllUser();
	
	}
}
