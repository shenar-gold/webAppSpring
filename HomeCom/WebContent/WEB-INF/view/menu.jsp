<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<h1 align = "center"> ${headerMessage}</h1>
<br>
	<div style= "position: fixed; top:50%; left:50%; transform: translate(-50%, -50%)">
		<div style="position:relative; text-align:center;">
		<a href = "/HomeCom/options/sandwich">
				<img src = "<c:url value="/images/sandwich.jpeg"/>" alt = "sandwich" width = "200" height = "200"/>
		
		</div>
		<div style="position:absolute; bottom: 8px; right: 8px; color: black;"> <strong> Sandwich </strong> </div>
		</a>
	</div>
</body>
</html>