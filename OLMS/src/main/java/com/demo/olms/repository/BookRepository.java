package com.demo.olms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.olms.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

	public Optional<Book> findByBookName(String bookName);

}
