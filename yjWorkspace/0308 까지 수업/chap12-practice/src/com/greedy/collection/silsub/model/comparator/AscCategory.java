package com.greedy.collection.silsub.model.comparator;

import java.util.Comparator;

import com.greedy.collection.silsub.model.vo.BookVO;

public class AscCategory implements Comparator<BookVO>{

	public int compare(BookVO o1, BookVO o2) {//Comparator인터페이스 의 compare추상메소드 // 추상메소드여서 무젝껀 오버라이드
		
		/* 
		 * 비교대상 두 인스턴스의 가격이 오름차순이 되기 위해서는
		 * 앞의 가격이 더 적은 가격이어야 한다. */
		
		int result = 0;
		
		if(o1.getCategory() > o2.getCategory()) {
			
			/* 오름 차순을 위해 순서를 바꿔야하는 경우 양수를 반환 */
			result = 1;
			
		}else if(o1.getCategory() < o2.getCategory()) {
			/* 이미 오름차순 정렬되어 있는경우 음수를 반환 */
			result = -1;
		}else {
			/* 두값이 같은경우 0을 반환*/
			result = 0;
		}
		
		return result;
		
		
		
	}
	
}
