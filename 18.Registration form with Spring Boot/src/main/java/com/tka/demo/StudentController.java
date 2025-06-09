package com.tka.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

	private final StudentRepo studentRepository;

	public StudentController(StudentRepo studentRepository) {
		this.studentRepository = studentRepository;
	}

	@GetMapping("/register")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "register"; // this refers to register.html in templates
	}

	@PostMapping("/register")
	public String submitForm(@ModelAttribute Student student) {
		studentRepository.save(student);
		return "success"; // refers to success.html in templates
	}
}
