package com.project.bicycleRentalApp.model.outputModel;

public class User {
	int id;
	String name;
	int age;
	String email;
	int phoneno;
	String address;
	
	
	public User(String name, int age, String email, int phoneno, String address) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneno = phoneno;
		this.address = address;
	}
	
	
	public User() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", phoneno=" + phoneno + ", address="
				+ address + "]";
	}

}
