<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.util.ArrayList, com.cg.student.bean.StudentScoreDetails"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Score Details</title>
</head>
<body>
<form action="details.obj">	
		<h1><mark>Student Score Details</mark></h1>   							
		<table align="center" width="90%">	
		   <tr>
		<td>Student ID:<sup>*</sup></td>
		<td>
			<select name="ddlId" style="width:150px" required>
			<c:forEach items="${sessionScope.list}" var="list">
        <option><c:out value="${list}" /></option>
    </c:forEach>
		</select>
		</td>
		</tr> 
        	<tr>
        	<td>Subject<sup>*</sup></td>
        	<td>
        	
        	<select id="sub" name="sub" required>
					<OPTION VALUE="Module 1">Module 1</OPTION>
					<OPTION VALUE="Module 2">Module 2</OPTION>
					<OPTION VALUE="Module 3">Module 3</OPTION>
					<OPTION VALUE="Module 4">Module 4</OPTION>
					<OPTION VALUE="Module 5">Module 5</OPTION>
					</select>
				</td>
			</tr>
			
			<tr>
				<td>Theory <sup>*</sup></td>
				<td>
					<input type="text" name="theory" id="theory" required/>
				</td>
			</tr>
			
			<tr>
				<td>MCQ <sup>*</sup></td>
				<td>
					<input type="text" name="mcq" id="mcq"  required/>
				</td>
			</tr>
			
			<tr>
				<td>Lab<sup>*</sup></td>
				<td>
					<input type="text" name="lab" id="lab"  required/>
				</td>
			</tr>
	
			<tr>
			    <td  colspan="2" align="center">
			    <mark><input type="submit" value="Submit"/></mark>
			    </td>
			</tr>
		</table>
	</form>

</body>
</html>