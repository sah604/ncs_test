package com.greedy.section08.initblock;

public class Product {
	
	/* 필드를 초기화 하지 않으면 JVM이 정한 기본값으로 객체가 생성된다. */
//	private String name;
//	private int price;
//	private static String brand;


	/* 명시적으로 초기화 */
	private String name = "갤럭시";
	private int price = 1000000;
	private static String brand = "샘성";
	
	/* 인스턴스 초기화 블럭 확인*/
	{
		name = "사이언";
		price = 500000;
		brand = "사과";
		System.out.println("인스턴스 초기화 블럭 동작함..");
	}
	
	/* static 초기화 블럭 */
	static {
		/* static 초기화 블럭에서는 non-static 필드를 초기화 하지 못한다. */
		/* 정적 초기화는 클래스 로드 시에 동작한다. 
		 * 따라서 정적 초기화 블럭의 동작 시점에는 인스턴스가 아무것도 존재할 수 없기 때문에 
		 * 존재하지 않는 인스턴스변수에 초기화하는 것은 시기상으로 불가능 하다. */
//		name = "아이펀";
//		price = 20202020;
		
		brand = "엘지";
		System.out.println("정적 초기화 블럭 동작함...");
	}
	
	/* 기본생성자 */
	public Product() {
		System.out.println("기본 생성자 호출됨...");
	}


	
	/* 매개변수가 있는 생성자 */ //매변 생성자를 호출해 주어도 this 사용 가능.
	public Product(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		Product.brand = brand;
		System.out.println("매개변수 있는 생성자 호출됨..");
	}
	
	/* 필드값 확인용 메소드 */
	public String getInformation() {
		return "name = " + this.name + " price = " + this.price + " brand = " + this.brand;
	}
	
}
