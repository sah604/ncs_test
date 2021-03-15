package com.greedy.section01.ploymorphism;

public class Application3 {
	
	public static void main(String[] args) {
		
		/* 매개변수에도 다형을 활용할 수 있다.*/
		
		Application3 app3 = new Application3();
		
		
		/*Animal 타입의 토끼와 호랑이 인스턴스를 만들어서 먹이를 준다.*/
		Animal animal1 = new Rabbit();
		Animal animal2 = new Tiger();
		
		app3.feed(animal1);
		app3.feed(animal2);
		
		Rabbit animal3 = new Rabbit();
		Tiger animal4 = new Tiger();
		
		app3.feed((Animal) animal3);// 명시적 형 변환
		app3.feed((Animal) animal4);
		
		app3.feed(animal3); // 묵시적 형변환
		app3.feed(animal4);
		
		/* 인스턴스를 생성하며 바로 묵시적 형 변환을 이용해서 전달할 수도 있다.*/
		app3.feed(new Rabbit()); //여기 한번만 하고 끝내겠다 하면 객체 다이렉트 생성해서 
		app3.feed(new Tiger());
		
		/*
		 * 결론 : 다형성을 적용하지 않았다면 호랑이에게 먹이를 주는 메소드와 토끼에세 먹이를 주는 메소드를 별도로 
		 *       작성해야 했을 것이다.*/
	}
	
	/**
	 * 동물에게 먹이를 주기 위한 메소드
	 * @param animal
	 */
	public void feed(Animal animal) {
		animal.eat();
	}
	


}
