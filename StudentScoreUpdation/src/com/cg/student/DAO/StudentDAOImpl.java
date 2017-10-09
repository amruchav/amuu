package com.cg.student.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.student.DbUtil.DbUtil;
import com.cg.student.bean.StudentDetails;

public class StudentDAOImpl implements IStudentDAO {

	Connection conn=null;
	public ArrayList<StudentDetails> retrieveDetails() {
		ArrayList<StudentDetails> list=new ArrayList<StudentDetails>();
		try
		{
		conn = DbUtil.getConnection();
		String sql="Select * from Student_score";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			
			int studentId=rs.getInt(1);
			String studentName=rs.getString(2);
			int age=rs.getInt(3);
			String state=rs.getString(4);
			String gender=rs.getString(5);
			int subjectCount=rs.getInt(6);
			int attempts=rs.getInt(7); 
			int totalScores=rs.getInt(8);
			list.add(new StudentDetails(studentId, studentName, age, state, gender, subjectCount, attempts, totalScores));
			
		}
		}
		catch(SQLException e)
		{

			System.out.println(e.getMessage());
		}
		return list;
		
	}
	@Override
	public int addDetails(StudentDetails bean) {
		int row=0;
		try
		{
		conn=DbUtil.getConnection();
		PreparedStatement ps=conn.prepareStatement("INSERT INTO Student_score VALUES(studId_seq.nextval,?,?,?,?,?,?,?)");
		
		ps.setString(1, bean.getStudentName());
		ps.setInt(2, bean.getAge());
		ps.setString(3, bean.getState());
		ps.setString(4, bean.getGender());
		ps.setInt(5, bean.getSubjectCount());
		ps.setInt(6, bean.getAttempts());
		ps.setInt(7, bean.getTotalScores());
		row=ps.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return row;
		
	}

}
