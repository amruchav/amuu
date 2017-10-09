package com.cg.student.bean;

public class StudentScoreDetails {
	
	private int studentId;
	private String subject;
	private int theory;
	private int mcq;
	private int lab;
	private int totalScore;
	private String grade;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getTheory() {
		return theory;
	}
	public void setTheory(int theory) {
		this.theory = theory;
	}
	public int getMcq() {
		return mcq;
	}
	public void setMcq(int mcq) {
		this.mcq = mcq;
	}
	public int getLab() {
		return lab;
	}
	public void setLab(int lab) {
		this.lab = lab;
	}
	 
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public StudentScoreDetails() {
		
	}
}
