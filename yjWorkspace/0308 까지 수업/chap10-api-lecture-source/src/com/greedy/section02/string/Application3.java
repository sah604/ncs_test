package com.greedy.section02.string;

import java.util.StringTokenizer;

public class Application3 {
	
	public static void main(String[] args) {
		
		/*
		 * split()과 StringTokenizer
		 * : 문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
		 * 
		 * split() : 정규표현식을 이용하여 문자열을 분리한다.
		 * 			비정형화된 문자열을 분리할 때 좋지만 (공백 문자열 값 포함)
		 * 			정규표현식을 이용하기 때문에 속도가 느리다는 단점을 다루고 있다. (정규표현식 -> 자바스크립트에서 사용)
		 * 
		 * StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
		 * 					정형화된 문자열 패턴을 분리할 때 사용하기 좋다. (공백 문자열 무시)
		 * 					split() 보다 속도면에서 더 빠르다.
		 * 					* 구분자를 생략하는 경우 공백이 기본 구분자 이다.
		 * 
		 * */
		
		/* 각 문자열의 의미는 사번/이름/주소/부서 를 의미한다. */
		
		String emp1 = "100/홍길동/서울/영업부"; // 모든 값 존재
		String emp2 = "200/유관순//총무부";	// 주소 없음
		String emp3 = "300/이순신/경기도/";	// 부서 없음
		
		String[] empArr1 = emp1.split("/");		
		String[] empArr2 = emp2.split("/");		
		String[] empArr3 = emp3.split("/");		
		
		for(int i = 0; i < empArr1.length; i++) {
			System.out.println("empArr1[" + i + "] : " + empArr1[i]);
		}
		
		for(int i = 0; i < empArr2.length; i++) {
			System.out.println("empArr2[" + i + "] : " + empArr2[i]);
		}
		
		for(int i = 0; i < empArr3.length; i++) {
			System.out.println("empArr3[" + i + "] : " + empArr3[i]);
		}
		
		/*
		 * 마지막 구분자 사이에 값이 존재하지 않는경우 이후 값도 추출하고 싶을 때
		 * -> 몇개의 토큰으로 분리할 것인지 한계치를 두 번째 인자로 넣어줄 수 있다. 
		 * 이때 음수를 넣게 되면 마지막 구분자 뒤의 값이 존재하지 않는 경우 빈 문자열로 토큰을 생성한다. */
		String[] empArr4 = emp3.split("/",-1);
		
		for(int i = 0; i < empArr4.length; i++) {
			System.out.println("empArr4[" + i + "] : " + empArr4[i]);
		}
		
		/* StringTokenizer */ 
		/* -> 공백으로 존재하는 값을 무시한다. */
		StringTokenizer st1 = new StringTokenizer(emp1,"/");
		StringTokenizer st2 = new StringTokenizer(emp2,"/");
		StringTokenizer st3 = new StringTokenizer(emp3,"/");
		
		while(st1.hasMoreTokens()) {
			System.out.println("st1 : " + st1.nextToken());
		}
		
		while(st2.hasMoreTokens()) {
			System.out.println("st2 : " + st2.nextToken());
		}
		
		while(st3.hasMoreTokens()) {
			System.out.println("st3 : " + st3.nextToken());
		}
		
		/* nextToken() 으로 토큰을 꺼내면 해당 StringTokenizer의 토큰을 재사용 하는것이 불가능하다 */
		while(st1.hasMoreTokens()) {
			System.out.println("st1 : " + st1.nextToken());
		}
		
		
		/* split()은 정규 표현식 이용(문자열패턴), StringTokenizer는 구분자 문자열 이용 */
		String colorStr = "red*orange#blue/yellow green";
		
		// "*#/ " 이라는 문자열이 구분자로 존재하지 않아서 에러 발생
//		String[] colors = colorStr.split("*#/ ");
		
		// 대괄호로 묶은 문자열은 문자열이 아닌 각 문자들의 패턴으로 볼 수 있다.
		
		String[] colors = colorStr.split("[*#/ ]");
		
		for(int i = 0; i < colors.length; i++) {
			System.out.println("colors["+i+"] : " +colors[i]);
		}
		
		StringTokenizer colorStingTokenizer = new StringTokenizer(colorStr,"*/# ");
		
		// StringTokenizer의 두번째 인자 문자열 자체는 연속된 문자열이 아닌 하나하나를 구분자로 이용하겟다는 으미
		while(colorStingTokenizer.hasMoreTokens()) {
			System.out.println(colorStingTokenizer.nextToken());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
