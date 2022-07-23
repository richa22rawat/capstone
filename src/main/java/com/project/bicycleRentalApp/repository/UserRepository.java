package com.project.bicycleRentalApp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.bicycleRentalApp.model.outputModel.User;

@Repository
public class UserRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<User> getAllUser()
	{
		List<User> list=new ArrayList<User>();
		String selectQuery="select id,name,age,email,address,phoneno from users";
		List<Map<String,Object>> result=jdbcTemplate.queryForList(selectQuery);
		
		for(Map<String,Object> row:result)
		{
		User obj=new User();
		obj.setId((int)row.get("id"));
		obj.setName((String)row.get("name"));
		obj.setAge((int)row.get("age"));
		obj.setEmail((String)row.get("email"));
		obj.setAddress((String)row.get("address"));
		obj.setPhoneno((int)row.get("phoneno"));
		
		list.add(obj);
		
		
		}
		return list;
	}
			
			/*User obj= new User("richa",54,"richa@gmail.com",2345678,"uttarakhand");
			User obj1= new User("richa",54,"richa@gmail.com",2345678,"uttarakhand");
			User obj2= new User("richa",54,"richa@gmail.com",2345678,"uttarakhand");
			User obj3= new User("richa",54,"richa@gmail.com",2345678,"uttarakhand");
			
			list.add(obj);
			list.add(obj1);
			list.add(obj2);
			list.add(obj3);
			return list;*/

}
