package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.laptrinhjavaweb.dao.BuildingDao;
import com.laptrinhjavaweb.dao.emyeuanh.BuildingEmyeuanh;
import com.laptrinhjavaweb.dao.impl.BuildingDaoImpl;
import com.laptrinhjavaweb.model.BuildingSearchResponse;
import com.laptrinhjavaweb.service.BuildingService;

public class BuildingServiceImpl implements BuildingService {

	private BuildingDao buildingDao;
	public BuildingServiceImpl() {
		// TODO Auto-generated constructor stub
		buildingDao=new BuildingDaoImpl();
	}
	@Override
	public List<BuildingSearchResponse> findAll(String name, String street, Integer numberOfBasement, Integer floorArea) {
		List<BuildingSearchResponse> buildings = new ArrayList<>();
		for(BuildingEmyeuanh bd : buildingDao.findAll(name, street, numberOfBasement, floorArea)) {
			buildings.add(new BuildingSearchResponse(bd.getId(), bd.getName(), bd.getFloorarea(), bd.getStreet(), bd.getNumberofbasement(), conVert(bd.getTypes())));
		}
		return buildings;
		
	}
	private String conVert(String types) {
		StringBuilder result = new StringBuilder();
		String [] arr = types.split(",");
		for(String type : arr) {
			result.append(getBuildingType(type) + ", ");
		}
		if(arr.length > 0) {
			result.deleteCharAt(result.length() - 2);
		}
		return result.toString();
	}
	public static String getBuildingType(String type) {
        Map<String, String> map = new HashMap<>();
        map.put("nguyen-can", "Nguyên căn");
        map.put("noi-that", "Nội thất");
        map.put("tang-tret", "Tầng trệt");
        return map.get(type);
    }
}
