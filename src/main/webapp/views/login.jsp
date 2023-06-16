<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body style="background-color:yellow;text-align:center;">
     <h2>Welcome To Login Page</h2>
    <form action="addToDo" method="post" >
        <input type="text" name="userId"  placeholder="Enter the userid"/><br></br>
        <input type="password" name="password" placeholder="Enter the password"/><br></br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>