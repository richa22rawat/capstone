package com.project.bicycleRentalApp.model.outputModel;



public class BookedCycleOutputModel {
	
	
	int id;
	int userId;
	int bicycleId;
	int totalTime;
	double totalPrice;
	String message;
	
	
	
	public BookedCycleOutputModel(int id, int userId, int bicycleId, int totalTime, double totalPrice, String message) {
		super();
		this.id = id;
		this.userId = userId;
		this.bicycleId = bicycleId;
		this.totalTime = totalTime;
		this.totalPrice = totalPrice;
		this.message = message;
	}
	
	
	
	public BookedCycleOutputModel() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "BookedCycle [id=" + id + ", userId=" + userId + ", bicycleId=" + bicycleId + ", totalTime=" + totalTime
				+ ", totalPrice=" + totalPrice + ", message=" + message + "]";
	}

}
