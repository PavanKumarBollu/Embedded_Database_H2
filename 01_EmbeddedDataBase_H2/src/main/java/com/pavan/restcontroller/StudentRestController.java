package com.pavan.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.Student;
import com.pavan.service.IStudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentRestController {

	@Autowired
	private IStudentService service;

	@PostMapping(value = "/register")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {
		String std = service.saveStudent(student);
		return new ResponseEntity<String>(std, HttpStatus.OK);
	}

	@GetMapping(value = "/findAll")
	public ResponseEntity<?> getAllStudents() {
		List<Student> students = service.findAllStudents();
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayStudentById(@PathVariable("id") Integer id) {
		Student student = service.findById(id);
		return new ResponseEntity<Student>(student, HttpStatus.OK);

	}

	@PutMapping("/modify")
	public ResponseEntity<String> modifyStudent(@RequestBody Student student) {
		String body = service.updateStudent(student);
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeStudentById(@PathVariable("id") Integer id) {
		String body = service.deleteById(id);
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
}
