package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application2 {
	public static void main(String[] args) {
		
		// * Scanner의 nextLine()과 next()
		/*
		 * nextLine() : 공백을 포함한 한 줄 입력을 위한 개행문자 전 꺼정 문자열로 반환한다. (공백문자 포함)(엔터 치기 전까지 모든문자를 받겠따)
		 * 
		 * next() : 공백문자나 개행문자 전 까지를 읽어서 문자열로 반환 (공백문자 포함하지 않는다) (띄어쓰끼나 엔터 치기 전까지의 문자열)
		 * 
		 */
		
		// 1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in); //static 은 기울어져 있다.
		
		// 2. 문자열 입력
		// 2-1. nextLine()
		System.out.print("인사말을 입력 : ");
		String greeting1 = sc.nextLine(); // 안녕 반갑
				
		System.out.println(greeting1);
		
		// 2-2. next()
		System.out.println();
		System.out.print("인사말을 입력해주세야 : ");
		String greeting2 = sc.next();
		
		System.out.println(greeting2);
		// "문자열" 자체가 String 클래스 그 자체이다. "문자열". 하면 String 클래스의 메소드가 뜨게된다.?
		
		sc.close(); // 로 마무리@@@@@@@@@@@@@@
		
	}

}
