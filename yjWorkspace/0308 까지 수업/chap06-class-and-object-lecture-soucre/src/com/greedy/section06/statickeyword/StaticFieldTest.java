package com.greedy.section06.statickeyword;

public class StaticFieldTest {
	/*non-static 필드와 static 필드 선언 */
	
	private int nonStaticCount;
	private static int staticCount;  // 여
	
	/* 기본 생성자 */
	public StaticFieldTest() {} // = this 는 기본생성자의 주소를 불러와주는 역할.
	
	
	/* 두 필드에 대한 값을 확인 */
	public int getNonStaticCount() {
		return this.nonStaticCount;
	}
	//StaticFieldTest. 안되는 이유 :  객체 생성의 주소값은 이미 생성돼 있음.
	// StaticFieldTest 이걸로는 스태틱에 접근가능
	// StaticFieldTest 로 논스태틱에 접근 불가능.  // 왜냐. 스태틱에 이미 저장되어있슴. 스태틱은.   근데 현재 클래스의 
	// this 는 스태틱, 논스태틱 접근가능
	// this 는 논스태틱 권장.
	
	public int getStaticCount() {
		/*
		 * static 필드에 접근하기 위해서는 클래스명.필드명으로 접근한다. //@@@@@@@@@@@@@@@@@@@@@@@@@@
		 * -> this. 으로도 접근은 가능하지만 this. 을 사용하지 않는 것이 좋다.
		 * */
		return StaticFieldTest.staticCount;
	}
	// this. 안 쓰는 이유 : 굳이 this 란 메소드를 써서 불러오지 않아도 필드 변수가 스태틱에 저장 돼 있기 때문에
	// this 메소드를 사용해 이 클래스의 주소값에 접근해서 불러오지 않고 클래스명. 을 바로 작성해서 불러온다.
	
	/* 두 필드 값을 1씩 증가시키기 위한 용도의 메소드 */
	public void increaseNonStaticCount() {
		this.nonStaticCount++;
	}
	
	public void increaseStaticCount() {
		StaticFieldTest.staticCount++; //스태틱이 아니라면 프라이빗에 접근 불가?
	}
	
}
