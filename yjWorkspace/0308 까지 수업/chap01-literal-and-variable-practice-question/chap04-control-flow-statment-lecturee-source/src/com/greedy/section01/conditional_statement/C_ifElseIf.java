package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class C_ifElseIf {
	
	/**
	 * <pre>
	 * 단독 if-else-if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * 
	 * </pre>
	 * 
	 */
	public void testSimpleIfElseIfStatement() {
		
		/*
		 * [if-else-if문 표현식]
		 * if(조건식1) { 
		 * 		조건식1이 true일 때 실행할 명령문;
		 * } else if (조건식2) {
		 *  	조건식 1이 false 이고 조건식2가 true일 때 실행할 명령문;
		 * } else {
		 * 		위의 조건 2개가 모두 거짓일 경우 실행할 명령문;
		 * }
		 * 
		 *  * 여러 개의 조건을 제시하여 그 중 한 가지를 반드시 실행 시키고 싶은 경우 사용한다.
		 * 
		 */
		
		System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
		System.out.println("연못에서 산신령이 나타나 금도끼 , 은도끼, 쇠도끼를 들고 나타났다.");
		System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");
		
		System.out.println("어느 도끼가 너의 도끼이냐? (1. 금도끼 2. 은도끼 3. 쇠도끼) : ");
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		int answer = sc.nextInt();
		
		if(answer == 1) { // 대답한 내용이 1번 (금도끼 인지) 확인하는 조건식
			
			System.out.println("이런 거짓말쟁이 !! 너에게는 아무런 도끼도 줄 수 없구나!! 이 욕심쟁이!!");
		
		} else if(answer ==2) { // 대답한 내용이 2번 (은도끼 인지) 확인하는 조건식
			
			System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고있구나 !! 어서 썩 사라지거라!!");
			
		} else {
			
			System.out.println("오호~ 정직하구나~ 여기있는 도끼 다 가져가거라!!");
		}
		// 대답 여부와 상관없이 마지막에 실행하는 출력문
		System.out.println("그렇게 산신령은 다시 연못 속으로 사라지고 말았다.");
		
		sc.close();
		//public void testSimpleIfElseIfStatement() 메소드 끝
	}

	
	/**
	 * <pre>
	 * 중첩 if-else-if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * 
	 * </pre>
	 */
	public void testNestedIfElseIfStatement() {
		
		// 중첩된 if-else-if문 실행 흐름 확인
		// 이프엘스이프 문 안에서 또다른 조건을 사용하여 if or if-else or if-else-id문 사용가능
		
		// greedy 대학의 유승제 교수님은 학생들 시험 성적을 수기로 계산하여 학점 등급을 매기는 채점 방식을 사용하고 있다.
		/*
		 * 90점 이상 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D
		 * 60점 미만인 경우에는 F 학점 부여.
		 * 추가로, 각 등급의 중간점수 (95,85,75...)인 경우 '+' 를 붙여서 등급을 세분화 한다.
		 * 그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름을 입력 : ");
		String name = sc.nextLine();
		System.out.println("당신의 점수를 입력 : ");
		int myScore = sc.nextInt();
		
		String grade = ""; // 지역이며 전역 변수 //지역도 누군가에겐 전역이다..
		// TODO "" 이거 왜 선언한거지...
		
		if(myScore >= 90) {
			
			grade = "A"; //점수가 90점 이상인 경우
			
			//등급이 A등급인데 +가 붙을 자격이 있는지 다시확인
			if(myScore >= 95) {
				grade += "+";
			}
			
		} else if (myScore >=80) {
			grade = "B";
			
			if(myScore >= 85) {
				grade += "+";
			}
			
		} else if (myScore >= 70) {
				grade = "C";
			
			if(myScore >= 75) {
				grade += "+";
			}
			
			
		} else if (myScore >= 60) {
				grade = "D";
			
			if(myScore >= 65) {
				grade += "+";
			}
			
		} else {
			grade = "F";
			
		}
		
		System.out.println(name + "학생의 점수는 " + myScore + " 이고, 등급은 " + grade+ " 입니다.");
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
		
		if (myScore % 10 >= 5 && myScore >= 60) {
			grade += "+";
		} // 추가;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
