package com.greedy.section03.uses;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {
		
		/* try-with-resource 
		 * jdk 1.7에서 추가된 문법
		 * close 해야 하는데 인스턴스의 경우 try옆에 괄호 안에서 생성하면
		 * 해당 try-catch블럭이 완료될 때 자동으로 close 해준다*/
		
		try(BufferedReader in = new BufferedReader(new FileReader("test.dat"));){ // 세미콜론이 안에 있는 이유는 () 안에 (); 를 집어넣어준거임
			// 자동으로 close 해준다. -> App1의 finally 구문을 대체 
			
			String s;
			
			while ((s= in.readLine()) !=null) {
				System.out.println(s);
			}
			
			//FileNotFoundException과 EOFException을 동시에 처리할 수 있다.(같은레벌)
			// 같은 레벨의 자손을 한 번에 처리할 수 있다.
		} catch (FileNotFoundException | EOFException e) { // EOFException = 문장의 끝을 나타내주는 익셉션
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
