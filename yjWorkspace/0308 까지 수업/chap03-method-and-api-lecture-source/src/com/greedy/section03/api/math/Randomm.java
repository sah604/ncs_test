package com.greedy.section03.api.math;

import java.util.Random;

public class Randomm {
	public static void main(String[] args) {
		
		Random randomNum = new Random();
		
		int a ;
		a = randomNum.nextInt(55000) + 1;
		System.out.println(a);
		
		
	}

}
