package com.pavan.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.Student;

@RestController
@RequestMapping(value="/student")
public class StudentRestController {
	
	@PostMapping(value="/register")
	public ResponseEntity<String> saveStudent(@RequestBody Student student)
	{
		return new ResponseEntity<String>("" ,HttpStatus.OK);
	}

}
 