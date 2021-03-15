package com.greedy.section03.array_copy;

import java.util.Arrays;

public class Application3 {
	public static void main(String[] args) {
		
		/* 깊은 복사를 해보자. */
		
		/* 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을
		 * 또 다른 배열에 복사를 해놓은 것이다.
		 * 
		 * 서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열 이기에
		 * 하나의 배열에 변경을 하더라고 다른 배열에는 영향을 주지 않는다.
		 * 
		 * 
		 * */
		
		/* 깊은 복사를 하는 방법 4가지
		 * 1. for문을 이용한 동일한 인덱스의 값 복사
		 * 2. Object 클래스의 clone()을 이용한 복사
		 * 3. System 클래스의 arraycopy()을 이용한 복사
		 * 4. Arrays의 copyOf()를 이용한 복사
		 * 
		 * 가장 높은 성능을 보이는 것은 순수 배열의 복사를 위해 만들어진
		 * arraycopy() 메소드다. 가장 많이 사용되는 방식은 좀 더 유연한 방식인 copyOf() 메소드 이다.
		 * 
		 * clone은() 은 이전 배열과 같은 배열밖에 만들 수 없다는 특징
		 * 그 외 3가지 방법은 복사하는 배열의 길이를 마음대로 조절할 수 있다는 특징
		 * */ 
		
		/* 원본 배열 할당 및 초기화 */
		int[] originArr = new int[] {1,2,3,4,5};
		
		print(originArr);
		
		
		/* 1. for문을 이용한 동일한 인덱스 값 복사 */
		int[] copyArr1 = new int[10];
		
		for(int i = 0; i < originArr.length; i++) { //오리진은5개 카피는 10개
			copyArr1[i] = originArr[i];
			
			//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		}
		
		print(copyArr1); // 원본 배열과 복사한 값은 같은 값을 가지고, 인덱스는 다른값, 다른 주소를 가지고 있다.

		/* 2. Object의 clone()을 이용한 복사 */
		int[] copyArr2 = originArr.clone();
		
		print(copyArr2); // 동일한 길이, 동일한 값을 가지는 배열이지만, 주소는 다르다.
		
		/* 3. System의 arraycopy()를 이용한 복사 (깊은 복사) */ //중간부터 복사할때 사용
		int[] copyArr3 = new int[10];
		
		  // 1.원본배열  2.복사를 시작할 인덱스   3. 복사본 배열  4. 복사를 시작할 인덱스 5. 복사할 길이
		System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
		
		print(copyArr3); // 복사만 만큼의 값은 같지만 길이도 다르고 주소도 다르다.
		
		/* 4. Arrays의 copyOf()를 이용한 복사 */ // 처음부터 복사하지만 길이를 다르게 할때 사용
		int[] copyArr4 = Arrays.copyOf(originArr, 7);
		
		print(copyArr4); // 복사한 만큼의 값은 같지만 길이도 다르고 주소도 다르다
	}
	
	
	/**
	 * 배열을 매개변수로 전달받아 모든 인덱스에 저장되어있는 값을 출력하는 기능을 제공
	 * @param iarr
	 */
	public static void print(int[] iarr) {
		
		// 전달받은 배열의 해쉬코드 출력
		System.out.println("iarr의 hashcode : " + iarr.hashCode());
		
		// 전달받은 배열의 값 출력
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
			
		}
		System.out.println();
		
		
		
	}

}
