package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 nextLine : ");
		String line = sc.nextLine();
		System.out.println("첫번 째 line : " + line);
		
		System.out.print("숫자: ");
		int num = sc.nextInt();
		System.out.println("nextInt 입력값  : " + num);
		//여기서 엔터 친 후 엔터 값이 
		
		System.out.print(" 두번 째 문자열 nextLine : "/**/);
		/*여기로 엔터값 들어감.*/String line2 = sc.nextLine();     //왜?
		System.out.println("두 번 째 line : " + line2);
		
		
		
		
		// 그러니까 Line 뒤에 int 와도 이상현상
		// int 뒤에 Line 와도 이상현상
		// 가정 1. Line은 문자열 입력후 엔터 까지 버퍼로 데려갈 수 있다. 하지만  int는 숫자만 담을 수 있기 때문에 엔터를 치면 숫자만 데려가고 입력한 엔터는 버퍼에 남게 된다.
		// 그래서 엔터를 먹을 수 있는 int 에서 남겨놓은 엔터를 Line이 감지하고 데려온 순간 공백(다음으로 넘어가세요 값 / 입력 = 엔터) 처리 되면서 이상현상 발생 하게 된다.
		
		// 그러니까 엔터 처리 못하는 int 형등 문자형 자료형들은 입력후 (엔터) 다음 입력 자료형이 엔터를 먹을 수 있는 next(); 나 nextLine(); 만나면 남아있는 엔터를 먹어 그것이 출력되 자동 으로 입력된다.
	}

}
