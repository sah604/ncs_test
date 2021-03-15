package com.greedy.section03.stringbuilder;

public class Application1 {
	
	public static void main(String[] args) {
		
		/*
		 * StringBuilfer 와 StringBuffer
		 * 두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이있다.
		 * 
		 * StringBuilder : 스레드 동기화 기능 제공하지 않는다.
		 * 				   스레드 동기화 처리를 고려하지 않는 상황에서 StringBuffer보다 성능이 좋음.
		 * StringBuffer : 스레드 동기화 기능 제공 한다.
		 * 				  성능면에서는 스트링빌더보다 느리다.
		 * */
		
		/*
		 * String과 StringBuilder
		 * String : 불변이라는 특성을 가지고 있다.
		 * 			문자열에 + 연산으로 합치기 하는경우, 기존 인스턴스를 수정하는 것이 아닌 
		 * 			새로운 인스턴스를 반환한다.
		 * 			따라서 문자열 변경이 자주 일어나는 경우 성능면 에서 좋지 않다.
		 *			하지만 변하지 않는 문자열을 자주 읽어 들이는 경우에는 오히려 좋은 성능을 기대할 수 있다.
		 * 
		 * StringBuilder :  가변이라는 특성을 가지고 있다.
		 * 					문자열에 append() 메소드를 이용하여 합치기 하는경우
		 * 					기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성하지 않는다.
		 * 
		 * 단, jdk 1.5 버전 에서는 문자열의 + 연산이 StringBuilder의 append() 로 컴파일이 된다.
		 * 
		 * */
		
		/*
		 * 원본 코드 */
//		String str1 = "java";
//		String str2 = "oracle";
//		
//		String str3 = str1 + str2;
//		String str4 = "";
//		
//		for(int i = 0 ; i< 10; i++) {
//			str4 += str1;
//		}
//		
//		System.out.println(str4);
		
		//=============================================
		//jdk 1.4 이하
		
//		String str1 = "java";
//		String str2 = "oracle";
//		
//		String str3 = str1 + str2;
//		String str4 = "";
//		
//		for(int i = 0 ; i< 10; i++) {
//			str4 = str4 + str1;
//		}
		
//		System.out.println(str4);
		
//		// JDK 1.5 이상
//		String str1 = "java";
//		String str2 = "oracle";
//		
//		String str3 = new StringBuilder(str1).append(str2).toString();
//		String str4 = "";
//		
//		for(int i = 0 ; i< 10; i++) {
//			str4 = new StringBuilder(str4).append(str1).toString();
//		}
//		System.out.println(str4);
		
		// StringBuilder 인스턴스 생성
		StringBuilder sb = new StringBuilder("java");
		
		StringBuffer ab = new StringBuffer("asd");
		
		
		
		// toString 오버 라이딩 되어있다.
		System.out.println("sb : " + sb);
				
		System.out.println("sb의 해쉬코드 : " + sb.hashCode());
		
		sb.append("oracle"); //어펜드 = 수정
		
		System.out.println("sb : " + sb);
		
		System.out.println("sb의 해쉬코드 : " + sb.hashCode());
		
		// hashCode의 결과를 확인해본결과 문자열을 변경했다고 해서 새로운 인스턴스가 생성된것은 아니다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
