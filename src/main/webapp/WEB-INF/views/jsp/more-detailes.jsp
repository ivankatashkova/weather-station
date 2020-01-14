<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Full forecast | <c:out value="${city}"></c:out></title>
</head>
<body text="white" bgcolor="black">
	<center>
		<div
			style="border-style: solid; border-color: silver; border-width: 1px; width: 25%; margin-top: 10%;">
			<h3>
				<c:out value="${city}"></c:out>
			</h3>
			<h1 style="color: blue;">
				<c:out value="${weather.main.temp}"></c:out>
				°C
			</h1>
			<p>
				Feels like:
				<c:out value="${weather.main.felsLike}"></c:out>
				°C
			</p>
			<p>Min | Max</p>
			<h4>
				<c:out value="${weather.main.tempMin}"></c:out>
				°C |
				<c:out value="${weather.main.tempMax}"></c:out>
				°C
			</h4>
			<h4>Pressure:</h4>
			<h4>
				<c:out value="${weather.main.pressure}"></c:out>
				hpa
			</h4>
			<h4>Humidity:</h4>
			<h4>
				<c:out value="${weather.main.humidity}"></c:out>
				%
			</h4>
			<h4>Wind:</h4>
			<h4>
				<c:out value="${weather.wind.speed}"></c:out>
				m/sec
			</h4>
			<h4>
				<c:out value="${weather.wind.deg}"></c:out>
				°
			</h4>
			<h4>Clouds:</h4>
			<h4>
				<c:out value="${weather.clouds.all}"></c:out>
				%
			</h4>
			<h4>Sunrise:</h4>
			<h4>
				<c:out value="${weather.sys.sunrise}"></c:out>
			</h4>
			<h4>Sunset:</h4>
			<h4>
				<c:out value="${weather.sys.sunset}"></c:out>
			</h4>
			<form action="/detailed-forecast" method="get">
				<button type="submit"
					style="background-color: blue; border: none; color: white; padding: 15px 32px; text-align: center; text-decoration: none; display: inline-block; font-size: 16px;">Detailed
					Forecast</button>
			</form>
		</div>
	</center>
</body>
</html>