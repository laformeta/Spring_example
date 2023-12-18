package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.domain.Review;

@RestController
public class Lesson03Ex01RestController {
	
	@Autowired
	private ReviewBO reviewBO;

	// url : http://localhost/lesson03/ex01?id=3
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
			//@RequestParam(value = "id") int id // 필수 파라미터
			//@RequestParam(value = "id", required = true) int id // 필수
			//@RequestParam(value = "id", required = false) Integer id // 필수가 아닌 파라미터
			//@RequestParam(value = "id", defaultValue = "1") int id // 필수 아니고 디폴트 값 1
			@RequestParam("id") int id) { // 필수 
		
//		if (id == null) {
//			id = 1;
//		}
		
		return reviewBO.getReview(id); // response body JSON
	}
}
