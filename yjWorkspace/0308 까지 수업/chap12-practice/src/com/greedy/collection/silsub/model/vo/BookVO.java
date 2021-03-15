package com.greedy.collection.silsub.model.vo;

public class BookVO {
	
	private int bNo;
	private int category;
	private String title;
	private String author;
	
	public BookVO() {} // 기본 생성자

	
	
	
	@Override
	public String toString() {
		return "BookVO [bNo=" + bNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}




	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}


	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}




	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	

}
