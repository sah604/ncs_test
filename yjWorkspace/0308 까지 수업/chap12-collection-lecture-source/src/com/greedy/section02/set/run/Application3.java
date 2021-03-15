package com.greedy.section02.set.run;

import java.util.Iterator;
import java.util.TreeSet;

public class Application3 {
// 트리셋 
	public static void main(String[] args) {
		
		/*
		 * TreeSet 클래스 
		 * 
		 * TreeSet클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
		 * 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다
		 * JDK 1.2 부터 제공되고 있으며
		 * Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다르다.
		 * 
		 * */
		
		TreeSet<String> tset = new TreeSet<>();
		
		tset.add("java");
		tset.add("oracle");
		tset.add("jdbc");
		tset.add("html");
		tset.add("css");
		
		// 자동 오름차순 정렬
		System.out.println(tset); 
		
		
		// 목록을 만들어서 하나씩 대문자로 변경 후 출력 // 목록을 만든다? Iterator
		
//		String tset1  = new String((new String().toUpperCase()));
		
		Iterator<String> iter = tset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next().toUpperCase());
		}
		
		
		// 배열로 바꾸어 연속처리한 후 대문자로 변경해서 출력
		Object[] arr = tset.toArray();
		
		for(Object obj : arr) {
			System.out.println(((String)obj).toUpperCase());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
