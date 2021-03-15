package com.greedy.section02.extend.run;

import com.greedy.section02.extend.Bunny;
import com.greedy.section02.extend.DrukenBunny;
import com.greedy.section02.extend.Rabbit;
import com.greedy.section02.extend.RabbitFarm;
import com.greedy.section02.extend.WildCardFarm;

public class Application2 {
	
	public static void main(String[] args) {
		
		/*
		 * 와일드카드(WildCard)
		 * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
		 * 그 객체의 타입변수를 제한할 수 있다.
		 * 
		 * <?> : 제한 없음
		 * <? extends type> : 와일드카드의 사항 제한 (type과 type의 후손을 이용해 생성한 인스턴스만 인자로 사용가능)
		 * <? super type> : 와일드카드 하한 제한 (type과 type의 부모를 이용해 생성한 인스턴스만 인자로 사용가능)
		 * 
		 * 
		 * 
		 * */
		
		WildCardFarm wildCardFarm = new WildCardFarm();
		
		/* 농장 생성 자체가 불가능한것은 매개변수로 사용할 수 없다.*/
//		wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal));
//		wildCardFarm.anyType(new RabbirFarm<Reptile> (newReptile));
	
		/* 어떠한 토끼농장이던 매개변수로 사용이 가능하다. */
//		Rabbit r = new Rabbit();
//		wildCardFarm.anyType(new RabbitFarm<Rabbit>(r));
		// 이게 되는 이유는 
		wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.anyType(new RabbitFarm<DrukenBunny>(new DrukenBunny()));
		
		/*
		 * Bunny이거나 Bunny의 후손 토끼농장만 매개변수로 사용이 가능하고
		 * 상위타입으로 만든 토끼농장은 매개변수로 사용이 불가능하다.
		 * */
//		wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.extendsType(new RabbitFarm<DrukenBunny>(new DrukenBunny()));
	
		/*
		 * Bunny 이거나 Bunny의 상위 타입 토끼 농장만 매개변수로 사용이 가능
		 * --> 하위타입으로 만든 토끼 농장은 매개변수로 사용이 불사능하다.
		 * */
		wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//		wildCardFarm.superType(new RabbitFarm<DrukenBunny>(new DrukenBunny()));
		
		// 와일드 카드를 바니를 기준으로 설정했름
		/*
		 * 1. 레빗팜은 extendsType 바니 기준.
		 * 
		 * */
	
	
	
	
	
	
	
	}

}
