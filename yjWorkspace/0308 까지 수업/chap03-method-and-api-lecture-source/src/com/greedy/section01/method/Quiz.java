package com.greedy.section01.method;

public class Quiz {
	public static void main(String[] args) {
		Quiz qu = new Quiz();
		System.out.println(qu.circleArea(5, 3.14));
		
		System.out.println(qu.circlePerimeter(8, 3.141592));
		
	}
	
	public double circlePerimeter(double radius, double PI) {
		return (radius*radius) * PI; //원넓이
	}
	
	public double circleArea(double radius , final double PI) {
		return 2 * radius * PI; //원 둘레
	}
	

}


