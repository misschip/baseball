

	function selectTeam(team) {
		console.log("선택된 팀 : ", team);
		
		$("#playerInfo").empty();
		
		$.ajax({
			type: "post",
			url: "/baseball/kbo?cmd=selectTeam",
			data: "team=" + team,
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			dataType: "json"
		}).done(function(result){
			console.log(result);
			
			renewPlayerList(result);
			
		}).fail(function(error){
			console.log(error);
		});
		
		
		
	}
	
	function renewPlayerList(teamPlayerList) {
		$("#playerList").empty();
		var i=1;
		for (player of teamPlayerList) {
			var trItem = "<tr><td>" + i++ + "</td>";
			// trItem += "<td>" + player.name + "</td></tr>";
			trItem += `<td><a href="" onclick="selectPlayer('${player.id}'); return false;">${player.name}</td></tr>`;
			
			$("#playerList").append(trItem);
			console.log(trItem);
		}
	}
	
	
	function selectPlayer(playerId) {
		console.log("선택된 선수: " + playerId);
		
		$.ajax({
			type: "post",
			url: "/baseball/kbo?cmd=selectPlayer",
			data: "playerId=" + playerId,
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			dataType: "json"
		}).done(function(result){
			renewPlayer(result);
			
		}).fail(function(error){
			console.log(error);
		});
	}
	
	
	function renewPlayer(player) {
		$("#playerInfo").empty();
		
		var trItem = "<tr>";
		trItem += `<td>${player.id}</td><td>${player.name}</td><td>${player.num}</td><td>${player.position}</td><td>${player.team}</td>`;
		trItem += "</tr>";
		
		$("#playerInfo").append(trItem);
	}
