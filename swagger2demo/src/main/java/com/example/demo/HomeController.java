package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="home")
public class HomeController {

	@RequestMapping(path="/getStudent")
	public Student getStudent()
	{
		Student s=new Student();
		s.setId(111);
		s.setName("nikita");
		return s;
	}
}
