package com.water.user.springboot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public class InternalError extends RuntimeException {

		  public InternalError(String exception) {
		    super(exception);
		  }
}
