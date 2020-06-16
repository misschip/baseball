package com.cos.baseball.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.baseball.repository.BaseballRepository;

public class SelectTeamAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String team = request.getParameter("team");
		
		BaseballRepository baseballRepository = BaseballRepository.getInstance();
		List<Player> players = baseballRepository.selectTeam(team);

	}

}
