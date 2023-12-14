package com.example.lesson02;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.domain.UsedGoods;

@RestController
public class Lesson02Ex01RestController {

	// url : http://localhost
	@RequestMapping("/lesson02/ex01")
	public List<UsedGoods> ex01() {
		return ;
	}
}
