package com.cos.baseball.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.baseball.model.Baseball;
import com.cos.baseball.repository.BaseballRepository;
import com.cos.baseball.util.Script;
import com.google.gson.Gson;

public class SelectPlayerAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String playerIdStr = request.getParameter("playerId");
		
		if (playerIdStr == null || playerIdStr.equals("")) {
			System.out.println("선택된 선수의 id값을 받아오지 못했습니다");
			return;
		}
		
		int playerId = Integer.parseInt(playerIdStr);
		
		BaseballRepository baseballRepository = BaseballRepository.getInstance();
		Baseball player = baseballRepository.selectPlayer(playerId);
		
		Gson gson = new Gson();
		String playerJson = gson.toJson(player);
		
		Script.outJson(playerJson, response);

	}

}
