package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.greedy.section01.list.comparator.AscendingPrice;
import com.greedy.section01.list.vo.BookVO;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* ArrayList의 사용법과 정렬에 대해서 알아보자. */
		
		List<BookVO> bookList = new ArrayList<>(); // 리스트로 <BookVO> 타입만 받겠다 지정.
		
		/* 도서 정보 추가 */
		bookList.add(new BookVO(1,"홍길동전","허균",50000));
		bookList.add(new BookVO(2,"목민심서","정약용",30000));
		bookList.add(new BookVO(3,"동의보감","허준",40000));
		bookList.add(new BookVO(4,"삼국사기","김부식",46000));
		bookList.add(new BookVO(5,"삼국유사","일연",60000));
		
		/* 제네릭의 타입제한에 의해 Compareable 타입을 가지고 있는 경우에만 sort가 사용 가능하다. */
//		Collections.sort(bookList); //여러개의 타입이 들어가 있는경우 sort불가. 
		
		for(BookVO book : bookList) { /// : ?? 향상된 for문
			
			System.out.println(book); // 그냥 뽑아줌.
		}
		
		
		/* 가격순으로 오름차순 정렬을 해보자*/ //  Comparator 인터페이스를 상속받아 만듦.
		bookList.sort(new AscendingPrice()); // 어레이 리스트의 소트
		
		System.out.println("=================가격오름차순 정렬====================");
		for(BookVO book : bookList) { /// : ?? 향상된 for문
			
			System.out.println(book);
		}
		
		
		/* 인터페이스를 구현한 클래스를 재사용하는경우 AscendingPrice클래스 처럼 작성하면 된다.
		 * 한 번만 사용하기 위해서는 조금 더 간편한 방법을 이용할 수 있다.
		 * 익명클래스 (Anonymous)를 이용할 수 있다.
		 *  */
		
		// 인터페이스 이기에 바로 인스턴스 생성할 수 없다.
//		bookList.sort(new Comparator<BookVO>());
		
		// 익명클래스는 뒤에 {}을 만들어서 마치 Comparator인터페이스를 상속받은 클래스인데
		// 이름이 없다고 생각하고 사용하는 것.
		bookList.sort(new Comparator<BookVO>() /*이부분*/{

			@Override
			public int compare(BookVO o1, BookVO o2) {
				// 내림차순 정렬 조건을 넣어주면 된다.
				// 아까와는 반대로 오름차순 정렬된 상태인 경우 순서를 바꿔줘야 한다.
				// 양수를 반환해서 순서를 바꿔라.
				
				// 이미 내림차순 정렬이 되어 있어서 순서를 바꾸는 경우 양수, 바꾸지 않는 경우에만 음수반환
				return o1.getPrice() >= o2.getPrice()? -1 : 1;
				 		// 앞의 가격이 크면 가만놔둠(-1)
						// 이것은 컴퍼어레이터의 소트 메소드가 해준다. ㅇㅇ
						// 조건은 컴페어(비교) 값이 있어야댐
			}/*이부분*/
			
		});
		
		System.out.println("=================가격내림차순 정렬====================");
		for(BookVO book : bookList) { /// : ?? 향상된 for문
			
			System.out.println(book);
		}
		
		/* 이번에는 제목 순 오름차순으로 정렬을 해보자. */
		bookList.sort(new Comparator<BookVO>() {

			@Override
			public int compare(BookVO o1, BookVO o2) {
				/* 문자열을 대소비교를 할 수 없다.
				 * 문자 배열로 변경 후 인덱스 하나하나 비교해서 어느것이 큰값인지 확인해야 하는데
				 * String클래스의 CompareTO() 메소드에서 이미 정의해 놓았다.
				 * */
				
				/*
				 * 앞에 값이 더 작은 경우에는 음수반환(바꾸지 말아야하는경우)
				 * 같으면 0을 반환
				 * 앞에 값이 더 큰경우 양수(바꿔야하는경우)반환*/
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
			
		});
		
		System.out.println("=================책 제목 오름차순 정렬====================");
		for(BookVO book : bookList) { /// : ?? 향상된 for문
			
			System.out.println(book);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
