<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<%@ page isELIgnored="false"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Page</title>
</head>
<body>

<%--This is JSP Expression Language --%>
<h1>Let's see the JSTL Example</h1>
<h1>My name is: ${Name }</h1>
<h1>My Id is: ${id }</h1>
<h1>Local Time and Date: ${time }</h1>
<hr>
<%--This is JSTL Example --%>
<h1>List of Friends: </h1>
<c:forEach var="item" items="${List }">
		<h2>${item }</h2>

</c:forEach>

</body>
</html>