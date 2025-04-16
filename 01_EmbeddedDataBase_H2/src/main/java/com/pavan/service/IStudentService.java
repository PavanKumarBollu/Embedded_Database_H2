package com.pavan.service;

import java.util.List;

import com.pavan.model.Student;

public interface IStudentService {

	public String saveStudent(Student student);

	public List<Student> findAllStudents();

	public Student findById(Integer id);

	public String updateStudent(Student student);

	public String deleteById(Integer id);
}
