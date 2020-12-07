package com.myshop.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("main")
	public String main(HttpServletRequestWrapper request) {
		request.setAttribute("main", "START");
		return "main/main.jsp";
	}

}
