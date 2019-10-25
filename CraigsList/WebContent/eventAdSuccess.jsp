<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>Your Advertisement has been added Successfully!!!</h3>
	</div>
	<form action="index.jsp">
		<input type="submit" value="Go to Home Page">
	</form>
	<form action="advertiserPage.jsp">
		<input type="submit" value="Add another Advertisement">
	</form>
	<form action="eventservlet" method="post">
		<input type="submit" value="View the Event Advertisements">
	</form>
</body>
</html>