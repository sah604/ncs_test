package com.greedy.section01.ploymorphism;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* 다형성과 객체 배열을 이용해서 여러 인스턴스를 연속 처리 */
		
		Animal[] animals = new Animal[5];
		
		animals[0] = new Rabbit(); // 각각의배열에 레퍼런스 주소 넣기.
		animals[1] = new Tiger();
		animals[2] = new Rabbit();
		animals[3] = new Tiger();
		animals[4] = new Rabbit();
		
		for(int i =0 ; i < animals.length; i++) {
			animals[i].cry();
		}
		
		/*
		 * 각 클래스별 고유한 메소드를 동작시키게 하기 위해서는
		 * 다운 캐스팅을 명시적으로 해줘야 한다,.
		 * 클래스캐스트익셉션을 방지하기 위해 인스턴스오브를 사용한다.*/
		
		for(int i = 0; i < animals.length; i++) {
			/* 만약 토끼면 점프를 뛰고, 호랑이면 울어라*/
			
			if(animals[i] instanceof Rabbit) {
				((Rabbit) animals[i]).jump();
				
			}else if(animals[i] instanceof Tiger){
				((Tiger) animals[i]).bite();
				
			}else {
				System.out.println("호랑이나 토끼가 아닙니다.");
			}
		}
	
	}

}
