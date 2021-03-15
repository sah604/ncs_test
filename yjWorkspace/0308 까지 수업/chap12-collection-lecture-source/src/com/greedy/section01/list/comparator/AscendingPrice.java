package com.greedy.section01.list.comparator;

import java.util.Comparator;

import com.greedy.section01.list.vo.BookVO;

public class AscendingPrice implements Comparator<BookVO>{

	/* Comparator 인터페이스를 상속받으면 오버라이딩 해야하는 메소드가 강제화 된다. */
	@Override
	public int compare(BookVO o1, BookVO o2) {//Comparator인터페이스 의 compare추상메소드 // 추상메소드여서 무젝껀 오버라이드
		 ///          여기는 App2 의 객체 5개중 첫번째 부터 하나씩
		/* 
		 * 비교대상 두 인스턴스의 가격이 오름차순이 되기 위해서는
		 * 앞의 가격이 더 적은 가격이어야 한다. */
		
		int result = 0;
		
		if(o1.getPrice() > o2.getPrice()) {
			
			/* 오름 차순을 위해 순서를 바꿔야하는 경우 양수를 반환 */
			result = 1;
			
		}else if(o1.getPrice() < o2.getPrice()) {
			/* 이미 오름차순 정렬되어 있는경우 음수를 반환 */
			result = -1;
		}else {
			/* 두값이 같은경우 0을 반환*/
		}
		
		return result;
		
		
		
	}

}
