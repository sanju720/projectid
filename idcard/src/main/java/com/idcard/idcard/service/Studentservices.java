package com.idcard.idcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idcard.idcard.model.Student;
import com.idcard.idcard.repository.StudentRepository;

@Service
public class Studentservices {
	
	@Autowired
	private StudentRepository studentrepository;
	
	public List<Student> findAll()
	{
		return studentrepository.findAll();
	}
	
	public Student findById(Long id)
	{
		return studentrepository.findById(id).orElse(null);
	}
	public void save(Student student)
	{
		studentrepository.save(student);
	}
	
	public void delete(Long id)
	{
		 studentrepository.deleteById(id);
	}
	

}
