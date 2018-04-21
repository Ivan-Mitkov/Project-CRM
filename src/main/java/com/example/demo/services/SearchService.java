package com.example.demo.services;

import java.util.List;

import com.example.demo.viewmodel.AccountViewModel;
import com.example.demo.viewmodel.ContactViewModel;

public interface SearchService {
	List<AccountViewModel> searchAccounts(String searched);

	List<ContactViewModel> searchContacts(String searched);
}
