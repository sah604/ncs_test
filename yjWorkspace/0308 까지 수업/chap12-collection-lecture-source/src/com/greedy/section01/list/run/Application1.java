package com.greedy.section01.list.run;

import java.util.*;

public class Application1 {

	public static void main(String[] args) {
		
		/*
		 * 컬렉션 프레임워크(Collection Framwork) 
		 * 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
		 * 표준화된 방법을 제공하는 클래스 들의 집합을 의미한다. */
		
		// 모두 콜렉션을 상속받은 클래스들
		
		/*
		 * Collection Framework는 크게 3가지 인터페이스 중 한가지를 상속받아 구현해 놓았다.
		 * 1. List 인터페이스
		 * 2. Set 인터페이스
		 * 3. Map 인터페이스
		 * 
		 * List 인터페이스와 Set인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고 있다.
		 * Map은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않다.
		 * 
		 * */
		
		/*
		 * 각 인터페이스 별 특징
		 * 
		 * 1. List 인터페이스
		 * - 순서 있는 데이터 집합으로 데이터의 중복 저장을 허용한다.
		 * - Vector, ArrayList, LinkedList, Stack, Queue
		 * 
		 * 2. Set 인터페이스
		 * - 순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
		 * - HashSet , TreeSet 등이 있다.
		 * 
		 *  3. Map 인터페이스
		 *  - 키와 값 한쌍으로 이루어지는 데이터의 집합이다.
		 *  - key를 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고, // key?
		 *    중복된 Key를 허용하지 않는다.
		 *  - value는 중복된 값을 저장할 수 있다.
		 *  - HashMap, TreeMap, HashTable, Properties 등이 있다.
		 *  
		 *  */
		
		
		/*
		 * ArrayList
		 * - 가장 많이 사용되는 컬렉션 클래스이다. 
		 * - JDK 1.2부터 제공된다. 
		 * - 내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.*/
		
		/* ArrayList는 인스턴스를 생성하게 되면 내부적으로 10칸짜리 배열을 생성해서 관리한다. */
		ArrayList alist = new ArrayList();
		
		System.out.println("alist : "+ alist);
		
		
		/* 다형성을 적용하여 상위 레퍼런스로 ArrayList 객체생성을 할 수 있고
		 * 리스트를 어레이리스트가 상속 받고 있다.
		 * List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
		 * 레퍼런스 타입은 List로 해두는 것이 더 유연한 코드를 작성하는 것이다. */
		List list = new ArrayList();
		
//		List a = new LinkedList();
		
		
		Collection clist = new ArrayList();
		// 3.어레이리스트 2. 리스트 1. 콜렉션
		
		
		/*
		 * arrayList는 저장순서가 유지되면 index(순번)이 적용된다.
		 * arrayList는 Object 클래스의 하위타입 인스턴스를 모두 저장할 수 있다.
		 * */
		alist.add("apple");
		alist.add(123); // autoBoxing (값 -> 객체)
		alist.add(45.67);
		alist.add(new Date());
		
		// toString() 메소드가 overriding 되어있다.
		System.out.println("alist : " + alist);
		
		/*
		 * arrayList의 크기를 size()메소드로 확인
		 * 단 size() 메소드는 배열의 크기가 아닌 요소의 갯수를 반환한다.
		 * */
		System.out.println("alist의 size : " + alist.size());
		
		// 내부 배열에 인덱스가 지정되어있어서 for문으로 접근가능
		for(int i = 0; i < alist.size(); i++) {
			
			//인덱스에 해당하는 값을 가져올 때는 get()메소드를 사용
			System.out.println(i + " : " + alist.get(i)); //[i] 가 아니라 get(i) 로 가져온다.
		}
		
		alist.add("apple");
		
		// ArrayList는 데이터의 중복저장을 허용한다.
		// 배열과 같이 인덱스로 요소들을 관리하고 있기 때문에 인덱스가 다른 위치에 동일한 값을 저장하는 것이 가능하다.
		System.out.println("alist : " + alist);
		
		// 원하는 인덱스 위치에 값을 추가할 수 있다.
		// 값을 중간에 추가하는 경우 인덱스 위치에 덮어쓰는 것이 아니므로
		// 새로운 값이 들어가는 인덱스 위치에 값을 넣고 이후 인덱스는 하나 씩 뒤로 밀어낸다.
		alist.add(1, "banana"); // 오버로딩됐다
		System.out.println("alist : " + alist);
		
		/*=====================================0305 시작=========*/
		
		 /* 저장된 값을 삭제할 때는 remove() 메소드를 사용한다. */
	     /* 중간 인덱스의 값을 삭제하는 경우 자동으로 인덱스를 하나씩 앞으로 당긴다. */
	     alist.remove(2);
	    
	     System.out.println("alist : " + alist);
	      
	     /* 지정된 위치와 값을 수정할 때도 인덱스를 활용할 수 있으며 set()메소드를 사용한다. */
	     alist.set(1, new Boolean(true));
	    
	     System.out.println("alist : " + alist);
	      
	     /* 모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성되어있다. */
	     List<String> stringList = new ArrayList<>(); // 어레이 리스트르 스트링으로 제한 해두었다.
	     //stringList.add(123); //에러발생
	     stringList.add("banana");
	     stringList.add("orange");
	     stringList.add("mango");
	     stringList.add("grape");
	      
	     System.out.println("stringList : " + stringList+"============");
	      
	      /* 저장 순서를 유지하고 있는 stringList를 오름차순 정렬 */
	      /*
	       * 사용하는 것은 Collection 인터페이스가 아닌 Collections 클래스이다.
	       * */
	      Collections.sort(stringList); // 컬렉션스의 클래스에 sort 라는 정렬 메소드...
	      
	     
	     
	      System.out.println("stringList : " + stringList);
	      
	      
	      
	      /* 정렬이 되어 저장된다. */
	      
	      // sort 는 먼저 리스트가 제네릭으로 제한되어있어야 하고
	      // 리스트에 값이 들어가 있어야 한다. 
	      
	      
	      
	      //System.out.println("stringList : " + stringList);
	      
	      /*ArrayList 오름차순만 가능하고
	       *그것을 내림차순으로 바꾸고 싶으면 리스트 타입을 
	       *LinkedList타입으로 변경해야만 내림차순 가능
	       * */
	      /*
	       * 조금 복잡하지만 내림차순 정렬을 할 수 있다.
	       * -> 기본적으로 ArrayList에는 역순으로 정렬하는 기능이 제공되지 않는다.
	       * */
	      
	      //stringList의 주소는 변경되지만 값은 변하지 않는다
	      stringList = new LinkedList<>(stringList); // 링크드 리스트로 새롭게 인스턴스 생성
	      
	      LinkedList<String> s = new LinkedList<>();
	      
	      s.descendingIterator();
	     
	      /* Iterator 인터페이스를 할용해서 역순으로 정렬한다.
	       * 
	       * LinkedList 타입으로 형변환 후 descendingIterator() 메소드를 사용하면
	       * 내림차순으로 정렬된 Iterator 타입의 목록을 반환해준다.
	       * 
	       * Iterator란 ? <- 인터페이스
	       * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
	       * --> 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위함이다.
	       * 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
	       * 
	       * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
	       * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할 
	       * 
	       * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false를 반환
	       * next() : 다음 요소를 반환
	       * */
	      
	      ((LinkedList<String>)stringList).descendingIterator();
	      
	      Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
	      // 메소드 연결을 이용.
	      
	      LinkedList<String> a = new LinkedList<>();
	      
	      Iterator<String> dIter2 = a.descendingIterator();
	     
	     
	      
	      
	      ///* 스트링으로 선언해주었으니까 문자열 즉 알파벳을 내림차순으로 정렬가능 하게 해준다. */
	      
	      //descendingIterator 은 링크드리스트 객체가 가지고있는메소드 
	      // Para p = new child 는 parant 메소드 
	      // p. 은 부모 메소드 밖에 쓰지못해서 차일드로 형변환을 해준다.
	      
	      /* 한번 꺼내면 다시 쓸 수 없다.(next)*/
//	      while(dIter.hasNext()) {
//	    	  System.out.println(dIter.next());
//	      }
//	      
//	      
//	      while(dIter.hasNext()) {
//	    	  System.out.println(dIter.next());
//	      }
	      
	      /* 역순으로 정렬된 결과를 저장하기 위해서 새로운 ArrayList를 만들어서 저장해두면 된다. */
	      List<String> descList = new ArrayList<>();
	      
	      
	      while(dIter.hasNext()) { // 내림차순으로 헤즈넥스트 해서 다음이 없다 펄스가 반환돼서 반복문그만.
	    	  descList.add(dIter.next()); // 어레이 리스트에 add 해서 내림차순 메소드를 사용해 어레이리스트에 저장.
	    	  							  //  그래서 출력 하면 내림차순으로 출력 된다...
	      }
		System.out.println("desList : " + descList); // 왜 역순이냐면 d이터는 링크드리스트의
		// 디센딩 메소드가 담겨있음. 
		
		Collections.sort(new ArrayList<String>(stringList));
		
		
		
		
		
		
		
		
		
	
	}
}
