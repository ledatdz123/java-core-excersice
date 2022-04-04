package com.laptrinhjavaweb.model;

public class BuildingSearchResponse {
	 private int id;
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	 private int floorarena;
	 private String street;
	 private int numberOfBasement;
	 private String types;
	
	public BuildingSearchResponse(int id, String name, int floorarena, String street, int numberOfBasement,
			String types) {
		super();
		this.id = id;
		this.name = name;
		this.floorarena = floorarena;
		this.street = street;
		this.numberOfBasement = numberOfBasement;
		this.types = types;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFloorarena() {
		return floorarena;
	}
	public void setFloorarena(int floorarena) {
		this.floorarena = floorarena;
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
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
}
