package com.greedy.section04.wrapper;

public class Application1 {
	
	public static void main(String[] args) {
	
		/*
		 * Wrapper 클래스
		 * 상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
		 * */
		
		/*
		 * 박싱(Boxing)과 언박싱(unBoxing)
		 * 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는것을 박싱(Boxing) 이라고 하며,
		 * 래퍼 클래스 타잎의 인스턴스를 기본 타입으로 변경하는것을 언박싱(UnBoxing) 이라고 한다.
		 * 
		 * */
		
		int intValue = 20;
		Integer boxingNumber1 = new Integer(intValue); // 인스턴스화 - 박싱(Boxing) 생성자이용
		Integer boxingNumber2 = Integer.valueOf(intValue); // static 메소드 이용 
		
		int unBoxingNumber1 = boxingNumber1.intValue(); // 언박싱(UnBoxing) // intValue
		
		/*
		 * 오토 박싱(AutoBoxing) 과 오토언박싱 (AutoUnBoxing)
		 * JDK 1.5 부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해준다.
		 * 
		 * */
		
		Integer boxingNumber3 = intValue;  // 오토 박싱
		
		int unBoxingNumber2 = boxingNumber3; // 오토 언박싱
		
		/* Wrapper 클래스 값 비교 */
		int inum = 20;
		Integer integerNum1 = new Integer(20);
		Integer integerNum2 = new Integer(20);
		Integer integerNum3 = 20;
		Integer integerNum4 = 20;
		
		// 기본 타입과 래퍼클래스 타입은 == 연산으로 비교 가능하다.
		System.out.println("int와 Integer 비교  : " + (inum == integerNum1));
		
		// 생성자를 이용해 생성한 인스턴스의 경우 == 으로 비교하지 못한다.
		// 단 , 오토박싱을 이용해서 생성한 값은 == 으로 비교 가능
		System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum2));
		System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum3));
		System.out.println("integer와 integer 비교 : " + (integerNum3 == integerNum4));
		
		// 래퍼 클래스 타입의 인스턴스를 비교할 때는 equals() 를 사용해야 한다.
		System.out.println("equals() : " + (integerNum1.equals(integerNum2)));
		System.out.println("equals() : " + (integerNum1.equals(integerNum3)));
		System.out.println("equals() : " + (integerNum1.equals(integerNum4)));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
