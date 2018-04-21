package com.example.demo.services;

import java.util.List;

import com.example.demo.viewmodel.AccountViewModel;

public interface SearchService {
	List<AccountViewModel> searchAccounts(String searched);
}
