package com.greedy.section06.statickeyword;

public class Application {
	
	public static void main(String[] args) {
		
		/*  static 키워드와 final 키워드에 대해 알아보자*/
		
		/*
		 * static : 정적 메모리 영역에 프로그램이 start될 때 할당을 하는 키워드이다.
		 * 			인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 
		 * 			지정할 수 있다.
		 * 			여러 인스턴스가 공유해서 사용할 목적의 공간이다.
		 * 			하지만 static키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야할 방법이다.
		 *  		명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제하자.
		 *  		의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때 이다. 
		 * 
		 * 
		 * final :  final은 중단의 의미를 가지는 키워드이다.
		 * 		    final 키워드를 사용할 수 있는 위치는 다양한 편이며
		 * 		    의미가 약간 다르지만, 결국은 변경 불가의 의미이다. // 싱글톤은 파이날 노?
		 *			
		 *			1. 지역변수 : 초기화 이후 값 변경 불가
		 *			2. 매개변수 : 호출 시 전달한 인자 변경 불가
		 *			3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
		 *			4. 클래스  : 프로그램 start 이후 값 변경 불가
		 *		5. non-static 메소드 : 메소드 재작성(재 정의)(overriding/오버라이딩 ) 불가
		 * 		6. static 메소드 : 메소드 재작성(overriding) 불가
		 * 			7. 클래스  : 상속 불가
		 * 
		 * */
		
		/* static 키워드를 필드에서 사용하는 것을 먼저 확인 해보자 */
		/*StaticFieldTest 인스턴스 생성 */
		StaticFieldTest sft1 = new StaticFieldTest();
		
		/* 두 필드가 가지고 있는 값 확인 */
		System.out.println("non-static field : " + sft1.getNonStaticCount());
		System.out.println("static field : " + sft1.getStaticCount());
		
		/* 두 필드의 값 1씩 증가 후 다시 값 확인*/
		sft1.increaseNonStaticCount();
		sft1.increaseStaticCount();
		
		/* 두 필드가 가지고 있는 값 확인*/
		System.out.println("non-static field : " + sft1.getNonStaticCount());
		System.out.println("static field : " + sft1.getStaticCount());
		
		/* 새로운 스태틱필드테스트 인스턴스 생성*/
		StaticFieldTest sft2 = new StaticFieldTest();
		System.out.println("non-static field : " + sft2.getNonStaticCount());
		System.out.println("static field : " + sft2.getStaticCount());
		
		/*
		 * 인스턴스 변수의 경우에는 sft1과 sft2 두개의 인스턴스가 서로 값을 공유하지 못하고 
		 * 인스턴스를 생성할 때 마다 0으로 초기화
		 * 
		 * 하지마 static 필드의 경우에는 클래스 변수 자체가 프로그램을 종료 할 때까지 유지되고 있기 때문에
		 * 값을 유지하고 있다.
		 * 
		 * 따라서 여러 개의 인스턴스가 같은 공간에 공유할 목적으로 field에 static 키워드를 사용한다.
		 * */
		
		
		/* non-static 메소드 호출 */
		
		StaticMethodTest smt = new StaticMethodTest();
		smt.nonStaticMethod();
		
		smt.staticMethod(); // 권장하지 않는다. 스태틱의 경우에는 인스턴스 생성하지 않고 바로 호출해야 스태틱의 의도 맞추기 가능
	
		/* 클래스명.메소드명으로 인스턴스를 생성하지 않고 호출할 수 있다. 
		 * ex) Math 클래스의 메소드들
		 * */
		StaticMethodTest.staticMethod();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
