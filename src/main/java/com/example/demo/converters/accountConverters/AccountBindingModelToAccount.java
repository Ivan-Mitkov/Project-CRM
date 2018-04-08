package com.example.demo.converters.accountConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.entities.Account;

public class AccountBindingModelToAccount implements 
Converter<AccountBindingModel, Account>{

	@Override
	public Account convert(AccountBindingModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
