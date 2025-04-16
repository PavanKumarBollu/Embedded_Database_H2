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
		
		return null;
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return null;
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
