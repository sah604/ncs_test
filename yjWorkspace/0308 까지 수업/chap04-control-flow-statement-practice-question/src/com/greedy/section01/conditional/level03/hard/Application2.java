package com.greedy.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입려하면 
		 * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
		 * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
		 * 
		 * -- 상품 가격 --
		 * 사과 :  1000원
		 * 바나나 : 3000원
		 * 복숭아 : 2000원
		 * 키위 : 5000원
		 * 
		 * -- 입력 예시 --
		 * 과일 이름을 입력하세요 : 바나나
		 * 
		 * -- 출력 예시 --
		 * 바나나의 가격은 3000원 입니다.
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" === 과일 가게 === ");
		System.out.print(" 사과 , 바나나 , 복숭아 , 키위  중 하나 입력 하시오 : ");
		String fuirt = sc.nextLine();
		//product  = 과일
		
		
		String price = "";
		
		switch (fuirt/* sc.nextLine(); 도 가능!*/){
			case "사과" :
				price = "1000 원";
				System.out.println(fuirt + "의 가격은 : " + price);
				break;
			case "복숭아" :
				price = "2000 원";
				System.out.println(fuirt + "의 가격은 : " + price);
			    break;
			case "바나나" :
				price = "3000 원";
				System.out.println(fuirt + "의 가격은 : " + price);
				break;
			case "키위" :
				price = "5000 원";
				System.out.println(fuirt + "의 가격은 : " + price);
				break;
			default :
				System.out.println("준비된 상품이 없습니다.");
			//return; 하면 지저분해지지 않겠죠?
		}	
		
		// String 의 "사과" 와 스캐너로 입력받은 "사과" 의 주소값이 달라서 외형은 같지만 속내는 다르다
		// 그래서 fuirt.equals("사과"); 로 구별
		
		
	
		
		
	}
}
