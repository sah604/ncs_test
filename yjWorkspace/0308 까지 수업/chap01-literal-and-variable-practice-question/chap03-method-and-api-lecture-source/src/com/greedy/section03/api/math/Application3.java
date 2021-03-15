package com.greedy.section03.api.math;

import java.util.Random;

public class Application3 {
	public static void main(String[] args) {
		
		/*
		  * java.util.Random 클래스
		  * java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
		  * nextInt (int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를
		  *                       발생시켜 정수 형태로 반환.
		  *                       
		  * 원하는 범위의 난수를 구하는 공식
		  * random(random객체이름).nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
		  * 
		  * */
		Random random = new Random(); //TODO 풀패키지 네임 써보기
		
		// 0부터 9까지의 난수 발생
		int randomNumber1 = random.nextInt(10);
		System.out.println(randomNumber1);
		
		// 1부터 10까지 난수 발생
		int randomNumber2 = random.nextInt(10) + 1;
		System.out.println(randomNumber2);
		
		// 20 부터 45 까지의 난수 발생
		int randomNum3 = random.nextInt(26) + 20;
		System.out.println(randomNum3);
		
		// -128 부터 127 까지의 난수 발생 127-(-128) : 255 + 1
		int randomNum4 = random.nextInt(256) - 128;
		//int randomNum4 = new Random().nextInt(555) +1;
		System.out.println("-128 ~ 127 까지의 난수 : " + randomNum4);
	}
	
}
