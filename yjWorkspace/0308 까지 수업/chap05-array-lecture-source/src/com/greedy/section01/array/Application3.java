package com.greedy.section01.array;

public class Application3 {
	public static void main(String[] args) {
		
		/*
		 * 기본적으로 배열을 선언하고 할당하게 되면
		 * 배열의 각 인덱스에는 자바에서 지정한 기본갓으로 초기화가 된 상태가 된다.
		 * heap영역은 값이 없는 빈공간이 존재할 수 없다. 
		 * 
		 * 만약 // int arr = new int[5] 라고 선언하고 값을 추가해주지 않는다면
		 * arr[0]~arr[5] 의 각 방에는 int 자료형의 초기값인 0이 저장된다.
		 * 
		 * */
		/* 
		 * 값의 형태 별 기본값
		 * 정수 : 0
		 * 실수 : 0.0
		 * 논리 : false
		 * 문자 : \u0000
		 * 참조 : (객체 등등) null
		 * 
		 * */
		
		int[] iarr = new int[5]; // 5개 방을 선언해준다고 한것이고 실제 값은 0부터 시작, 0 ~ 4 로 5개.
		
		/* int 의 기본값인 0으로 초기화 되어 있다. */
		System.out.println(iarr[0]); //각각의 인덱스로 비교. iarr : 배열의 주소값이 담겨있슴
		System.out.println(iarr[1]);//                 1 인덱스에 담긴 값.
		System.out.println(iarr[2]);
		System.out.println(iarr[3]);
		System.out.println(iarr[4]);
	
		// 반복문을 사용해서 인덱스에 담긴 값 출력.
		for(int i = 0; i < iarr.length ; i++) {
			System.out.println("iarr[" + i +"]의 값 : " + iarr[i]);
		}
		
		
		//int[] iarr2 = new int[5];
		//iarr2[0] = 11; ...... iarr[4] = 55 와 같다.
		
		// 자바에서 지정한 기본값 외의 값으로 초기화를 하고 싶은 경우 블럭을 사용한다.
		/* {}블럭을 사용하는 경우에는 new 를 사용하지 않아도 되며, 값의 갯수만큼 자동으로 크기를 설정하지 않아도 된다.*/
		int[] iarr2 = { 11, 22, 33, 44, 55 };  //{} = new
		
		// 새로 만든가는 것을 명시적으로 보여주고 싶다면 이것으로도  가능.
		int[] iarr3 = new int[] {11, 22, 33, 44, 55};  
		System.out.println("");
		System.out.println("iarr2의 길이 : " + iarr2.length);
		System.out.println("iarr3의 길이 : " + iarr2.length);
		
		// 초기화 값 확인
		for(int i = 0; i < iarr2.length ; i++) {
			System.out.println("iarr2[" + i +"]의 값 : " + iarr2[i]);
		}
		System.out.println("");
		
		for(int i = 0; i < iarr3.length ; i++) {
			System.out.println("iarr3[" + i +"]의 값 : " + iarr3[i]);
		}
		
		
		/* 문자열도 배열로 사용 가능.******************* */
		String[] sarr = {"apple" ,"banana", "grape", "orange"};
		
		for(int i = 0; i < sarr.length ; i++) {
			System.out.println("sarr[" + i +"]의 값 : " + sarr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
