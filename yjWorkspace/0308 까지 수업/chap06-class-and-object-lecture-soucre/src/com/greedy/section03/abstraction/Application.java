package com.greedy.section03.abstraction;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		// 카레이서가 자동차를 운전하는 프로그램을 만들려고 한다.
		/*
		 * 기능을 최대한 단순화 시켜서 프로그램을 만들어보자.
		 * 1. 자동차는 처음에 멈춤 상태로 대기하고 있는다.
		 * 2. 카레이서는 먼저 자동차에 시동을 건다. 이미 걸려있는 경우 다시 시동을 걸 수 없다,
		 * 3. 카레이서가 엑셀레이터를 밟으면 시동이 걸린상태일 경우 자동차는 시속이 10km/h 증가하며 앞으로 나간다.
		 * 4. 자동차가 달리는 중인 경우에 브레이크를 밟으면 자동차의 시속은 0으로떨어지며 멈춘다.
		 * 5. 브레이크를 밟을때 자동차가 달리는 중이 아니라면 이미 멈추있는 상태라고 안내한다.
		 * 6. 카레이서가 시동을 끄면 더이상 자동차는 움직이지 않는다.
		 * 7. 자동차가 달리는 중이라면 시동을 끌 수 없다.
		 * 
		 * 
		 * */
		
		/* 
		 * 여기서 필요한 객체는 카레이서와 자동차 객체이다.  (액셀과 브레이크는 자동차 안에 들어가죠)
		 * 카레이서
		 * 1. 시동을 걸어라
		 * 2. 엑셀 밟기
		 * 3. 후레이끄 밟기
		 * 4. 시동을 꺼라
		 * 
		 * */
		//행위에 포커스를 맞춰서 그행위가 필요한 내용을 뽑아내는 작업이 추상화 작업
		/* 자동차
		 * 1. 시동 걸리기
		 * 2. (시속증가)앞으로 가라
		 * 3. 멈추기
		 * 4. 시동을 꺼라. 
		 * */
		
		CarRacer racer = new CarRacer();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=========카레이싱 프로그램==========");
		System.out.println("1. 시동걸기");
		System.out.println("2. 전진");
		System.out.println("3. 정지");
		System.out.println("4. 시동끄기");
		System.out.println("9. 프로그램 종료");
		
		while(true) {
			
			System.out.println("메뉴 선택");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : racer.startUp(); break;
				case 2 : racer.stepAccelator(); break;
				case 3 : racer.stepBreak(); break;
				case 4 : racer.tureOff(); break;
				case 9 : System.out.println("프로그램을 종료합니다"); break;
				default : System.out.println("잘못된 번호를 입력 하셨습니다"); break;
			}
			
			
		if (no == 9) {
			break;
		}
		
		
		}
		
		
		
		
		
		
		
	}

}
