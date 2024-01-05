package com.example.lesson07.entity;

import java.time.ZonedDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString // 객체 출력시 필드 값이 보여짐
@AllArgsConstructor // parameter가 모두 있는 생성자
@NoArgsConstructor // parameter가 없는 생성자
@Builder // setter 대용
@Getter
@Table(name = "new_student")
@Entity // 이 객체는 Entity (JPA - DB간의 통신을 Entity를 통해함)
public class StudentEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		private String name;
		
		@Column(name = "phoneNumber")
		private String phoneNumber;
		
		private String email;
		
		@Column(name = "dreamJob")
		private String dreamJob;
		
		@UpdateTimestamp // column이 Null이어도 현재시간으로 저장(NOW())
		@Column(name = "createdAt", updatable = false) // 업데이트시 변경되지 않도록 하는 기능 updatable = false
		private ZonedDateTime createdAt;
		
		@UpdateTimestamp
		@Column(name = "updatedAt")
		private ZonedDateTime updatedAt;
	
}
