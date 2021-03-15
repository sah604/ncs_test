package com.greedy.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
	//Set 에서 LinkedHashSet

	public static void main(String[] args) {
		
		/*
		 * LinkedHashSet 클래스
		 * HashSet이 가지고 있는 기능을 모두 가지고 있고
		 * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
		 *  
		 * JDK 1.4 부터 제공하고 있다.
		 * */
		
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
	
		lhset.add("java");
		lhset.add("oracle");
		lhset.add("jdbc");
		lhset.add("html");
		lhset.add("css");
	
		// 저장 순서 그래도 출력
		System.out.println("lhset : " + lhset);
		
	
		/* 오름 차순 정렬을 원하는 같은 클래스 타입일 경우에만 가능. */
		/* 만들어진  LinkedHashSet을 가지고 트리셋으로 객체생성하면
		 * 같은 타입의 객체를 자동으로 비교하여 오름차순으로 정렬한다.
		 * 
		 * */ 
		TreeSet<String> tset = new TreeSet<>(lhset); // 트리셋은 오름차순만 지원
		System.out.println("tset : " + tset);
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	
	
	
	}
}
