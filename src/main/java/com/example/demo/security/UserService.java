package com.example.demo.security;



import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    void register(RegistrationModel registrationModel);

    List<UserViewModel> findAll();

	User getUserByUsername(String username);
}