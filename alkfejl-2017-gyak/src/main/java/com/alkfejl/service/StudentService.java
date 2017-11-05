package com.alkfejl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkfejl.model.Student;
import com.alkfejl.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> studentNamesStartingWith(String segment) {
		return studentRepository.findByFirstNameSegment(segment);
	}
	
	//
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
}
