package com.greedy.section03.array_copy;

public class Application2 {
	public static void main(String[] args) {
		
		/* 얕은 복사의 활용 */
		/*
		 * 얕은 복사를 활용 하는 것은 주로 메소드 호출시 인자로 사용하는 경우와
		 * 리턴 값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
		 * 
		 * 
		 * */

		String[] names = {"홍길동","유관순","이순신"};
		
		/* 얕은 복사 확인을 위한 hashcode 출력 */
		System.out.println("names의 hashcode : " + names.hashCode());
		
		/* 배열을 매개변수로 전달받는 출력 기능 (얕은복사) */
		// static 메소드 호출방법
		// 클래스.메소드명()
		// -> 같은 클래스 내에 있는것을 호출하려면 클래스명 생략가능
		print(names);
		
		/* 리턴값으로 활용 */
		String[] animals = getAnimals();
		
		System.out.println("리턴 받은 animals의 hashcode : " + animals.hashCode());
		
		print(animals);
	}
	
	/**
	 * 배열을 매개변수로 전달받아 모든 인덱스에 저장되어있는 값을 출력하는 기능
	 * @param sarr
	 */
	public static void print(String[] sarr) {
		
		// 전달받은 배열의 hashcode 출력
		System.out.println("sarr의 hashcode :" + sarr.hashCode());
		
		// 전달받은 배열의 값 출력
		for(int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 동물종류로 생성된 문자열 배열을 반환하는 메소드
	 * @return
	 */
	public static String[] getAnimals() {
		
		String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};
		System.out.println("새로만든 animals의 hashcode : " + animals.hashCode());
		
		return animals;
		
		
	}
	
	
	
	
	
	
	
	

}
