package com.cg.student.service;

import java.util.ArrayList;

import com.cg.student.bean.StudentScoreDetails;

public interface IStudentService {

	public ArrayList<Integer> retreiveID();

	public String givegrade(int totalScore);

	public int updateDetails(StudentScoreDetails bean);


}
