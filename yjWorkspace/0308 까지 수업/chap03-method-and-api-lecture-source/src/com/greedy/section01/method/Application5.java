package com.greedy.section01.method;

public class Application5 {
	public static void main(String[] args) {
		
		// 메소드 리턴 테스트
		// 모든 메소드 내부에는 return; 이 존재한다.
		// void 메소드의 경우 return; 을 명시적으로 작성하지 않아도 마지막 줄에 컴파일러가 자동으로 추가해 준다.
		// return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어 이다.
		// 호출된 곳으로 돌려주겠어
		
		// main() 메소드 시작확인
		System.out.println("main() 메소드 시작...");
	
		// 1. 메소드 리턴 테스트
		Application5 app5 = new Application5();
		app5.testMethod();
		
		System.out.println("main() 메소드 종료...");
	}
	
	public void testMethod() {
		System.out.println("testMethod() 동작 확인...");
		
		//return;
		// void안써도 되는 이유는 만약 /다른 자료형 일 떄 리턴이 없다면 무슨값으로 리턴 해줘야 할지 모르기 때문에/ 리턴 작성해줘야함
		// System.out.println("test"); // 리턴은 메소드 마지막에 작성해야 한다. 리턴 아래 작성 불가능
 	}

}
