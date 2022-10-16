package com.demo.olms.dto;

import java.util.List;

public class BookDto {

	String isbn;
	
	String bookName;

	String author;

	public List<PageDto> pages;

	public List<PageDto> getPages() {
		return pages;
	}

	public void setPages(List<PageDto> pages) {
		this.pages = pages;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	

}
