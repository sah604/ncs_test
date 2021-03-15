package com.greedy.section05.parameter;

public class ParameterTest {
	
	public void testPrimaryTypeParameter(int num) {
		System.out.println("매개변수로 전달받은값 : " + num);
	}
	
	public void testPrimaryTypeArrayParameter(int[] iarr) {
		
		/* 배열의 주소가 전달 된다.
		 * 즉, 인자로 전달하는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가리킨다.(얉은 복사)
		 * 
		 * 
		 * */
		System.out.println("매개변수로 전달받은 값 : " +iarr); // 주소값
		
		/* 배열의 0번 인덱스에 값 변경 */
		iarr[0] = 99;
		System.out.print("변경 후 배열의 값 출력 : " );
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i]+ " ");
		}
		System.out.println();
		
		
	}
	
	
	public void testClassTypeParameter(RactAngle rectAngle) {
		/*
		 * 인스턴스도 주소가 전달된다.
		 * 즉, 인자로 전달하는 인스턴스와 매개변수로 전달받은 인스턴스는 서로 동일한 
		 *     인스턴스를 가리킨다. (얕은복사) */
		System.out.println("매개 변수로 전달받은 값 : " + rectAngle);
		
		/* 사각형의 넓이와 둘레 출력*/
		System.out.println("변경전 사각형의 넓이와 둘레==================");
		rectAngle.calcArea();
		rectAngle.calcRound();
		
		/*사각형의 넓이와 둘레를 변경하자 */
		rectAngle.setWidth(100);    // 자동 형변환 적용
		rectAngle.setHeight(100);
		
		/*사각형의 넓이와 둘레 출력 */
		System.out.println("변경 후 사각형의 넓이와 둘레 =================");
		rectAngle.calcArea();
		rectAngle.calcRound();
	}

	public void testVaribleLengthArrayParameter(String name, String...hobby) { // ... 가변배열
		
		/*
		 * 가변길이의 배열은 몇개가 매개변수로 전달된지 모르는 상황이기에 
		 * 이름과 구분하기 위해 뒤쪽에 작성해야 한다.
		 * *** 앞쪽에 작성하는 경우 에러 발생.
		 */
		// 그니까 ... 은 배열이긴 한데 몇개를 받을지 모를때 선언한다?
		System.out.println("이름 : " + name);
		System.out.println("취미의 갯수 : " + hobby.length);
		System.out.print("취미 : ");
		for(int i = 0; i < hobby.length; i++) {
			System.out.print(hobby[i] + " ");
		}
		System.out.println();
	}


}

