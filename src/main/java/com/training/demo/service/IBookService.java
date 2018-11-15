package com.training.demo.service;

import java.util.List;

import com.training.demo.entity.Book;

public interface IBookService {
	
	public List<Book> findAll();
	public Book save(Book book);

}
