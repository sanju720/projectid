package com.idcard.idcard.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.idcard.idcard.model.Student;
import com.idcard.idcard.service.StudentService;

public class Studentcontroller {
	private StudentService studentService;

	public Studentcontroller(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@GetMapping("/student")
	public String listStudents(Model model) {
		model.addAttribute("student", studentService.getAllStudents());
		return "add";
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "list";
		
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/student";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "view";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setUsername(student.getUsername());
		existingStudent.setContact_no(student.getContact_no());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setPassword(student.getPassword());
		
		// save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/student";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/student";
	}	
}
	

