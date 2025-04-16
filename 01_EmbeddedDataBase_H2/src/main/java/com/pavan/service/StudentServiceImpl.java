package com.pavan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pavan.dao.StudentDao;
import com.pavan.model.Student;

public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentDao dao;
	
	
	@Override
	public String saveStudent(Student student) {
		Student save = dao.save(student);
		return "Student Registed With the id " + save.getSid();
	}

	@Override
	public List<Student> findAllStudents() {
		return dao.findAll();
	}

	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
