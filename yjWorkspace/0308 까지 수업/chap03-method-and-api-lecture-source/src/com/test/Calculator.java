package com.test;

public class Calculator {

	public static int test = 10;
	/**
	 * <pre>
	 *  매개변수로 전달받은 두 수를 비교하여 더 작은 값을 가진 정수를 반환한다.
	 *  같은 값을 가지는 조건에 대해서는 처리하지 않겠다.
	 * </pre>
	 * @param first 최소값 비교를 위한 첫 번째 정수
	 * @param second 최소값 비교를 위한 두 번째 정수
	 * @return 두 수 중 작은 값을 정수형으로 반환
	 */
	public int minNumberOf(int first, int second) {
		
		// 두 수가 동일한 조건은 제외하고,
		// 두 수를 비교하여 첫 번째 숫자가 크면 두 번째 숫자를 반환하고,
		// 아니면 첫 번째 숫자를 반환하도록 작성
		
		return (first > second)? second : first;
	}
	
	
	/**
	 * <pre>
	 *   매개변수로 전달받은 두 수를 비교하여 더 큰 값을 가진 정수를 반환한다.
	 *   같은 값을 가지는 조건에 대해서는 처리하지 않는다.
	 * </pre>
	 * @param first 최대값 비교를 위한 첫 번째 정수
	 * @param second 최대값 비교를 위한 두 번째 정수
	 * @return 두 수 중 큰 값을 정수형으로 반환
	 */
	public static int maxNumberOf(int first, int second) { 
		
		// 두 수가 동일한 조건은 제외하고,
		// 두 수를 비교하여 첫 번째 숫자가 크면 첫번째 숫자를 반환하고,
		// 아니면 두 번째 숫자를 반환하도록 작성
		
		return (first > second)? first : second;
	}
}















