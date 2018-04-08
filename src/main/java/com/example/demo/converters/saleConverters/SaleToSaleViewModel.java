package com.example.demo.converters.saleConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.converters.accountConverters.AccountToAccountViewModel;
import com.example.demo.converters.employeeConverters.EmployeeToEmployeeViewModel;
import com.example.demo.converters.productConverters.ProductToProductViewModel;
import com.example.demo.entities.Sale;
import com.example.demo.viewmodel.SaleViewModel;

@Component
public class SaleToSaleViewModel implements 
Converter< Sale,SaleViewModel>{

	private final ProductToProductViewModel productConveter;
	private final AccountToAccountViewModel accountConverter;
	private final EmployeeToEmployeeViewModel employeeConverter;
	
	public SaleToSaleViewModel(ProductToProductViewModel productConveter, AccountToAccountViewModel accountConverter,
			EmployeeToEmployeeViewModel employeeConverter) {
		this.productConveter = productConveter;
		this.accountConverter = accountConverter;
		this.employeeConverter = employeeConverter;
	}


	@Nullable
	@Override
	public synchronized SaleViewModel convert(Sale source) {
		if(source==null) {
			return null;
		}

		final SaleViewModel sale=new SaleViewModel();
		sale.setId(source.getId());
		sale.setProduct(productConveter.convert(source.getProduct()));
		sale.setPrice(source.getPrice());
		sale.setClosedAt(source.getClosedAt());
		sale.setQuontity(source.getQuontity());
		sale.setAccount(accountConverter.convert(source.getAccount()));
		sale.setEmployee(employeeConverter.convert(source.getEmployee()));
		
		return sale;
	}

}
