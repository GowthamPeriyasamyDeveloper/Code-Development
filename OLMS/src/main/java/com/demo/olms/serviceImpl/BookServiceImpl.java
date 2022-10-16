package com.demo.olms.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.olms.dto.BookDto;
import com.demo.olms.dto.BookReaderResponse;
import com.demo.olms.dto.PageDto;
import com.demo.olms.entity.Book;
import com.demo.olms.entity.Pages;
import com.demo.olms.repository.BookRepository;
import com.demo.olms.repository.PageRepository;
import com.demo.olms.service.BookService;


@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Autowired
	PageRepository pageRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public BookDto createBook(BookDto bookdto) {

		Book book = modelMapper.map(bookdto, Book.class);
		return modelMapper.map(bookRepository.save(book), BookDto.class);

	}
	


	@Override
	public BookDto readBookByPageNo(String bookName, Integer pageNo) {

		Book book = bookRepository.findByBookName(bookName)
				.orElseThrow(() -> new NoSuchElementException("Book is not available in the library"));

		Pages page = pageRepository.getBookByPageNo(pageNo, book.getIsbn());

		BookDto bookDto = new BookDto();

		bookDto.setPages(Arrays.asList(modelMapper.map(page, PageDto.class)));

		bookDto.setAuthor(book.getBookName());

		bookDto.setBookName(book.getBookName());

		bookDto.setAuthor(book.getAuthor());

		bookDto.setIsbn(book.getIsbn());

		return bookDto;

	}

	@Override
	public List<BookReaderResponse> readBook(String bookName) {

		BookReaderResponse readerResponse = null;

		List<BookReaderResponse> bookReaderResponse = new ArrayList<>();

		Book book = bookRepository.findByBookName(bookName).orElseThrow(() -> new NoSuchElementException ("Book is not available in the library"));

		List<Pages> bookPages = pageRepository.getBookPages(book.getIsbn());
	
		
		for (Pages page : bookPages) {
			
			readerResponse = new BookReaderResponse();
			readerResponse.setContent(page.getContent());
			readerResponse.setPageNo(page.getPageNo());
			bookReaderResponse.add(readerResponse);	
		}

		return bookReaderResponse;

	}
}
