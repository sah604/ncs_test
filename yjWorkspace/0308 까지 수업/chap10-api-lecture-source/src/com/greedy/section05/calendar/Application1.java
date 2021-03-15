package com.greedy.section05.calendar;

import java.util.Date;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* Date 클래스
		 * JDK 1.0 부터 날짜를 취급하기 위해서 사용되던 Date 클래스
		 * 
		 * ** Deprecated란?
		 * 향후 버전이 업데이트 되면서 사라지게 될 기능이니 가급적이면 사용을 권장하지 않는다.
		 * */
		
		/* 1. 기본 생성자 사용하는 방법 */
		/* 기본 생성자로 인스턴스를 생성하면 운영체제의 날짜/시간 정보를 이용해서 인스턴스를 만들게 된다. */
		java.util.Date today = new java.util.Date();
		
		// toString() 메소드가 오버라이딩 되있어서 필드값을 출력해서 볼수 있다.
		System.out.println(today/*.toString()*/);
		
		/* getTime() : 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 millisecond(1/1000 초)로 계산해서
		 * long 타입으로 반환한다. */
		
		System.out.println(today.getTime());
		
		/* 매개변수에 long타입의 리터럴에 맞게 뒤에 L을 붙여준다. */
		Date time = new Date(1615030089157L);
		
		System.out.println(time);
		
		/*
		 * 하루는 24시간 1시간 60분 1분 60초 1초는 1000밀리초
		 * 1000 * 60 * 60 * 24
		 * */
	}

}
