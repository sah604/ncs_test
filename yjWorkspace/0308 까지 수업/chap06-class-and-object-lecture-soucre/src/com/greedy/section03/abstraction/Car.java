package com.greedy.section03.abstraction;

public class Car {
	
	//sp!!!! 
	/*
	 * 시동을 켜거나 끄거나 , 앞으로 가거나 멈추거나 하는 행동
	 * --> 시동이 걸려있는지 확인
	 * 
	 * 메소드간에 서로 공유해야 하는 속성이 존재
	 * 그것을 필드에 작성
	 * 
	 * */

	private boolean isOn; // 초기에는 시동이 꺼진 false 상태이다.
	private int speed; 
	
	
	/**
	 * 자동차의 시동을 걸기 위한 메소드
	 */
	public void startUp() {
		
		if(isOn) {
			System.out.println("이미 시동이 걸려 있습니다");
		}else {
			this.isOn = true;
			System.out.println("시동을 걸었습니다. 출발 준비가 완료 되었습니다.");
		}
		
	}
	
	
	/**
	 * <pre>
	 *
	 * 자동차를 가속시키기 위한 메소드
	 * 시동이 걸린 상태인 경우에만 호출시마다 10km/h 속도를 증가시킨다
	 * </pre>
	 */
	public void go() {
		
		if(isOn) {
			System.out.println("차가 앞으로 움직입니다");
			this.speed +=10;
			System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다");
		}else {
			System.out.println("차의 시동이 걸려있지 않습니다. 시동을 걸어주세요");
		}
		
	}
	
	/**
	 * <pre>
	 * 자동차를 멈추기 위한 메소드
	 * 시동이 걸려있고 달리는 상태인 경우에만 멈출 수 있다.
	 * 
	 * </pre>
	 */
	public void stop() {
		
		if(isOn) {
			if(this.speed > 0) {
				this.speed = 0 ;
				System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
			}else {
				System.out.println("차는 이미 멈춰있는 상태입니다.");
			}
			
		}else {
			System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요 ");
		}
		
	}
	
	
	
	
	/**
	 * 자동차의 시동을 끄기위한 메소드
	 */
	public void turnOff() {
		
		if(isOn) {
			if(speed > 0) {
				System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 브레이크를 밟아 차를 멈춰주세요");
			}else {
				this.isOn = false;
				System.out.println("시동을 끕니다. 다시 운행 하시려면 시동을 켜주세요.");
			}
			
		}else {
			System.out.println("이미 시동이 꺼져 있는 상태입니다. 시동상태를 확인해주세요");
		}
	}
}






















