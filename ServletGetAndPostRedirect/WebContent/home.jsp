<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String myname=(String) session.getAttribute("Name_key");
	%>
	<h3>Name is: <%= myname %></h3>
	<a href="profile.jsp" >Profile</a>
	<a href="AboutUs.jsp" >About us</a>
	<a href="logout" >logout</a>

</body>
</html>