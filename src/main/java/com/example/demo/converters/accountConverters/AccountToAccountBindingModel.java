package com.example.demo.converters.accountConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.entities.Account;

@Component
public class AccountToAccountBindingModel implements 
Converter<Account,AccountBindingModel >{

	@Override
	public AccountBindingModel convert(Account source) {
		// TODO Auto-generated method stub
		return null;
	}

}
