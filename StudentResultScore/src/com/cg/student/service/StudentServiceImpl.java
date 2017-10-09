package com.cg.student.service;

import java.util.ArrayList;

import com.cg.student.DAO.IStudentDAO;
import com.cg.student.DAO.StudentDAOImpl;
import com.cg.student.bean.StudentScoreDetails;

public class StudentServiceImpl implements IStudentService {
     IStudentDAO dao=null;
	@Override
	public ArrayList<Integer> retreiveID() {
		dao=new StudentDAOImpl();
		return dao.retrieveID();
	}
	
	@Override
	public String givegrade(int totalScore) {
	String grade=null;
		if(totalScore >= 91 && totalScore<=100 )
		{
			grade="S";
		}
		if(totalScore >= 81 && totalScore<=90)
		{
			grade="A";
		}
		if(totalScore > 71 && totalScore<=80)
		{
			grade="B";
		}
		if(totalScore > 61 && totalScore<=70)
		{
			grade="C";
		}
		if(totalScore > 51 && totalScore<=60)
		{
			grade="D";
		}
		if(totalScore <= 50 )
		{
			grade="U";
		}
		return grade;
		
		
	}

	@Override
	public int updateDetails(StudentScoreDetails bean) {
		dao=new StudentDAOImpl();
		return dao.StudentScoreDetails(bean);
	}

}
