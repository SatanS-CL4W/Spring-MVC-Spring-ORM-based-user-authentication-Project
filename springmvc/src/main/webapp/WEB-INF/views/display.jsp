<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ModelAttribute Annotation Example</title>
</head>
<body>
	<h1>User's Name: ${user.userName }</h1>	
	<h1>User's Name: ${user.email }</h1>
	
	<h1>Password entered is "${user.userPassword }", make your passsword strong!!!</h1>


</body>
</html>