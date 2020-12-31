package com.example.sentryspringdemo;

public class ApiResponseMessage {
	private final int code;
	private final String message;

	public ApiResponseMessage(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
