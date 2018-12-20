package com.training.demo.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping("/showBooks")
	public String findAllBooks(Model model) {
		
		return "showBooks";
		
	}
	
	@RequestMapping("/botCheckPg")
	public String checkPage()  {
		return "CheckBotPage";
	}
	
	@RequestMapping("/botCheckPg1")
	public String checkPage1()  {
		return "CheckBotPage";
	}
	
	@RequestMapping("/botCheckPg2")
	public String checkPage2()  {
		return "CheckBotPage";
	}
	
	@RequestMapping("/botCheckPg3")
	public String checkPage3()  {
		return "CheckBotPage";
	}
	
	@RequestMapping("/botCheckPg4")
	public String checkPage4()  {
		return "CheckBotPage";
	}
	
	@RequestMapping("/botCheckPg5")
	public String checkPage5()  {
		return "CheckBotPage";
	}
	
	@RequestMapping("/botCheckPg6")
	public String checkPage6()  {
		return "CheckBotPage";
	}
	
	@RequestMapping("/botCheckPg7")
	public String checkPage7()  {
		return "CheckBotPage";
	}
	
	@RequestMapping("/botCheckPg8")
	public String checkPage8()  {
		return "CheckBotPage";
	}
	
	@RequestMapping("/botCheckPg9")
	public String checkPage9()  {
		return "CheckBotPage";
	}
}
