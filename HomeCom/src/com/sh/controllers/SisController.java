package com.sh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeupKit() {
		
		return "just take my make up kit";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getBooks()
	{
		System.out.println("test");
		return "Math book";
	}
}
