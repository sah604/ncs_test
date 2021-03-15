package com.greedy.section04.constructor;
//스캐너는 생성자에 매개변수를 써 놓은거임.
public class Application {
	public static void main(String[] args) {
		
		/* 기본생성자 호출하여 인스턴스 생성후 필드값 출력*/
		User user1 = new User();
		System.out.println(user1.getInformation());
		
		/* 아이디 패스워드 이름을 매개변수로 전달 받는 생성자를 호출하여 인스턴스 생성후 필드값 출력 */
		User user2 = new User("user0101", "pwd123", "민연준");
		System.out.println(user2.getInformation());
		
		/* 모든 필드를 초기화하는 생성자를 호출하여 인스턴스 생성 후 필드값 출력 */
		/* java.util.Date는 기본생성자로 인스턴스를 생성하면
		 * 현재 프로그램이 동작하는 운영체제 상의 날짜, 시간 정보를 이용해 인스턴스를 생성한다. */
		User user3 = new User("user02", "pass02" , "이순신", new java.util.Date()); // 데이터클래스 사용
		System.out.println(user3.getInformation());
				
		/* 복사 생성자를 호출하여 인스턴스 생성 후 필드값 출력 */
		User user4 = new User(user3);
		System.out.println(user4.getInformation());
		
	}
	
	
	/* 기본생성자와 매개변수 생성하는 생성자 2개가 동시에 존재 할 경우*/
    // 매개변수 써 넣지 않으면 기본생성자 기능으로 실행...
//User us3 = new User("민연준123 "," 12qw "); // 하지만 매개변수 3개중 하나라도 써넣지 않으면 에러발생. 

	
	/*
	 * 객체를 생성 하려고 하면    클래스명 레퍼런스변수 = new 클래스명();
	 * new 뒤에 클래스명은 사실 상 생성자(constructor)라 불리는 메소드 호출하는 구문
	 * 클래스명 레퍼런스변수 = new 생성자();
	 * 
	 * */
	
	/*
	 * 생성자란?
	 * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출한다.
	 * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor)라고 한다.
	 * 
	 * 기본 생성자는 compiler에 의해 자동으로 추가 되기 때문에 지금까지 명시적으로 작성하지 않고 사용할 수 있었다.
	 * 
	 * 이렇게 기본 생성자를 이용해서 인스턴스를 생성하게 되면 자바에서는 자료형 별 초기값을 이용해서 필드를 초기화 한다.
	 * 필드의 초기값을 사용자가 원하는대로 설정하고 싶은 경우 생성자의 호출 시 인자로 값을 전달하여 호출 할 수 있다.
	 * 이러한 인자를 받아 필드를 초기화 할 목적의 생성자를 "매개변수가 있는 생성자"라고 한다.
	 * 
	 * 하지만 매개변수가 있는 생성자가 한 개라도 존재하는 경우 compiler는 기본생성자를 자동으로 추가해주지 않는다
	 * 
	 *  사용시에 주의해야 한다.
	 * 
	 * */
	
	
}
