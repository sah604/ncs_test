package com.greedy.section01.ploymorphism;

public class Application4 {
	public static void main(String[] args) {
		
		/* 리턴 타입에도 다형성을 적용할 수 있다.*/
		
		Application4 app4 = new Application4();
		
		Animal randomAnimal = app4.gerRandonAnimal();
		randomAnimal.cry();
		
		/*
		 * 다형성을 적용하지 않고 반환 받으려면 호랑이를 리턴받는 메소드 와
		 * 토끼를 리턴받는 메소드를 따로 만들어야 한다. */
	}
	
	public Animal gerRandonAnimal() {
		
		int random = (int)(Math.random()*2);
		
		return random == 0? new Rabbit() : new Tiger();
	}

}
