package com.greedy.section05.parameter;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * 메소드의 파라미터 선언부에는 다양한 종류의 값을 인자로 전달하여 호출할 수 있다.
		 * 
		 * 매개변수(parameter)로 사용 가능한 자료형
		 * 1. 기본자료형
		 * 2. 기본자료형의 배열
		 * 3. 클래스 자료형 (car 에서 CarRacer로 이동)
		 * 4. 클래스 자료형 배열
		 * 5. 가변인자 
		 * 
		 * */
		
		ParameterTest pt = new ParameterTest();
		
		/* 1. 기본 자료형을 매개변수로 전달 받는 메소드 호출 확인*/
		/* 기본 자료형 8가지 모두 가능하다. */
		int num = 20;
		
		pt.testPrimaryTypeParameter(num);
		
		/* 기본자료형은 인자로 전달하는 값과 매개변수로 전달하는 값과 자료형이 동일하다.*/
		
		/* 2. 기본자료형 배열을 매개변수로 전달 받은 메소드 호출 확인 */
		int[] iarr = new int[] {1,2,3,4,5};
		System.out.println("인자로 전달하는 값 : " + iarr);
		pt.testPrimaryTypeArrayParameter(iarr);
		System.out.println("==========================================");
		
		/* 메소드로 호출 후 값 변경 확인 */
		System.out.print("변경 후 원본 배열의 값 출력 : ");
		for(int i = 0 ; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
		

		/* 3. 클래스 자료형 */
		/* 사각형의 가로, 세로의 길이를 저장할 RactAngle이라는 클래스를 이용해서 확인 */
		RactAngle r1 = new RactAngle(12.5, 22.5);
		System.out.println("인자로 전달 하는 값 : " + r1);

		pt.testClassTypeParameter(r1);
		
		/* 4. 클래스 자료형 배열은 뒤에서... */
		
		/* 5. 가변인자 */
		/*
		 * 인자로 전달하는 값의 갯수가 정해지지 않은 경우 가변배열을 활용 할 수 있다 */
//		pt.testVaribleLengthArrayParameter();  // 인자가 아무것도 없는 경우 에러발생
		pt.testVaribleLengthArrayParameter("홍길동"); //가변인자는 전달하지 않아도 된다.
		pt.testVaribleLengthArrayParameter("유관순", "볼링");
		pt.testVaribleLengthArrayParameter("이순신", "볼링" ,"축구", "당구");
		pt.testVaribleLengthArrayParameter("신사임당", new String[] {"테니스", "서예", "떡썰기"});
		
		/*testVaribleLengthArrayParameter 메소드를 오버로딩 하게 되면
		 * 컴파일 에러가 발생한다.
		 * WHy? 둘 중 어떤 메소드를 호출하는것인지에 대한 모호성이 발생했기 때문에 에러가 난다.
		 * ㅡ> 가변배열을 매개변수로 이용한 메소드는 모호성으로 인하여 오버로딩 안하는것이 좋다. */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
