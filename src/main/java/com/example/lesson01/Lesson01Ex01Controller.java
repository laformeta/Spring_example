package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller		// Spring Bean으로 등록
public class Lesson01Ex01Controller {

	// url: http://localhost:8080/lesson01/ex01/1
	@ResponseBody
	@RequestMapping("/lesson01/ex01/1") // 주소 path 매핑
	public String ex01_1() {
		return "<h2>예제1번</h2>문자열을 Response Body로 보내는 예제";
	}
	
	// url : http://localhost/lesson01/ex01/2
	@ResponseBody
	@RequestMapping("/lesson01/ex01/2")
	public Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("사과", 20);
		map.put("귤", 21);
		map.put("멜론", 22);
		map.put("포도", 23);
		
		// {"키"=값} map
		// {"키":값} JSON, javascript dictionary
		
		// map을 리턴하면 json으로 나타난다.
		// web starter에 jackson 이라는 라이브러리가 포함되어 있기 때문이다.
		return map;
		
	}
}