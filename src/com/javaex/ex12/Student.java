package com.javaex.ex12;

public class Student extends Person {
	
	// 필드
	private String schoolName;

	// 생성자
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	
	public Student() {
		super(); // 부모쪽에(person) 기본 생성자가 없으면 오류 발생.
	}

	
	// 메소드 gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	// 메소드 일반	
	@Override
	public String toString() {
		return "학교 = " + schoolName + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	public void showInfo() {
		System.out.println("이름 : " + getName() + " 나이 : " + getAge() + " 학교 :" + schoolName);
	}
}