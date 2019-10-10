 package com.dev.ustglobal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carData")
public class Car {
	
	@Column
	@Id
	private String brand;
	@Column
	private int modelNo ;
	@Column
	private String color;

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", modelNo=" + modelNo + ", color=" + color + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
	    

	}

}
