package com.greedy.section02.superkeyword;

public class Application {
	
	public static void main(String[] args) {
		
		ProductVO product1 = new ProductVO();
		System.out.println(product1.getInfomation());
		
		ProductVO pro2 = new ProductVO("5-12312", "삼성", "갤럭시폴드1" , 2500000, new java.util.Date());
		System.out.println(pro2.getInfomation());
		
		ComputerVO com1= new ComputerVO();
		System.out.println(com1.getInfomation());
		
		ComputerVO com2 = new ComputerVO("퀄컴", 812, 12, "안드로이드");
		System.out.println(com2.getInfomation());
		
		ComputerVO com3 = new ComputerVO("5-12312", "삼성", "갤럭시폴드1" ,
				2500000, new java.util.Date(),"퀄컴", 812, 12, "안드로이드");
		System.out.println(com3.getInfomation());

	}
}
