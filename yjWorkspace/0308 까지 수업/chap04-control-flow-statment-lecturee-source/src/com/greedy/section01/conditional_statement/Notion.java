package com.greedy.section01.conditional_statement;

public class Notion {
	public static void main(String[] args) {
		int num = 200;
		
		if(num >= 100) {
			System.out.println(num + " 은 100 이상입니다");
			if (num >= 500) {
				System.out.println(num + " 은 500 이상입니다");
				if (num > 1000) {
					System.out.println(num + " 은 1000보다 큽니다");
				}
			}
		}
		
		
		
		
		
	}

}
