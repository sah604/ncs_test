package com.greedy.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		
		/* File을 이용한 스트림을 사용하기 전에 File클래스 사용법 확인 */
		
		/*
		 * JDK 1.0 부터 API로 파일 처리를 수행하는 대표적인 클래스 이다.
		 * 
		 * */
		
		/* File 클래스를 이용해서 인스턴스 생성
		 * 대상 파일이 존재하지 않아도 인스턴스를 생성할 수 있다. */ // 매개변수의 파일에대한 인스턴스 생성
		File file = new File("src/com/greedy/section01/file/test.txt"); //파일 생성이 이것만으로는 안댐
		//
		
		
		try {
			/* 파일 생성후 성공 실패 여부를 boolean로 리턴한다. */
			boolean createSuccess = file.createNewFile(); // 여기서 파일 생성. // 후 리프레시 해준다.
			// 2번째 실행 부터는 false
			
			// 최초 실행하면 새롭게 파일이 만들어 지기 때문에 true를 반환 하지만,
			// 파일이 한번 생성되고 나면 생성되고 난 이후에는 새롭게 파일을 만들지 않기 때문에
			// false를 반환한다.
			System.out.println("createSuccess : " +createSuccess);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		/* 생성한 파일의 크기 */
		System.out.println("파일의 크기 : " +file.length() + "byte");
		
		/* 파일의 경로 */ // src 부터
		System.out.println("파일의 경로 : " + file.getPath());
		
		System.out.println("현재 파일의 상위경로 : " + file.getParent());
		
		/* 디스크 상의 경로*/
		System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
		
		
		/* 파일 삭제 */
		boolean deletSuccess = file.delete();
		
		// 삭제 이후에는 삭제가 되기 때문에 매번 실행할 때마다 파일 생성결과는  true
		// 로 나오게 된다.  // 위에서 생성하고 바로 삭제해줘서..?
		System.out.println("deletSuccess : " + deletSuccess);
		
	}
	
	
	
	
	
	
	
}
