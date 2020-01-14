<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Home</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<body text="white" bgcolor="black">
	<center>
		<div style="margin-top: 10%;">
			<form action="" method="post">
				<input type="text" name="city" placeholder="Enter city"
					style="padding: 13px 30px; display: inline-block; font-size: 16px;">
				<button type="submit"
					style="background-color: blue; border: none; color: white; padding: 15px 32px; text-align: center; text-decoration: none; display: inline-block; font-size: 16px;">Search</button>
			</form>
			<br>
			<c:if test="${not empty city}">
				<div
					style="border-style: solid; border-color: silver; border-width: 1px; width: 25%;">
					<h3>
						<c:out value="${city}"></c:out>
					</h3>
					<h1 style="color: blue;">
						<c:out value="${currentWeather.main.temp}"></c:out>
						°C
					</h1>
					<p>
						Feels like:
						<c:out value="${currentWeather.main.felsLike}"></c:out>
						°C
					</p>
					<p>Min | Max</p>
					<h4>
						<c:out value="${currentWeather.main.tempMin}"></c:out>
						°C |
						<c:out value="${currentWeather.main.tempMax}"></c:out>
						°C
					</h4>
					<form action="/more-detailes" method="get">
						<button type="submit"
							style="background-color: blue; border: none; color: white; padding: 15px 32px; text-align: center; text-decoration: none; display: inline-block; font-size: 16px;">More
							detailes</button>
					</form>
				</div>
			</c:if>
		</div>
	</center>
</body>
</html>
