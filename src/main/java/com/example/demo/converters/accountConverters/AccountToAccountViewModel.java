package com.example.demo.converters.accountConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.converters.adressConverters.AdressToAdressViewModel;
import com.example.demo.entities.Account;
import com.example.demo.viewmodel.AccountViewModel;

@Component
public class AccountToAccountViewModel implements 
Converter<Account,AccountViewModel > {
	private final AdressToAdressViewModel converter;
	

	public AccountToAccountViewModel(AdressToAdressViewModel converter) {
		this.converter = converter;
	}


	@Nullable
	@Override
	public AccountViewModel convert(Account source) {
		if(source==null) {
			return null;
		}
		final AccountViewModel account=new AccountViewModel();
		account.setName(source.getName());
		account.setAdress(converter.convert(source.getAdress()));
		account.setEmail(source.getEmail());
		account.setPhone(source.getPhone());
		return account;
		
	}


}
