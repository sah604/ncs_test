package com.greedy.section01.extend;

public class FireCar extends Car {

//	public FireCar() { 알트 쉬프트 에스 자동완성
//		super();
//		// TODO Auto-generated constructor stub
//	}
	// Car 의 기능 상속받기
	
	/*
	 * Car 클래스를 부모 클래스로 FireCar를 자식클래스로 사용할 것이다.
	 * 클래스 선언부에 extends Car를 추가해서 Car클래스를 상속받을 것이다.
	 * FireCar는 부모 클래스인 Car가 가지고 있는 모든 멤버를 상속 받는다.
	 * - 부모가 가지고 있는 private 멤버는 접근이 불가능 하다.
	 * - 생성자는 상속받지 못한다.
	 * */
	
	/* 기본 생성자 */
	public FireCar() {
		/*
		 * 모든 생성자는 맨 첫줄에 super()를 컴파일러가 자동 추가한다.  //상속이 아닌 경우에도?
		 * 부모의 기본 생성자를 호출하는 구문이다.
		 * */
		super();// 자기가 상속받고 있는 부모클래스의 기본생성자로 간다.
		 
	}
	
	
	/* 소방차의 기능을 재정의 해보자 */
	/*
	 * @Override    @  =  어노테이션 (재정의)
	 * JDK 1.5 부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않을 경우에는 컴파일 에러를 발생시킨다.
	 * */
	@Override // 재정의 했구나.. 라고 생각
	public void soundHorn() { //
		/* 오버라이딩 규칙 : 기본적으로 부모 메소드 선언부 내용을 그대로 작성해야 한다.*/
		if(isRunning()) { // this. / super.  / 그냥 셋다 가능
			System.out.println("뿌아아아아아아아앙!!");
			
		}
		
	}
	
	
	/**
	 * 물을 뿌리는 기능 제공
	 */
	public void sprayWater() {
		System.out.println("불난곳 발견 , 물을 뿌립니다. ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
