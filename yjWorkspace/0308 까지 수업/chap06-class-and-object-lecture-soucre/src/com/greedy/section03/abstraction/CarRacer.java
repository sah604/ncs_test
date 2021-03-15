package com.greedy.section03.abstraction;

public class CarRacer {
	
	/* CarRace가 상호작용할 Car 클래스를 CarRacer를 알고 있어야 한다. */
	
	private Car car = new Car();
	
	/**
	 * 카레있어가 자동차의 시동을 걸 수 있는 메소드
	 * 
	 */
	public void startUp() {
		car.startUp();
	}
	
	/**
	 * 카레이써가 엑셀을 밟아서 가속을 할 수 있는 메소드
	 */
	public void stepAccelator() {
		car.go();
	}
	
	/**
	 * 카레잇어가 브레이크를 밟아 정지 할 수있는 메소드
	 */
	public void stepBreak() {
		car.stop();
	}
	
	/**
	 * 카레이서가 자동차의 시동을 끌 수있는 메소드
	 */
	public void tureOff() {
		car.turnOff();
	}
}
