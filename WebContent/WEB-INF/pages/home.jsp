<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- Java imports -->
<%@page import="java.util.*" %>
<%@page import="java.lang.String" %>
<%@page import="egg.support.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Beginning of the End</title>
		
		<!-- Stylesheets -->
		<link rel="stylesheet" href="css/trainStyling.css" type="text/css" />
		
		<!-- Javascript -->
		<script type="text/javascript"
			src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	</head>
	
	
	<body>
		
		<script>
			console.log("working your");			
		</script>
		
		
		
		
		<div id="wrapper">
			<div id="headerDiv" style="height: 35px">
				<!-- consistent across pages; change name at some point -->
				<span>Admin Page</span>
			</div>
			
			<div id="searchBar" >
				<!-- to search by specific employee -->
				<label>Search for Employee by </label>
	       			<select id="searchType">
	       				<option>First Name</option>
	       				<option>Last Name</option>
	       				<option>Employee ID</option>
	       				<option>Date of Hire</option>
	       			</select>
	       			<input type="text" id="searchTerms" />
	       			<button id="searchSubmitBttn" type="button">Search</button>
			</div>
			
			<% 	out.println("<h4>Hey bebbe</h4>"); 
			Contract c = new Contract("1", "Starwood");
			
			out.println(c.toString());
		
		%>
			
			<div id="dashboardButtons">
				<!-- buttons for selections/redirects -->
			</div>
		
			<div id="footer">
				<div>eGGsHeLL Co. &copy;2014 Copyright </div>
			</div>
		</div>
	</body>
</html>