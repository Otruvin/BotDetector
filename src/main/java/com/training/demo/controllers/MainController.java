package com.training.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.demo.entity.Book;
import com.training.demo.service.IBookService;

@Controller
public class MainController {
	
	@Autowired
	IBookService bookService;
	
	@RequestMapping("/showBooks")
	public String findAllBooks(Model model) {
		
		List<Book> books = (List<Book>) bookService.findAll();
		
		model.addAttribute("books", books);
		
		return "showBooks";
		
	}
	
	@RequestMapping("/editor")
	public String editorPage(Model model) {
		model.addAttribute("book", new Book());
		return "addBook";
	}
	
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String submitBook(@ModelAttribute Book book) {
		bookService.save(book);
		return "redirect:../";
	}

}
