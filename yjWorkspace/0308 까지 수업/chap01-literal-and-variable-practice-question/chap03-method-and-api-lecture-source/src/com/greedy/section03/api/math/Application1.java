package com.greedy.section03.api.math;

public class Application1 {
	public static void main(String[] args) {
		 
		/*
		 * API 란?
		 *  Application Programming Interface 는 응용프로그램에서 사용할 수 있도록
		 *  운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수있도록 만든인터페이스를 뜻함.
		 * 
		 */
		
		// java.lang.Math 클래스 @@@
		/*
		 * Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은것.
		 *  
		 */
		 
		// 절대값 출력
		// 클래스의 full-name을 다 적은 경우
		System.out.println(" -7의 절대값 : " + (java.lang.Math.abs(-7)));
		//풀 패키지 이름을 작성한것.
		
		
		System.out.println(" -1. 25의 절대값 : " + (Math.abs(-1.25)));
		// Math는 static 클래스 이기 때문에 클래스명. 으로 호출 가능
		
		// java.lang 이라는 패키지는 워낙 자주 사용하는 패키지이다 보니 import를 하지 않고 사용할 수 있도록 해놓았다.
		// 컴파일러가 import java.lnag.*; 이 코드를 자동으로 추가해서 컴파일러 해주기 때문이다.
	
	}
}
// 클래스를 만들때 lang 패키지는 기본으로  (자동으로)들어간다. 그래서 import 도 자동으로 해주기 때문에 불필요.
