package com.demo.olms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.olms.dto.BookDto;
import com.demo.olms.service.BookService;


@RestController
@RequestMapping("/Olms")
public class OlmsController {

	@Autowired
	private BookService bookservice;

	@PostMapping("/createBook")
	public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookdto) {
		return new ResponseEntity<>(bookservice.createBook(bookdto), HttpStatus.CREATED);
	}

	@GetMapping("/readBook/{bookName}/{pageNo}")
	public ResponseEntity<BookDto> readBookByPageNo(@PathVariable String bookName, @PathVariable Integer pageNo) {
		return new ResponseEntity<>(bookservice.readBookByPageNo(bookName, pageNo), HttpStatus.OK);
	}

	@GetMapping("/readBook/{bookName}")
	public ResponseEntity<List<?>> readBook(@PathVariable String bookName) {
		return new ResponseEntity<>(bookservice.readBook(bookName), HttpStatus.OK);
	}

}

