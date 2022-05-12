package com.pcwk.oop01_review;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "이상무";
		student.studentId = 20123456;
		student.grade = 4;
		student.address = "서울";
		
		student.showStudentInfo();//메서드 호출
		
	}

}
