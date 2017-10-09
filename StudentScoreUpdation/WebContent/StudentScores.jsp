<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.util.ArrayList, com.cg.student.bean.StudentDetails"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<StudentDetails> list = (ArrayList<StudentDetails>)session.getAttribute("list");
for(StudentDetails m:list)
    	{
			out.println(m.getStudentId());
			
    		out.println(m.getStudentName());
    		out.println(m.getAge());
    		out.println(m.getState());
    		out.println(m.getGender());
    		out.println(m.getSubjectCount());
    		out.println(m.getAttempts());
    		out.println(m.getTotalScores());
    		out.println("<br>");
    }%>

<a href="add.obj">AddNewStudentScoreDetails</a> 

</body>
</html>

	