package com.greedy.section01.extend;

public class Application {
	
	public static void main(String[] args) {
		
		/* Car 클래스 생성 후 테스트 */
		Car car = new Car();
		
		car.soundHorn();
		car.run();
		car.soundHorn();
		car.stop();
		car.soundHorn();
		
		// 소방차 , 레이싱카 등 모두 자동차 이다.
		// FireCar is a Car.(O)   /  Car is a FireCar(x)
		// 위의 관계가 성립되는 것을 IS-A 관계라고 한다.
		// --> IS-A 관계가 성립이 되는 경우에는 상속을 사용할 수 있다.
		
		/* FireCar 클래스를 생성 후 테스트 */
		FireCar fireCar = new FireCar();
		// 파이어카가 상속 받았기 떄문에 다른클래스에서 호출시에도 정상 작동 된다.
		fireCar.soundHorn();
		fireCar.run();
		fireCar.soundHorn();
		fireCar.stop();
		fireCar.soundHorn();
		
		fireCar.sprayWater();
		
		/*
		 * 상속은 부모가 가진 멤버를 사용하면서 확장까지 가능하도록 해 두었다.
		 * 상속은 자식이 부모 멤버에 접근해서 자신것 처럼 사용가능하지만 반대의 경우는 허용하지 않는다. */
		
		/* RacingCar 클래스 생성 후 테스트 */
		RacingCar racingCar = new RacingCar();
		racingCar.soundHorn();
		racingCar.run();
		racingCar.soundHorn();
		racingCar.stop();
		racingCar.soundHorn();
	}

}
