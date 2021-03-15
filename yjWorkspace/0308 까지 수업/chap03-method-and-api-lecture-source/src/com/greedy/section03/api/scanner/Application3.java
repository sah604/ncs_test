package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application3 {
	public static void main(String[] args) {
		
		// 스캐너 주의 사항
		// 스캐너의 next 메소드들은 입력한 내용을 버퍼로 부터 토큰 단위로 분리해서 읽어온다.
		// 1. next() 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때
		// 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력 받을 때
		
		// 스캐너 객체생성
		Scanner sc = new Scanner(System.in);
		
		// 1. next()로 문자열 입력 받은 후 정수, 실수 ,논리값 입력 받을 때
		System.out.print("문자열을 입력해 주세여 : ");
		String str1 = sc.next();
		System.out.println("str1 : "+ str1);
		
		sc.nextLine(); // 으로 혹시모르는 띄어쓰기 다음의 문자열이 남아있을경우 여기서 먹어준다 // 이거 지워도 왜 됨?;;;;;;;;;
		
		System.out.print("숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.println("num1 : " + num1);
		
		// * 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력 받을 때
		System.out.print("다시 숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		System.out.println("num2 : " + num2);
		
		sc.nextLine(); /// nextInt에서 숫자 입력 후 엔터를 칩니다. 그러면 버퍼값에 엔터값이 저장됩니다. 그런데 다음에 nextLine이 오게 된다면 엔터값을 인식해 버려서 아무것도 없는 것처럼 인식됨...
		// 그러면 Line 다음 Line 도 오류?
		System.out.print("공백이 있는 문자열을 하나 입력해주세요. : ");
		String str2 = sc.nextLine();
		System.out.println("str2 : " + str2);
		
		sc.close();
		
	}

}
