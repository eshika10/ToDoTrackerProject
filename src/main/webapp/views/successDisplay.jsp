<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final Display Page</title>
</head>
<body style="background-color:DodgerBlue;text-align:center;">
   <h3>UserId: ${model_todo.getUserId()}</h3>
      <h3>UserName: ${model_todo.getUserName()}</h3>
      <h3>Password: ${model_todo.getPassword()}</h3>
      <h3>Description: ${model_todo.getDescription()}</h3>
      <h3>TargetDate: ${model_todo.getTargetDate()}</h3>
      <h3>isDone: ${model_todo.getIsDone()}</h3>
</body>
</html>