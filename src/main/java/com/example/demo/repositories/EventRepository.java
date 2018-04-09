package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

	Optional<Event> findEventBySubject(String subject);

}
