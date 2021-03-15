package com.greedy.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {
		
		/* FileReader */
		
		/*
		 * FileInputStream과 사용하는 방법은 거의 동일하다.
		 * 단, byte 단위가 아닌 character 단위로 읽어오는 부분이 차이점이다.
		 * 따라서 2바이트/3바이트 글자 단위로 읽어오기 때문에 한글을 정상적으로 읽어올 수 있다.
		 * 
		 * */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("src/com/greedy/section02/stream/testReader.txt"); // 감싸는 이유
		
			// 파일 내용을 읽어오는것은 동일하다.
//			int value;
//			while((value = fr.read()) != -1){
//				System.out.print((char) value);
//			}
//			
			/*
			 * byte 배열로 읽어오는 경우에는 한글이 깨지게 된다.
			 * 유니코드로 변환된 한글은 byte에 저장하기에 더 큰 숫자를 가지기 때문에 오버플로우가 일어난다.
			 * (byte = 127)
			 * 
			 * 따라서 byte배열이 아닌 char배열로 내용을 읽어오는 기능을 제공하고 있다.
			 * */
			char[] carr = new char[(int) new File("src/com/greedy/section02/stream/testReader.txt").length()];
			
			fr.read(carr);  // 인풋  //리드 를통해 글자하나하나 읽어온다.
			
			for(int i = 0; i< carr.length; i++) {
				System.out.print(carr[i]);  //아웃풋
			}
			
			
			
			
			
		} catch (FileNotFoundException e) { // 1. 파일이 없는 경우 예외처리.
			
			e.printStackTrace();
		
		} catch (IOException e) { // - read로 해석하는 도중 해석할 때 문제가 발생하면 IOException발생...
			
			e.printStackTrace();
		} finally{
			
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {  // 2. 닫았는데 파일이 없을경우 예외처리
					
					e.printStackTrace();
				}
			}
		}
	}
}
