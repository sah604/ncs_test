package com.greedy.section03.increment_decrement_operator;

public class Application3 {
	
	public static void main(String[] args) {
		
		int a = 5;
		
		int b = 10;
		
		int c = (++a) + b;
		//      현재값(다음번에 호출됐을때 반환해주는값)
		//       6(6) + 10
		//  a = 6
		//  b = 10
		//  c = 16
		
		int d = c / a;
		//      16 / 6
		//  a = 6
		//  b = 10
		//  c = 16
		//  d = 2
		
		int e = c % a;
		//      16 % 6
		//  a = 6
		//  b = 10
		//  c = 16
		//  d = 2
		//  e = 4
		
		int f = e++;
		//      4(5)
		//  a = 6
		//  b = 10
		//  c = 16
		//  d = 2
		//  e = 5
		//  f = 4
		
		int g = (--b) + (d--);
		//       9(9) + 2(1)
		//  a = 6
		//  b = 9
		//  c = 16
		//  d = 1
		//  e = 5
		//  f = 4
		//  g  = 11
		
		
		int h = 2;
		//  a = 6
		//  b = 9
		//  c = 16
		//  d = 1
		//  e = 5
		//  f = 4
		//  g = 11
		//  h = 2
		
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		//      6(7) + 9 / (15(15) / 4) * (11(10) - 1) % (6(6) + 2);
		//      6 +  9 / 3 * 10 % 8
        //      6 +   3   * 10 % 8
		//      6 +  30 % 8
		//      6 +  6 
		// i =   12
		
		//  a = 7
		//  b = 9
		//  c = 15
		//  d = 1
		//  e = 6
		//  f = 4
		//  g = 10
		//  h = 2
		//  i = 12
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
