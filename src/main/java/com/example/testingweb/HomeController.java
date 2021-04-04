package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		String unused = null;
		return "Hello, World";
	}

	@RequestMapping("/s")
	public @ResponseBody String greeting2() {
		return "Hello, World;;;";
	}
}
