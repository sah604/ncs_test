package com.greedy.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 2보다 큰 정수를 하나 입력 받아 그 수가 소수인지 아닌지를 판별해서 출력하세요
		 * 소수인 경우 "소수다." 출력, 소수가 아닌 경우 "소수가 아니다." 출력
		 * 
		 * 단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요." 라고 출력 후
		 * 정수를 다시 입력 받을 수 있도록 한다. 
		 * 
		 * 소수란?
		 * 어떤 수를 1부터 자기 자신까지 차례대로 나누었을 때
		 * 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수를 소수라고 한다.
		 *
		 * 
		 * -- 입력 예시 --
		 * 2보다 큰 정수를 하나 입력하세요 : 7
		 * 
		 * -- 출력 예시 --
		 * 소수다.
		 * */
		//
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2보다 큰 정수 하나 입력  : ");
		int numInput = sc.nextInt(); 
		
		int left = 1;
		
		String str = "";
		

		if(numInput > 2){
			for(int i = 1; i < numInput; i++) {     
				                                    //여기서 소수를 찾아야댐. 1부터 num의 최대값까지 나누어서 1과 num의 값만 나오는경우 //  
				if (numInput % i == 0) {                 // 여기선 나눈 나머지가 0일 때 소수가 아닌거 잖아여. 근데 5%2 = 2| 1 나머지가 0이 아님. 그래서 원래 소수인데 1라서  소수라고뜸 
					left ++;     
					
					}
				
			}
			
			if(left > 2) { // 입력받은 수를 1부터 입력받은 수 까지 차례대로(자신 + 1 = 2, 그래서 2보다 클때) 나누었을때 나머지가 0인 수 가(i) 3 이상 일때 소수가 아니다 3보다 작으면 (2개, 자신과 1만 있을경우) 소수다!
			System.out.println("소수가 아니다");                 // 15의 경우 1,3,5,15
			}else {                                           // 9일 경우 1,3,9             // 5일경우 1,5 
				System.out.println("소수이다");
			}
			
			}else {
			System.out.println("다시입력");
		}
		
		
	
		//15 / 2이일때도 나머지가 1임. 그래서 소수다 라고뜸
		/*
		System.out.print("2보다 큰 정수를 하나 입력하시오 : ");
		
	      int num = sc.nextInt();
	      
	      if(num <= 2) {
	         
	         System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
	         
	      } else if(num == 3) {
	         
	         System.out.println("소수다.");
	         
	      } else if(num % 2 == 0) {
	         
	         System.out.println("소수가 아니다.");
	                  
	      } else if(num % 3 == 0) {
	         
	         System.out.println("소수가 아니다.");
	         
	      } else {
	         
	         System.out.println("소수다.");
	         
	      }*/
	      
		// 만약 입력하는 수가 4
		// 1회차 4 % 2 == 0 - 체크 = 펄스
		// 2호회차는 건너뜀
	      

		
		
		
		
	}
}
