package com.greedy.section01.conditional_statement;

public class Application {
	
	public static void main(String[] args) {
		
		A_if a = new A_if();
		/* 단독 if문 흐름 확인용 메소드 호출 */
		// a.testSimpleIfStatemant();
		
		/* 중첩 if문 흐름 확인용 메소드 호출 */
		//a.testNestedIfStatement();
		
		B_ifElse b = new B_ifElse();
		/* 단독 if-else 문 흐름 확인용 메소드 호출*/
		// b.testSimpleIfElseStatement();
		//b.testNestedIfElseStatement();
		
		C_ifElseIf c = new C_ifElseIf();
		//c.testSimpleIfElseIfStatement();
		/* 단독 if-else문 흐름 확인용 메소드 호출 */
		
		// c.testNestedIfElseIfStatement();
		/* 중첩 if-else 문 흐름 확인용 메소드 호출 */
		
		D_switch d = new D_switch();
		//d.testSimpleSwithStatement();
		/* switch문 흐름 확인용 메소드 호출 */
		
		/* 문자열 값 비교 및 break 테스트 */
		d.testSwitchVendingMachine();
	
	
	}

}
// 양수 실수 난수 정수 