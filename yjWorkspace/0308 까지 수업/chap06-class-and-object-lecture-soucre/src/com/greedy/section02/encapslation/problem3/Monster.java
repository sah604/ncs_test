package com.greedy.section02.encapslation.problem3;

public class Monster {
	
	/* 몬스터 정보를 저장할 필드 작성 */
	//String name;
	String kinds;
	
	int hp;
	
	/**
	 * <pre>
	 * 몬스터의 정보를 입력받아서 몬스터 이름에 해당하는 필드에 값을 변경해주는 메소드
	 * 
	 * @param name
	 */
	public void setInfo(String info) {
		this.kinds = info;
	}
	
	/**
	 * 몬스터의 체력정보를 입력 받아서 몬스터 체력에 필드값을 변경해주는 메소드
	 * @param hp
	 */
	public void setHp(int hp) {
		
		if(hp > 0) {
			this.hp = hp;
		}else {
			this.hp = 0;
		}
	}
	
	/**
	 * 몬스터의 정보를 입력받아 모든 필드의 내용을 문자열로 되돌려주는 메소드
	 * @return 모든 필드의 정보를 문자열 합치기하여 반환
	 */
	public String getInfo() {
//		return "몬스터 이름은" + this.name+ "이고, 체력은 "+ this.hp + "입니다";
		return "몬스터 이름은" + this.kinds+ "이고, 체력은 "+ this.hp + "입니다";
		
	}

}
