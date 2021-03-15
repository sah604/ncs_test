package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.vo.MemberVO;

public class Application {
	public static void main(String[] args) {
		
		MemberVO member = new MemberVO();
		
		System.out.println("name : " + member.getAge());
		System.out.println("id : " + member.getId());
		System.out.println("pwd : " + member.getPwd());
		System.out.println("gender : "+ member.getGender());
		System.out.println("phone : " + member.getPhone());
		System.out.println("email : "+ member.getEmail());
		
	    member.setAge(20);
	    member.setId("user01");
	    member.setPwd("pass01");
	    member.setName("홍길동");
	    member.setGender('M');
	    member.setPhone("010-3339-9860");
	    member.setEmail("qpwlxk123@gmail.com");
	    
	    System.out.println("변경 후 name : " + member.getAge());
		System.out.println("변경 후 id : " + member.getId());
		System.out.println("변경 후 pwd : " + member.getPwd());
		System.out.println("변경 후 gender : "+ member.getGender());
		System.out.println("변경 후 phone : " + member.getPhone());
		System.out.println("변경 후 email : "+ member.getEmail());
	}

}
