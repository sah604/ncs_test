package com.greedy.section01.list.run;

import java.util.Stack;

public class Application4 {
	// 스택 = 후입선출 
	public static void main(String[] args) {
		
		/* Stack 구조...   // 지금까지 배운 저장공간 스택과 다른것
		 * 
		 * Vector : 스레드 동기화처리가 지원
		 * 
		 * Stack은 리스트 계열 클래스의 Vector클래스를 상속받아 구현하였다. 
		 * 스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
		 * 후입선출(LIFO - Last Input Firt Out) 방식의 자료 구조라 불린다. 맨뒤에들어온 애가 맨 첨으로 나간다.
		 * 
		 * */
		
		/* Stack 인스턴스 생성 */
		Stack<Integer> integerStack = new Stack<>();
		
		/* 
		 * Stack에 값을 넣을 때는 push() 메소드를 이용한다.
		 * add()도 이용 가능하지만 Vector의 메소드 이다.
		 * 스택은 push()를 사용하는것이 좋다.
		 * 
		 * */
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		integerStack.push(5);
		
		System.out.println(integerStack);
		
		/*
		 * Stack에서 요소를 찾을때 search()를 이용할 수 있다.
		 * 인덱스가 아닌 위에서부터 순번을 의미한다.
		 * 또한 가장 상단의 위치가 0이아닌 1부터 시작한다.
		 * */
		
		System.out.println(integerStack.search(1));
		
		/*
		 * stack에서 값을 꺼내는 메소드는 크게 2가지로 볼 수 있다.
		 * peek() : 해당 Stack의 가장 마지막에 있는(상단에 있는) 요소 반환
		 * pop()  : 해당 Stack의 가장 마지막에 있는(상단에 있는) 요소 반환 후 제거
		 * 
		 * */
		
		System.out.println("peek() : " + integerStack.peek());
		System.out.println(integerStack);
		
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
//		System.out.println("pop() : " + integerStack.pop()); // EmptyStackException 발생. 지울거 보다 초과한경우
		System.out.println(integerStack);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
