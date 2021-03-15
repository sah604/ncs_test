package com.greedy.section04.vo;

import java.util.Date;

public class Application {
	public static void main(String[] args) {
		
		/* 생성자를 이용한 초기화와 설정자(setter)를 이용한 초기화 비교 */
		/* 생성자를 이용한 초기화와 설정자를 이용한 초기화는 각각의 장단점이 존재한다. */
		
		/* 1. 생성자를 이용한 초기화
		 * 장점 : setter 메소드를 여러번 호출해서 사용하지 않고 단 한번의 호출로 인스턴스 생성 및 초기화 가능.
		 * 단점 : 필드 초기화할 때 매개변수의 갯수를 경우의 수 별로 모두 만들어 줘야 한다.
		 * 		 호출 시 인자가 많아지는 경우 어떠한 값이 어떤 필드를 의미하는지 한 눈으로 보기 힘들다.
		 * 
		 * 2. 설정자를 이용한 초기화
		 * 장점 : 필드를 초기화 하는 각각의 값들이 어떤 필드를 초기화 하는지 명확하게 볼 수 있다.
		 * 
		 * 단점 : 하나의 인스턴스를 생성할 때 한 번의 호출로 끝나지 않는다.
		 * 
		 * */
		
		/* 생성자를 이용한 초기화 */
		UserVO user1 = new UserVO("greedy", "rmflrl", "그리디" ,new java.util.Date());
		System.out.println(user1.getInformation());
		
		/* 기본생성자와 설정자를 이용한 초기화 */
		UserVO user2 = new UserVO();
		user2.setId("greedy");
		user2.setPwd("grd123");
		user2.setName("민연");
		user2.setEnrollDate(new java.util.Date());
		
		System.out.println(user2.getInformation());
		
		
		
		
	}

}
