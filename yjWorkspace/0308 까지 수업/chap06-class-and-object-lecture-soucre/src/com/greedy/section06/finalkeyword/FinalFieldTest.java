package com.greedy.section06.finalkeyword;

public class FinalFieldTest {
	
	/* non-static field에 final 사용*/

	/*
	 * final은 변경 불가능의 의미를 가진다.
	 * 따라서 초기 인스턴스(객체)가 생성되고 나면 기본값이 0이 필드에 들어가게 되는데
	 * 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 초기화를 해 주어야 한다.
	 * 그렇지 않으면 complie error가 발생
	 * */
//	private final int nonStaticNum; // 0으로 초기화 되어 이후 변경 불가능
	
	/* 이를 해결할 수 있는 방법 2가지가 있다. */
	/* 1. 선언과 동시에 초기화 한다. */
	private final int NON_STATIC_NUM =1; /* 여기(non static) 은 다른곳에서 호출 할 때마다 생성 된다.*/
	

	
	/* 2. 생성자를 이용해서 초기화 함 */
	private final String NON_STATIC_NAME; // 이것만 있으면 오류가 나는데 /* 여기(non static)*/
	
	public FinalFieldTest(String nonStaticName) {  
		this.NON_STATIC_NAME = nonStaticName;
	} // 이렇게 설정후에는 오류가 풀린다. 왜냐하면 
	// 논스태틱 필드변수는 heap 에 저장되어 생성될 때마다 새롭게 생겨서 이런 방법이 가능하다
	
	
	
	/* static field에 final 사용 */
	/*
	 * static 에도 자바에서 지정한 기본값이 초기에 대입되기 때문에 
	 * final 키우드 사용시 초기화를 하지 않으면 에러가 발생한다.
	 * */
	
	// 
	
//	private static final int STATIC_NUM; //에러 발생
	private static final int STATIC_NUM = 1;  /* 여기서 만들어진 순간 다른 공간에 저장됨 */
	
//	private static final double STATIC_DOUBLE;
	
	
	// 스태틱은 만들어짐과 동시에 다른 공간에 저장된다. (스태틱만의 공간)
	//스태틱으로 선언후 초기화해주지 않으면 0으로 초기값이 설정되는데, 
	//final 은 변수의 값을 변경해주지 못하니까 다음에 설정한다고 하면 final 이기때문에 바꿀수 없는 값이 된거지.

	/* 생성자로 초기화 불가 */
//	public FinalFieldTest(double staticDouble) {
//		FinalFieldTest.STATIC_DOUBLE = staticDouble;	
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

