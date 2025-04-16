package com.pavan.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.pavan.error.ErrorDetails;
import com.pavan.exeception.StudentRecordNotFoundException;

public class GlobalExceptionHandler {

	public ResponseEntity<ErrorDetails> studentNotFound(StudentRecordNotFoundException srnfe) {
		return new ResponseEntity<ErrorDetails>(
				new ErrorDetails(LocalDateTime.now(), srnfe.getMessage(), "Record Not found"), HttpStatus.OK);
	}

}
