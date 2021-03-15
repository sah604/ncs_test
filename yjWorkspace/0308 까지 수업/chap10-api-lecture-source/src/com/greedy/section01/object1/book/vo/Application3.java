package com.greedy.section01.object1.book.vo;

public class Application3 {
	
	public static void main(String[] args) {
		
		/*
		 * Object 클래스의 명세에 작성된 일반 규약에 따르면
		 * equals() 메소드를 재정의 하는 경우 반드시 hashcode() 메소드도 재정의 하도록 되어있다.
		 * 
		 * 만약에 hashcode()를 재정의 하지 않으면 같은값을 가지는 동등객체는
		 * 같은 hashcode값을 가져야한다는 규약에 위반되게 한다.
		 *
		 * */
		
		BookVO book1 = new BookVO(1,"홍길동전","허균",50000);
		BookVO book2 = new BookVO(1,"홍길동전","허균",50000);
		
		System.out.println("book1 의 해쉬코드 : " + book1.hashCode());
		System.out.println("book2 의 해쉬코드 : " + book2.hashCode());
	}

}
