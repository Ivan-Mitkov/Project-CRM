package com.example.demo.converters.accountConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.converters.adressConverters.AdressViewModelToAdress;
import com.example.demo.entities.Account;
import com.example.demo.viewmodel.AccountViewModel;

@Component
public class AccountViewModelToAccount implements 
Converter<AccountViewModel,Account >{
	private final AdressViewModelToAdress converter;
	

	public AccountViewModelToAccount(AdressViewModelToAdress converter) {
		this.converter = converter;
	}


	@Override
	public Account convert(AccountViewModel source) {
		if(source==null) {
			return null;
		}
		
		Account account=new Account();
		account.setIdNumber(source.getIdNumber());
		account.setAdress(converter.convert(source.getAdress()));
		account.setEmail(source.getEmail());
		account.setName(source.getName());
		account.setPhone(source.getPhone());
		
		
		return account;
	}

}
