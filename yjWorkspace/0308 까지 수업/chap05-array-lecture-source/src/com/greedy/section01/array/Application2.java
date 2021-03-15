package com.greedy.section01.array;

import java.util.Scanner;

public class Application2 {
	public static void main(String[] args) {
		
		/* 배열의 사용 방법 */
		
		/* 배열의 선언 */
		/*
		 * 자료형[] 변수명;
		 * 자료형 변수명 []; 로도 선언 가능.
		 * 
		 * 
		 * 
		 */
		
		/* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다. */
		int[] iarr;
		char carr[];
		int[] iiaa;
		
		/*
		 * 선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.  
		 * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자 이다.
		 * 발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에 
		 * 참조자료형(reference type)이라고 한다.
		 * iarr = 공간의 주소값을 가지고 있다.
		 * 
		 * */
//		iarr = new int[]; // 크기를 지정해주지 않으면 에러발생
		iarr = new int[5];
		iiaa = new int[5]; //new 라고 하는것은 새로운 방(집)을 만들어 준다는것.
		carr = new char[10];
		// iarr 이라는 참조변수에 new int 5라고 하는 주소를 iarr에 넣어주는것.
		System.out.println("iarr : " + iarr[0]); //
		System.out.println("carr : " + carr);	// 이렇게 하면carr 의 주소값만 나오고 [n] 을 지정해줘서 출력 해주기
		
		//System.out.println("iarr : " + iiaa);
		
		
		/* 선언과 할당을 동시에 할 수  있다 */
		int[] iarr2 = new int[5];
		char carr2[] = new char[10];
		
		// heap메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역이다.
		// stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다.
		System.out.println("iarr : " + iarr2); // 16진수 주소값 출력
		System.out.println("carr : " + carr2);
		
		/*
		 * hashcode() : 일반적으로 객체의 주소값을 10진수로 반환하여 생성한 객체의 고유한 정수값을 반환 
		 * 동일객체인지 비교할 때 사용할 목적으로 쓰여지며, 동등객체를 동일객체취급하기 위한 용도
		 * overriding 해서 사용한다.
		 * --> 해쉬코드 = 주소값이다. 라고 일단 생각하자.
		 * 해쉬코드 = 변수에 선언된 고유의 주소값.
		 */
		System.out.println("iarr의 hashcode : " + iarr2.hashCode()); 
		System.out.println("carr hashcode : " + carr2.hashCode());
		
		
		/* 스캐너를 통해 입력받은 정수로 배열 길이를 지정해서 배열을 할당 할 수 있다. */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("새로 할당할 배열의 길이를 입력하세요 : ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println("darr의 hashdcode : " + darr.hashCode());
		System.out.println("darr의 길이 : " + darr.length);
		
		/* 하지만 한번 지정한 배열의 크기는 변경하지 못한다. */
		
		/* 배열의 사이즈를 변경한게 아니라 새로운 배열을 생성하고, 그 주소값을 참조주소에 덮어 쓴것이다. */
		darr = new double[30]; //new 로 다시 주소값(방 30개인 집) 생성/*************************/
		// new double[30]을 darr 에 덮어 씌운것!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// darr 은 변수 이름겸 주소이름 이다.
		
		System.out.println("darr의 hashdcode : " + darr.hashCode());
		System.out.println("darr의 길이 : " + darr.length);
		
		// stack || heap || static
		
		// 한 번 할당된 배열은 지울 수 없다./*************************/
		// 다만 래퍼런스 변수를 null로 변경해서 더 이상 주소를 참조할 수 없게된 배열은
		// 일정 시간이 지난후 heap의 old영역으로 이동하여 GC(가지비 컬렉터)가 삭제시킨다.
		// 한번 찾아갈 수 있는 주소값을 잃어버린 배열은 다시 참조 불가능하다.
		
		darr = null; /*************************/
		// 아무것도 참조하지 않고 null이라는 특수한 값을 참조 하고 있는경우
		// 참조 연산자를 사용하게 될 때 발생하는 에러이다.
		System.out.println("삭제 후 darr의 길이 : " + darr.length);
		
		// java.lang.NullPointerException
		// darr 은 null 이 되었다,,, 집이 있어야 찾든 말든하죠,,,,, 
		// null = 우리집 정상영업합니다...
		// null = 주민등록 말소 // 주소없어짐
		
		
	}

}
