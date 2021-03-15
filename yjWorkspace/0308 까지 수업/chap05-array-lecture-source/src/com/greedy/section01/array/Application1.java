package com.greedy.section01.array;

public class Application1 {
	public static void main(String[] args) {
		
		/*
		 * 배열이란?
		 * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한용도) 이다.
		 * 배열은  heap영역에 new 연산자를 이용하여 할당한다.
		 * 
		 * 배열의 값이 Heap (휘발성의 메모리, 본인역할 후 사라짐) 에 저장.
		 * 배열[] 의 큰 주소 1개. (new 와 같이 힙에 저장)
		 * 
		 */
		
		/*
		 * 배열의 사용이유
		 * - 만약 배열을 사용하지 않는다면 변수를 여러개 사용해야 한다.
		 * 1. 연속된 메모리 공간으로 관리할 수 있다.( 모든 변수의 이름을 사용자가 관리해야 한다,)
		 * 2. 반목문을 이용한 연속 처리가 불가능하다. 
		 * 
		 */
		
		/*
		 * 변수 5개의 값을 저장한다.
		 * -> 사용자(개발자)는 변수의 이름을 모두 알아야 한다.
		 * */
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum = 0;
		
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		
		System.out.println("sum : " +sum);
		
		/* 배열을 이용해보자 */
		/* 배열의 선언 및 할당*/
		int[] arr = new int[5]; // index 는 4 (0,1,2,3,4)
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//값을 대입할때 반복문을 사용할 수 있다.
		for(int i = 0, value = 0; i < arr.length ; i++) {
			arr[i] = value += 10;
		}
		
		//누적해서 담을 변수 선언
		int sum2 = 0;
		//일반적인 변수처럼 사용 가능
		sum2 += arr[0];
		sum2 += arr[1];
		sum2 += arr[2];
		sum2 += arr[3];
		sum2 += arr[4];
		
		System.out.println("sum2 : " + sum2);
		
		// 반복문을 이용해서 누적하여 담을 변수
		int sum3 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum3 += arr[i];
		}
		
		System.out.println("sum3 : " + sum3);
		
		
		
		
		
		
		
		
		
		
	}

}
