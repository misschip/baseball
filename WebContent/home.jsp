<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>야구팀별 선수 정보</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>


</head>
<body>
	
	<div class="container">
	<h1>야구팀별 선수 정보</h1>
		<div class="row">
			<div class="col-sm-2">
				<table class="table table-striped">
					<caption style="caption-side: top">KBO 팀 목록</caption>
					<thead>
						<tr>
							<td>번호</td>
							<td>팀</td>
						</tr>
					</thead>
				
					<tbody>
						<c:forEach var="team" items="${teamList}" varStatus="status">
							<tr>
								<td>${status.count}</td>
								<%-- onclick 내에 return false를 추가해 주면 href 링크의 작동을 방지함 --%>
								<td><a href="" onclick="selectTeam('${team}'); return false;">${team}</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			
			<div class="col-sm-2">
				<table class="table table-striped">
				<caption style="caption-side: top">팀별 선수 목록</caption>
				<thead>
					<tr>
						<td>번호</td>
						<td>이름</td>
					</tr>
				</thead>
				
				<tbody id="playerList">
				</tbody>
				</table>
			</div>
			
			
			<div class="col-sm-8">
				<table class="table table-striped">
				<caption style="caption-side: top">선수 상세 정보</caption>
				<thead>
					<tr>
						<td>id</td>
						<td>이름</td>
						<td>번호</td>
						<td>포지션</td>
						<td>소속팀</td>
					</tr>
				</thead>
				
				<tbody id="playerInfo">
				</tbody>
				</table>
			</div>
		</div>
	</div>
<script src="js/baseball.js"></script>
</body>
</html>