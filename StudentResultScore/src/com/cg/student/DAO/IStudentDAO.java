package com.cg.student.DAO;

import java.util.ArrayList;

import com.cg.student.bean.StudentScoreDetails;

public interface IStudentDAO {

	public ArrayList<Integer> retrieveID();

	public int StudentScoreDetails(StudentScoreDetails bean);

}
