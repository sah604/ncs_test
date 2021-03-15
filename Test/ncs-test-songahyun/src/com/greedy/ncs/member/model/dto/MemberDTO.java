package com.greedy.ncs.member.model.dto;

import java.util.Date;

public class MemberDTO {
	
	private int id;
	private String pwd;
	private String name;
	private Date date;
	private double height;
	private double weight;
	private boolean isAlive;
	private int number;
	
	public MemberDTO() { }
	
	public MemberDTO(int id, String pwd, String name, Date date, double height, double weight, boolean isAlive, int number) {
		
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.date = date;
		this.height = height;
		this.weight = weight;
		this.isAlive = isAlive;
		this.number = number;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", date=" + date + ", height=" + height + ", weight=" + weight + ", isAlive=" + isAlive + ", number=" + number + "]";
	}
	
}
