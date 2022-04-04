package com.laptrinhjavaweb.controller;

import java.util.List;

import com.laptrinhjavaweb.model.BuildingSearchRequest;
import com.laptrinhjavaweb.model.BuildingSearchResponse;
import com.laptrinhjavaweb.service.BuildingService;
import com.laptrinhjavaweb.service.impl.BuildingServiceImpl;

public class BuildingController {

	private BuildingService buildingService;
	public BuildingController() {
		buildingService=new BuildingServiceImpl();
	}
	public List<BuildingSearchResponse> showBuilding(BuildingSearchRequest buildingSearch){
		return buildingService.findAll(buildingSearch.getName(), buildingSearch.getStreet(), buildingSearch.getFloorarea(), buildingSearch.getNumberOfBasement());
	}
}
