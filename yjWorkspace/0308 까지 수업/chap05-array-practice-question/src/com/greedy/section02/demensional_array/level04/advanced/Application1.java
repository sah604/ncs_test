package com.greedy.section02.demensional_array.level04.advanced;

public class Application1 {

	public static void main(String[] args) {
		
		/* 세 명의 학생 성적 정보를 2차원 배열에 초기화 한 후
		 * 과목별 합계, 학생별 총점 및 평균을 구하여 출력하세요
		 * 
		 * -- 출력 예시 --
		 * ================== A반 성적표 ====================
         * 이름        국어          영어          수학          합계            평균
         * -----------------------------------------------
         * 홍길동       80           90          77            247          82.3
         * 이순신       78      97       86      261     87.0
         * 유관순       71      68       88      227     75.7
         * -----------------------------------------------
         * 합계        229     255      251      735     81.7
		 * */
		
		
		int[] hong = {80 , 90 , 77 };
		int[] lee = {78 , 97 , 86};
		int[] youu = {71 , 68 , 88};
		
		
		
		
		System.out.println("         ===A반 성적표===");
		System.out.println(" 이름    국어    영어    수학    합계");
		System.out.println("        -----------------");
		
		int total = 0;
		System.out.print("홍길동    ");
		for(int i = 0 ; i< hong.length; i++) {
			System.out.print(hong[i]);
			
			total += hong[i];
			
			System.out.print("     ");
		}
		System.out.print(total + "       ");
		double avg = (double)total / 3;
		System.out.println(avg);
		
		int total1 = 0;
		System.out.print("이순신   ");
		for(int i = 0 ; i< lee.length; i++) {
			System.out.print(lee[i]);
			
			total1 += lee[i];
			
			System.out.print("     ");
		}
		System.out.print(total1 + "       ");
		double avg1 = (double)total1 / 3;
		System.out.println(avg1);
		
		
	}
	
}
