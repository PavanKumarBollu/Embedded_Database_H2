package com.pavan.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pavan.error.ErrorDetails;
import com.pavan.exeception.StudentRecordNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentRecordNotFoundException.class)
	public ResponseEntity<ErrorDetails> studentNotFound(StudentRecordNotFoundException srnfe) {
		return new ResponseEntity<ErrorDetails>(
				new ErrorDetails(LocalDateTime.now(), srnfe.getMessage(), "Record Not found"), HttpStatus.OK);
	}
	public ResponseEntity<ErrorDetails> globalException(Exception e) {
		return new ResponseEntity<ErrorDetails>(
				new ErrorDetails(LocalDateTime.now(), e.getMessage(), "Record Not found"), HttpStatus.OK);
	}
	
	
	

}
