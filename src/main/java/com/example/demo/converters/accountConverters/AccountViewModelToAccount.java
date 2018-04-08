package com.example.demo.converters.accountConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.entities.Account;
import com.example.demo.viewmodel.AccountViewModel;

public class AccountViewModelToAccount implements 
Converter<AccountViewModel,Account >{

	@Override
	public Account convert(AccountViewModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
