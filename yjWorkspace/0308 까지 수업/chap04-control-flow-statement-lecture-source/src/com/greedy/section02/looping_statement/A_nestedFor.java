package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class A_nestedFor {
	
	
	/**
	 * <pre>
	 * 	중첩 for문을 이용한 구구단 2단부터 9단까지 출력
	 * </pre>
	 */
	public void printGugudanFromTwoToNine() {
		
		for(int dan = 2; dan < 10; dan++) {
			
			for(int su = 1; su < 10; su++) {
				
				System.out.println(dan + " * " + su + " = " + (dan * su));
				
			}
			
			// 하나의 단이 출력되고 나면 한줄을 띄운다.
			System.out.println();
			
		}
		
		
	}
	
		
	/**
	 * <pre>
	 *	중첩 for문을 이용한 구구단 2단부터 9단까지 출력을 개선
	 * </pre>
	 */
	public void printUpgradeGugudanFromTwotoNine() {
		
		for(int dan = 2; dan < 10; dan++) {
			
			/* 한 단씩 구구단을 출력하는 메소드를 호출하며 인자로 단을 전달한다 */
			printGugudanOf(dan);	//	출력 메소드를 생성하여 밖으로 뺌
			System.out.println();	//	한 단이 끝난 뒤 줄바꿈
			
		}
		
	}
	
	/**
	 * <pre> 
	 *	매개변수로 전달받은 구구단을 출력한다.
	 * </pre>
	 * 
	 * @param dan
	 */
	public void printGugudanOf(int dan) {	//	메소드 생성 + 매개변수 받아오기
		
		for(int su = 1; su < 10; su++) {
			System.out.println(dan + " * " + su + " = " + (dan * su));
			
		}
		
	}
	
	
	
	/**
	 * <pre>
	 * 	키보드로 입력받은 정수만큼의 행만큼 별을 출력하는 메소드
	 * </pre>
	 */
	public void printStarInputRowTimes() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 핼 수를 입력하세요 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			
			for(int j = 1; j < 6; j++) {
				
				System.out.print("*");	// print는 옆(행)으로, println은 아래(열)로 출력
				
			}
			
			System.out.println("");
			
		}
		
		sc.close();
		
	}
	
	
	/**
	 * <pre>
	 * 	키보드로 입력 받은 정수만큼의 행만큼 별을 삼각형 모양으로 출력
	 * '
	 * ''
	 * '''
	 * ''''
	 * '''''
	 * </pre>
	 */
	public void printTriangleStarts() {
		
		// 출력할 줄 수 입력
		System.out.print("출력할 줄 수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		} 
		
		sc.close();
		
	}
	
	
	
	
}
