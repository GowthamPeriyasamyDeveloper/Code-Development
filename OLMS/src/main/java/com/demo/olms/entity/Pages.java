package com.demo.olms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long pageId;

    int pageNo;
	
	String content;
	
	public Long getPageId() {
		return pageId;
	}

	public void setPageId(Long  i) {
		this.pageId = i;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}	
}
