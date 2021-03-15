package com.greedy.section02.string;

public class Application4 {
	
	public static void main(String[] args) {
		
		/*
		 * 이스케이프(escape) 문자
		 * 문자열 내에서 사용하는 문자 중 특수 문자를 표현하거나 특수기능을 사용할 때 사용하는 문자이다.
		 * 
		 * 이스케이프문자 	의미
		 * 	\n			개행(줄바꿈)
		 * 	\t 			탭
		 * 	\'			작은 따옴표
		 * 	\"			큰 따옴표
		 * 	\\			역슬래쉬 표시
		 * 
		 * */
		
		/* 개행문자 */
		System.out.println("안녕하세요. \n저는 홍길동이랍니다");
		
		/* 탭 문자 */
		System.out.println("안녕하세요. \t저는 홍길동이랍니다");
		
		/* 홑 따옴표 */
		System.out.println("안녕하세요. 저는 '홍길동'입니다."); //큰 따에 작 따 는 가능
		
//		System.out.println('''); // 홑따옴표 문자와 문자 리터럴 기호가 중복
		System.out.println('\'');
		
		/* 쌍 따옴표 문자*/
//		System.out.println("안녕하세요 저는 "홍길동" 입니다 ");
		System.out.println("안녕하세요 저는 \"홍길동\" 입니다 ");
	
		
		/*
		 * 이스케이프 문자 사용안하는 특수문자 
		 * ~ ` ! @ # % $ - _ = ; : ' \ " , < > /
		 * 
		 * 이스케이프 문자를 사용하는 특수문자(\\)
		 * $ ^ * ( ) + | { } [ ] . ? 
		 * 
		 * */
		
		String str = "java/oracle/jdbc";
		String[] sarr = str.split("/");
		
		for(String s : sarr) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
