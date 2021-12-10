package org.college;

public class Student extends College{

	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name");
	}

	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Department Name");
	}

	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student ID");
	}

	public static void main(String[] args) {
	
		Student std = new Student();
		std.studentName();
		std.studentId();
		std.studentDept();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.hostelName();
	}
}
