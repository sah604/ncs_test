package com.greedy.section02.extend.run;

import com.greedy.section02.extend.Bunny;
import com.greedy.section02.extend.DrukenBunny;
import com.greedy.section02.extend.Rabbit;
import com.greedy.section02.extend.RabbitFarm;
import com.greedy.section02.extend.Snake;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* Animal 타입으로는 제네릭 클래스 인스턴스 생성이 불가능 하다. */
//		RabbitFarm<Animal> farm1 = newRabbitFarm<>();
		
		/* Mammal 타입으로는 제네릭 클래스 인스턴스 생성이 불가능 하다*/
//		RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
		
		/* 전혀 다른 타입을 이용해서도 인스턴스 생성이 불가능 하다,.*/
//		RabbitFarm<Snake> farm3 = new RabbitFarm<>();
		
		/* Rabbit 타입이나 Rabbit의 후손으로는 인스턴스 생성이 가능하다. */
		RabbitFarm<Rabbit> farm4 = new RabbitFarm<Rabbit>();
		RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
		RabbitFarm<DrukenBunny> farm6 = new RabbitFarm<>();
		
		Bunny farm7 = new DrukenBunny();
		
		((DrukenBunny)farm7).cryD();
		farm7.bunyOri();
		
		/* setter를 이용할 때에도 올바은 타입의 인스턴스를 인자로 전달해야 한다.*/
//		farm4.setAnimal(new Snake());
		
		farm4.setAnimal(new Rabbit());
		((Rabbit)farm4.getAnimal()).cry();
		farm4.getAnimal().cry(); // 형변환 생략 가능
		
		farm5.setAnimal(new Bunny());
		((Bunny)farm5.getAnimal()).cry();
		farm5.getAnimal().cry(); // 형변환 생략 가능
		
		farm6.setAnimal(new DrukenBunny());
		((Bunny)farm6.getAnimal()).cry(); // 동적 바인딩 일어남.
		farm6.getAnimal().cry();
		
	
	}
}
