package com.greedy.section04.array_sort;

public class Application1 {
	//정렬의 기초
	public static void main(String[] args) {
		
		/* 변수의 두 값 변경하기*/
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(" num1 : " + num1);
		System.out.println(" num1 : " + num2);
		
		/* 두 변수의 값을 바꾸기 위해서는 다른 변수 한개 더 필요 */
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(" num1 : " + num1);
		System.out.println(" num1 : " + num2);
		
		System.out.println("==========================");
		
		/* 배열의 인덱스에 있는 값도 서로 변경 할 수 있다. (-> 변수라고 생각) */
		int[] arr = {2,1,3};
		
		int temp2;
		
		temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		
	}

}
