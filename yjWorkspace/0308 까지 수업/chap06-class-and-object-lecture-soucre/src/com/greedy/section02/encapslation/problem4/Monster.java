package com.greedy.section02.encapslation.problem4;

public class Monster {
	
	/* 필드에 접근 못해야함 !! 그럴러면? */
	/* private 는 현재 클래스에서만 사용가능 하다는 뜻*/
	
	/*
	 * 접근제한자
	 * 클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드이다.
	 * 1. public : 모든 패키지에 접근 허용
	 * 2. protected : 동일 패키지에 접근 허용. 단, 상속관계에 있는 경우 다른 패키지에서도 접근 가능.
	 * 3. default : 동일 패키징에서만 접근 허용. (앞에 작성하지 않는 것이 default. 기본값 이라고.)
	 * 4. private : 해당 클래스 내부에서만 접근 허용.
	 * 
	 * 위의 4가지 접근 제한자는 클래스의 멤버(필드, 메소드)에 모두 사용가능하다.@@@@@@@@@@@@@@
	 *   // 메소드의 필드... 
	 * 
	 * 단, 클래스 선언 시 사용하는 접근제한자는 public과 default만 사용가능하다.
	 * */
	
	
	private String kinds;  // 필드 변수
	private int hp;        // 필드 변수
	
	
	/**
	 * 몬스터의 종류응 매개변수로 입력받아 필드를 변경해주는 용도
	 * @param kinds
	 */
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	
	/**
	 * 몬스터의 hp를 입력받아 양수인 경우에 입력받은 값을 필드값으로 변경해주는 용도
	 * 단, 0혹은 0보다 작은 정수를 입력 받은 경우 0으로 필드값을 변경
	 * @param hp
	 */
	public void setHp(int hp) { /* this.  = 현재클래스. */
		if(hp > 0) {
			this.hp = hp;   // 이렁게 해주는 이유
 		}else {             // hp = hp 하면 setHp(hp) 의 hp를 다른데서 못불러 오기때문에 hp 라는 필드 변수를 선언해줘서 사용.   
			this.hp = 0;
		}
	}
	
	// 근데 그 이름 바꾼것에 접근할수 있자나. 그걸 아예방지 하고자 하는거져
	
	/**
	 * 몬스터의 정보를 문자열로 반환해주는 용도의 메소드
	 * 
	 * @return
	 */
	public String getInfo() { //get 도 private에 접근할 수 있어서
		return "몬스터 종류는 " + this.kinds + " 이고, 체력은 " + this.hp + "입니다.";
	}
	
//	public void get1Info() {
//		return "몬스터 종류는 " + this.kinds + " 이고, 체력은 " + this.hp + "입니다.";
//	}
	// 게터와 세터
	// 세터와 게터가 쓰이는 이유는 나는 프라이빗선언한 필드변수를 사용해서 메소드를 만들었다 라는걸 명시적으로 보여주는건가?
	
}

