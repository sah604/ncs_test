package com.greedy.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* Calender 클래스 
		 * 
		 * abstract 클래스로 Calendar 클래스를 이용해서 인스턴스를 생성하는것이 불가능 하다.
		 * */
		
		/*
		 * Calendar 클래스를 이용한 인스턴스 생성 방법
		 * 1. getInstance() static 메소드를 이용해서 인스턴스를 반환받는 방법
		 * 2. 후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스를 생성하는 방법
		 * */
		
		/* 1. getInstance() static 메소드 이용 */
		Calendar calendar = Calendar.getInstance();
		
		/*
		 * toString()이 오버라이딩 되어 있어서 모든 필드의 값을 확인할 수 있다.
		 * 생성된 인스턴스의 타입이 후손 클래스의 타입인 GregorianCalendar 타입인것도 확인 
		 * */
		System.out.println(calendar);
		
		/* 특정 날짜/시간 정보를 이용해서 인스턴스를 생성하는 방법을 GregorianCalendar의 생성자 제공한다. */
	
		/* 2. GregorianCalendar 이용하는 방법 */
		/* 2-1. 기본생성자 사용 */
		Calendar gregorianCalendar = new GregorianCalendar();
		
		System.out.println(gregorianCalendar);
		System.out.println("===================================");
		/* 2-2. 년,월,일,시,분,초 정보를 이용해서 인스턴스를 생성 */
		/* 1993년 08월 02일 12:01:00 */
		int year = 1993;
		int month = 7; // 월은 0~ 11월로 사용하기 때문에
		int dayOfMonth = 2;
		int hour = 12;
		int min = 1;
		int second = 0;
		
		Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
		
		System.out.println(birthDay);
		
		System.out.println(birthDay.getTimeInMillis());
		
		Date date = new Date(birthDay.getTimeInMillis());
		System.out.println(date);
		
		Date date2 = new Date(new GregorianCalendar(year, month, dayOfMonth, hour, min, second).getTimeInMillis());
		
		System.out.println(date2);
		
		System.out.println("===========================");
		
		// 생성된 인스턴스의 필드 정보를 Calendar 클래스에 있는 get() 메소드를 사용해서 반환 받을 수 있다.
		int birthYear = birthDay.get(1);
		int birthMonth = birthDay.get(2);
		int birthDayOfMonth = birthDay.get(5);
		
		System.out.println(birthYear);
		System.out.println(birthMonth);
		System.out.println(birthDayOfMonth);
		
		System.out.println(Calendar.YEAR); // 1
		System.out.println(Calendar.MONTH);// 2
		System.out.println(Calendar.DATE); // 5
		
		System.out.println("year : " + birthDay.get(Calendar.YEAR));
		System.out.println("year : " + birthDay.get(Calendar.MONTH));
		System.out.println("dayOfMonth : " + birthDay.get(Calendar.DATE));
		
		/* 일요일부터 주 시작. 일 1 월 2 화 3 수 4 목 5 금 6 토7 의미*/
		System.out.println("dayOfWeek : " + birthDay.get(Calendar.DAY_OF_WEEK));
		
		String day = "";
		switch(birthDay.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY : day = "일"; break;
		case Calendar.MONDAY : day = "월"; break;
		case Calendar.WEDNESDAY : day = "화"; break;
		case Calendar.TUESDAY : day = "수"; break;
		case Calendar.THURSDAY: day = "목"; break;
		case Calendar.FRIDAY : day = "금"; break;
		case Calendar.SATURDAY : day = "토"; break;
		}
		System.out.println("요일 : " + day);
		
		System.out.println("amPm : " + birthDay.get(Calendar.AM_PM)); //0은 오전, 1은 오후
		
		System.out.println(birthDay.get(Calendar.AM_PM) == Calendar.AM ? "오전" : "오후");
		
		System.out.println("hourOfDay : " + birthDay.get(Calendar.HOUR_OF_DAY)); //24시간 체제
		System.out.println("hour : " + birthDay.get(Calendar.HOUR));			// 12시간 체제
		
		System.out.println("min : " + birthDay.get(Calendar.MINUTE));
		System.out.println("seconf : " + birthDay.get(Calendar.SECOND));
		
		
		
	}

}
