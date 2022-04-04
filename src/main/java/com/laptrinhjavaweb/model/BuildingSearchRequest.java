package com.laptrinhjavaweb.model;

public class BuildingSearchRequest {

	private String name;
	private int floorarea;
	private String street;
	private int numberOfBasement;
	public String getName() {
		return name;
	}
	public int getFloorarea() {
		return floorarea;
	}
	public void setFloorarea(int floorarea) {
		this.floorarea = floorarea;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumberOfBasement() {
		return numberOfBasement;
	}
	public void setNumberOfBasement(int numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BuildingSearchRequest(String name, int floorarea, String street, int numberOfBasement) {
		super();
		this.name = name;
		this.floorarea = floorarea;
		this.street = street;
		this.numberOfBasement = numberOfBasement;
	}
	
}
