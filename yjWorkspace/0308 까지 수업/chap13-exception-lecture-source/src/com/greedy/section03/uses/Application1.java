package com.greedy.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {
	
	public static void main(String[] args) {
		
		BufferedReader in = null; 
		
		try {
			in = new BufferedReader(new FileReader("test.dat"));
			
			String s;
			
			// readLine() 메소드도 IOException을 발생시켜 놓았기 때문에
			// catch 블럭을 추가해서 예외처리 구문을 작성
			while((s= in.readLine()) != null) {
				
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// FileNotFoundException은 IOException의 후손이다.
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			
			// 예외처리 구문과 상관없이 반드시 수행해야 하는 경우 작성을 한다.
			// 보통 사용한 자원을 반납한 목적으로 사용하게 된다.
			try {
				if(in != null) { // in 이 null이라면 (생성되어 있지 않다면 끈다는것이 모순)
					in.close();
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
