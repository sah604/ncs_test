package com.greedy.section03.increment_decrement_operator;

public class Application2 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // 10(11)
		// a = 11, b = 20, c = 30
		
		System.out.println((++a) + (b++)); // 12(12) + 20(21)
		// a = 12, b = 21, c = 30
		
		System.out.println((a++) + (--b) + (--c)); // 12(13) + 20(20) + 29(29)
		// a = 13, b = 20, c = 29
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}
}
