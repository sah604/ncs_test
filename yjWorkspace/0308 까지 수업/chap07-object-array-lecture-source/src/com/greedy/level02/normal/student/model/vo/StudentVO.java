package com.greedy.level02.normal.student.model.vo;

public class StudentVO {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	public StudentVO() {}
	
	public StudentVO(int grade, int classroom, String name, double height, char gender) {
		this.classroom = classroom;
		this.gender = gender;
		this.grade = grade;
		this.height = height;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void  printInfomation() {
		System.out.println("학년 : " + this.grade); // 3가지 방식(this. , 필드변수 이름, 게터)중 보통 this. 으로(명시적으로) 사용한다.
		System.out.println("반 : " + this.classroom);
		System.out.println("이름 : " + this.name);
		System.out.println("키 : " + this.height);
		System.out.println("성별 : " + this.gender);
		
	}

}
