package com.greedy.section01.object1.book.vo;

public class BookVO {
	/* 책 정보를 관리 할 수있는VO 클래스 작성 */

	private int number;
	private String title;
	private String autor;
	private int price;
	
	/* 기본 생성자 */
	public BookVO() {}

	/* 모든 필드를 초기화 하는 생성자 */
	public BookVO(int number, String title, String autor, int price) {
		
		this.number = number;
		this.title = title;
		this.autor = autor;
		this.price = price;
	}

	/* setter/ getter */
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		
		return "Book [number = " + this.number
				+ ", title = " + this.title
				+ ", autor = " + this.autor
				+ ", price = " + this.price
				+ "]";
	}
	// 주소확인보다 필드값을 확인하는 경우가 많기 때문에 
		//toString 메소드를 오버라이딩 해서 필드값 확인용으로 많이 쓰인다.

	
	
	/*---------------------- eqauls() 오버라이딩 -----------------------------*/
	// 스트링의 주소값은 하나의 스트링이 저장되면 문자열이 같은경우 같은 주소를 바라본다.
	
	@Override
	public boolean equals(Object obj) {
		
		/* 두 인스턴스가 주소가 같으면 이후 다른 내용을 비교할 것도 없이 true를 반환한다. */
		if (this == obj) {
			return true;
		}
		
		/* this는 인스턴스가 생성되면 주소값이 저장된다. */	
		if (obj == null) {
			return false;			
		}
		
		/* 전달받은 레퍼런스 변수를  BookVO 타입으로 형변환하여 각 필드별로 비교를 시작한다. */
		BookVO other = (BookVO) obj;
		/*
		 * autor 필드의 값이 null인 경우 
		 * 매개변수로 전달받은 인스턴스의 author 필드에도 null이 저장되어 있어야 
		 * 서로 같은 값을 가진다. 그렇지 않으면 false를 반환
		 * */
		if (autor == null) { // 값을 안넣을 경우 null 값을 안넣으면 무조건 false
			
			/* autor 필드가 null인 경우에 다른 인스턴스의 author가 null이 아니면  false로 반환. */
			if (other.autor != null)
				
				return false;
		} else if (!autor.equals(other.autor)) {
			/*
			 * String 클래스의 equals()는 이미 기능을 오버라이딩 해 두었기 때문에
			 * 같은 값을 가지는지를 비교한다.
			 * */// 정약용 == (북.정약용) 아 ~ 이퀄은 스트링의 == 이기 때문에.
			return false;
		}
		if (number != other.number) {
			return false; // 30 == 북.30 이 아니면 같지않다.
		}
		
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		
		/* 모든 조건을 통과하면 두 인스턴스의 모든 필드는 같은 값을 가지므로 true 반환 */
		return true;
	}
	
	/*-------------------------------------------------------------------*/
	
	@Override
	public int hashCode() {
		
		/* 곱셈연산을 누적 시켜야 하기 때문에 0이 아닌값으로 초기화 (0을곱하면 0이 되기때문에) */
		int result = 1;
		
		/* 31은 소수이기 때문에 연산 시 동일한 hashcode 값이 나오지 않을 확률을 증가시킨다.
		 * 31을 이용하면 시프트 연산과 뺄셈으로 대체해 최적한 가능한 값*/
		final int PRIME = 31;
		
		result = PRIME * result + this.number;
		result = PRIME * result + this.title.hashCode(); // 재정의 중인데 어떻게 해쉬코드를 가져다 쓰지?
		result = PRIME * result + this.autor.hashCode(); // 재정의 이전의 해쉬코드를 가져오는것.
		result = PRIME * result + this.price;
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
