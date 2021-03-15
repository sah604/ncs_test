package com.greedy.section02.absractclass;

public class Application {
	
	public static void main(String[] args) {
		
		/*
		 * 추상 메소드란?
		 * 
		 * 메소드의 선언부만 있고 구현부(body)가 없는 메소드를 추상 메소드라고 한다.
		 * 추상메소드의 경우 반드시 abstract 키워드를 메소드 헤드에 작성해야 한다.
		 * ex) public abstract*/
		
		
		/* Product 클래스로 인스턴스는 생성할 수 없다. -> 추상 클래스는 인스턴스 생성불가 */
//		Product pro = new Product();
		
		/* 추상 클래스를 상속받은 객체를 이용해야한다. */
		SmartPhone smartPhone = new SmartPhone();
		
		/* SmartPhone은 SmartPhone 타입이기도 하지만 Product 타입 이기도 하다. */
		System.out.println(smartPhone instanceof SmartPhone);
		System.out.println(smartPhone instanceof Product);
		
		/* 따라서 다형성을 적용해서 추상 클래스를 레퍼런스 타입으로 활용할 수 있다. */
		Product product = new SmartPhone(); //객체로는 사용할 수 없지만 레퍼런스 주소로는 사용가능하다.
		
		
		/* 동적 바인딩에 의해 SmartPhone의 메소드가 호출된다. */
		product.abstMetod(); // 스마트폰 클래스에서 부모의것을 재정의한것을 출력 (동적바인딩이 일어남)
		
		/* 추상클래스가 가진 메소드도 호출할 수있다.*/
		product.nonStaticMethod();
		
		/* static 메소드는 그냥 사용이 가능하다. (인스턴스 생성이 불필요)*/
		Product.staticMethod();
	
		
		/*
		 * 추상 클래스를 왜 쓰냐면
		 * 추상클래스의 추상 메소드는 오버라이딩에 대한 강제성이 부여된다.
		 * 따라서 여러 클래그들을 그룹화하여
		 * 필수 기능을 정의하여 강제성을 부여 해 개발 시 일관된 인터페이스를 제공할 수 있다.
		 * 
		 * 하지만 다른 클래스를 상속 받고 있는 클래스를 작성할 시에는 추상클래스를 추가 상속받을 수 있다. 
		 * 그래서 추상클래스보다 더 강제성이 강한 인터페이스(interface)라는 매커니즘을 제공하고 있다. 
		 * */
	
	}

}
