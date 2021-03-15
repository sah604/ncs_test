package com.greedy.section02.uses;

import java.util.Scanner;

public class Application {
	/*
	 * 객체배열은 동일한 타입의 여러개의 인스턴스를 인자로 전달하거나 리턴받는
	 * 경우에도 객체 배열을 이용할 수 있다.
	 * 
	 * */
	/*
	 * VO를 활용한 간단한 회원 관리용 프로그램
	 * 구현기능
	 * 1. 여러명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
	 * 2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MemberManager memberManager = new MemberManager();
		
		menu: // 이름 지정해주기
		while(true) {
			System.out.println("===== 회원 관리 프로그램 =====");
			System.out.println("1. 회원 등록 ");
			System.out.println("2. 회원 전체조회");
			System.out.println("9. 프로그램 선택");
			
			System.out.print("메뉴선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : memberManager.signMember(); // 브레이크 = 가장 가까원 { } 를 나감.
			case 2 : memberManager.printAllMembers();  break;
			case 9 : System.out.println("프러그램을 종료합니다."); break menu;
			default : System.out.println("잘못된 번회 입력"); break;
			}
		}
		
		sc.close();
	}

}
