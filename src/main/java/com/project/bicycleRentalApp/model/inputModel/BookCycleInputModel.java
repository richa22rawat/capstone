package com.project.bicycleRentalApp.model.inputModel;

import lombok.Data;

@Data
public class BookCycleInputModel {
	
	
	int userId;
	int bicycleId;
	int totalTime;
	double pricePerHour;
	
	
	
	
	public BookCycleInputModel(int userId, int bicycleId, int totalTime, double pricePerHour) {
		super();
		this.userId = userId;
		this.bicycleId = bicycleId;
		this.totalTime = totalTime;
		this.pricePerHour = pricePerHour;
	}


	public BookCycleInputModel() {
		
	}


	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBicycleId() {
		return bicycleId;
	}
	public void setBicycleId(int bicycleId) {
		this.bicycleId = bicycleId;
	}
	public int getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}
	
	public double getPricePerHour() {
		return pricePerHour;
	}


	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	
	

}
