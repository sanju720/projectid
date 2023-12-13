package com.idcard.idcard.service.impl;

import java.util.List;
import com.idcard.idcard.model.Student;
import com.idcard.idcard.repository.StudentRepository;
import com.idcard.idcard.service.StudentService;

public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentrepository;
	
	public StudentServiceImpl(StudentRepository studentrepository)
	{
		super();
		this.studentrepository=studentrepository;
	}

	@Override
	public List<Student> getAllStudents() 
	{
		return studentrepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		 return studentrepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		 return studentrepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentrepository.deleteById(id);
	}

}
