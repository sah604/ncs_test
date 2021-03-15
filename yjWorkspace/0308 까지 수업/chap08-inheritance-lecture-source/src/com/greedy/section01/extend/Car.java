package com.greedy.section01.extend;
// 부모 클래스
public class Car {
	/* 자동차의 달리는 상태를 확인 할 수 있는 필드 */
	
	private boolean runningStatus; // 기본값 펄스
	
	/* 기본 생성자 */
	public Car() {
//		super(); // object 클래스로 이동.. 모든클래스는 오브젝트 클래스를 상속 받는다.
		
		
		System.out.println("Car 클래스의 기본 생성자 호출됨...");
	}
	
	/**
	 * 자동차의 기본적인 달리는 기능
	 */
	public void run() {
		
		/* 자동차는 기본적으로 달리는 기능을 수행할 수 있다. */
		runningStatus = true;
		System.out.println("자동차가 달립니다");
	}
	
	/**
	 * 자동차의 기본적인 경적을 울리는 기능(크락숀)
	 */
	public void soundHorn() {
		
		if(isRunning()) {
			System.out.println("빵빵!");
		}else {
			System.out.println("주행중이 아닌 상태에는 경적을 울릴 수 없습니다.");
		}
	}
	
	/**
	 * 자동차의 주행중 상태를 반환해주는 메소드
	 * @return true이면 주행중 / false이면 멈춤 상태
	 */
	protected boolean isRunning() {
		/* 자동차의 주행중 상태를 반환하는 기능을 수행*/
		
		return runningStatus;
	}
	
	/**
	 * 자동차의 기본적인 멈추는 기능
	 */
	public void stop() {
		runningStatus = false;
		System.out.println("자동차가 멈춥니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
