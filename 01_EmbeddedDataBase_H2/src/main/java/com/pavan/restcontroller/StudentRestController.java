package com.pavan.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/student")
public class StudentRestController {
	
	public ResponseEntity<String> saveStudent()
	{
		return new ResponseEntity<String>("" ,HttpStatus.OK);
	}

}
 