package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
public class HelloController {
	protected static Logger logger = LoggerFactory.getLogger(HelloController.class);

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView toIndex() {
//		System.out.println("====index@RestController====");
// 		ModelAndView mv = new ModelAndView("index");
//		return mv;
//	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String toIndex1() {
		System.out.println("====index@controller====");
 		return "index1";
	}
	@RequestMapping("/page1")
	public ModelAndView page1() {
		// 页面位置 /WEB-INF/jsp/page/page.jsp
		ModelAndView mav = new ModelAndView("page/page1");
		return mav;
	}

//	@RequestMapping("/hello/{name}")
//	public String hellName(@PathVariable String name) {
//		String str = " hello " + name;
//		System.out.println(str);
//		return str;
//	}

	@RequestMapping("/hello/{name}")
	@ResponseBody
	public User hellName(@PathVariable String name) {
		User user = new User();
		user.setName("hello");
		user.setPwd("11111");
		return user;
 	}
}
