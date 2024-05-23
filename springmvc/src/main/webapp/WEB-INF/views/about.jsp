<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
<style>
/* Center the table horizontally */
.center {
	margin: 0 auto;
	width: fit-content; /* Adjust width as needed */
}
</style>
</head>
<body>
	<h1>This is About Page</h1>
	<h1>Called by Home Controller</h1>
	<h1>url /home</h1>
	<%
	String ob = (String) request.getAttribute("Name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> l = (List<String>) request.getAttribute("List");
	%>

	<h1>
		My name is :
		<%=ob%></h1>
	<h1>
		My id is :
		<%=id%></h1>
	<h1>
		My friends list :
		<div class="center"> 
		<table border="1">
			<thead>
				<tr>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
				<%
				// Iterate over the list of names and display them in table rows
				for (String name : l) {
				%>
				<tr>
					<td><%=name%></td>
				</tr>
				<%
				} // End of for loop
				%>
			</tbody>
		</table>
		</div>
	</h1>


</body>
</html>