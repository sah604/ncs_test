package com.greedy.section02.demensional_array;



public class Application2 {
	public static void main(String[] args) {
		
		/* 2차원 정변배열을 선언 및 할당 하고 차례로 값을 대입해서 출력해보자 */
		
		/* 1. 배열의 선언 및 할당 
		 * 정변 배열의 경우 각 인덱스별 배열을 따로 할당 할 수 있지만 
		 * 선언과 동시에 모든 배열을 할당 할 수 있다.
		 * 
		 * 자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][할당할 배열의 길이];
		 * 
		 */
		
		int[][] iarr = new int[3][5];
		
		/* 2. 각 배열의 인덱스에 접근해서 값 대입 후 출력 */
		/* 값 대입 */
		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
		iarr[0][3] = 4;
		iarr[0][4] = 5;
		
		iarr[1][0] = 6;
		iarr[1][1] = 7;
		iarr[1][2] = 8;
		iarr[1][3] = 9;
		iarr[1][4] = 10;
		
		iarr[2][0] = 11;
		iarr[2][1] = 12;
		iarr[2][2] = 13;
		iarr[2][3] = 14;
		iarr[2][4] = 15;
		
		/* 값 출력 */
		System.out.println(iarr[0][0] + "" +
		iarr[0][1] +
		iarr[0][2] +
		iarr[0][3] +
		iarr[0][4] +
		" "+
		iarr[1][0] +
		iarr[1][1] +
		iarr[1][2] +
		iarr[1][3] 	+	iarr[1][4]+
		" "+
		iarr[2][0] +
		iarr[2][1] +
		iarr[2][2] +
		iarr[2][3]+
		iarr[2][4]);
		
		//sp? 머 햇어야댓음?
		
		int value = 1;
		
		for(int i = 0; i < iarr.length; i++) {
			
			for(int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = value ++; // 1부터 시작이니께
				
			}
		}
		
		//값 출력
		
		for(int i = 0; i < iarr.length; i++) {
			
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
				
			}
			System.out.println();
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
