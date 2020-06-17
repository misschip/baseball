package com.cos.baseball.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.baseball.model.Baseball;
import com.cos.baseball.repository.BaseballRepository;
import com.google.gson.Gson;

public class SelectTeamAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String team = request.getParameter("team");
		
		if (team == null || team.equals("")) return;
		
		BaseballRepository baseballRepository = BaseballRepository.getInstance();
		List<Baseball> teamData = baseballRepository.selectTeam(team);
		
		Gson gson = new Gson();
		String teamDataJson = gson.toJson(teamData);
		
		response.setCharacterEncoding("utf-8");
		PrintWriter out= response.getWriter();
		out.print(teamDataJson);
	}

}
