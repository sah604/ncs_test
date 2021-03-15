package com.greedy.collection.silsub.controller;

import java.util.ArrayList;
import java.util.Comparator;

import com.greedy.collection.silsub.model.comparator.AscCategory;
import com.greedy.collection.silsub.model.comparator.DescCategory;
import com.greedy.collection.silsub.model.vo.BookVO;

public class BookManager {
	
	private ArrayList<BookVO> bookList;
	
	
	public BookManager() {
		bookList = new ArrayList<BookVO>();
	}
	
//	public ArrayList<Book> book2 = new ArrayList<>();
	
	
	
	public void addBook(BookVO book) {
		
		bookList.add(book);
		
	}
	
	public void deleteBook(int index) {
		
		bookList.remove(index);
	}
	
	public int searchBook(String title) {
		
		int result = -1;
		
		for(int i = 0; i < bookList.size(); i++) {
			
			if(bookList.get(i).equals(title)) {
				
				result = i;
				return result;
			}
			
		}
		return result;

	}
	
	
	public void printBook(int index) {
		
		System.out.println(bookList.get(index));
	}
	
	public void displayAll() {
		
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	
	
	public BookVO[] sortedBookList(int select) {
		
		
	
		if(select == 1) { //오름차순

			bookList.sort(new AscCategory());
			
			
			// 리스트만 sort 사용가능한데
		
		}else if(select == 2) {
			bookList.sort(new DescCategory());
		}
			
		
		return bookList.toArray(new BookVO[bookList.size()]);//@@ 
		
	}
	
	public void printBookList(BookVO[] br){
		
		for(BookVO br1 : bookList) {
			System.out.println(br1);
		}
	}

}
