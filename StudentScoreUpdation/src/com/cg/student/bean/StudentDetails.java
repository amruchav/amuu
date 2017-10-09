package com.cg.student.bean;

public class StudentDetails {
	
	private int studentId;
	private String studentName;
	private int age;
	private String state;
	private String gender;
	private int subjectCount;
	private int attempts; 
	private int totalScores;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSubjectCount() {
		return subjectCount;
	}
	public void setSubjectCount(int subjectCount) {
		this.subjectCount = subjectCount;
	}
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public int getTotalScores() {
		return totalScores;
	}
	public void setTotalScores(int totalScores) {
		this.totalScores = totalScores;
	}
	public StudentDetails(int studentId, String studentName, int age,
			String state, String gender, int subjectCount, int attempts,
			int totalScores) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.state = state;
		this.gender = gender;
		this.subjectCount = subjectCount;
		this.attempts = attempts;
		this.totalScores = totalScores;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	

}
