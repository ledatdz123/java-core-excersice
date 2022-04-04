package com.laptrinhjavaweb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.dao.BuildingDao;
import com.laptrinhjavaweb.dao.emyeuanh.BuildingEmyeuanh;
import com.laptrinhjavaweb.utils.StringUtils;

public class BuildingDaoImpl implements BuildingDao {

	private String DB_URL = "jdbc:mysql://localhost:3306/javasql22022";
	private String USER = "root";
	private String PASS = "1234";

	@Override
	public List<BuildingEmyeuanh> findAll(String name, String street, Integer numberOfSement, Integer floorArea) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		StringBuilder sql = new StringBuilder("SELECT * FROM building " + SystemConstant.ONE_TO_ONE + "");

		if (!StringUtils.isNullOrEmpty(name)) {
			sql.append(" and name like '%" + name + "%'");
		}
		if (!StringUtils.isNullOrEmpty(street)) {
			sql.append(" and street like '%" + street + "%'");
		}
		if (numberOfSement != null) {
			sql.append(" and numberOfBasement = " + numberOfSement + "");
		}
		if (floorArea != null) {
			sql.append(" and floorArea = " + floorArea + "");
		}

		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql.toString());
			List<BuildingEmyeuanh> buildingEmyeuanhs = new ArrayList<>();

			while (rs.next()) {
				BuildingEmyeuanh buildingEmyeuanh = new BuildingEmyeuanh();
				buildingEmyeuanh.setId(rs.getInt("id"));
				buildingEmyeuanh.setName(rs.getString("name"));
				buildingEmyeuanh.setStreet(rs.getString("street"));
				buildingEmyeuanh.setFloorarea(rs.getInt("floorArea"));
				buildingEmyeuanh.setNumberofbasement(rs.getInt("numberOfBasement"));
				buildingEmyeuanh.setTypes(rs.getString("types"));
				buildingEmyeuanhs.add(buildingEmyeuanh);
			}
			return buildingEmyeuanhs;
		} catch (SQLException | ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
