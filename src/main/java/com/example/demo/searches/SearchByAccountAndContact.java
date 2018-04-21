package com.example.demo.searches;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.viewmodel.AccountViewModel;
import com.example.demo.viewmodel.ContactViewModel;

@Component
public class SearchByAccountAndContact implements Searchable {

	List<AccountViewModel> searchAccounts;
	List<ContactViewModel> searchContacts;
	public SearchByAccountAndContact() {
		List<AccountViewModel> searchAccounts=new ArrayList<>();
		List<ContactViewModel> searchContacts=new ArrayList<>();
	}
	public SearchByAccountAndContact(List<AccountViewModel> searchAccounts, List<ContactViewModel> searchContacts) {
		this.searchAccounts = searchAccounts;
		this.searchContacts = searchContacts;
	}
	public List<AccountViewModel> getSearchAccounts() {
		return searchAccounts;
	}
	public void setSearchAccounts(List<AccountViewModel> searchAccounts) {
		this.searchAccounts = searchAccounts;
	}
	public List<ContactViewModel> getSearchContacts() {
		return searchContacts;
	}
	public void setSearchContacts(List<ContactViewModel> searchContacts) {
		this.searchContacts = searchContacts;
	}
	
}
