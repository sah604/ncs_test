package com.greedy.level02.normal.student.run;

import java.util.Scanner;

import com.greedy.level02.normal.student.model.vo.StudentVO;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		StudentVO svo = new StudentVO();
		
		System.out.print("학년 입력 : ");
		int grade = sc.nextInt();
//		svo.setGrade(grade = sc.nextInt());
		
		
		System.out.print("반 입력 :");
		int classroom = sc.nextInt();
//		svo.setClassroom(classroom);
		
		sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
//		svo.setName(name);
		
		System.out.print("키 : ");
		double height  = sc.nextDouble();
//		svo.setHeight(height);
		
		System.out.println("성별 : ");
		char gender = sc.next().charAt(0);
		
		StudentVO svo1 = new StudentVO(grade, classroom,name, height, gender);
		
		svo1.printInfomation();
		
		
		sc.close();
		
		
	}

}
