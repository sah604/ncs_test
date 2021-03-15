package com.greedy.section03.vo;

public class Member {
	
	/*
	 * 취급하려고 하는 회원 정보를 구상해서 필드를 우선 작성
	 * 회원 번호, 회원명, 나이, 성별, 키 , 몸무게, 회원 탈퇴여부(활성화여부)를 관리할 것이다.
	 * 
	 * 값 객체가 가지는 속성(필드)를 추출하는 과정 또는 추상화라고 볼 수 있다.
	 * 
	 * VO 클래스를 만들기 위해서는 모든 필드를 private로 만든다.
	 * */
	
	private int number;   		// 회원 번호
	private String name;  		// 회원 명
	private char gender;  		// 성별
	private int age;      		// 나이
	private double height;		// 키
	private double weight;		// 몸무게
	private boolean isActivated; // 회원탈퇴여부(활성화여부)
	
	// 데이터 위주의 클래스를 만들어야지 해서 필드변수만 선언. 별다른 기능이 필요없기떔에
	
	/*
	 * 설정자(setter)/ 접근자(getter) 
	 * 
	 * 설정자(setter) 작성규칙
	 * : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
	 * 	호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
	 * 
	 * [표현식]
	 * public void set필드명(매개변수){
	 *     this.필드 = 매개변수;
	 * }
	 * [작성예시]
	 * public void setName(String name){
	 *  	this.name = name;
	 * }
	 * 
	 * 접근자(getter)작성 규칙
	 * : 필드의 값을 반환 받은 목적의 메소드 집합을 의미한다.
	 * 	각 접근자는 하나의 필드에만 접근 하도록 한다.
	 * 	필드에 접근해서 기록된 값을 return을 이용하여 반환한다,
	 *  이 떄 반환타입은 반환하려는 값의 자료형과 일치하여야 한다.
	 * 
	 * [표현식]
	 * public 반환형 get필드명(){
	 * 		return 반환값;
	 * }
	 * 
	 * [작성예시]
	 * public String getName(){
	 * 		return this.name;
	 * }
	 * */
	
	/* 설정자(setter) 메소드 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGenger(char gender) {
		this.gender = gender;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight ) {
		this.weight = weight;
	}
	
	public void setActivated(boolean isActivated) { //앞에 is 빠진 이유는 그냥 약속임.
		this.isActivated = isActivated;
	}
	
	/* 접근자 (getter) 메소드*/
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	/* boolean의 접근자는 get으로 시작하지 않고 is로 시작하는것이 일반적인 관례 */
	public boolean isActivated() {
		return isActivated;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
