<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> ModelAndView method application Example</h1>
	<%
	String ob = (String) request.getAttribute("name");
	Integer obj = (Integer) request.getAttribute("id");

	%>
	<h1>My New Name is: Mr.<%=ob %></h1>
	<h1>My New Id is: <%=obj %></h1>
</body>
</html>