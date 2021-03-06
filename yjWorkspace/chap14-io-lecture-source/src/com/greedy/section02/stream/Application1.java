package com.greedy.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* 입출력 스트림 개요 
		 * 
		 * 프로그램을 할 때 많은 종류의 데이터를 다르게 두어야 한다.
		 * 데이터는 프로그램 내부에 있을 수 있지만, 프로그램 외부의 데이터를 가져와서 사용할 수도 있다. 
		 * 
		 * 프로그램과 외부데이터가 연결된 길을 스트림(Stream) 이라고 한다. 
		 * 스트림은 단방향이기 때문에 데이터를 읽어오기 위한길은 입력스트림, 
		 * 데이터를 출력하기 위한 스트림을 출력스트림 이라 한다.
		 * 
		 * InputStream/Reader 는 : 데이터를 읽어오는 입력스트림     // 둘의 차이 : 바이트 차이
		 * OutputStream/Writer 는 : 데이터를 내보내는 출력 스트림 
		 * 
		 * InputStream과 OutputStream은 데이터를 1바이트 단위로 입/출력
		 * Reader과 Writer계열은 글자(2바이트 혹은 3바이트) 단위로 작업
		 * */
	
		FileInputStream fin = null; // finally 부분에서 열어놓은 스트림객체를 닫기위해 필드 선언
		
		try {
			fin = new FileInputStream("src/com/greedy/section02/stream/testInputStream.txt");
			
			int value;
			
			// read() : 파일에 기록된 값을 순차적으로 읽어오고 더 이상 읽어올 데이터가 없는 경우 -1을 반환
//			while((value = fin.read()) != -1) {
//				
//				// 값을 정수로 읽어온다.
//				System.out.println(value);
//				
//				// 문자로 출력하고 싶은 경우 형변환 하면된다.
//				System.out.println((char)value); // (한글)문자는 3바이트 이므로 깨진 상태로 들어온다.
//				
//			}
			
			/* byte 배열을 이용해서 한번에 데이테를 읽어오는 방법 */
			System.out.println("파일의 길이 : " + new File("src/com/greedy/section02/stream/testInputStream.txt").length());
			
			int fileSize = (int)new File("src/com/greedy/section02/stream/testInputStream.txt").length();
			byte[] barr = new byte[fileSize];
			
			// read()메소드의 인자로 생성한 byte배열을 넣어주면 파일의 내용을 읽어서 byte배열에 기록해준다.
			fin.read(barr);
			
			// 스트림은 파일의 끝까지 다 읽어들인 스트림이기 때문에 // 위에서 인풋과 아웃풋이 완료 됐기 때문에 
			// 위에 1바이트의 읽어온 내용을 주석해야 정상동작 한다.
			for(int i = 0; i <barr.length; i++) {
				System.out.println((char)barr[i]);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) { //IOException이 FileNotFoundException보다 상위이므로 아래에 쓴다.
			
			e.printStackTrace();
		} finally {
			
		//fin 인스턴스가 null이 아닌 경우 자원 반납.
			if(fin != null) {
				
			try {
				//자원 해제를 하는 경우에도 IOException을 핸들링 해야한다.
				
				/*
				 * 자원 반납을 해야하는 이유는
				 * 1. 장기간 실행 중인 프로그램에서 스트임 닫지 않은 경우 다양한 리소스 누수(leak)가 발생한다. 
				 * 2. 뒤에 배우는 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 있는 데이터를 강제로 전송해야한다.
				 * 
				 * --> close()메소드는 자원반납하며 flush()을 해주기 때문에 close()만 제대로 해줘도 된다.
				 * 	   따라서 close() 메소드는 외부 자원을 사용하는 경우에는 반드시 "마지막"에 호출해줘야 한다.
				 * */
				fin.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		}
		
	}

}

