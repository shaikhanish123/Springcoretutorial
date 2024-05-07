package com.springcore;

public class Student{
	private int Studentid;
	private String StudentName;
	private String StudentAddress;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentid, String studentName, String studentAddress) {
		super();
		Studentid = studentid;
		StudentName = studentName;
		StudentAddress = studentAddress;
	}

	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "App [Studentid=" + Studentid + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
}
