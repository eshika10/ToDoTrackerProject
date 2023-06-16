<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Page</title>
</head>
<body style="background-color:orange;text-align:center;">
   <form method="post" action="finalAdd">
       <input type="text" placeholder="Enter userId" name="userId"/><br></br>
       <input type="text" placeholder="Enter userName" name="userName"/><br></br>
       <input type="password" placeholder="Enter password" name="password"/><br></br>
       <input type="text" placeholder="Enter description" name="description"/><br></br>
       <input type="text" placeholder="YYYYMMDD" name="targetDate"/><br></br>
       <input type="text" placeholder="Enter Yes/No" name="isDone"/><br></br>
       <input type="submit" value="submit"/>
     </form>
</body>
</html>