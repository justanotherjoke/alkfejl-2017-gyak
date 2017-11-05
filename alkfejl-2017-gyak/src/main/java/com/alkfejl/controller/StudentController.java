package com.alkfejl.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alkfejl.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("")
	public String studentList(Model model) {
		model.addAttribute("title", "Student list");
		model.addAttribute("students", studentService.studentNamesStartingWith("John"));
		return "list";
	}
	
	/*
	@GetMapping("")
	public String studentList(Model model) {
		model.addAttribute("title", "Student list");
		model.addAttribute("students", Arrays.asList(
				"name1",
				"name2",
				"name3"
		));
		return "list";
	}*/
}
