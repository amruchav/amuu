package com.cg.student.service;

import java.util.ArrayList;
import com.cg.student.DAO.IStudentDAO;
import com.cg.student.DAO.StudentDAOImpl;
import com.cg.student.bean.StudentDetails;

public class StudentServiceImpl implements IStudentService {

	IStudentDAO dao=null;
	public ArrayList<StudentDetails> retriveDetails() {
		
		
			dao=new StudentDAOImpl();
			return dao.retrieveDetails();
		
	}
	@Override
	public int addDetails(StudentDetails bean) {
		dao=new StudentDAOImpl();
		return dao.addDetails(bean);
	}

}
