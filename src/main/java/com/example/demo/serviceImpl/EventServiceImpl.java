package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Event;
import com.example.demo.repositories.EventRepository;
import com.example.demo.services.EventService;
@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository repository;
	
	public EventServiceImpl(EventRepository repository) {
			this.repository = repository;
		}
	
	public Optional<Event> findEventBySubject(String subject) {
		Optional<Event> opEvent=repository.findEventBySubject(subject);
		return opEvent;
	}

	

}
