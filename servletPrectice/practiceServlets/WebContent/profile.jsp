<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String name=(String) session.getAttribute("key"); %>
	<h2 style='color:red'> !Welcome to this page <%=name%></h2>
	<div>
		<nav>
				<a href="profile.jsp" >Home </a>
				<a href="about_us.jsp" >About us</a>
				<a href="contact.jsp" >Contact</a>
		</nav>
	</div>

</body>
</html>