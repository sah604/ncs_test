package com.greedy.section01.init;

public class Application {
	public static void main(String[] args) {
		
		/*
		 * 객체배열은 레퍼런스 변수에 대한 배열이다.
		 * 생성한 인스턴스도 배열을 이용해서 관리하면 동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고
		 * 연속 처리할 수 있어서 유용하다
		 * 
		 * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
		 * 동일한 타입의 여러 인스턴스를 반환 해야 하는경우 객체배열을 이용 할 수있다.
		 * 
		 * 
		 * */
		
		/* 자동차 5대 인스턴스 생성 */
		Car car1 = new Car("페라리" , 330);
		Car car2 = new Car("람보르기니" , 150);
		Car car3 = new Car("롤스로이스" , 200);
		Car car4 = new Car("부가티" , 430);
		Car car5 = new Car("포터2" , 530);
		
		car1.driveMaxSpeed();
		car2.driveMaxSpeed();
		car3.driveMaxSpeed();
		car4.driveMaxSpeed();
		car5.driveMaxSpeed();
		System.out.println("============================");
		/* 동일한 타입의 인스턴스를 여러개 사용해야 할 때 객체배열을 이용하면 보다 효율적으로 사용 할 수있다.*/
		Car[] carArray = new Car[5];
		carArray[0] = new Car("페라리" , 330);
		carArray[1] = new Car("람보르기니" , 150);
		carArray[2] = new Car("롤스로이스" , 200);
		carArray[3] = new Car("부가티" , 430);
		carArray[4] = new Car("포터2" , 530);
		
		for(int i = 0; i < carArray.length; i++) {
			carArray[i].driveMaxSpeed();
		}
		
		/* 객체배열도 할당과 동시에 초기화할 수 있다. */
		Car[] carArray2 = {
				new Car("페라리",300)
				, new Car("람보르니기",350)
				, new Car("롤스로",250)
				, new Car("포타", 600)
				, new Car("모닝",50)
		};
		System.out.println("============향상된 포문================");
		
		String[] s = {"안녕" ,"반가워", "난 for 문이야"};
		for(String str : s) {
			System.out.println(str);
		}
		
		/* 향상된 for문 사용이 가능하다 */
		for(Car c : carArray2) {
			c.driveMaxSpeed();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
