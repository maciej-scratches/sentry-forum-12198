package com.example.sentryspringdemo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlers {

	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = NotFoundException.class)
	@ResponseBody
	ApiResponseMessage handleResourceNotFoundException(NotFoundException notFoundException) {
		return new ApiResponseMessage(HttpStatus.NOT_FOUND.value(), notFoundException.getMessage());
	}
}
