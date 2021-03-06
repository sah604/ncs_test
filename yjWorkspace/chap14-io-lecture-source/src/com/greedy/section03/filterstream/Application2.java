package com.greedy.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application2 {

	public static void main(String[] args) {
		
		/* 
		 * 형변환 보조스트림
		 * 기본 스트림이 byte 기반 스트림이고, 보조 스트림이 char기반 스트림인 경우 
		 * */
		
		/*
		 * 표준 스트림
		 * 자바에서 콘솔이나 키보드 같은 표준 입출력 장치로 부터 데이터를 입출력하기 위한 스트림 
		 * System.in , System.out, System.err 
		 * pdf를 참고...참고하라고 엌ㅋㅋ
		 * 
		 * --> 자주 사용되는 자원에 대해서 미리 스트림을 생성해 두었기 때문에 개발자가 스트림을 생성하지 않아도 된다. 
		 * */
		
		/*
		 * 이런 표준 스트림 중 콘솔로부터 읽어오는 기반스트림이 InputStream인데
		 * Buffer를 이용해서 성능을 향상 시키고 싶은 경우엔 형변한 보조 스트림을 사용할 수 있다.
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
													//->System.in 콘솔 스트림에 입력 하겠다.
		
		
		try {
			System.out.print("문자열 입력");
			String value = br.readLine(); // 스캐너랑 같은....
			
			System.out.println("value : " + value);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			
			if(br != null) {
				
				try {
					br.close();
				} catch (IOException e) {
	
					e.printStackTrace();
				}
			}
		}
		
		
		
		/* 출력을 위한 것도 마찬가지로 방식으로 사용할 수 있다. */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java oracle jdbd"); // Write = 입력받았던 것을 출력해준다. 
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
