package com.greedy.section02.variable;

public class Application2 {
	public static void main(String[] args) {
		// 변수를 사용하기 위한 방법
		// 1. 변수를 준비한다.(선언)
		// 2. 변수에 값을 대입한다.(값 대입 및 초기화)
		// 3. 변수를 사용한다.
		
		// 1. 변수를 준비한다.(선언)
		// 정수를 취급하는 자료형은 4가지
		byte bnum;		// 1byte
		short snum;		// 2byte
		int inum;		// 4byte
		long lnum;		// 8byte
		
		// 실수를 취급하는 자료형은 2가지
		float fnum;		// 4byte
		double dnum;	// 8byte
		
		// 논리값을 취급하는 자료형 1가지
		boolean isTrue; // 1byte
		
		// 문자를 취급하는 자료형 1가지
		char ch;		// 2byte
		char ch2;
		
		// 문자열을 취급하는 자료형
		String str;
		
		// 2. 변수에 값을 대입한다.(값 대입 및 초기화)
		// 2-1. 정수를 취급하는 자료형에 값 대입
		bnum = 1;
		snum = 2;
		inum = 4;
		//lnum = 8;
		lnum = 8L;
		
		// 2-2. 실수를 취급하는 자료형에 값 대입
		fnum = 4.0f;
		dnum = 8.0;
		
		// 2-3. 문자를 취급하는 자료형에 값 대입
		ch = 'a'; // 문자 형태의 값을 저장할 수 있다.
		ch2 = 97; 
		
		// 2-4. 논리를 취급하는 자료형에 값 대입
		isTrue = true;
		isTrue = false;
		
		// 2-5. 문자열을 취급하는 자료형에 값 대입
		str = "안녕하세요";
		
		
		// 변수를 선언하고 난 뒤 최초로 값을 대입되는 것을 초기화
		// 위에서는 변수 선언과 값 대입을 따로 했지만 동시에 수행할 수 있다.
		// 이런것들을 '선언과 동시에 초기화'라고 한다.
		int point = 100;
		int bonus = 10;
		
		// 3. 변수를 사용한다.
		// 3-1. 변수에 저장한 값 출력하기
		System.out.println("====== 변수에 저장된 값 출력 ======");
		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);
		
		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : " + dnum);
		
		System.out.println("ch의 값 : " + ch);
		System.out.println("ch2의 값 : " + ch2);
		
		System.out.println("isTure의 값 : " + isTrue);
		
		System.out.println("str의 값 : " + str);
		
		
		// 3-2. 변수를 이용해서 연산하기
		System.out.println("포인트와 보너스의 합은 ? " + (point + bonus));
		
		// 대입연산자(=)의 왼쪽과 오른쪽 편에 사용
		// 대입연산자의 왼편에는 공간이라는 의미, 오른쪽편에는 값이라는 의미
		point = point + 100;
		
		System.out.println("point = point + 100 ? " + point);
		
	}
}





















