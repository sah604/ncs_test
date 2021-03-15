package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class C_ifElseIf {
	
	/**
	 * <pre>
	 * 	단독 if-else-if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * </pre>
	 */
	public void testSimpleIfElseIfStatement() {	//	메소드 생성
		
		/*
		 * [if-else-if문 표현식] 
		 * if(조건식1) {
		 * 		조건식1이 true 일 때 실행할 명령문;
		 * } else if(조건식2) { 
		 * 		조건식1이 false이고, 조건식2가 true 일 때 실행할 명령문;
		 * } else {
		 * 		위 조건 2개가 모두 거짓일 경우 실행할 명령문;
		 * }
		 * 
		 * 	* 여러 개의 조건을 제시해서 그 중 한가지를 반드시 실행시키고 싶은 경우 사용한다.
		 */
		
		System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
		System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
		System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");
		
		System.out.println("어느 도끼가 너의 도끼이니? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		
		
		if(answer == 1) { // 대답한 내용이 금도끼인지 확인하는 조건식 // TODO == 부분 공부
			
			System.out.println("이런 거짓말쟁이! 너에게는 아무런 도끼도 줄 수 없구나! 이 욕심쟁이!");
			
		} else if(answer == 2) { // 대답한 내용이 은도끼인지 확인하는 조건식
			
			System.out.println("욕심이 과하지는 않지만 그래도 너는 거짓말을 하고 있구나! 어서 썩 사라지거라.");
			
		} else { // 대답한 내용이 쇠도끼인지 확인하는 조건식
			
			System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라~");
			
		}
		
		// 대답 여부와 상관없이 마지막에 실행하는 출력문
		System.out.println("그렇게 산신령은 다시 연못 속으로 사라지고 말았다...");
		
		sc.close();
		
	}
	
		
	/**
	 * <pre>
	 *  중첩 if-else-if 구문 흐름을 확인하기 위한 용도의 메소드
	 * </pre>
	 */
	public void testNestedIfElseIfStatement() {
		
		// 중첩된 if-else-if문 실행 흐름 확인
		// if-else-if문 안에서 또 다른 조건을 사용하여 if or if-else or if-else-if문을 사용할 수 있다.
		
		/* greedy 대학의 유xx 교수님은 학생들 시험 성적을 수기로 계산에서 학점 등급을 매기는 채점방식을 사용하고 있었다.
		* 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C'. 60점 이상이면 'D'를,
		* 60점 미만인 경우에는 'F'를 학점 등급으로 하는 기준이다.
		* 추가로 각 등급의 중간점수(95, 85, 75......)인 경우, '+'를 붙여서 등급을 세분화 하다보니 신경쓸것이 많았다.
		* 그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
		*/
		
		// 내가 해본 것 TODO
		
		//System.out.print("학생의 이름을 입력하세요. : ");
		//Scanner sc = new Scanner(System.in);
		//String str1 = sc.nextLine();
		
		//System.out.println("점수를 입력하시오.");
		//int score = sc.nextInt();
	
		//if(score >= 90) {
			//if(score >= 95)
				
				
		// 강사님 - 학생의 이름과 점수 입력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요. : ");
		String name = sc.nextLine();
		System.out.print("학생의 점수를 입력하세요. : ");
		int point = sc.nextInt();
		
		String grade = "";	//	지역변수이면서 전역변수(아래에서는 전역)
		
		if(point >= 90) {	//	TODO 조건이 충족되거나 혹은 만족되지 않으면 이하 구문은 실행X
				
			//점수가 90점 이상인 경우
			grade = "A";
			
			//등급이 A등급인데 +가 붙을 자격이 있는지를 다시 확인
			if(point >= 95) {
				
				grade += "+";
				
			}
			
			
		} else if(point >= 80) {
			
			grade = "B";
			
			if(point >= 85) {
				
				grade += "+";
				
			}
		
		} else if(point >= 70) {
			
			grade = "C";
			
			if(point >= 75) {
				
				grade += "+";
				
			}
					
		} else if(point >= 60) {
			
			grade = "D";
			
			if(point >= 65) {
				
				grade += "+";
				
			}
			
			
		} else {
			
			grade = "F";
			
		}
		
		System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		// 다른 방식 (+ 추가)
		
		
		System.out.print("학생의 이름을 입력하세요. : ");
		String name1 = sc.nextLine();
		System.out.print("학생의 점수를 입력하세요. : ");
		int point1 = sc.nextInt();
		
		String grade1 = "";	//	지역변수이면서 전역변수(아래에서는 전역)
		
		if(point >= 90) {
				
			//점수가 90점 이상인 경우
			grade1 = "A";
			
		} else if(point >= 80) {
			
			grade1 = "B";
		
		} else if(point >= 70) {
			
			grade1 = "C";
			
					
		} else if(point >= 60) {
			
			grade1 = "D";
				
			
		} else {
			
			grade1 = "F";
			
		}
		
		if((point % 10) >= 5 && point >= 60) {
			
			grade += "+";
			
		}
		
		System.out.println(name1 + " 학생의 점수는 " + point1 + "이고, 등급은 " + grade1 + "입니다.");
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
		
	}
	

}
