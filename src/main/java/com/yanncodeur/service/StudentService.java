package com.yanncodeur.service;

import java.util.List;

import com.yanncodeur.entities.Student;

public interface StudentService {
	
	List<Student>VoirToutLesEleves();  // service de listing
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);

	Student updateStudent(Student student);
	
	
	void deleteStudentById(Long id);

	Student createStudent();

}
