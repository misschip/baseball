package com.cos.baseball.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cos.baseball.db.DBConn;
import com.cos.baseball.model.Baseball;

public class BaseballRepository {
	private static BaseballRepository instance = new BaseballRepository();
	private BaseballRepository() {};
	
	public static BaseballRepository getInstance() {
		return instance;
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public Baseball selectPlayer(int playerId) {
		final String SQL = "SELECT id,name,num,position,team FROM baseball WHERE id = ?";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, playerId);
			
			rs = pstmt.executeQuery();
			Baseball player = null;
			
			if (rs.next()) {
				player = Baseball.builder()
						.id(rs.getInt("id"))
						.name(rs.getString("name"))
						.num(rs.getInt("num"))
						.position(rs.getString("position"))
						.team(rs.getString("team"))
						.build();
				
				return player;
			}
			

			return player;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConn.close(conn, pstmt, rs);
		}
		
		return null;
	}
	
	
	public List<Baseball> selectTeam(String team) {
		final String SQL = "SELECT id,name,num,position,team FROM baseball WHERE team = ?";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, team);
			
			rs = pstmt.executeQuery();
			List<Baseball> teamList = new ArrayList<>();
			
			while (rs.next()) {
				Baseball baseball = Baseball.builder()
						.id(rs.getInt("id"))
						.name(rs.getString("name"))
						.num(rs.getInt("num"))
						.position(rs.getString("position"))
						.team(rs.getString("team"))
						.build();
				
				teamList.add(baseball);
			}
			
			// System.out.println("BaseballRepository : findAll : teamList: " + teamList);
			return teamList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConn.close(conn, pstmt, rs);
		}
		
		return null;
	}
	
	
	
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
			DBConn.close(conn, pstmt, rs);
		}
		
		return null;
	}
	
}
