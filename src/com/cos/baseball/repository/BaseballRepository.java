package com.cos.baseball.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cos.baseball.db.DBConn;

public class BaseballRepository {
	private static BaseballRepository instance = new BaseballRepository();
	private BaseballRepository() {};
	
	public static BaseballRepository getInstance() {
		return instance;
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public List<String> findAll() {
		final String SQL = "SELECT DISTINCT team FROM baseball";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			List<String> teamList = new ArrayList<>();
			
			while (rs.next()) {
				String teamName = rs.getString("team");
				teamList.add(teamName);
			}
			
			// System.out.println("BaseballRepository : findAll : teamList: " + teamList);
			return teamList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
		return null;
	}
	
}
