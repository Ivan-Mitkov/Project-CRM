package com.example.demo.converters.accountConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Account;
import com.example.demo.viewmodel.AccountViewModel;

@Component
public class AccountToAccountViewModel implements 
Converter<Account,AccountViewModel > {

	@Override
	public AccountViewModel convert(Account source) {
		// TODO Auto-generated method stub
		return null;
	}

}
