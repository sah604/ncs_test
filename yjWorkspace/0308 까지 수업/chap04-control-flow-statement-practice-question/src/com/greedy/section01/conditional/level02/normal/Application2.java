package com.greedy.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* BMI(신체질량지수)를 계산하고, 계산된 값에 따라 
		 * 저체중(20 미만)인 경우 "당신은 저체중 입니다.", 
		 * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.", 
		 * 과체중(25이상 30미만)인 경우 "당신은 과체중 입니다.", 
		 * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
		 * 
		 * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
		 * 
		 * 계산 예시) BMI = 67 / (1.7 * 1.7)
		 * */
		System.out.println("== BMI 계산기 ===");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("당신의 몸무게 입력  /*추가*/ (kg 제외): "); 
		float weight = sc.nextFloat()/*추가*/ / 100;
		
		System.out.print("당신의 키 입력 /*추가*/ (cm 제외) : "  );
		double height = sc.nextDouble();
		
		float bmi = (weight / (float)(height  * height));
		
		/* 추가 */
		String result = "";
		
		System.out.println(bmi+ " 이며");
		
		if (bmi >= 30) {
			System.out.println("당신은 비만 입니다");
			/* 추가 */ //result = "저체중";
		}else if (bmi >= 25 && bmi <= 29) {
			System.out.println("당신은 과체중 입니다.");
		}else if (bmi < 25 && bmi >= 20) {
			System.out.println(" 정상 체중 입니다.");
		}else{
			System.out.println(" 당신은 저체중입니다");
		}
		
		/* 추가 */
		//System.out.println("당신은"+ result + "입니다");
			
		
		
		
		
		
		
		
		
	}
}
