package com.pavan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
