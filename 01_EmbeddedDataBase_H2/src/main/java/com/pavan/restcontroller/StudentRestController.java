package com.pavan.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.Student;
import com.pavan.service.IStudentService;

@RestController
@RequestMapping(value="/student")
public class StudentRestController {
	
	private IStudentService service;
	
	
	@PostMapping(value="/register")
	public ResponseEntity<String> saveStudent(@RequestBody Student student)
	{
		String std = service.saveStudent(student);
		return new ResponseEntity<String>(std ,HttpStatus.OK);
	}

}
 