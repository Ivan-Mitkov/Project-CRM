package com.example.demo.converters.accountConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.converters.adressConverters.AdressBindingModelToAdress;
import com.example.demo.entities.Account;

@Component
public class AccountBindingModelToAccount implements 
Converter<AccountBindingModel, Account>{

	private final AdressBindingModelToAdress converter;
	
	public AccountBindingModelToAccount(AdressBindingModelToAdress converter) {
		this.converter = converter;
	}

	@Override
	@Nullable
	public synchronized Account convert(AccountBindingModel source) {
		if(source==null) {
			return null;
		}
		
		Account account=new Account();
		
		account.setId(source.getId());
		account.setIdNumber(source.getIdNumber());
		account.setAdress(converter.convert(source.getAdress()));
		account.setEmail(source.getEmail());
		account.setName(source.getName());
		account.setPhone(source.getPhone());
		
		
		return account;
	}
	
	

}
