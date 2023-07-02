package com.yanncodeur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yanncodeur.entities.Student;
import com.yanncodeur.repos.StudentRepository;

@SpringBootApplication
public class SchoolgestionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SchoolgestionApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	}
	

}
