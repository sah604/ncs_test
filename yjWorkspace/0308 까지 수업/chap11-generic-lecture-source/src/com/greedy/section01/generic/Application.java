package com.greedy.section01.generic;

public class Application {
	
	public static void main(String[] args) {
		
		/*
		 * 제네릭(generic) 
		 * 자바에서 제네릭이란 데이터의 타입을 일반화 한다는 의미를 가진다.
		 * 
		 * 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법을 말한다. 
		 * 컴파일 시에 미리 타입 검사를 시행하게 되면 클래스나 메소드 내부에서 사용되는 객체의 타입
		 * 안정성을 높일 수 있다.(잘못된 타입일 경우에는 컴파일 에러 발생)
		 * 반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다.
		 * (instanceOf 비교 및 다운캐스팅 작성 불필요)
		 * */
		
		/* 인스턴스 생성 */
		// 제네릭 클래스로 인스턴스를 생성할 시 타입변수 자리에 사용하려는 실제 타입을 명시해야 한다.
		GenericTest<Integer> gt1 = new GenericTest<Integer>(); // 나는 int(정수형) 타입만 받겠다.
		
		
		// Integer 타입
		gt1.setValue(new Integer(10)); //int 가 기본자료형인데 새로 선언 해야댐?
		System.out.println(gt1.getValue());
		System.out.println(gt1.getValue() instanceof Integer);
		
		// String 타입으로 생성 스트링 타입만 받겠다
		GenericTest<String> gt2 = new GenericTest<String>();
		gt2.setValue("홍길동");
		System.out.println(gt2.getValue());
		System.out.println(gt2.getValue() instanceof String);
		
		
		/*
		 * JDk 7부터 타입선언 시 타입변수가 작성되면 타입 추론이 가능하기 때문에
		 * 생성자 쪽의 타입(<이 안의 내용>)을 생략하고 사용할 수 있게 된다. */
		GenericTest<Double> gt3 = new GenericTest</*여기*/>();
		
		gt3.setValue(0.5);
		System.out.println(gt3.getValue());
		System.out.println(gt3.getValue() instanceof Double);
		
		
		/* 
		 * 사용한 제네릭은 컴파일 시점 타입 변환이 된 후에 사라지게 된다.
		 * 컴파일 완료된 코드에는 제네릭 코드가 제거되어 있어서 
		 * 제네릭 이전에 작성된 코드와의 하위 호환성을 위해서 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
