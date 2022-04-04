package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.dao.emyeuanh.BuildingEmyeuanh;

public interface BuildingDao {
	 List<BuildingEmyeuanh> findAll(String name, String street, Integer numberOfSement, Integer floorArea);
}
		
		
	
