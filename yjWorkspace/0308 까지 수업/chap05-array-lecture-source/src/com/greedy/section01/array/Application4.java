package com.greedy.section01.array;

import java.util.Scanner;

public class Application4 {
	public static void main(String[] args) {
		
		/* 배열을 이용한 예제 */
		/* 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램을 만들어 보세요 */
		
		// 일단, 5명을 배열로 만들고, 배열이 꽉찰 때까지 반복문...
		
		Scanner sc = new Scanner(System.in);
		
		int javaScore[] = new int[5];
		double totalScore = 0.0; 
		
		
		for(int i = 0; i < javaScore.length; i++) {
			System.out.print((i + 1) + "번째 학생의 자바 점수 입력 : " );
			
			javaScore[i] = sc.nextInt();
			
			totalScore += javaScore[i];
			
		}
		
		double sum = 0.0;
		/**/ double avg2 = 0.0;
		for(int i = 0; i < javaScore.length; i ++) {
			sum += javaScore[i];;
		}
		
		double avg = totalScore / javaScore.length;
		System.out.println("학생 5명의 평균 점수는" +avg);
	}

}
