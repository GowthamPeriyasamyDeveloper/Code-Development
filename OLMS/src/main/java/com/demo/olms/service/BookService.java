package com.demo.olms.service;

import java.util.List;

import com.demo.olms.dto.BookDto;
import com.demo.olms.dto.BookReaderResponse;

public interface BookService {

	public BookDto createBook(BookDto bookdto);

	public BookDto readBookByPageNo(String bookName, Integer pageNo);

	public List<BookReaderResponse> readBook(String bookName); 	
	
	

}
