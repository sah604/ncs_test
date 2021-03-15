package com.greedy.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
	
	public static void main(String[] args) {
		
		/* FileOutStream */
		/*
		 * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트링이다. 
		 * */ // 프로그램이 읽어주기 위한
		
		FileOutputStream fout = null;
		
		try {
			// 실행해도 예외는 발생하지 않는다.
			// OutputStream의 경우에는 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다.
			
			// 두 번째 인자로 true를 전달하면 이어쓰기가 된다.
			// false는 이어쓰기가 아닌 덮어 쓰기가 되며, 기본값은 false이다.
			fout = new FileOutputStream("src/com/greedy/section02/stream/testOutputStream.txt");
		
//			fout.write(97); //testOutputStream에 a 작성됨.
			// IOException을 핸들링 해야한다//@@@@@@@@@@@@@@@@@@@@
			
			/*byte배열을 이용해서 한 번에 기록할 수도 있따. */
			
			byte[] barr = new byte[] {98,99,100,101,10,102}; // 10 = 개행문자
			
//			fout.write(barr);
			
			// 1번 인덱스 부터 3의 길이만큼 파일에 내보내기 (cde 기록된다)
			fout.write(barr,1,3);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) { // fout.write(97)
			
			e.printStackTrace();
		} finally {
			
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
