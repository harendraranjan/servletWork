<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
</head>
<body>
    <form action="register" method="post">
        Name: <input type="text" name="name1" placeholder="Enter your name"><br><br>
        Email: <input type="text" name="email1" placeholder="Enter your email"><br><br>
        Password: <input type="password" name="pass1" placeholder="Enter your password"><br><br>
        Gender: 
        <input type="radio" name="gender1" value="male"> Male
        <input type="radio" name="gender1" value="female"> Female<br><br>
        City:
        <select name="city1">
            <option value="select">Select city</option>
            <option value="Noida">Noida</option>
            <option value="Sitamrhi">Sitamrhi</option>
            <option value="Delhi">Delhi</option>
            <option value="Pune">Pune</option>
            <option value="Agra">Agra</option>
            <option value="Motihari">Motihari</option>
            <option value="Patna">Patna</option>
            <option value="other">Other</option>
        </select>
        <input type="submit" name="submit">
    </form>
</body>
</html>
