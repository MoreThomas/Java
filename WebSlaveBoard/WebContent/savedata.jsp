<%@page import="com.board.model.MunicipalBoard"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Using GET and POST Method to Read Form Data</title>
<link rel="stylesheet" type="text/css" href="main.css" />
</head>
<body>
<form method="post" action="savedata">
<h1>Enter new params: </h1>
<table id="list1" style="border:solid;">
	<tr>
		<td>Date</td>
		<td><input type="text" name="inp_date" /></td>
	</tr>
	<tr>
		<td>Hot water</td>
		<td><input type="text" name="inp_hw" /></td>
	</tr>
	<tr>
		<td>Cold Water</td>  
		<td><input type="text" name="inp_cw" /></td>		
	</tr>	
	<tr>
		<td>Electricity</td> 
		<td><input type="text" name="inp_elec" /></td>
	</tr>
	<tr>
		<td><input type="submit" id="Insert" value="Done" /></td>
	</tr>	
</table>
</form>		 		    		   		    				    		    		
</body>
</html>