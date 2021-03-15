package com.greedy.level02.normal;

public class Random {
	
	public void randomNumber(int min, int max) {
		 //                      5      10
		int a = max - min;
		
		int random1 = (int)(Math.random() * a) + min;
		
		System.out.println(random1);
		
	}
	
	public void randomUpperAlphabet(int lenght) {
		
		
		char lenght1;
		
		for (int i = 1; i <= lenght; i++) {
			lenght1 = (char) ((Math.random() * 26) +65);
			
			System.out.print(lenght1);
		}

	}
	
	public void rockPaperScissors() {
		 System.out.println(" ");
		 
		int a = (int)(Math.random() * 3) + 1;
		
		String ga = "가위";
		String ba = "바우";
		String bo = "보";
		
		if(a == 1) {
			System.out.println(ga);
		}else if(a == 2) {
			System.out.println(ba);
		}else {
			System.out.println(bo);
		}
		

	}
	
	public void tossCoin() {
		int a = (int)(Math.random() * 2) + 1;
		
		String front = "앞면";
		String back = "뒷면";
		
		if (a == 1) {
			System.out.println("앞면");
		}else {
			System.out.println("뒷면");
		}
	}
	
	
	

}
