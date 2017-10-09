package com.cg.student.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.student.bean.StudentDetails;
import com.cg.student.service.IStudentService;
import com.cg.student.service.StudentServiceImpl;

@WebServlet("*.obj")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDetails bean=new StudentDetails();
		IStudentService service=new StudentServiceImpl();
		HttpSession session=request.getSession();
		String path=request.getServletPath();
		System.out.println(path);
		String target=null;
		
		switch(path)
		{
		case "/retrieve.obj":
			ArrayList<StudentDetails> list = service.retriveDetails();
			session.setAttribute("list", list);
			target="StudentScores.jsp";
			break;
			
		case "/add.obj":
			target="NewStudent.jsp";
			break;
			
		case "/details.obj":
			
			String Studentname=request.getParameter("txtname");
			int Age=Integer.parseInt(request.getParameter("txtage"));
			String State=request.getParameter("state");
			String gender=request.getParameter("txtgen");
			int noSub=Integer.parseInt(request.getParameter("txtno"));
			int attempt=Integer.parseInt(request.getParameter("txtatt"));
			int totalscore=Integer.parseInt(request.getParameter("txttot"));
			
			bean.setStudentName(Studentname);
			bean.setAge(Age);
			bean.setState(State);
			bean.setGender(gender);
			bean.setAttempts(attempt);
			bean.setTotalScores(totalscore);
			bean.setSubjectCount(noSub);
			
			int res=service.addDetails(bean);
			if(res>0)
			{
				target="InsertSuccess.jsp";
			}
			else
			{
				target="Error.jsp";
			}
			
		
			
			
	}
		
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);

	

}
}
