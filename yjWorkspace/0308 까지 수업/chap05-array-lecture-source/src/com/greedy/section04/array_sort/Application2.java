package com.greedy.section04.array_sort;

public class Application2 {

	public static void main(String[] args) {
		
		/*
		 * 순차정렬
		 * 순차 정렬이란 정렬 알고리즘 에서 가장 간단하고 기본이 되는 알고리즘으로
		 * 배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기본적인 정렬 알고리즘/
		 * 
		 * */
		
		/* 초기배열 선언 및 초기화 */
		int[] iarr = {2,5,4,6,1,3};
		
		for(int i = 1/*자기자신 다음부터 비교*/; i < iarr.length; i++) {
			
			for(int j = 0; j < i; j++) { // for 이 한번 끝나면 끝나는거 아니엇음>@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
				
				// 부등호 방향이  < : 오름차순
				//             > : 내림차순
				if(iarr[i]  < iarr[j]) {
					int temp; // 비교대상이 더 작으면 그 값이랑 바꿈. 결국 작은걸 끄집어 내는 거니까 작은게 앞에오게됨.
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}
			}
		}
		
		for(int i =0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
