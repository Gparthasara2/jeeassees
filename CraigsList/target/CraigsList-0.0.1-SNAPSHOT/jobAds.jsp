<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<form class="form-control" action="jobservlet" method="get">
		<div>
			Enter the Job Title: <input type="text" name="title">
		</div>
		<div>
			Enter the Description: <input type="text" name="desc">
		</div>
		<div>
			Experience Required(in years): <input type="number" name="exp">
		</div>
		<div>
			Location : <input type="text" name="loc">
		</div>
		<div>
			Contact: <input type="text" name="ph">
		</div>
		<input type="submit" value="Submit">
	</form>
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		crossorigin="anonymous">
</body>
</html>