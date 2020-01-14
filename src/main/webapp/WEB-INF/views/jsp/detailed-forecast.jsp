<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detailed forecast | <c:out value="${city}"></c:out></title>
</head>
<body text="white" bgcolor="black">

	<form action="/" method="get">
		<button type="submit"
			style="background-color: blue; border: none; color: white; padding: 15px 32px; text-align: center; text-decoration: none; display: inline-block; font-size: 16px; float: right;">Home
		</button>
	</form>

	<h3>
		<c:out value="${city}"></c:out>
	</h3>
	<c:forEach var="item" items="${forecast.list}">
		<div
			style="float: left; display: inline; border-style: solid; border-color: silver; border-width: 1px;">
			<center>
				<h4>
					<c:out value="${item.dtText}"></c:out>
				</h4>
				<h1 style="color: blue;">
					<c:out value="${item.main.temp}"></c:out>
					°C
				</h1>
				<p>
					Feels like:
					<c:out value="${item.main.felsLike}"></c:out>
					°C
				</p>
				<p>Mix | Max</p>
				<h4>
					<c:out value="${item.main.tempMin}"></c:out>
					°C |
					<c:out value="${item.main.tempMax}"></c:out>
					°C
				</h4>
				<h4>Pressure:</h4>
				<h4>
					<c:out value="${item.main.pressure}"></c:out>
					hpa
				</h4>
				<h4>Humidity:</h4>
				<h4>
					<c:out value="${item.main.humidity}"></c:out>
					%
				</h4>
				<h4>Wind:</h4>
				<h4>
					<c:out value="${item.wind.speed}"></c:out>
					m/sec
				</h4>
				<h4>
					<c:out value="${item.wind.deg}"></c:out>
					°
				</h4>
				<h4>Clouds:</h4>
				<h4>
					<c:out value="${item.clouds.all}"></c:out>
					%
				</h4>
			</center>
		</div>
	</c:forEach>


</body>
</html>