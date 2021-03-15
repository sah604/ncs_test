package com.greedy.section03.map.run;

import java.util.Collection;
import java.util.Date; 
import java.util.HashMap; // 포함이 돼있는게 아니라 임플리먼트받은것이기 때문에 하위 클래스는 아
import java.util.Iterator;
import java.util.Map;
import java.util.Set;  // 인터페이스 콜렉션이 임플리먼트 해줌.
import java.util.Map.Entry;



public class Application1 {
	
	public static void main(String[] args) {
		
		/* 
		 * Map 인터페이스의 특징 (셋과 리스트를 짬뽕한...)
		 * 
		 * Collection 인터페이스와 다른 저장 방식을 가진다.
		 * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
		 * 
		 * 키(key) 란?
		 * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
		 * 
		 * 1. 요소의 저장 순서를 유지하지 않는다.
		 * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
		 * HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
		 * HashMap이 가장 많이 사용되며 HashTable은 JDK 1.0 부터 제공되며
		 * HashMap과 동일하게 동작한다. (해시맵과 해시테이블중 해시맵이 더 상위호환이다 그래서 가급적 해시맵 사용)
		 * 
		 * */
		
		/*
		 * HashMap
		 * JDK 1.2부터 제공되는 클래스로 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다.
		 * 
		 * */
		
		HashMap hmap  = new HashMap();
		Map hmap2 = new HashMap();  // 다형성을 적용해서 유연하게
		
		/* Map에서 값을 추가할 때는 put(키,값) 키와 값 쌍으로 저장한다. 
		 * 키와 값은 둘 다 반드시 객체여야 한다.
		 * */
	//	hmap.put(Object Key, Object value);
		hmap.put("one", new Date());
		hmap.put(12, "red apple");
		hmap.put(33, 123); // 33 => new Integer(33) autoBoxing 처리됨.
		
		System.out.println("hmap : " + hmap);
		
		/* 키는 중복저장 되지 않는다. (set 의 특징) : 최근키로 override됨(덮어씀) */
		hmap.put(12, "yellow banana");
		System.out.println("hmap : " + hmap);
		
		/* 키 값이 다르면 값객체 저장은 중복 저장 가능*/
		hmap.put(11, "yellow banana");
		hmap.put(9, "yellow banana");
		System.out.println("hmap : " + hmap);
		
		/* 값 객체의 내용을 가져오는 get() 메소드를 사용 */
		System.out.println("키 12에 대한 객체 : " + hmap.get(12));
		
		/* 키값을 가지고 삭제를 처리할 때  */
		hmap.remove(12);
		System.out.println("hmap : " + hmap);
		
		/* 저장된 객체수를 확인 할 때 */
		System.out.println("hmap에 저장된 객체의 수 : " + hmap.size());
		
		HashMap<String,String> hmap3 = new HashMap<>();
		hmap3.put("one", "java 8");
		hmap3.put("two", "oracle 11g");
		hmap3.put("three", "jdbc");
		hmap3.put("four", "html 15");
		hmap3.put("five", "css 3");
		
		/*
		 * 1. keySet()을 이용해서 키만 따로 set으로 만들고,
		 * 	  Iterator()로 키에 대한 목록을 만든다.
		 * */
//		Set<String> keys = hmap3.keySet();
//		Iterator<String> keyIter = keys.iterator();
		
		Iterator<String> keyIter = hmap3.keySet().iterator(); //메소드 끼리 연결을 이용
		
		while(keyIter.hasNext()) {
			
			String key = (String)keyIter.next();
			String value = hmap3.get(key);
			System.out.println(key + " = " + value); //왜 four 부터?
			
		}
		
		
		/* 저장된 value객체들만 values() 로 Collection으로 만듦 */
		Collection<String> values = hmap3.values();
		
		// Collection로 만든 객체를 Iterator()로 처리
		Iterator<String> valueIter = values.iterator();
		
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		
		// 배열로 만들어서 처리
		Object[] valueArr = values.toArray();
		for(int i = 0; i < valueArr.length; i++) {
			System.out.println(i + " : " + valueArr[i]);
		}
		
		// Map의 내부클래스인 EntrySet을 이용 : entrySet()
		Set<Map.Entry<String,String>> set = hmap3.entrySet();
		
		System.out.println("============================");
		
		// Entry : 키 객체와 값 객체를 쌍으로 묶은 것
		Iterator<Map.Entry<String, String>> entIterator = set.iterator();
		
		while(entIterator.hasNext()) {
			
			Map.Entry<String, String> entry = entIterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
