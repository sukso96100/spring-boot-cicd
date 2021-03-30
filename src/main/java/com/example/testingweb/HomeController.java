package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		String unused1 = "2";
		String unused = null;
		if(unused.equals("unused")){
			return "world";
		}
		return "Hello, World";
	}

	@RequestMapping("/s")
	public @ResponseBody String greeting2() {
		return null;
	}
}
