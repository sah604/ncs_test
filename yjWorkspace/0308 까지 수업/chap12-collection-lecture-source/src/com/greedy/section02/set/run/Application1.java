package com.greedy.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
	
	public static void main(String[] args) {
		
		/*
		 * Set 인터페이스를 구현 Set 컬렉션 클래스의 특징
		 * 1. 요소의 저장 순서를 유지해야 하지 않는다. 
		 * 2. 같은 요소의 중복 저장을 허용하지 않는다. (null값도 중복 되지 않게 하나의 null 만 저장한다.)
		 * 
		 * */
		
		/*
		 * HashSet 클래스 // Hash 가 붙어있다? 검색 관련
		 * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스중 하나이다.
		 * JDK 1.2 부터 제공하고 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
		 * */
		
		/* HashSet 인스턴스 생성*/
		HashSet<String> hset = new HashSet<>();
		
		HashSet<String> hsetc = new HashSet<>();
//		// 다형성을 적용하여 상위 인터페이스 타입으로 사용 가능
//		Set hset2 = new HashSet();
//		Collection hset3 = new HashSet();
		
		hset.add(new String("java"));
		hset.add(new String("oracle"));
		hset.add(new String("jdbc"));
		hset.add(new String("html"));
		hset.add(new String("css"));
		
		hsetc.add(new String("java"));
		hsetc.add(new String("oracle"));
		hsetc.add(new String("jdbc"));
		hsetc.add(new String("html"));
		
		
		/* 저장 순서 유지 안된다. */
		System.out.println("hset : " + hset);
		
		/* 중복 안됨.*/
		hset.add(new String("java"));
		
		System.out.println("hset : " + hset);
		System.out.println("저장된 객체 수 : " + hset.size());
		System.out.println("포함 확인 : " + hset.contains(new String("oracle")));
		
		System.out.println("==================");
		/* Set 은 저장된 객체를 하나씩 꺼내는 기능이 없다.
		 * 1. toArray() 메소드를 이용해서 배열로 바꾸고 for loop (포 문)사용
		 * */
		
		Object[] arr = hset.toArray();
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		

		
		
		
		
		
		/*
		 * 2. iterator()로 목록 만들어 연속 처리
		 * 
		 * */
		Iterator<String> iter = hset.iterator();
		
		System.out.println("===========");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		/* clear() 메소드를 이용하여 지운다. */
		hset.clear();
		System.out.println("empty? : "+ hset.isEmpty());
		
		
		
		
	}
	
	

}
