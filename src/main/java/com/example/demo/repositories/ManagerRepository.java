package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

	Optional<Manager> findManagerByName(String name);

}
