package com.example.demo.converters.accountConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.entities.Account;

public class AccountToAccountBindingModel implements 
Converter<Account,AccountBindingModel >{

	@Override
	public AccountBindingModel convert(Account source) {
		// TODO Auto-generated method stub
		return null;
	}

}
