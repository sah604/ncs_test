package com.greedy.section08.initblock;

public class Application {
	public static void main(String[] args) {
		/* 초기화 블럭과 초기화 순서 */
		/*
		 * 초기화 블럭
		 * 복잡한 초기화를 수행할 수 있는 블럭을 제공하며, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분된다.
		 * 
		 * 1. 인스턴스 초기화 블럭
		 * 	: 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 된다.
		 * 	  인스턴스를 호출하는 시점마다 호출이 된다. (메소드 호출시 마다)
		 * 	  인스턴스 변수를 초기화 하며 정적필드에는 실행시점마다 값을 덮어 쓴다.
		 * {
		 *   초기화 내용 작성
		 * }
		 * - 이런식으로
		 * 
		 * 2. 정적(스태틱) 초기화 블럭
		 * 	: 클래스가 로드될 때 한번 동작한다.
		 * 	  정적 필드를 초기화하며, 인스턴스 변수는 초기화 하지 못한다.
		 * static{
		 * 		초기화 내용 작성
		 * }
		 * 
		 * */
		
		Product product = new Product(); //Product(); 호출...
		
		System.out.println(product.getInformation());
		
		Product product2 = new Product("대륙폰 " , 5000000 , "사오미");
		System.out.println(product2.getInformation());
		
		/*
		 * 인스턴스 변수 : 기본값 -> 명시적 초기값 -> 인스턴스 초기화 블럭 -> 생성자 
		 * 클래스변수 : 기본값 -> 명시적 초기값 -> 정적초기화블럭 -> 인스턴스초기화 블럭 -> 생성자 */ //이거 먼소림>?
	}
	

	
	
	
}
