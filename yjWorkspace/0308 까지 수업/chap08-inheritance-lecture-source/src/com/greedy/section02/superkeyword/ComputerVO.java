package com.greedy.section02.superkeyword;

import java.util.Date;

public class ComputerVO extends ProductVO{
	/* 
	 * ComputerVO 클래스는 하나의 상품이다 (IS-A)
	 * */
	
	private String cpu; //이름이 다를경우 자동생성 어떻게 되는지... 
	private int hdd;
	private int ram;
	private String operationSystem;
	
	public ComputerVO() {
		System.out.println("ComputerVO 클래스의 기본 생성자 호출");
	}

	public ComputerVO(String cpu, int hdd, int ram, String operationSystem) {
		// 부모클래스의 기본생성자 호출
		super(); //부모의 기본생성자로 (기본생성자는 기본값)
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
	}
	
	// 부모의 필드도 모두 초기화하는 생성자 
	public ComputerVO(String code, String brand, String name, int price, Date manufacuringDate, String cpu, int hdd,
			int ram, String operationSystem) {
		super(code, brand, name, price, manufacuringDate); //슈퍼 메소드 , 맨위에 
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
	}

	//setter /getter
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	
	
	@Override
	public String getInfomation() {

//		return "code=" + super.getCode()
//		        + ", brand = " + super.getBrand()
//		        + ", name = " + super.getName()
//		        + ", price = "+ super.getPrice()
//		        + ", manufacturingDate = " + super.getManufacuringDate()
//		        + ", cpu = " + this.cpu
//		        + ", ram = " + this.ram
//		        + ", operationSystem = "+ this.operationSystem;
		return super.getInfomation()
				+ ", cpu = " + this.cpu
				+ ", hdd = " + this.hdd
				+ ", ram = " + this.ram
				+ ", operationSystem = "+ this.operationSystem;
		
		/*
		 * super.getInfomation() : 정상적으로 부모의 메소드 호출
		 * this.getInfomation() : 재귀호출이 일어나며 stackOverflow발생 
		 * getInfomatoion()      : this. 이 자동 추가되어 재귀호출 일어난다. 
		 * 
		 * super. 을 명시적으로 사용해야 한다.*/
	}

	
	
	
	
	
	
}
