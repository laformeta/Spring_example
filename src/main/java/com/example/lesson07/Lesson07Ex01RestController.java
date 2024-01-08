package com.example.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson07.entity.StudentEntity;
import com.example.lesson07.repository.StudentRepository;

@RequestMapping("/lesson07")
@RestController
public class Lesson07Ex01RestController {

	@Autowired
	private StudentBO studentBO;
	
	
	
	// c: create
	@GetMapping("/ex01/1")
	public StudentEntity create() {
		String name = "김성훈";
		String phoneNumber = "010-1111-1111";
		String email = "kims@naver.com";
		String dreamJob = "개발자";
		
		// 방금 insert 된 pk id도 바로 얻어낼 수 있음
		return studentBO.addStudent(name, phoneNumber, email, dreamJob);
	}
	
	// U: Update
		@GetMapping("/2")
		public StudentEntity update() {
			// id가 5번인 dreamJob 변경
			// 5, 디자이너
			return studentBO.updateStudentDreamJobById(5, "디자이너");
		}
		
		// D: Delete
		@GetMapping("/3")
		public String delete() {
			// id:6
			studentBO.deleteStudentById(3);
			return "삭제 완료";
		}
}
