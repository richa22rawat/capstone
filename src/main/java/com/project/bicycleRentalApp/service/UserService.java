package com.project.bicycleRentalApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bicycleRentalApp.model.outputModel.User;
import com.project.bicycleRentalApp.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public List<User> listAllUser()
	{
		return userRepository.getAllUser();
		
	}
	

}
