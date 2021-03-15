package com.greedy.section05.parameter;

public class RactAngle {
	
	/* 사각형의 길이와 높이를 저장하는 필드 */
	private double width;
	private double height;
	
	public RactAngle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * 사각형의 넓이를 구하는 용도의 메소드
	 */
	public void calcArea() {
		double area = width * height;
		System.out.println("이 사각형의 넓이는" + area + "입니다.");
	}
	
	public void calcRound() {
		
		double round = (width + height) * 2;
		
		System.out.println("이 사각형의 둘레는 " + round + "입니다");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
