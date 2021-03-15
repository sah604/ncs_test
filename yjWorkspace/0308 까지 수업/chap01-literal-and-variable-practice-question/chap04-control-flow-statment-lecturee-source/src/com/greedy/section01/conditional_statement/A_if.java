package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class A_if {
	
	
	/**
	 * <pre>
	 * 단독 if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * 정수 짝수 여부 판단 확인용
	 * </pre>
	 */
	public void testSimpleIfStatemant() {
		/*
		 * [if문 표현식]
		 * if(조건식) {
		 * 		조건식이 true일 때 실행할 명령문:
		 * }
		 * 
		 * 조건식 : true or false가 나오는 연산식을 조건식이라고 한다. 
		 * 
		 * if문은 (조건식)의 결과 값이 참(true)이면 { } 안에 있는 코드를 실행하고,
		 * 조건식의 결과 값이 거짓(false) 라면 { } 안에 있는 코드를 무시하고 넘어간다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한개를 입력 하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			
			System.out.println("입력하신 숫자는 짝수 입니다.");
			
		}
		System.out.println("프로그램을 종료합니다. ");
		
		sc.close();
		
	}
	
	
		/**
		    * <pre>
		    *    중첩 if 구문 흐름을 확인하기 위한 용도 메소드.
		    *    양의 정수 짝수인지 여부 판단 확인
		    * </pre>
		    * 
		    */
		   public void testNestedIfStatement() {
		      
		      // 중첩된 if문 실행 흐름 확인
		      // if문 안에서 또 다른 조건을 사용하여 if문을 사용할 수 있다.
		      
		      Scanner sc = new Scanner(System.in);
		      
		      /*
		       * 정수 한개를 입력 받아 그 수가 양수인 경우에만 짝수 인지를 확인햐여 짝수 이면
		       * "입력하신 숫자는 양수이면서 짝수입니다 " 라고 출력
		       * 둘 중 하나라도 해당하지 않으면 아무내용도 출력하지 않는 구문
		       * 
		       * */
		      
		      System.out.print("숫자를 한 개 입력하세요 : ");
		      int num = sc.nextInt();
		      
		      // 양수인지 조건 확인
		      if(num > 0) { // 참이면 짝수인지 여부를 확인하러 간다.  
		    	
		    	  // 양수가 맞으면 다시한번 짝수인지 확인
		    	  if (num % 2==0) {
		    		  System.out.println("입력하신 숫자는 양수이면서 짝수입니다");
		    	  }
		      }
		      
		      System.out.println("프로그램을 종료합니다.");
		
		sc.close();
		
	}

}
