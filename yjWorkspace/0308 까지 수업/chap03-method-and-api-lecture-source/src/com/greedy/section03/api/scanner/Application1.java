package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application1 {
	public static void main(String[] args) {
		
		// java.util.Scanner를 이용한 다양한 자료형 값 입력받기
		
		// 1. Scanner 객체 생성
		
		// 1-1. Scanner 객체 생성(import 제외)
		//java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
		
		// 1-2. java.lang 패키지는 생략 가능 하니까~
		//java.util.Scanner sc = new java.util.Scanner(System.in);
	
		// 1-3. 다른 패키지에 있는 클래스 사용시 패키지명 생략하기 위해 사용하는 구문 (import)
		Scanner sc = new Scanner(System.in);
		
		
		// 2. 자료형별 값 입력 받기
		// 2-1. 문자열 입력 받기
		System.out.print("이름을 입력 하세요 : ");
		String name = sc.nextLine();
		System.out.println("입력하신 이름은  " + name + " 입니다.");
		
		// 2-2. 정수형 값 입력 받기
		// * nextInt(): 입력받은 값을 int형으로 반환한다.
		System.out.print("나이를 입력 하세요 : ");
		int age = sc.nextInt();
		System.out.println("입력하신 나이는 : " + age + " 입니다.");
		
		// * nextLong() : 입력받은 값을 Long 형으로 반환한다.
		System.out.print("금액을 입력해 주세요 : ");
		long money = sc.nextLong();
		System.out.println("입력하신 금액은 : "+ money + " 원 입니다.");
		
		
		// 2-3. 실수형 값 입력 받기
		// * nextFloat() : 입력받은 값을 float 형으로 반환한다.
		System.out.print("키를 입력해주세요 : ");
		float height = sc.nextFloat();
		System.out.println("입력하신 키는 : "+ height + " cm 입니다.");
		
		// * nextDouble() : 입력받은 값을 double 형으로 반환한다.
		System.out.print("원하는 실수를 입력하세요 : ");
		double number = sc.nextDouble();
		System.out.println("입력하신 실수는 : "+ number + " 입니다");
		
		// 2-4. 논리형 값 입력 받기
		// * nextBoolean() : 입력받은 값을 boolean 형으로 반환한다.
		// -> true 와 false 외에는 다른 값을 입력하면 inputMismatchException 발생.
		System.out.print(" 참 이나 거짓을 true or false 로 입력 : ");
		boolean isTrue = sc.nextBoolean();
		System.out.println("입력하신 논리값은 : " + isTrue + "입니다.");
		
		
		// 2-5. 문자형 값 입력받기 char @@@@@@@@@@@@@@@@@@@@@@@@@@
		// 일단 문자열로 입력을 받고, 입력받은 문자에서 원하는 순번째 문자를 분리해서 사용한다.
		// java.lang.String에 charAt(int index) index = 순번 (몇번쨰 있는걸 가져올겁니까)
		// intdex를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를
		// 문자형으로 반환해주는 기능이다.
		
		sc.nextLine();
		System.out.println("아무 문자나 입력 해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("입력하신 문자는 : "+ ch +" 입니다");
		
		
		
		//sc.next(). == "문자열".
		
		sc.close();
		//Scanner 클래스는 다 쓰고 나면 닫아줘야 합니다 아니면 노랭이 경고발생.
		
		
		
		
		
		
		
		
		
	
	}

}
