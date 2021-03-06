package com.greedy.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
	
	public static void main(String[] args) {
		
		/* FileWriter */
		/*
		 * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
		 * 1글자의 데이터를 처리한다.*/
		
		FileWriter fw = null;
		
		try {
			/* 실행해도 예외는 발생하지 않는다. 
			 * Writer의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다. */
			
			// 두 번째 인자로 true를 전달하면 이어쓰기 된다.
			// false는 이어쓰기가 아닌 덮어쓰기 이며 기본값은 false 이다.
			fw = new FileWriter("src/com/greedy/section02/stream/testWriter.txt"); //true = 이어쓰기
		
			fw.write(97);
			
			//char 배열도 가능하다.
			fw.write(new char[] {'a', 'p','p','l','e'});
			
			// 문자열도 가능하다.
			fw.write("우리나라 대한민국 만만세");
			// 이어쓰기 해보기 @@@@@@@@@@@@@@@@@@@@@@
		
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
				
		
		
		
		
		
	}

}
