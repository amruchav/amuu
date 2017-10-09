package com.cg.student.service;

import java.util.ArrayList;

import com.cg.student.bean.StudentDetails;

public interface IStudentService {

	ArrayList<StudentDetails> retriveDetails();

	public int addDetails(StudentDetails bean);

}
