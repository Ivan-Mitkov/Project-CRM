package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	Optional<Account> findByName(String name);

}
