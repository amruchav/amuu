package com.cg.student.DAO;

import java.util.ArrayList;

import com.cg.student.bean.StudentDetails;

public interface IStudentDAO {

	ArrayList<StudentDetails> retrieveDetails();

	public int addDetails(StudentDetails bean);

}
