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

import com.cg.student.bean.StudentScoreDetails;
import com.cg.student.service.IStudentService;
import com.cg.student.service.StudentServiceImpl;

@WebServlet("*.obj")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentScoreDetails  bean=new StudentScoreDetails();
		IStudentService service=new StudentServiceImpl();
		HttpSession session=request.getSession();
		String path=request.getServletPath();
		System.out.println(path);
		String target=null;
		switch(path)
    {
	   case "/add.obj":
		ArrayList<Integer> list = service.retreiveID();		
		session.setAttribute("list", list);
		target="AddStudentExam.jsp";
		break;
		
	   case "/details.obj":
		   
			int Id=Integer.parseInt(request.getParameter("ddlId"));
			String subject=request.getParameter("sub");
			int thr=Integer.parseInt(request.getParameter("theory"));
			int mcq=Integer.parseInt(request.getParameter("mcq"));
			int lab=Integer.parseInt(request.getParameter("lab"));
			bean.setStudentId(Id);
			bean.setSubject(subject);
		    bean.setTheory(thr);
		    bean.setMcq(mcq);
		    bean.setLab(lab);
			int totalScore=thr+mcq+lab;
			bean.setTotalScore(totalScore);
			String grade=service.givegrade(totalScore);
			bean.setGrade(grade);
			int res=service.updateDetails(bean);
			if(res>0)
			{
			session.setAttribute("Id", Id);
			session.setAttribute("subject", subject);
			session.setAttribute("totalScore", totalScore);
			session.setAttribute("grade", grade);
			target="ResultScore.jsp";
			break;
		
	}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
		

	
}
}
