package com.greedy.section01.object1.book.vo;

public class Application2 {
	
	public static void main(String[] args) {
		
		/*
		 *  == equals() 메소드 오버라이딩
		 *  equals 메소드는 매개변수로 전달받은 인스턴스와 == 연산하여 true or false 를 반환한다
		 *  즉 동일한 인스턴스인지를 비교하는 기능을 한다.
		 *  
		 *  동일객체와 동등객체
		 *  동일객체 : 주소가 동일한 인스턴스를 동일 객체라고 한다.
		 *  동등객체 : 주소가 다르더라도 필드값이 동일한 객체를 동등객체라고 한다.
		 *  
		 *  equals() 메소드의 기본 기능은 동일객체를
		 *  
		 *  경우에 따라 동등객체를 동일 객체로 취급해서 비교하고 싶은 경우가 있다.
		 *  즉, 동일한 필드값을 가지는 객체를 같은 객체로 판단할 수 있도록 하는 경우를 말한다.
		 *  
		 *  --> equals() 메소드를 오버라이딩하여, 각각의 필드가 동일한 값을 가지는지를 확인하고
		 *  	모든 필드값이 같은 값을 가지는 경우 true, 아닌경우 false를 반환 하도록 하자.
		 * 
		 * */
		
		BookVO book2 = new BookVO(2, "목민심서", "정약용", 30000);
		BookVO book3 = new BookVO(2, "목민심서", "정약용", 30000);
		
		System.out.println("두 인스턴스와 == 연산비교 : " + (book2 == book3));
		System.out.println("두 인스턴스와 equals() 비교 : " + book2.equals(book3));
		
		String a = new String("a");
		String ab = new String("a");
		
		int a1 = new Integer(1);
		int a2 = new Integer(1);
		
		System.out.println(a1 == a2);
//		System.out.println(a1.equals(a2));
	}

}
