package com.loadingFRomProperties.bl;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	private String name;
	@Value("${student.intrestedCourse}")
	private String intrestedCourse;
	@Value("${student.hobby}")
	private String hobby;

	public void displayStudentInfo() {
		System.out.println("student name : " + name);
		System.out.println("student inerested course : " + intrestedCourse);
		System.out.println("student hobby : " + hobby);
	}
}
