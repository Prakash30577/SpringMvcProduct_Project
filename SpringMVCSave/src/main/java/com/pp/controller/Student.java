package com.pp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pp.Dao.ProductDao;

@Controller
public class Student {

	//@Autowired
	//private ProductDao productDao;
	//Some testing changes are there

	@RequestMapping("get")
	public String saveData() 
	{
		System.out.println("in side student controller");
		
		return "register";

	}

}
