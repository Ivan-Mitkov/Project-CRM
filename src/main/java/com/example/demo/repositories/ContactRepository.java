package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

	List<Contact> findAllByAccountId(Long id);

}
