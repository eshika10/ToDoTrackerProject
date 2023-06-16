<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body style="background-color:cyan;text-align:center;">
     <h2>Welcome ${model_name}</h2>
     <a href="add">Add ToDo</a><br></br>
      <a href="delete">Delete ToDo</a><br></br>
       <a href="update">Update ToDo</a><br></br>
        <a href="display">Display ToDo</a><br></br>
</body>
</html>