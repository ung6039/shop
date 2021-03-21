package com.myshop.app;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myshop.app.repository.MemberDAO;
import com.myshop.app.repository.UserRepository;
import com.myshop.app.service.UserService;
import com.myshop.app.vo.LoginVO;
import com.myshop.app.vo.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
//	@Autowired
//	UserService userService;
	@Autowired
	MemberDAO memberdao;
	
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
	@RequestMapping(value="/joinForm.do",method=RequestMethod.GET)
	public String join(HttpServletRequest request, Model model) {
		return "WEB-INF/login/joinForm";
	}
	@RequestMapping(value="/JoinPro.do",method=RequestMethod.POST)
	public String join_p(HttpServletRequest request, Model model) {
		boolean status = true;
		if(status) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = "웅";
			String birthday = request.getParameter("birthday");
			String birthdd = request.getParameter("birthdd");
			String birthmm = request.getParameter("birthmm");
			birthday = birthday+"-"+birthmm+"-"+birthdd;
			String addr = "서울시";
			String img = "img/img.png";
			Map map = new HashMap();
			map.put("memberid", id);
			map.put("pwd",pwd);
			map.put("birthday", birthday);
			map.put("name", name);
			map.put("info","123123");
			map.put("addr", addr);
			map.put("img",img);
			
			memberdao.save(map);
			
			return "redirect:/main.do";
		}  
		
		else {
			return "WEB-INF/login/login";
		}
	}
	@RequestMapping(value="/about.do", method= RequestMethod.GET)
	public String about(Locale locale, Model model, HttpServletRequest request) {
		logger.info("about",locale);
		String img = request.getParameter("img");
		return "WEB-INF/about/detail?"+img;
	}
	@RequestMapping(value="/login.do")
	public String login(HttpSession session){
		
		return "WEB-INF/login/login";
	}
	
	@RequestMapping(value="login1.do", method=RequestMethod.POST)
	public String login1(HttpServletRequest request, HttpSession session ) {
		String id = (String) request.getParameter("id");
		String pwd= (String) request.getParameter("pwd");
		logger.info("로그인 정보"+id+" "+ pwd);
		session.setAttribute("id", id);
		System.out.println(session.getAttribute("id"));
		
		return "index";
	}
	
}
