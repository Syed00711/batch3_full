package com.microcare.spring.microcare_spring_boot;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleComponent {

	@GetMapping("/hello/{id}/{id1}")
	public String value(@PathVariable String id, @PathVariable int id1) {
		return "Hello Welcome to spring boot project!!!!! "+id + id1;
	}
	
	@GetMapping("/reqparam")
	public String checkParam(@RequestParam String name,@RequestParam String surname) {
		System.out.println("requestparam");
		return "Hello!"+name +","+surname;
	}
	
	@DeleteMapping("/remove")
	public boolean removeData(@RequestParam int id) {
		if(id>1000)
		return true;
		else
			return false;
	}
	
	@PostMapping("/create")
	public boolean create(@RequestBody List<String> list) {
		return (list.size()>5)?true:false;
	}
	
	@PostMapping("/student/create")
	public Student createStudent(@RequestBody Student student) {
		System.out.println(student.toString());
		return student;
	}
	
}
