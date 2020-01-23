package com.sh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BroController {


	@RequestMapping("/cricketbat")
	public String giveCricketBat() {
		
		return "/WEB-INF/view/MRFCricketbat.jsp";
		
	}
}
