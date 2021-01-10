package com.myshop.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value="/app", method = RequestMethod.GET)
	public String start() {
		
		System.out.println("start");
		return "index";
	}
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		
		
		return "WEB-INF/main/home";
	}
	@RequestMapping(value="/about.do", method= RequestMethod.GET)
	public String about(Locale locale, Model model) {
		logger.info("about",locale);
		return "WEB-INF/about/detail";
	}
	@RequestMapping(value="/login.do")
	public String login(HttpSession session){
		
		return "WEB-INF/login/login";
	}
	
	@RequestMapping(value="login1.do", method=RequestMethod.GET)
	public String login1(HttpServletRequest request) {
		String id = (String) request.getAttribute("id");
		String pwd= (String) request.getAttribute("pwd");
		logger.info(id);
		logger.info(pwd);
		return "index";
	}
	
}
