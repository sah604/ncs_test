package com.greedy.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요
		 * 
		 * 참고) 문자열의 길이는 String 클래스의 length() 메소드를 이용할 수 있습니다.
		 * 
		 * -- 입력 예시 --
		 * 문자열을 입력하세요 : apple
		 * 
		 * -- 출력 예시 --
		 * 0 : a
		 * 1 : p
		 * 2 : p
		 * 3 : l
		 * 4 : e
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 문자열을 입력해주세여 : "); //츨려
		
		String str = sc.nextLine();
		
		
		for(int i = 0; i < str.length(); i++) { // 입력받은 문자열의 최대길이 수 까지 실행한다.
			
			char ch = str.charAt(i); // char 을 선언해주고 입력받은 문자열의 i 번째 (0)부터 시작
			// 만약, str 의 값이 5라고 치면 lenght 1~5 까지 값을 가지게 되는데, charAt 는 0부터 시작이잖아. 그래서 0 ~ 4 의 방을 가지고 있었습니다.
			// 왜? lenght 은 입력받은 글자의 갯수가 총 몇개인지. 1부터 시작하겠죠?
			// 하지만 인덱스 에서는 0부터 시작하기 때문에
			// 안 녕 하 세 요
			// 0  1 2  3  4 = charAt
			//              lenght가 어차피 i 가 0부터 시작하기 때문에 길이가 같아진다 라는 뜻이져ㅛ?
			// 
			System.out.println(i + " : " +ch);
			
			//1. i = 0 
			// 0 + : + 안
			// 1 + : + 녕
			
		}
		sc.close();
	}
}
