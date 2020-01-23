<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>  </head>

<style type="text/css">
	span{
	color: red;
	font-family: Arial;
	}
</style>


<body>
	<h3>${headerMessage3}: </h3>
	<table>
		<tr>
			<td>Food: </td>		<td>${food.getFoodName()}</td>
		</tr>
		<tr>
			<td>Ingredients: </td>		<td>${food.getIngredients()}</td>
		</tr>
		<tr>
			<td>Bread: </td>		<td>	${food.getBreadType()}</td>
		</tr>
		
		<tr>
			<td><a href = "/HomeCom/cafe"> <button>Order more</button></a></td>		
			<td><a href = "/HomeCom/finishOrder/"><button>Finish order</button></a></td>
		</tr>
	</table>
	 <br>
	 <br>

</body>
</html>