package com.greedy.section04.constructor;

//import java.util.Date;

public class User {
	
	/* 아이디, 비밀번호, 이름, 가입일을 관리 */
	
	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate; //Date 도 클래스의 일종이다. // 필드로 다른 클래스 자료형도 사용할 수 있다.
	 
	/*
	 * 생성자의 작성위치
	 * 작성위치는 문법상으로는 클래스 내부에 작성하면 되지만,
	 * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는것이 관례이다.
	 * 
	 * */
	
	/*
	 * 생성자의 사용 목적
	 * 1. 인스턴스 생성 시점에 수행할 명령이 있는경우 사용한다.
	 * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하여 인스턴스를 생성 할수있다.
	 * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다.
	 * 	  따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 있다. (초기값 전달 강제화)
	 * */
	
	/*
	 * 생성자 작성 방법
	 * [표현식]
	 * 접근제한자 클래스명 (매개변수){
	 *     
	 *     인스턴스 생성 시점에 수행할 명령 기술(주로 필드를 초기화)
	 *     this.필드명 = 매개변수;
	 * }
	 * 
	 * */

	/* 기본생성자 (default constructor) */ //기본생성자는 반환값 없음 void도 아님.
	public User() { // 기본 생성자일경우에도 메소드 기능 사용 가능.
		System.out.println("User 클래스의 기본 생성자 호출함....");
		
	}
	
	/* 동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는것 불가능*/
//	public User() {
//		
//	}
	
	public User(String id, String pwd, String name) {
		// 매개변수의 선언부에 작성한 매개변수의 타입, 갯수, 순서에 따라 동일한 생성자
		// 혹은 메소드를 한 클래스 내에 여러개를 작성 할 수 있게 만든 기술이 있다.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		// --> 오버로딩 @@@@@@@@@ 오버라이딩과 다름. overloading
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		
		System.out.println("User 클래스의 id pwd name을 초기화하는 생성자 호출함...");
 	}
	// 메소드 명은 원래 같은 이름으로 만들지 못하는데, 매개변수의 선언부에 작성한 매개변수의 타입, 갯수, 순서가 다르면 
	
	
	public User(String id, String pwd , String name, java.util.Date enrollDate) {
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
//		this.enrollDate = enrollDate;
		
		// 초기화내용이 위의 매개변수생성자와 현재 매개변수 생성자 간에 중복이 발생하게 된다.
		// 이 중복되는 초기화 내용을 줄여서도 사용할 수 있다.
		// --> this() 메소드를 사용해서 동일 클래스 내에 작성한 다른 생성자 메소드를
		// 		호출하는 구문이다.
		this(id, pwd, name); //this() 는 가장 첫줄에 선언해야 하며 그렇지 않으면 컴파일에러가 발생
								// 중복을 줄여줄때 사용한다.
		this.enrollDate = enrollDate;
		
		System.out.println("User 클래스의 모든 필드를 초기화 하는 생성자 호출함.");
	}
	
	
	/* 복사 생성자 */
	/*
	 * 이미 만들어진 타입의 인스턴스가 가지는 필드값을 이용해서 새로운 인스턴스 생성 시 초기화 값으로 이용할 수있다,
	 * 동일한 값을 가지지만 새롭게 할당되는 인스턴스 이기 때문에 서로다른 주소값을 가지게 된다.
	 * -> (깊은 복사)
	 * 
	 * */
	public User(User otherUser) {
		this.id = otherUser.id;
		this.pwd = otherUser.pwd;
		this.name = otherUser.name;
		this.enrollDate = otherUser.enrollDate;
		
		System.out.println("User 클래스의 복사 생성자 호출함...");
		System.out.println("this의 hashcode : " + this.hashCode());
		System.out.println("otherUser의 hashcode : " + otherUser.hashCode());
	}
	
	
	public String getInformation() {
		
		return"id = " + this.id + ", pwd = " + this.pwd + ", name = "+this.name+", enrollDate = " + this.enrollDate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
