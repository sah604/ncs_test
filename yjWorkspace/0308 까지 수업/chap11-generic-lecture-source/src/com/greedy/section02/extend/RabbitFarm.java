package com.greedy.section02.extend;

/* 인터페이스 상속 시 implements 키워드 대신 extende 사용한다.*/
// public class RabbitFarm <T implements Animal>{ //에러남
// public class RabbitFarm <T extends Animal>{ //정상
	
// 클래스 상속 시 extends 사용가능
//public class RabbitFarm <T extends Rabbit> { 
	
	/*
	 * 클래스와 인터페이스 상속 시 &를 사용한다.
	 * --> 대신에 앞에는 클래스가 와야하고 인터페이스는 뒤에온다.@@@@@@@@@@@@@@@@@@@@
	 * &로 여러 타입을 동시에 가지는 경우에만 타입 변수에 맞는 타입으로 여긴다.
	 * (둘 중 하나가 아니다!!!)
	 * 
	 * 클래스 여러개는 &사용 불가하고 ,(콤마) 사용시 컴파일에러는 발생하지 않지만
	 * 뒤에 작성한 클래스 또 한 다른 타입변수로 온다.
	 * --> 하나의 클래스만 상속받아 구현할 수 있다.
	 * */
//public class RabbitFarm <T extends Rabbit & Animal> { 
//public class RabbitFarm <T extends Rabbit, Reptile> { 
	// Reptile 자체를 타입변수로 본다.

//public class RabbitFarm <T extends Rabbit , TR extends Reptile> { // 1. 레빗팜 이라는 클래스에 제네릭으로 레빗클래스만 타입제한
// 제네릭을 사용해 해당 클래스로 타입지정 가능 타입지정을 클래스로 할 수도 있다.
public class RabbitFarm <T extends Rabbit> { 
	
	// 타입변수는 아직 어떤 토끼가 될 지 모른다. 토끼이거나 토끼의 후손만 가능.
	private T animal; // 필드변수 선언
	
	public RabbitFarm(){} // 기본 생성자
	
	public RabbitFarm(T animal) { // T타입의 animal 매개변수 생성자
		this.animal = animal;
	}

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}














}
