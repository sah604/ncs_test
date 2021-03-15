package com.greedy.section03.stringbuilder;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* StringBulider의 자주 사용되는 메소드 */
		
		StringBuilder sb1 = new StringBuilder();
		
		// capacity() : 용량 (현재 버퍼의 크기) 을 정수형으로 반환하는 메소드 (문자열의 길이 + 16이 기본용량)
		System.out.println(sb1.capacity());
		
		/*
		 * append() : 인자로 전달된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가한다.
		 * 기본 용량을 초과하는 경우 (기존문자열 + 1) * 2을 하여 용향을 확장시킨다.
		 *  16*2+2 
		 * */ 
		
		StringBuilder sb12 = new StringBuilder("12345678910111213123456789123456789123456789");
		System.out.println(sb12.length());
		System.out.println("==="+sb12.capacity());
		
//		for(int i = 0; i < 100 ; i++) {
//			sb1.append(i);
//			System.out.println("sb1 : " + sb1);
//			System.out.println("capacity : " + sb1.capacity()); //  2N +2 증가함 //글자수가 16개 넘어간다? 그럼 *2 +(2) 또 34개. 글자수가 34개 넘어간다? 반복,
//			System.out.println("sb1 lenght : " + sb1.length());
//			System.out.println("hashCode : " + sb1.hashCode());
//			
//		}
//		
		/* 새로운 StringBuilder 인스턴스 생성 */
		StringBuilder sb2 = new StringBuilder("javaoracle");
		/*                                //   0123456789
		 * delete() : 시작 인덱스와 종료 인덱스를 이용하여 문자열에서 원하는 부분의 문자열 제거
		 * deleteChatAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
		 * 원본에 영향을 미친다. ㄷㄷ
		 * */
		System.out.println("delete() : " + sb2.delete(2, 5)); // 2이상 5 미만
		System.out.println("deleteCharAt() : "+ sb2.deleteCharAt(0));
		
		System.out.println("sb2 : " + sb2);
		
		/*
		 * insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
		 * 원본에 영향을 미친다.
		 * */
		System.out.println("insert() : " + sb2.insert(1, "vao"));
		System.out.println("insert() : " + sb2.insert(0, "j"));
		
		/* 인덱스 번호가 문자열의 길이와 같은 경우 append와 같은 역할을 한다.*/
		System.out.println("insert() : " + sb2.insert(sb2.length(), "jdbc"));
		System.out.println("sb2 : " + sb2);
		
		/*
		 * reverse() : 문자열 인덱스 순번을 역순으로 재배열한다.
		 * 원본에 영향을 미친다.
		 * */
		System.out.println("reverse() : " + sb2.reverse());
		System.out.println("sb2 : " + sb2);
		
		/*
		 * String 클래스와 동일한 메소드도 있다,
		 * charAt() , indexOf()/lastIndexOf(), length(), replace(), substring(), toString()
		 * 
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
