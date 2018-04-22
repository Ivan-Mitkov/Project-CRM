package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Manager;
@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

	Optional<Manager> findManagerByName(String name);

	Optional<Manager> findManagerByIdNumber(String idNumber);

}
