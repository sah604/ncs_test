package com.greedy.section02.uses;


/**
 * 회원 정보를 저장할 목적의 VO클래스
 * @author TJ
 *
 */
public class MemberVO {
	
	private int num;
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	
	/*기본 생성자*/
	private MemberVO() {}
	
	public MemberVO(int num, String id,String pwd, String name, int age, char gender) {
		this.age = age;
		this.gender = gender;
		this.id = id;
		this.name = name;
		this.num = num;
		this.pwd = pwd;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
	
	public String getInfomation() {
		return "num = "+this.num + " id = "+ this.id + " pwd = "+ this.pwd + " name = " + this.name + " age = " + this.age + " gender = " + this.gender; 
	}
}
