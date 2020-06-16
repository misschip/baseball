<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>야구팀별 선수 정보</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<h1>야구팀별 선수 정보</h1>
	
	<div class="container">
		<div class="row">
			<div class="col-sm-2">
				<table border="1">
					<thead>
						<tr>
							<td>번호</td>
							<td>팀</td>
						</tr>
					</thead>
				
					<tbody>
						<c:forEach var="team" items="${teamList}" varStatus="status">
							<tr>
								<td>${status.index+1}</td>
								<%-- onclick 내에 return false를 추가해 주면 href 링크의 작동을 방지함 --%>
								<td><a href="" onclick="selectTeam('${team}'); return false;">${team}</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			
			<div class="col-sm-2">
				<table>
				<thead>
					<tr>
						<td>id</td>
						<td>이름</td>
					</tr>
				</thead>
				
				<tbody>
				</tbody>
				</table>
			</div>
			
			<div class="col-sm-2">
				<table>
				<thead>
					<tr>
						<td>id</td>
						<td>이름</td>
						<td>번호</td>
						<td>포지션</td>
						<td>소속팀</td>
					</tr>
				</thead>
				
				<tbody>
				</tbody>
				</table>
			</div>
		</div>
	</div>
	
<script>
	function selectTeam(team) {
		console.log("선택된 팀 : ", team);
		
		$.ajax({
			type: "post",
			url: "/kbo?cmd=selectTeam",
			data: "team=" + team,
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			dataType: "json"
		}).done(function(result){
			
		}).fail(function(error){
			
		});
		
	}
</script>	
</body>
</html>