package com.greedy.section06.statickeyword;

public class StaticMethodTest {
	
	private int count;
	
	/* non-static 메소드와 static 메소드 두개를 호출해서 비교 */
	public void nonStaticMethod() {
		
		this.count++; // 주소값이 this 메소드 안에 들어가 있음
		
		System.out.println("nonStaticMethod 호출함...");
	}
	
	public static void staticMethod() { // 이미 여기서 static 저장공간에 생성됨.
		
//		this.count++; //인스턴스를 생성하지 않고 사용하는 메소드(스테틱) 이기 때문에
						// this에는 주소가 들어갈 수 없다.
		
		System.out.println("staticMethod 호출됨..");
	}

}
