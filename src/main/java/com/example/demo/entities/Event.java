package com.example.demo.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Event {

	private Long id;
	private Adress location;
	private String subject;
	private String description;
	private LocalDateTime dateAndTime;
	private List<Employee> toAttend;
	
	
}
