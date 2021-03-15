package com.greedy.level01.basic;

public class Calculator {
	
	public void checkMethod() {
		System.out.println("메소드 호출 확인");
	}
	
	public void sum1to10() {
		int sum = 0;
		for(int i = 1; i <=10 ; i++) {
			sum += i;
			
		}
		System.out.println("1부터 10까지의 합 : " +sum);
	}
	
	public void checkMaxNumber(int a, int b) {
		
		int max = Math.max(a, b);
		System.out.println("둘 중 큰수는 ? : "+ max);
	}
	
	public void sumTwoNumber(int a, int b) {
		
		int add = a + b;
		
		System.out.println("10과 20의 합은 : " + add);
	}
	
	public void  minusTwoNumber (int a, int b) {
		
		int minus = a - b;
		
		System.out.println("10과 5의 합은 : " + minus);
		
	}
	

}
