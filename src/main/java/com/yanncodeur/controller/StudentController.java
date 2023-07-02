package com.yanncodeur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.yanncodeur.entities.Student;
import com.yanncodeur.service.StudentService;

@Controller
public class StudentController {
	// injection des services 
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	// fin des injections
	
	@GetMapping("/student")
	public String VoirToutLesEleves(Model model) {
		model.addAttribute("student", studentService.VoirToutLesEleves());
		return "students";
		
	}
	
	

	@GetMapping("/student/new")
	public String createStudent(Model model) {
		model.addAttribute("student", studentService.createStudent());
		return "create_student";
		
	}

	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/student ";
	}
	
	
	@GetMapping("/student/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/student ";
		
	}
	
	
	//les deux dernieres méthodes pour modifier un élève
	@GetMapping("/student/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setNom(student.getNom());
		existingStudent.setPrenom(student.getPrenom());
		existingStudent.setEmail(student.getEmail());
		
		// save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/student";		
	}

	
	
	
}
