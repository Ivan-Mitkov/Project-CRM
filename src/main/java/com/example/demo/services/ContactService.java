package com.example.demo.services;

import java.util.List;

import com.example.demo.viewmodel.ContactViewModel;

public interface ContactService {

	List<ContactViewModel> findAllContactsOfAnAccount(Long id);

}
