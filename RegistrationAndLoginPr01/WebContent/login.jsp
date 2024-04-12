<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        .container {
            width: 300px;
            margin: 100px auto;
        }
        input {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }

        button {
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
	<div class="container">
    <h2>Login</h2>
    <form action="login" method="post">
            Username :<input type="text"  name="email1" placeholder="email">
        
            Password : <input type="password"  name="pass1" placeholder="password">
            
        	<button type="submit">Login</button>
    </form>
</div>

</body>
</html>