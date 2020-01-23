
<!DOCTYPE html>
<html>

<body>
	<h1 align = "center"> ${headerMessage}</h1>
	
	<form action="/HomeCom/processOrder/${itemName}">
<!-- 		<div align = "center"> -->
	
	<table>
		<tr>
			<td><label>Item name: </label> </td> 
			<td><input style = "background-color: #eff0f1; font-style: italic" id = "item_id" type = "text" name = "foodName" value = "${itemName}" disabled></td>
		</tr>
	
		<tr>
			<td><label>Ingredients: </label></td>
			<td>
				<select name="ingredients" multiple>
				 <option value="beef">Beef</option>
				 <option value="oil">Oil</option>
				 <option value="onion">Onion</option>
				 <option value="carrot">Carrot</option>
				</select>
			</td>
		</tr>

		<tr>
		 <td><label>Bread: </label></td>
		 <td>
		 	<select name ="breadType">
		     <option value = "bagel">Bagel</option>
		     <option value = "french-baguette">French baguette</option>
		 	</select>
		 </td>
		</tr>
	</table>
			

			<input type = "submit" value = "order now">
<!-- 		</div> -->
	</form>
</body>
</html>