package com.myshop.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value="/main.do", method = RequestMethod.GET)
	public String main(HttpServletRequest request) {
		request.setAttribute("main", "START");
		return "WEB-INF/main/main";
	}
	@RequestMapping(value="/logout.do",method =RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("id");
		return "redirect:/main.do";
	}
	@RequestMapping(value="/detail.do",method=RequestMethod.GET)
	public String detail_product(HttpServletRequest request){
		System.out.println("??12122");

		return "WEB-INF/shop_product/product";
	}
	@RequestMapping(value="/detail.do",method=RequestMethod.GET)
	public String board(HttpServletRequest request){
		System.out.println("dfsf");
		return "WEB-INF/board/board";
	}

}