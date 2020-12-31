package com.example.sentryspringdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/")
	ResponseEntity<Void> sample() {
		throw new NotFoundException("oops");
	}
}
