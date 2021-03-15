package com.greedy.section01.literal;

public class Application2 {
	public static void main(String[] args) {
		// 값을 직접 연산하여 출력할 수 있다.
		
		// 1. 숫자와 숫자의 연산
		// 1-1. 정수와 정수의 연산
		System.out.println("========= 정수와 정수의 연산 ===========");
		System.out.println(123 + 456);
		System.out.println(123 - 23);
		System.out.println(123 * 10);
		System.out.println(123 / 10); // 몫을 구할 때(div)
		System.out.println(123 % 10); // 나머지를 구할 때(mod)
		
		// 1-2. 실수와 실수의 연산
		System.out.println("========= 실수와 실수의 연산 ===========");
		System.out.println(1.23 + 1.23);
		System.out.println(1.23 - 0.23);
		System.out.println(1.23 * 10.0);
		System.out.println(1.23 / 10.0);
		System.out.println(1.23 % 1.0); // 약간의 오차가 생긴다. 
		
		// 1-3. 정수와 실수의 연산
		// 정수와 실수 연산의 결과 항상 실수가 나온다.
		System.out.println("========= 정수와 실수의 연산 ===========");
		System.out.println(123 + 0.5);
		System.out.println(123 - 0.5);
		System.out.println(123 * 0.5);
		System.out.println(123 / 0.5);
		System.out.println(123 % 0.5);
		
		// 2. 문자의 연산
		// 2-1 문자와 문자의 연산
		System.out.println("========= 문자와 문자의 연산 ===========");
		System.out.println('a' + 'b');
		System.out.println('a' - 'b');
		System.out.println('a' * 'b');
		System.out.println('a' / 'b');
		System.out.println('a' % 'b');
		
		// 2-2. 문자와 정수의 연산
		// 컴퓨터는 문자를 인식하지 못하고 숫자로만 인식할수있기 때문에
		// 모든 문자에 대응되는 숫자들이 매칭되어있다.(아스키코드/유니코드 65535)
		System.out.println("========= 문자와 정수의 연산 ===========");
		System.out.println('a' + 1);
		System.out.println('a' - 1);
		System.out.println('a' * 1);
		System.out.println('a' / 1);
		System.out.println('a' % 1);
		
		// 2-3. 문자와 실수의 연산
		// 결과는 실수 형태로 나오게 된다.
		System.out.println("========= 문자와 실수의 연산 ===========");
		System.out.println('a' + 1.0);
		System.out.println('a' - 1.0);
		System.out.println('a' * 2.0);
		System.out.println('a' / 2.0);
		System.out.println('a' % 2.0);
		
		/*
		 * 결론은 문자는 내부적으로 숫자 취급을 한다.
		 * 지금까지 연사은 숫자끼리의 연산을 본 것이다. 
		 */
		
		// 3. 문자열의 연산
		// 3-1. 문자열과 문자열의 연산
		// 문자열과 문자열의 '+'연산 결과는 문자열 합치기(이어붙이기)가 된다.
		// 문자열은 '+' 연산 외에는 다른 연산을 사용하지 못한다.
		System.out.println("========= 문자열와 문자열의 연산 ===========");
		System.out.println("hello " + "world");
		//System.out.println("hello " - "world"); //에러발생
		//System.out.println("hello " * "world");   //에러발생
		//System.out.println("hello " / "world");   //에러발생
		//System.out.println("hello " % "world");   //에러발생
		
		// 3-2. 문자열과 다른 형태의 값 연산
		System.out.println("========= 문자열와 다른 형태의 연산 ===========");
		System.out.println("helloworld" + 123);
		System.out.println("helloworld" + 123.456);
		System.out.println("helloworld" + 'a');
		System.out.println("helloworld" + true);
		
		System.out.println("123" + "456");
		
		
		// 4. 논리값 연산
		// 4-1. 논리값과 논리값 연산
		// 논리값 끼리의 연산은 모든 연산자 사용이 불가능하다.
//		System.out.println(true + false);	// 에러발생
//		System.out.println(true - false);	// 에러발생
//		System.out.println(true * false);	// 에러발생
//		System.out.println(true / false);	// 에러발생
//		System.out.println(true % false);	// 에러발생
		
		// 4-2. 논리값과 정수의 연산
//		System.out.println(true + 1);	// 에러발생
//		System.out.println(true - 1);	// 에러발생
//		System.out.println(true * 1);	// 에러발생
//		System.out.println(true / 1);	// 에러발생
//		System.out.println(true % 1);	// 에러발생
		
		// 4-3. 논리값과 실수의 연산
//		System.out.println(true + 1.0);	// 에러발생
//		System.out.println(true - 1.0);	// 에러발생
//		System.out.println(true * 1.0);	// 에러발생
//		System.out.println(true / 1.0); // 에러발생
//		System.out.println(true % 1.0); // 에러발생
		
		// 4-4. 논리값과 문자의 연산
		// 논리값과 문자의 연산은 모든 연산자 사용이 불가능하다.
		// 이유는, 문자는 내부적으로 숫자 취급을 하기 때문에 결과 논리값과 숫자의 연산에 불과하다.
//		System.out.println(true + 'a');	// 에러발생
//		System.out.println(true - 'a'); // 에러발생
//		System.out.println(true * 'a'); // 에러발생
//		System.out.println(true / 'a'); // 에러발생
//		System.out.println(true % 'a'); // 에러발생
		
		// 4-5. 논리값과 문자열의 연산
		System.out.println("============ 논리와 문자열의 연산==========");
		System.out.println(true + "a"); // 문자열 합치기가 됨
//		System.out.println(true - "a"); // 에러발생
//		System.out.println(true * "a"); // 에러발생
//		System.out.println(true / "a"); // 에러발생
//		System.out.println(true % "a"); // 에러발생
		
	}
}

















