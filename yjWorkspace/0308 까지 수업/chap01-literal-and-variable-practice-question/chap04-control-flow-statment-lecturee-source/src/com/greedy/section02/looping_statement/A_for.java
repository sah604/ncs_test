package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class A_for {
	
	/**
	 * <pre>
	 * 단순 for문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * </pre>
	 */
	public void testSimpleForStatement() {
		/*
		 * [for문 표현식]
		 * 
		 * for(초기식; 조건식; 증감식;) {
		 * 		조건을 만족하는 경우 실행할 구문 (반복할 구문);
		 * }
		 * 
		 */
		/* 1부터 10까지 1씩 증가 시키면서 i 값을 출력하는 기본 반복문 */
		for(int i = 1; i <=10; i++) {
			System.out.println(i);
		}
	}

	public void testForExample1() {

		
		// 10 명의 학생이름을 입력받아 이름을 출력 해보자
		
		/*
		System.out.print("1 번째 학생의 이름을 입력해 주세요 : ");
		String student1 = sc.nextLine();
		System.out.println(" 번째 학생의 이름은 : " + student1 + " 입니다.");
		
		System.out.print("2 번째 학생의 이름을 입력해 주세요 : ");
		String student2 = sc.nextLine();
		System.out.println("2 번째 학생의 이름은 : " + student2 + " 입니다.");
		
		System.out.print("3 번째 학생의 이름을 입력해 주세요 : ");
		String student3 = sc.nextLine();
		System.out.println("3 번째 학생의 이름은 : " + student3 + " 입니다.");
		
		System.out.print("4 번째 학생의 이름을 입력해 주세요 : ");
		String student4 = sc.nextLine();
		System.out.println("4 번째 학생의 이름은 : " + student4 + " 입니다.");
		
		System.out.print("5 번째 학생의 이름을 입력해 주세요 : ");
		String student5 = sc.nextLine();
		System.out.println("5 번째 학생의 이름은 : " + student5 + " 입니다.");
		
		System.out.print("6 번째 학생의 이름을 입력해 주세요 : ");
		String student6 = sc.nextLine();
		System.out.println("6 번째 학생의 이름은 : " + student6 + " 입니다.");
		
		System.out.print("7 번째 학생의 이름을 입력해 주세요 : ");
		String student7 = sc.nextLine();
		System.out.println("7 번째 학생의 이름은 : " + student7 + " 입니다.");
		
		System.out.print("8 번째 학생의 이름을 입력해 주세요 : ");
		String student8 = sc.nextLine();
		System.out.println("8 번째 학생의 이름은 : " + student8 + " 입니다.");
		
		System.out.print("9 번째 학생의 이름을 입력해 주세요 : ");
		String student9 = sc.nextLine();
		System.out.println("9 번째 학생의 이름은 : " + student9 + " 입니다.");
		
		System.out.print("10 번째 학생의 이름을 입력해 주세요 : ");
		String student10 = sc.nextLine();
		System.out.println("10 번째 학생의 이름은 : " + student10 + " 입니다.");
		
		*/
	
		Scanner sc = new Scanner(System.in);

	// 반복해야 하는 내용
	// 1. 학생이름 입력 받아 변수에 저장
	// 2. 안내문구출력
	// 3. 저장된 이름을 출력
	//
	// 반복횟수 1부터 10까지 1씩증가
	
	for (int i = 1; i <= 10; i++ ) {
		System.out.print(i + " 번째 학생의 이름을 입력 : ");
		String student = sc.nextLine();
		System.out.println(i + " 번째 학생의 이름은 : " + student + "입니다");
	}
	
	System.out.println(" 10 명의 학생이름 입출력 기능 완료");
	
	sc.close();

	
 }
	
	public void testForExample2() {
		
		// 1 ~ 10 까지의 합계를 구하시오
		
		// 1 부터 10 까지를 변수에 저장
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;
		int num9 = 9;
		int num10 = 10;
		
		// 결과를 누적시켜 담아줄 변수
		int sum = 0;
		
		// sum에  변수의 값을 하나씩 담기
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		sum += num6;
		sum += num7;
		sum += num8;
		sum += num9;
		sum += num10;
		
		System.out.println("sum : " + sum);
		
		// 무엇을 반복하면 좋을까나?
		// 일정하게 증가하는 값
		// 저장된 값을 sum에 누적시키기
		
		int sum2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			sum2 += i;
		}
		
		System.out.println("sum2 : " + sum2);
		
		
		
		
		
		
		
		
		
	}

	public void testForExample3() {
		
		// 5 ~ 10 사이의 난수를 발생시켜 1부터 발생한 난수 까지의 합계를 구해보자. 
		
		int random = (int) (Math.random() * 6) +5;
		
		int result = 0;
		
		System.out.println("random : " +random);
		
		for(int i = 1 ; i <= random ; i++ ) {
			result += i;
		}
		System.out.println("1부터 난수 까지의 합계 : " + result);
	}

	public void testForExample4() {
		
		// 숫자 2개를 입력 받아 작은 수에서 큰수 까지의 합계를 구하세요
		// 단, 두 숫자는 같은 숫자를 입력하지 않는 다는 가정으로.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 첫 번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println(" 두 번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		int maxNum = Math.max(num1, num2);
		int minNum = Math.min(num1, num2);
		
		int result = 0;
		
		for ( int min  = minNum ; min <= maxNum ; min++) {
			
			result += min;
		}
		System.out.println("두 수중 작은수 에서 큰 수까지의 합은 : " + result);
		
		
	}

}

