<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Jobs Available</h3>

<table>
<tr>
<td>Job Title</td>
<td>Job Description</td>
<td>Experience</td>
<td>Location</td>
<td>Phone</td>
</tr>
		<c:forEach var="ad" items="${jobAds}">
			<tr>
				<td>${ad.job_title}</td>
				<td>${ad.job_desc}</td>
				<td>${ad.job_exp}</td>
				<td>${ad.job_location}</td>
				<td>${ad.job_contact}</td>
			</tr>
			
		</c:forEach>
	
</table>

</body>
</html>