package com.greedy.section02.extend;

public class WildCardFarm {
	
	/* 매개변수로 전달받는 토끼농장을 구현할 때 타입변수에 대해서 제한이 가능하다.*/

	/* 토끼 농장에 있는 토끼가 어떤 토끼 이던 상관없다. */
	public void  anyType(RabbitFarm<?> farm) {
		
		farm.getAnimal().cry(); // 이건  노상관
		
	}
	
	/* 토끼농장의 Bunny이거나 그 후손타입으로 만들어진 토끼농장만 매개변수로 사용가능*/
	public void extendsType(RabbitFarm<? extends Bunny> farm) {
		farm.getAnimal().cry();
	}
	
	/* 토끼농장의 토끼는 bunny이거나 그 부모 타입으로 만들어진 토끼 농장만 매개변수로 사용가능*/
	public void superType(RabbitFarm<? super Bunny> farm) {
		farm.getAnimal().cry();
	}
	
}
