package com.greedy.section01.method;

public class StaticTest {
	
	public static int  add (int n1, int n2) {
		int result = n1+n2;
		int add  = result;
		System.out.println(add);
		return add;
	}
	
	public static void name() {
		System.out.println("스테틱 임포트가 필요한가");
	}


}
