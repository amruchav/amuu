package com.cg.student.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.student.DbUtil.DbUtil;
import com.cg.student.bean.StudentScoreDetails;

public class StudentDAOImpl implements IStudentDAO {
	Connection conn = null;
	public ArrayList<Integer> retrieveID() {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int id=0;
		
		try
		{
		conn = DbUtil.getConnection();
		String sql="Select student_ID from StudentDetails";
		
		 PreparedStatement ps2=conn.prepareStatement(sql);
		 ResultSet rs=ps2.executeQuery();
		 while(rs.next())
		 {
			list.add(rs.getInt(1));
		 } 
		 System.out.println(list);
		}
		 catch (SQLException e) {
				
			 System.out.println(e.getMessage());
			} 
			
		
		 return list;
	}

	@Override
	public int StudentScoreDetails(StudentScoreDetails bean) {
		int row=0;
		try
		{
		conn=DbUtil.getConnection();
		PreparedStatement ps=conn.prepareStatement("INSERT INTO StudentScoreDetails VALUES(?,?,?,?,?,?,?)");
		
		ps.setInt(1, bean.getStudentId());
		ps.setString(2, bean.getSubject());
		ps.setInt(3, bean.getTheory());
		ps.setInt(4, bean.getMcq());
		ps.setInt(5, bean.getLab());
		ps.setInt(6, bean.getTotalScore());
		ps.setString(7, bean.getGrade());
		row=ps.executeUpdate();
		
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return row;
	}
}
