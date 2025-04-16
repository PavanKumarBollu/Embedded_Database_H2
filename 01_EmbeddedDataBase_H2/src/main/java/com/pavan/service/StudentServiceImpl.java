package com.pavan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pavan.dao.StudentDao;
import com.pavan.exeception.StudentRecordNotFoundException;
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
		Student student = dao.findById(id).orElseThrow(()-> new StudentRecordNotFoundException("Student Record Not found"));
		return student;
	}

	@Override
	public String updateStudent(Student student) {
		Student dbStu = dao.save(student);
		
		return "Student record updated with the id :: " + dbStu.getSid();
	}

	@Override
	public String deleteById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
