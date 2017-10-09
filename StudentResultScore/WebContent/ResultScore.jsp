<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table> 
<%
int id = Integer.parseInt(session.getAttribute("Id").toString());
String name = session.getAttribute("subject").toString();
int total = Integer.parseInt(session.getAttribute("totalScore").toString());
String grade = session.getAttribute("grade").toString();
%> 
<form>
<table border="10" align="center" cellspacing="10" cellpadding="5">
<tr>
	<td>Student Id</td>
	<td><%=id %>
</tr>

<tr>
	<td>Subject name</td>
	<td><%=name %> 
</tr>

<tr>
	<td>Total Score</td>
	<td><%=total %> 
</tr>

<tr>
	<td>Grade</td>
	<td><%=grade %>
</tr>

</table>
</form> 
</body>
</html>