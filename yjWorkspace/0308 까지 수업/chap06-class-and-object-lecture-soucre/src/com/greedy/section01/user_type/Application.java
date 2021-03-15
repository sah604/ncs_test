package com.greedy.section01.user_type;

public class Application {
	public static void main(String[] args) {
		
		/* 회원 정보를 관리하기 위해 회원의 여러정보(아이디, 비밀번호, 이름, 나이, 성별, 취미)를 
		 * 취급하여 관리하려고 한다
		 * */
		
		String id = "user01";
		String pwd = "pass01";
		String name = "홍길동";
		int age = 20;
		char gender = '남';
		String[] hobby = new String[] {"축구", "볼링", "테니스"};
		
		System.out.println("id : "+ id);
		System.out.println("pwd : "+ pwd);
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
		System.out.println("gender : "+ gender);
		System.out.print("hobby : " );
		
		
		for(int i = 0 ; i < hobby.length ; i++) {
			System.out.print(hobby[i] + " ");
		}
		System.out.println();
		
		/*
		 * 위에서 처럼 각각의 변수로 관리하게 되면 여러가지 단점이 있다
		 * 1. 변수명을 다 관리해야 하는 어려움이 생긴다.
		 * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면 너무 많은 것들을 인자로 전달해야해서 
		 *    한눈에 들어오지 않는다.
		 * 3. 리턴은 1개의 값만 가능하기 때문에 회원 정보를 묶어서 리턴값으로 사용할 수 없다.
		 *    Why? 서로 다른 자료형들이기 때문에
		 * 
		 * */
		
		/* 그래서 자바에서는 서로 다른 자료형의 데이터를 사용자 (개발자) 정의로 하나로 묶는다
		 * 정의할 수 있는 방법을 제공해 준다.
		 *                             아!!! 클래스명.변수명 하면 변수 호출 가능이잖아~~!!!
		 * 필요로 하는 자료형이 주가로 존재하는 경우 자바에서는 클래스라는 매커니즘을 이용해서 사용자 자료형을
		 * 만들수 있게 한다.
		 * 위에서 만든 데이터들의 공통적인 부분은 '회원정보'라는 것이다.
		 * 이러한 공통점을 고려하여 그룹화 할 수있는 명사 형태로 클래스작성.
		 * 
		 * */
		
		/*생성한 Member 클래스 사용*/
		
		/* 사용자 정의의 자료형 사용하기 */
		/* 1. 변수선언 및 객체생성 */
		/*
		 * 자료형 변수명 = new 클래스명(); <- 이 구문은 객체(instance)를 생성하는 구문
		 * 사용자 정의의 자료형인 클래스를 이용하기 위해서는 new 연산자로  heap 에 할당을 해야한다.
		 * 객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체(instance)가 생성된다.
		 *
		 * */
		  
		
		/* new 연산자를 통해서 heap에 생성되기 때문에 jvm 기본값을 초기화 한다.*/
		Member member = new Member();  
		
		
		/* 필드에 접근하기 위해서는 레퍼런스변수명.필드명  으로 접근한다 
		 * '.'은 참조 연산자라고 하는데, 레퍼런스 변수가 참고하고 있는 주소를 접근한다는 의미
		 * 각 공간은 필드명으로 접근한다. 
		 * (배열은 인덱스로 접근, 객체는 필드명으로 접근한다.)
		 * */
		System.out.println("member.id : " + member.id);
		System.out.println("member.pwd : " + member.pwd);
		System.out.println("member.name : " + member.name);
		System.out.println("member.age : " + member.age);
		System.out.println("member.gender : " + member.gender);
		System.out.println("member.hobby : " + member.hobby);
		
		/* 2. 필드에 접근 -> 변수사용하듯 사용할 수 있다.*/ 
		member.id = "user01";
		member.pwd = "pass01";
		member.name = "홍길동";
		member.gender = '남';
		member.hobby = new String[] {"축구","볼링","테니스"};
		
		System.out.println();
		/*값확인*/
		System.out.println("member.id : " + member.id);
		System.out.println("member.pwd : " + member.pwd);
		System.out.println("member.name : " + member.name);
		System.out.println("member.age : " + member.age);
		System.out.println("member.gender : " + member.gender);
		System.out.print("member.hobby : ");
		
		for(int i1 = 0; i1 < member.hobby.length; i1++) {
			System.out.print(member.hobby[i1]+",");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
