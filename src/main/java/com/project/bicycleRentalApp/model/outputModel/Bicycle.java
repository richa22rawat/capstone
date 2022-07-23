package com.project.bicycleRentalApp.model.outputModel;



import lombok.Data;

@Data
public class Bicycle {
	String name;
	double price;
	String yearOfManufacture;
	String colour;
	String desc;
	int available;



	public Bicycle(String name, long price, String yearOfManufacture, String colour, String desc) {
		super();
		this.name = name;
		this.price = price;
		this.yearOfManufacture = yearOfManufacture;
		this.colour = colour;
		this.desc = desc;
	}


	public Bicycle() {
		// TODO Auto-generated constructor stub
	}


	
	
	
	public int getAvailable() {
		return available;
	}


	public void setAvailable(int available) {
		this.available = available;
	}


	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getYearOfManufacture() {
		return yearOfManufacture;
	}





	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}





	public String getColour() {
		return colour;
	}





	public void setColour(String colour) {
		this.colour = colour;
	}





	public String getDesc() {
		return desc;
	}





	public void setDesc(String desc) {
		this.desc = desc;
	}





	@Override
	public String toString() {
		return "Bicycle [name=" + name + ", price=" + price + ", yearOfManufacture=" + yearOfManufacture + ", colour="
				+ colour + ", desc=" + desc + "]";
	}

}
