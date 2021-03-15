package com.greedy.section02.demensional_array;

public class Jusoo {
	public static void main(String[] args) {
		
		
		
		int[][] arr = new int[3][4];
		System.out.println(arr);
		
		arr = new int[3][2];
		System.out.println(arr);
		
		arr = new int[3][0];
		System.out.println(arr);
		//여기서
		 System.out.println("========================");
		int[][] arr2 = new int[3][];
		System.out.println(arr2); //이거의 주소값 3행 0(null)열 
		
		arr2 = new int[3][0];
		System.out.println(arr2); // 3행 0열의 주소
		
		arr2 = new int[3][11];
		System.out.println(arr2); //이러면 바뀜
		//둘이 주소값 같음
		arr2[0] = new int[5];
		System.out.println(arr2);
		
		arr[0] = new int[10];
		System.out.println(arr2);
		
		arr2 = new int[3][0];
		System.out.println(arr2); 
		
		
		 System.out.println("========================");
		 
		arr2 = new int[3][4];
		System.out.println(arr2); 
		
		System.out.println(arr2.hashCode());
		System.out.println(arr2[0][1]); // -> 값말고 주소값을 출력 하려면?
		
		 System.out.println("========================");
		 System.out.println(arr2);
		 System.out.println(arr2[0]);
		 System.out.println(arr2[1]);
		 
		
		int[] arr3 = new int[4];
		
		System.out.println(arr3[3]); //여기에는 주소가 없구나
		
		
		
		
		
		
		
		
//		System.out.println(arr[3][0]); // 3행 0열의 값이 선언되지 않았기 때문에 오류
		
		
		// 이게 실행되는 이유는 0번째 방에 열의 주소값이 생성됐기 때문에 실행 간웅.
		
		
		
		
		
		
		
		
			}

}
