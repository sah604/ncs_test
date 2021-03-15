package com.greedy.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
		 * 
		 * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
		 * 지폐외 동전을 구분하여 단위를 표기하세요
		 * 
		 * -- 입력 예시 --
		 * 받으신 금액을 입력하세요 : 100000
		 * 상품 가격을 입력하세요 : 22340
		 * 
		 * -- 출력 예시 --
		 * ============================
		 * 50000원권 지폐 1장
		 * 10000원권 지폐 2장
		 * 5000원권 지폐 1장
		 * 1000원권 지폐 2장
		 * 500원권 동전 1개
		 * 100원권 동전 1개
		 * 50원권 동전 1개
		 * 10원권 동전 1개
		 * ============================
		 * 거스름돈 : 77660원
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 받으신 가격 입력 : ");
		int money = sc.nextInt();
		
		System.out.print(" 상품가격 : ");
		int price = sc.nextInt();
		
		int change = money - price; //거스름돈
		int change2 = money - price;
		
		//===============================
		int currency = 50000;
		int mok = 0;
		int nmg = 0;
		int sw = 0;
		int temp = change;
		
		while(true) {
			mok = temp / currency;
			nmg = temp % currency;
			
			if(mok == 0 && nmg ==0) {
				break;
			}
			
			
			
			
		}
		
		
		
		
		
		
		//=================================
		
		int fiveMiliWonCount = 0;
		
		int miliWonCount = 0;
		
		int oChenWonCount = 0;
		
		int ChenWonCount = 0;
		
		int fiveBeakWonCount = 0;
		
		int beakWonCount = 0;
		
		int oSibWonCount = 0;
		
		int sibWonCount = 0;
		
		System.out.println("====================================");
		while(50000 <= change) {
			
			fiveMiliWonCount++;
			change = (change - (50000));
			
			
		}System.out.println("50000원권 지폐 " + fiveMiliWonCount + "장");
		
		while(10000 <= change) {
			miliWonCount++;
			change = (change - (10000));
			
			
		}System.out.println("10000원권 지폐 " + miliWonCount + "장");
		
		while(5000 <= change) {
			oChenWonCount++;
			change = (change - (5000));
			

		}System.out.println("5000원권 지폐 " + oChenWonCount + "장");
		
		while(1000 <= change) {
			ChenWonCount++;
			change = (change - (1000));
			
		}System.out.println("1000원권 지폐 " + ChenWonCount + "장");
		
		while(500 <= change) {
			fiveBeakWonCount++;
			change = (change - (500));
			
		}System.out.println("500원권 동전 " + fiveBeakWonCount + "개");
		
		while(100 <= change) {
			beakWonCount++;
			change = (change - (100));
			
		}System.out.println("100원권 동전 " + beakWonCount + "개");
		
		while(50 <= change) {
			oSibWonCount++;
			change = (change - (50));
			
		}System.out.println("50원권 동전 " + oSibWonCount + "개");
		
		while(10 <= change) {
			sibWonCount++;
			change = (change - (10));
			
		}System.out.println("50원권 동전 " + sibWonCount + "개");
		
		System.out.println("==============================");
		System.out.println("거스름돈 : " + change2 + " 원 ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
