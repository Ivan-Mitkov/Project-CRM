package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Opportunity;

public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {

	List<Opportunity> findAllByAccountId(Long idDB);

}
