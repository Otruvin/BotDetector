package com.training.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.DAO.BookRepository;
import com.training.demo.entity.Book;

@Service
public class BookService implements IBookService{
	
	@Autowired
	private BookRepository repository;

	@Override
	public List<Book> findAll() {
		List<Book> books = (List<Book>) repository.findAll();
		return books;
	}

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return book;
	}
	
	
	
}
