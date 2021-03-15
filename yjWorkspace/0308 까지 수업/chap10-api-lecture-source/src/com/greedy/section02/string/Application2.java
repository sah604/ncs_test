package com.greedy.section02.string;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* 문자열 객체를 만드는 방법 */
		/*
		 * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton 개념)
		 * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
		 * */
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		/*
		 * 리터럴 형태로 만든 문자열 인스턴스는 동일한 값을 가지는 인스턴스는 하나의 인스턴스로 관리한다. 
		 * 따라서 주소값을 비교하는 == 연산으로 비교 시 서로 동일한 stack에 저장된 주소를 비교하여
		 * true를 반환한다.*/
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		/*
		 * new로 새로운 인스턴스를 생성하게 되면 기존 인스턴스를 두고 새로운 인스턴스를 할당했기 때문에
		 * == 연산으로 비교 시 서로다른 주소값을 가지고 있기때문에 false를 반환 */
		System.out.println("str2 == str3 : " + (str2 == str3));
		
		/*
		 * 동일한 방식으로 인스턴스를 생성하고 값 또한 같러라도
		 * 새로운 인스턴스를 생성하는 서로 다른 주소를 가지고 있기 때문에 false 반환 */
		System.out.println("str3 == str4 : " + (str3 == str4));
		
		/*
		 * 4개의 문자열 모두 동일한 hashCode 값을 가진다.
		 * --> 동일한 문자열은 동일한 hashCode값을 반환하도록 재정의 되어 있기때문에
		 * */
		System.out.println("str1의 hashCode : " +str1.hashCode());
		System.out.println("str2의 hashCode : " +str2.hashCode());
		System.out.println("str3의 hashCode : " +str3.hashCode());
		System.out.println("str4의 hashCode : " +str4.hashCode());
		
		/*
		 * 문자열은 불변이라는 특징을 가지고 있다
		 * 기존 문자열에 + 연산을 수행하는 경우 문자열을 수정하는것이 아니라 새로운 문자열을 할당하게 된다,
		 * 
		 * */
		System.out.println("str1 == str2 :" + (str1==str2));
		System.out.println("str2의 hashCode : " +str2.hashCode());
		str2 += "oracle";
		
		System.out.println("str1 == str2 :" + (str1==str2));
		System.out.println("str2의 hashCode : " +str2.hashCode());
		System.out.println(str2);
		
		/*
		 * equals() : String 클래스의 eqalus()메소드는 인스턴스 비교가 아닌 문자열 값을 비교하여
		 * 			동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false 반환
		 * 			(object 클래스의 equals() 메소드를 재정의 해두엇다.
		 * 
		 * 			-> 동일한 문자열인지를 비교하려면 == 연산 대신 equals() 메소드 사용하자.
		 * */
		System.out.println("str1.eqauls(str3) : " + str1.equals(str3));
		System.out.println("str1.eqauls(str4) : " + str1.equals(str4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
