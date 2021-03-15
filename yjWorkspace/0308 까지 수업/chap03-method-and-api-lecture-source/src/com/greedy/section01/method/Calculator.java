package com.greedy.section01.method;

public class Calculator {
	
	/**
	 * <pre>
	 * 매개 변수로 전달받은 두 수를 비교하여 더 작은 값을 가진 정수를 반환한다.
	 * 같은 값을 가지는 조건에 대해서는 처리하지 않는다.
	 * </pre>
	 * @param first 최솟값 비교를 위한 첫 번째 정수
	 * @param second 두번째 정수
	 * @return 두 수중 작은 값을 정수형으로 반환
	 */
	public int minNumberOf(int first, int second) {
		
		//return int (first = second) ? return 0 : (first > second) ? return first : return second;
		return (first > second)? second : first;
	}
	
	
	/**
	 * 매개변수로 전달받은
	 * 두수를 비교, 더큰 값을 가진 정수 반환
	 * 같은 값은 처리하지 않는다
	 * 
	 * @param first 첫번째 정수
	 * @param second 두번째 정수
	 * @return 두 수 중 큰 값을 정수형으로 반환
	 */
	public static int maxNumberOf(int first, int second) {
		
		
		
		return (first > second)? first : second ;
	}

}
