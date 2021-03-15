package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class A_for {
	
	/**
	 * <pre>
	 * 	단순 for문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * </pre>
	 */
	public void testSimpleForStatement() {
		
		/*
		 * [for문의 표현식]
		 *
		 * for(초기식; 조건식; 증감식) {
		 * 		조건을 만족하는 경우 수행할 구문(반복할 구문);
		 * }
		 *
		 */
		
		// TODO 기초틀 공부
		/* 1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 출력문 */
		for(int i = 1; i <= 10; i++) {
		
			System.out.println(i);
			
		}
		
		
	}
	
	public void testForExample1() {
		
		// 10명의 학생 이름을 받아 이름을 출력해보자
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 학생의 이름을 입력해주세요 : ");
		String student1 = sc.nextLine();
		System.out.println("1번째 학생의 이름은 : " + student1);
			
		System.out.print("2번째 학생의 이름을 입력해주세요 : ");
		String student2 = sc.nextLine();
		System.out.println("2번째 학생의 이름은 : " + student2);
		
		System.out.print("3번째 학생의 이름을 입력해주세요 : ");
		String student3 = sc.nextLine();
		System.out.println("3번째 학생의 이름은 : " + student3);
		
		System.out.print("4번째 학생의 이름을 입력해주세요 : ");
		String student4 = sc.nextLine();
		System.out.println("4번째 학생의 이름은 : " + student4);

		System.out.print("5번째 학생의 이름을 입력해주세요 : ");
		String student5 = sc.nextLine();
		System.out.println("5번째 학생의 이름은 : " + student5);
		
		System.out.print("6번째 학생의 이름을 입력해주세요 : ");
		String student6 = sc.nextLine();
		System.out.println("6번째 학생의 이름은 : " + student6);
		
		System.out.print("7번째 학생의 이름을 입력해주세요 : ");
		String student7 = sc.nextLine();
		System.out.println("7번째 학생의 이름은 : " + student7);
		
		System.out.print("8번째 학생의 이름을 입력해주세요 : ");
		String student8 = sc.nextLine();
		System.out.println("8번째 학생의 이름은 : " + student8);
		
		System.out.print("9번째 학생의 이름을 입력해주세요 : ");
		String student9 = sc.nextLine();
		System.out.println("9번째 학생의 이름은 : " + student9);
		
		System.out.print("10번째 학생의 이름을 입력해주세요 : ");
		String student10 = sc.nextLine();
		System.out.println("10번째 학생의 이름은 : " + student10);
		
		// TODO
		// 반복해야 하는 내용
		// 1. 안내문구의 서수 출력
		// 2. 학생이름 받아서 변수에 저장
		// 3. 저장된 이름 출력

		// 고려해야할 요소
		// 1. 반복 횟수
		// 2. 시작, 종료 숫자
		// 3. 증가할 수치
		// -> 1부터 10까지 씩 증가
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
			String student = sc.nextLine(); // 반복문이기 때문에 입력값을 받고 저장하게 설정하면 자동으로 반복수행함
			System.out.println(i + "번째 학생의 이름은 : " + student + "입니다.");
		}
		
		System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다.");
	
		sc.close();
		
	}
	
	public void testForExample2() {
		
		// 1 ~ 10까지의 합계를 구하시오
		
		// 1부터 10까지를 변수에 저장
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
		
		// TODO 결과를 누적시켜 담아줄 변수
		int sum = 0; // 보통 int는 0을 기본 값으로 초기화를 함
		
		// sum에 변수의 값을 하나씩 담기
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
		
		System.out.println("sum = " + sum);
		
		// 무엇을 반복하면 좋을까
		
		// 반복해야 할 내용
		// 변수에 1씩 증가하는 값 담기
		// 저장된 값을 sum에 누적시키기
		
		// 반복 횟수 및 시작할 숫자? 1부터 10까지 10번 반복
		
		int sum2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			sum2 += i;
			
		}
		
		System.out.println("sum2 : " + sum2);

	}
		
	public void testForExample3() {	
		
	// 5 ~ 10 사이의 난수를 발생시켜서 1부터 발생한 난수까지의 합계를 구해보자
	// TODO 못풀겠다 이거 공부해라 강현우 
		
	int random = (int) (Math.random() * 6 + 5 ) ;
		
	int sum3 = 0;
	
	for(int i = 1; i <= random; i++) {
		
		sum3 += i;
		
	}
	
	System.out.println("1부터 " + random + "까지의 합은 : " + sum3);
	
	}

	public void testForExample4() {
		
		// 숫자 두 개를 입력 받아 작은 수에서 큰수까지의 합계를 구하세요.
		// 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결해본다.
		
		// TODO int min = Math.min, max 선언해서
		// 

		// 내 풀이법
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("숫자 하나를 더 입력해주세요 : ");	// TODO 강사님 풀이 참고
		int num2 = sc.nextInt();
														// 여기서 sum을 선언
		if(num1 > num2) {								
			
			for(int i = num2; num2 < num1; num2++) {	// for(int i = num2; i <= num1, i++)
				
				num2 += num2;							// sum += i
				
				System.out.println("입력하신 숫자 중 작은 숫자부터 큰 숫자까지의 합은 " + num2 + "입니다.");
			
			}
			
			
		} else {
				
			for(int i = num1; num1 < num2; num1++) {
					
				num1 += num1;
					
				System.out.println("입력하신 숫자 중 작은 숫자부터 큰 숫자까지의 합은 " + num2 + "입니다.");
			}
			
		}
		
		
		//sc.close();
		
		// 더 큰 값과 작은 값을 저장할 변수 선언 (다른 풀이법)
		int min = 0;
		int max = 0;
		
		if(num1 > num2) {
			
			min = num2;
			max = num1;
			
		} else {
			
			min = num1;
			max = num2;
			
		}	//	최소값, 최대값이 구분되면 반복문을 1회만 작성하면 된다.
		
		int sum2 = 0;
		
		for(int i = min; i <= max; i++) {
		
			sum2 += i;
			
		}
		
		System.out.println("");	// TODO 아직 완성 안함
			
	}
	
	
	public void printSimpleGugudan() {
		
		/* 키보드로 2~9 사이의 구구단을 입력받아
		* 2~9 사이인 경우 해당 단의 구구단을 출력하고,
		* 그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해야 합니다." 출력
		* 
		* 출력값 예시
		* 5 * 1 = 5
		* 5 * 2 = 10
		* 5 * 3 = 15
		* 5 * 4 = 20
		* 5 * 5 = 25
		* 5 * 6 = 30
		* 5 * 7 = 35
		* 5 * 8 = 40
		* 5 * 9 = 45
		* 
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========= 구구단 =========");
		System.out.println(" 2부터 9까지의 값을 입력하세요 ");
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int dan = sc.nextInt();
		
		if (dan < 2 && dan > 9) {
			
			System.out.println("반드시 2~9 사이의 양수를 입력해야 합니다.");
			
		} else {
			
			for(int i = 1; i <= 9; i++) {
				
				System.out.println(dan + " * " + i + " = " + (dan * i));
				
			}
			
			
			
		}
		
		
		sc.close();
		
		
		
	}
	
	
	
	
	
}
