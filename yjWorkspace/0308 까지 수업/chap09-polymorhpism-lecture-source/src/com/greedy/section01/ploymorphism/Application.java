package com.greedy.section01.ploymorphism;

public class Application {
	
	public static void main(String[] args) {
		
		/* Animal 인스턴스 생성후 테스트*/
		System.out.println("Animal 생성 ============================");
		Animal animal = new Animal();
		animal.eat();
		animal.run();
		animal.cry();
		
		System.out.println("Rabbit 생성 ========================");
		Rabbit rabbit = new Rabbit();
		rabbit.eat();
		rabbit.run();
		rabbit.cry();
		rabbit.jump();
		
		System.out.println("Tiger 생성 ========================");
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		tiger.cry();
		tiger.bite();
		tiger.sleep();
		
		/*
		 * 
		 * Rabbit과 Tiger는 Animal 클래스를 상속받았다. 
		 * Rabbit은 Rabbit 타입 이기도 하면서 Animal 타입 이기도 하다.
		 * 
		 * Tiger는 Tiger 타입이면서 Animal 타입 이기도 하다.
		 * */
		// @@@@@@@@@@@@@@ 여기 아래가 핵심.
		Animal a1 = new Rabbit();  // 둘다 상속 구조이기 때문에... 부모는 자식타입을 모두 받아줄 수 있다.
		Animal a2 = new Tiger();
		
	
		
		// 반대로 Animal은 애니멀이지 타이거나 래빗이 아니다.
		// 그래서 에러발생.
//		Rabbit r = new Animal();
//		Tiger t = new Animal();
		
		System.out.println("동적 바인딩 =============================");
		/*
		 * 동적바인딩
		 * 컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가,
		 * 런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌에 동작하는 것을 의미한다.
		 * 
		 * */
		
		a1.cry(); // 애니멀 클래스의 객체로 생성. 실제 객체는 래빗. 부모가 가진 메소드가 자식클래스에서 오버라이딩 됐다면
					// 자식의 메소드를 실행.(런타임 도중) 만약 오버라이딩 하지 않았다면
					// 부모(원래)의 메소드 실행.
		a2.cry();
		
		/* 하나의 메소드 호출로 각기 다른 객체의 다른 메소드를 동작 시키게 한다. */
		// 이경우 레빗에 추가된 
//		a1.jump(); 가 실행이 안된다. 부모클래스에 jump는 없기 때문.
//		a2.bite(); 에러발생/
		/* 현재 레퍼런스 변수의 타입은 Animal 이기 때문에 Rabbit과 Tiger가 가지고 있는 고유한 기능을
		 * 동작 시키지 못한다. */
		
		
		System.out.println("클래스 타입의 형변환 확인=================================");
		/*
		 * 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여 Rabbit과 Tiger로
		 * 변경해야 메소드 호출이 가능하다
		 * class type casting : 클래스 형변환
		 * --> 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우
		 * 		ClassCastException 발생 한다.
		 * 
		 * */
		
		((Rabbit) a1).jump();
		((Tiger) a2).bite();
		
		/* 타입 형변환을 잘못하는 경우
		 * 컴파일 시에는 문제가 되지 않지만 런타임시 익셉션 발생한다.
		 * */
//		((Tiger) a1).bite(); // 토끼는 호랑이가 될 수없다.
		
		/* 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자 "instanceof" */
		System.out.println("instanceof 확인===============================");
		System.out.println("a1이 Tiger 타입인지 확인 "+(a1 instanceof Tiger));
		System.out.println("a1이 Rabbit 타입인지 확인 "+(a1 instanceof Rabbit));
		/* 상속받은 타입도 함께 가지고 있다. (다형성) */
		System.out.println("a1이 Animal 타입인지 확인 " + (a1 instanceof Animal));
		
		/* 모든 클래스는 Object의 후손이다. */
		System.out.println("a1이 Object 타입인지 확인 " + (a1 instanceof Object));
		
		/* instanceof 연산자를 이용해서 해당 타입이 맞는 경우에만 클래스 형변환을 적용한다. */
		if(a1 instanceof Rabbit) {
			((Rabbit) a1).jump();
		}
		
		if(a1 instanceof Tiger) {
			((Tiger) a2).bite();
		}
		
		
		
		/*
		 * 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
		 * up-casting : 상위타입으로 형 변환
		 * down-casting : 하위타입으로 형 변환
		 * 
		 * 또한 작성 여부에 따라 명시적과 묵시적 두 가지로 구분된다.
		 * 
		 * */
		
//		Animal animal1 = (Animal) new Rabbit(); // up-casting 명시적 형 변환
//		Animal animal2 = new Rabbit();          // up-casting 묵시적 형 변환
//		
//		Rabbit rabbit1 = (Rabbit)animal1;       // down-casting 명시적 형 변환
////		Rabbit rabbit2 = animal2;               // down-casting은 묵시적 형 변환 안됨.
//		
		Animal animal11 = (Animal) new Tiger(); // up-casting 명시적 형 변환
		Animal animal21 = new Tiger();          // up-casting 묵시적 형 변환
		
		Tiger tiger1 = (Tiger)animal11;       // down-casting 명시적 형 변환
		
		
		tiger1.eat();
		animal21.eat();
		
		
		
		
		
		
		
		
	}

}
