package com.example.demo.converters.accountConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.converters.adressConverters.AdressToAdressBindingModel;
import com.example.demo.entities.Account;

@Component
public class AccountToAccountBindingModel implements 
Converter<Account,AccountBindingModel >{

	private final AdressToAdressBindingModel converter;
	
	
	public AccountToAccountBindingModel(AdressToAdressBindingModel converter) {
		this.converter = converter;
	}


	@Nullable
	@Override
	public AccountBindingModel convert(Account source) {
		if(source==null) {
			return null;
		}
		final AccountBindingModel account=new AccountBindingModel();
		
		account.setId(source.getId());
		
		account.setIdNumber(source.getIdNumber());
		account.setName(source.getName());
		account.setAdress(converter.convert(source.getAdress()));
		account.setEmail(source.getEmail());
		account.setPhone(source.getPhone());
		return account;
		
	}

}
