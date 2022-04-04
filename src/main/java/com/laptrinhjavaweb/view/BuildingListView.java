package com.laptrinhjavaweb.view;

import java.util.List;
import java.util.Scanner;

import com.laptrinhjavaweb.controller.BuildingController;
import com.laptrinhjavaweb.model.BuildingSearchRequest;
import com.laptrinhjavaweb.model.BuildingSearchResponse;

public class BuildingListView {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Building Name: ");
		String name = in.nextLine();
		System.out.println("Enter Building Street: ");
		String street = in.nextLine();
		System.out.println("Enter Building NumberOfBasement: ");
		String numberOfBasementString = in.nextLine();
		Integer numberOfBasement = numberOfBasementString != null ? Integer.valueOf(numberOfBasementString) : null;
		System.out.println("Enter Building floorArea: ");
		String floorAreaString = in.nextLine();
		Integer floorArea = floorAreaString != null ? Integer.valueOf(floorAreaString) : null;
		BuildingSearchRequest request=new BuildingSearchRequest(name, floorArea, street, numberOfBasement);
		BuildingController buildingController = new BuildingController();
		List<BuildingSearchResponse> buildingSearchResponse = buildingController.showBuilding(request);
		for (BuildingSearchResponse item : buildingSearchResponse) {
			System.out.println("Name: " + item.getName());
			System.out.println("So tang ham: " + item.getNumberOfBasement());
			System.out.println("Dien tich san: " + item.getFloorarena());
			System.out.println("Loai toa nha: " + item.getTypes());
		}
		in.close();
	}
}
