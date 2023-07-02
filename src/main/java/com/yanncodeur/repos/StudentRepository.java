package com.yanncodeur.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yanncodeur.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
