package com.yanncodeur.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yanncodeur.entities.Student;
import com.yanncodeur.repos.StudentRepository;
import com.yanncodeur.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	
	@Override
	public List<Student> VoirToutLesEleves() {
		
		return studentRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}



	
	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}



	@Override
	public Student updateStudent(Student student) {
	
		return studentRepository.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}





// service d'creation d' étudiant 
	@Override
	public Student createStudent() {
		Student std= new Student();
		return std;
	}

}
