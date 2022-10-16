package com.demo.olms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.olms.entity.Pages;

public interface PageRepository extends JpaRepository<Pages, Integer> {

	@Query(value = "select * from pages p where p.isbn=:isbn", nativeQuery = true)
	public List<Pages> getBookPages(@Param("isbn") String isbn);

	@Query(value = "select * from pages p where p.isbn=:isbn and p.page_no=:pageNo", nativeQuery = true)
	public Pages getBookByPageNo(@Param("pageNo") Integer pageNo, @Param("isbn") String isbn);

}
