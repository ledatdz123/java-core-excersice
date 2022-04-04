package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.BuildingSearchResponse;

public interface BuildingService {
	List<BuildingSearchResponse> findAll(String name, String street, Integer numberOfBasement, Integer floorArea);
}
