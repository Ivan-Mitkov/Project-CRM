package com.example.demo.enums;

public enum Status {
	INITIAL("initial contact"), WORKING("working"), CLOSED("closed");
	private final String name;

	private Status(String name) {
		this.name = name;
	}
	
	
	
}
