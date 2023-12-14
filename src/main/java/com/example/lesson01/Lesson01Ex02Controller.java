package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson01Ex02Controller {
	
	// url : http://localhost/lesson01/ex02
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		return "lesson01/ex02";
	}
}
