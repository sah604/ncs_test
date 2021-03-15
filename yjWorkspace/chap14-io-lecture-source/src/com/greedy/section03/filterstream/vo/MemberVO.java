package com.greedy.section03.filterstream.vo;

public class MemberVO {
	
	/* 회원 정보를 관리하기 위한 용도의 VO클래스*/
	private String id;
	private String pwd;
	private String name;
	private String email;
	private int age;
	private char gender;
	private double point;
	
	
	public MemberVO() {}


	public MemberVO(String id, String pwd, String name, String email, int age, char gender, double point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public double getPoint() {
		return point;
	}


	public void setPoint(double point) {
		this.point = point;
	}
	
	
	
	

}
