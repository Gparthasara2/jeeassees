<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title><link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
<form action="jobservlet" method="post" style="margin-top: 80px;">
		<div align="center" style="margin-top: 20px;">
			<button class="btn btn-primary view" type="submit" name="jobadButton">View Job Advertisements</button>
		</div>
	</form>
	<form action="eventservlet" method="post">
		<div align="center" style="margin-top: 20px;">
			<button class="btn btn-primary view" type="submit" name="eventAdButton">View Event Advertisements</button>
		</div>
	</form>
	<form action="housingAds.jsp">
		<div align="center" style="margin-top: 20px;">
			<button class="btn btn-primary view" type="submit" name="housingAdButton">View Housing Advertisements</button>
		</div>
	</form>
	<form action="communityAds.jsp">
		<div align="center" style="margin-top: 20px;">
			<button class="btn btn-primary view" type="submit" name="communityAdButton">View Community Advertisements</button>
		</div>
	</form><form action="saleAds.jsp">
		<div align="center" style="margin-top: 20px;">
			<button class="btn btn-primary view" type="submit" name="saleAdButton">View Sales and Services Advertisements</button>
		</div>
	</form><script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	
</body>
</html>