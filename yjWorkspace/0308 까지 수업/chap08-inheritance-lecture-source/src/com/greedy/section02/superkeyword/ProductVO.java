package com.greedy.section02.superkeyword;

import java.util.Date;

public class ProductVO {
	
	/* 관리하려는 상품의 속성을 추상화 해서 VO 클래스를 만든다.*/
	private String code;  // 상품코드
	private String brand;  // 제조사
	private String name;   // 상품명
	private int price;    // 가격
	private Date manufacuringDate; // 제조일자
	
	/* 기본생성자 */
	public ProductVO() {
		System.out.println("ProductVO 클래스의 기본 생성자 호출됨..");
	}
	
	
	// 모든 필드를 초기화하는 생성자 // 알트 시프트 에스 자동생성
	public ProductVO(String code, String brand, String name, int price, Date manufacuringDate) {
		/* 아무 클래스도 상속받지 않았는데 super() 가 호출된다.
		 * java.lang.Object 클래스의 생성자를 호출하는 것이다. 
		 * 왜냐? 모든클래스는 오브젝트 클래스의 후손이기 때문이다. */
		super(); // 오브젝트 클래스로 간다.
		this.code = code;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.manufacuringDate = manufacuringDate;
		
		System.out.println("ProductVO 클래스의 매개변수 있는 생성자 호출됨..");
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Date getManufacuringDate() {
		return manufacuringDate;
	}


	public void setManufacuringDate(Date manufacuringDate) {
		this.manufacuringDate = manufacuringDate;
	}
	
	public String getInfomation() {
		return "code = " + this.code + ", brande  = "+this.brand + ", name = "+ this.name+ ", price = "+this.price+", manufacturingDate = " + this.manufacuringDate;
	}

}
