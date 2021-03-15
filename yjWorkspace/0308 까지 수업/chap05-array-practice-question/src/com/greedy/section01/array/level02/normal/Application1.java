package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
		 * 검색할 문자를 하나 입력 받아 
		 * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 문자열을 하나 입력하세요 : helloworld
		 * 검색할 문자를 입력하세요 : l
		 * 
		 * -- 출력 예시 --
		 * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력 : ");
		String moonJa = sc.nextLine();
		
		
		
		
		System.out.print("검색할 문자 입력 : ");
		String serch = sc.next();
//		System.out.println("검색할 문자 입력 : ");
//		char c = sc.next().charAt(0);
		
		char[] ch = new char[moonJa.length()];
		
//		char[] ch1 = moonJa.toCharArray();
//		System.out.println("======");
//		System.out.println(ch1);
		
		//입력받은 문자열의 길이만큼 방 생성
		
		char[] sch = new char[serch.length()];
		


		int count = 0;
		
		for(int i = 0; i < moonJa.length(); i++) {
			
			ch[i] = moonJa.charAt(i);
			
			sch[0] = serch.charAt(0);
			
			
			if (ch[i] == sch[0]) {
				count++;
			}
			
		}
		System.out.println("입력하신 문자열 " + moonJa + " 에서 찾으신 문자 " + serch + " 는 " + count + " 개 입니다");
		
		
	}

}
