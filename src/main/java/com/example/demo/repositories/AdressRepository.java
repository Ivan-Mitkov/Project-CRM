package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Adress;

public interface AdressRepository extends JpaRepository<Adress, Long> {

}
