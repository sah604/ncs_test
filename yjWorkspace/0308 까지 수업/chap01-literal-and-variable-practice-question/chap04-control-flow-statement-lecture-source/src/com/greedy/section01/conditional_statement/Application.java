package com.greedy.section01.conditional_statement;

public class Application {

	public static void main(String[] args) {
		
		A_if a = new A_if();
		/* 단독 if문 흐름 확인용 메소드 호출 */
		//a.testSimpleIfStatement();	// A_if 어플리케이션 내 단독 if문
		
		/* 중첩 if문 흐름 확인용 메소드 호출 */
		//a.testNestedIfStatement();	// A_if 어플리케이션 내 중첩 if문
		
		B_ifElse b = new B_ifElse();
		/* 단독 if-else문 후름 확인용 메소드 호출 */
		//b.testSimpleIfElseStatement();
		
		//b.testNestedIfElseStatmement();
		
		// 단독 if-else
		C_ifElseIf c = new C_ifElseIf();
		//c.testSimpleIfElseIfStatement();
			
		// 중첩 if-else
		//c.testNestedIfElseIfStatement();
		
		//c.improvedNest // TODO 다 못했음. 혼자 해볼 것
		
		D_switch d = new D_switch();
		
		/* switch문 흐름 확인용 메소드 호출 */
		//d.testSimpleSwtichStatement();
		
		/* 문자열값 비교 및 break 테스트 */
		d.testSwitchVendingMachine();
		
		
	}
	
}
