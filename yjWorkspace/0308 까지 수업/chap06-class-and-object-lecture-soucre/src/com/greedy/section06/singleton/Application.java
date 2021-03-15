package com.greedy.section06.singleton;

public class Application {
	
	public static void main(String[] args) {
		
		/* static을 이용한 싱글톤 패턴 */
		/* singleton patton 이란
		 * 
		 * 애플리케이션이 시작될 때 어떤 클래스가 최초 한 번만 메모리를 할당하고
		 * 그 메모리에 인스턴스를 만들어서 하나의 인스턴스를 공유해서 사용하며
		 * 메모리 낭비를 방지할 수 있다. (매번 인스턴스 생성 하지 않아도 된다.)
		 *  // 만약 사람 클래스를 만들면 처음으로 뇌 클래스를 만들어 놓았다고 한다면 팔 다리 손가락 클래스에 갔다 쓸 때 계속 new 를 사용하지않고 한번 선언된 인스턴스를 가져다 쓸 수있다고 하는것
		 * 
		 * 
		 * 장점
		 * 1. 첫 번재 이용시에는 인스턴스를 생성해야 하므로 속도 차이가 나지않지만
		 *    두 번째 이용 시에는 인스턴스를 생성 시간 없이 사용할 수 있다.
		 * 2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증할 수 있다.
		 * 
		 * 단점
		 * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다. //그래서 
		 * 	  (유지보수와 테스트에 문제점이 있다.)
		 * 2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다.
		 * */
		
		/*
		 * 싱글톤 구현 방법
		 * 1. 이론 초기화 (Eager Initinalization)
		 * 2. 게으른 초기화 (Lazy Initialization)
		 * 
		 * */
		/* getInstance() 메소드를 호출해야만 인스턴스를 생성할 수 있다. */
//		EagerSingleton ear = new EagerSingleton(); // 생성자의 접근 제한자가 프라이빗 이여서 접근 불가
		
		EagerSingleton earger1 = EagerSingleton.getInstance();
		EagerSingleton eager2 = EagerSingleton.getInstance();
		// EagerSingleton. 에 접근 가능한 이유 = public class EagerSingleton  이거니까. 여기에 접근한 것이고 우리가 하고자 하는것은  new 생성자에 접근 하지 못하게 하는것이다.
		
		
		System.out.println("earger 1의 해코" + earger1.hashCode());
		System.out.println("eager 2의 해코 ㅣ:" + eager2.hashCode());
		
		/*게으른 초기화 구현*/
		LazySingleton lazy1 = LazySingleton.getInstance();
		LazySingleton lazy2 = LazySingleton.getInstance();
		
		System.out.println("lazy 1의 해코" + lazy1.hashCode());
		System.out.println("lazy 2의 해코 ㅣ:" + lazy2.hashCode());
		
		/*
		 * 이른 초기화를 사용하면 클래스를 로드 하는 속도가 느려지지만
		 * 처음 인스턴스 반환 요청에서 속도가 빠르다는 장점을 가진다.
		 * 
		 * 반면 게으른 초기화는 클래스를 로드하는 속도는빠르지만
		 * 첫 번째 요청에 대한 속도가 두번째 요청에 대한 속도보다
		 * 느리다는 특징을 가지고 있다.*/
		
		
		
		
		
		
		
		
		
	}

}
