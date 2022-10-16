package com.demo.olms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Book {

	@Id
	String isbn;
	
	String bookName;
	
	String author;
	
	
	@OneToMany(targetEntity=Pages.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name ="isbnval",referencedColumnName ="isbn" )
	private List<Pages> pages;
	

	public List<Pages> getPages() {
		return pages;
	}

	public void setPages(List<Pages> pages) {
		this.pages = pages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	
}
