<%@page import="com.board.model.ProcessorPerformance"%>
<%@page import="com.board.model.Community"%>
<%@page import="com.board.model.MunicipalBoard"%>
<%@page import="java.util.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Statistics of Flat Rent</title>
<link rel="stylesheet" type="text/css" href="main.css" />
</head>
<body>
	<%  			
		StringBuffer buff = new StringBuffer();
		List<MunicipalBoard> list = new Community().selectAll();	
		Iterator<MunicipalBoard> itr = list.iterator();         
	%>
<p align="right"> <%= (new java.util.Date()).toLocaleString() %></p>		
	<table width="100%"  border="0">		
		<tr>
			<td colspan="2">
				<p id="titletext">My Statistics Data</p>
			</td>
		</tr>
		<tr valign="top" background="">
		    <td style="background-color:white;width:20%; text-align:top;">		    		    			    			    		    		    	
		    	<jsp:include page="savedata.jsp" flush="true" />		    	
    		</td>
			
			<td style="background-color:#eeeeee;height:200px; width:70%;text-align:top;border:solid;">
				<h3 align="center">The list of public figures</h3>
					<table border="2" cellspacing="0" cellpadding="4" align="center">
						<tr align="center" bgcolor="#999999">
							<td>Date</td>
							<td>Hot water</td>
							<td>Price by 1L</td>
							<td>Cold Water</td>
							<td>Price by 1L</td>
							<td>Electricity</td>
							<td>Price by 1Ba</td>
							<td>Flat #1</td>
							<td>Porch</td>
							<td>Flat #2</td>		
						</tr>	
				<%
				while(itr.hasNext()) { 
				%> 
						<tr align="right" bgcolor="white">	
							<% final MunicipalBoard mb = itr.next(); %>
							<td><%=mb.getPaydate() %></td>
							<td><%=mb.getHot_water() %></td>
							<td><%=mb.getPrice_hotwater() %></td>
							<td><%=mb.getCold_water() %></td>
							<td><%=mb.getPrice_coldwater() %></td>	
							<td><%=mb.getElectricity() %></td>
							<td><%=mb.getPrice_electricity() %></td>
							<td><%=mb.getPrice_flat() %></td>
							<td><%=mb.getPrice_porch() %></td>
							<td><%=mb.getPrice_main() %></td>			
						</tr>
					<% } %>	
		   			</table>
								
					<h3 align="center">List of public utilities</h3>
					<table border="2" cellspacing="0" cellpadding="4" align="center">						
						<tr align="center" bgcolor="#999999">
							<td>Date</td>
							<td>Hot Water</td>
							<td>Price HotWater</td>
							<td>Cold Water</td>
							<td>Price ColdWater</td>
							<td>Electricity</td>
							<td>Price Electricity</td>
							<td>Summary #1</td>
							<td>Summary #2</td>				
						</tr>
					<%			
						for (int i = 1; i < list.size(); i++) {
							ProcessorPerformance pp = new ProcessorPerformance(list.get(i - 1), list.get(i));
							%>
							<tr align="center" bgcolor="white">
								<td><%=list.get(i).getPaydate() %></td>
								<td><%=pp.getHotW() %></td>
								<td><%=pp.getPrice_hotW() %></td>
								<td><%=pp.getColdW() %></td>
								<td><%=pp.getPrice_coldW() %></td>
								<td><%=pp.getElectic() %></td>
								<td><%=pp.getPrice_electic() %></td>
								<td><%=pp.getSum1() %></td>
								<td><%=pp.getSum2() %></td>						
					<%	}
					%>
							</tr>
					</table>		
			</td>					
			</tr>
			<tr>
				<td colspan="2" bgcolor="#FFA500" align="right" id="authortext" >
					developed by Rado</td>
			</tr>
		
	</table>
		
</body>
</html>