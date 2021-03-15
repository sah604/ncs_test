package com.greedy.section04.vo;

public class UserVO {

	/*
	 * 일반적으로 VO(Value Object)목적으로 설계된 클래스는 명사 뒤에 VO)를 붙인다.
	 * ->UserVo , MemberVo, BoardVo 등등..
	 * */
	
	/*
	 * 자바빈 (Java Bean) 이란?
	 * JSP 에서 배우게 될 표준 액션 태그로 접근할 수 있는 자바 클래스 이다.
	 * 자바 코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법
	 * 그 때 사용할 수 있도록 규칙을 지정해놓은 java클래스를 자바빈이라고 부른다.
	 * 
	 * 자바빈 작성 규칙
	 * 1. 자바빈은 특정 패키지에 속해있어야한다.
	 * 2. 멤버변수의 접근제어자는 privta로 선언해야한다.
	 * 3. 기본생성자가 명시적으로 존재해야 한다. (매개변수 있는 생성자는 선택사항)
	 * 4. 멤버변수에 접근 가능한 설정자 (setter) 와 접근자 (getter)가 public으로 작성 되어있어야 한다, 
	 * 5. 직렬화(Serializeable) 가 되어야 한다. (선택사항)
	 * */
	
	// public protected (defalut) private
	/* 모든 필드를 private 접근제한으로 설정 */
	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate;

	/* 기본 생성자 명시적으로 작성 */
	public UserVO() {}
	
	/* 매개변수 있는 생성자는 선택사항이다. */
	/* 필요에 따라 만들지만 일반적으로 가장 많이 사용되는 생성자는 모든 필드를 최기화하는 생성자 이다*/
	
	public UserVO(String id,String pwd, String name, java.util.Date enrollDate) {
		this.id = id;
		this.name = name;
		this.enrollDate = enrollDate;
		this.pwd = pwd;
	}
	
	/*
	 * 설정자와 접근자 (세터와게터)
	 * 모든 필드에 대해 각 설정자와 접근자를 작성하여 접근제한 범위는 public으로 설정한다.
	 * */

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

	public java.util.Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(java.util.Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	

	/* 출력용 메소드 */
	public String getInformation() {
		return "id= " + this.id + "pwd = "+ this.pwd + " name = " + this.name + " enrollDate = "+this.enrollDate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
