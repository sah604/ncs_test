package com.greedy.section04.wrapper;

public class Application2 {

	public static void main(String[] args) {
		
		/* parsing : 문자열 (String) 값을 기본자료형 값으로 변경하는것을 parsing 이라고 한다. */
		
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("4"); // 문자열 4가 인트형 숫자 4로 바꾼것
		long l = Long.parseLong("8");		//8L은 안된다.
		float f = Float.parseFloat("4.0"); // 4.0f는 된다.
		double d = Double.parseDouble("8.0");
		boolean bl = Boolean.parseBoolean("true");
		
		/* Character는 parsing 기능을 제공하지 않는다. */
		char c = "abc".charAt(0);
	
	
	
	
	}
}
