package com.greedy.section02.demensional_array;

public class Jusoo2 {
	public static void main(String[] args) {
		int[][] arr = new int [3][4];
		arr = new int [6][6];
		System.out.println(arr[5][5]);
		
		arr[5][4] = 4;
		
		arr = new int[1][1];
		
		// 엥 되네...
		arr = new int [4][4];
		System.out.println(arr[3][3]);
		
		
		
		arr[0] = new int[5];
		System.out.println(arr[0]);
		
		arr[0] = new int[10];
		System.out.println(arr[0]);
		
		int[] arr2 = new int[4];
		
		arr2 = new int[5];
		
		
		
		
		
				
	}

}
