package com.example.demo.coverters.saleConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.SaleBindingModel;
import com.example.demo.converters.accountConverters.AccountToAccountBindingModel;
import com.example.demo.converters.accountConverters.AccountToAccountViewModel;
import com.example.demo.converters.accountConverters.AccountViewModelToAccount;
import com.example.demo.converters.employeeConverters.EmployeeToEmployeeBindingModel;
import com.example.demo.converters.employeeConverters.EmployeeToEmployeeViewModel;
import com.example.demo.converters.employeeConverters.EmployeeViewModelToEmployee;
import com.example.demo.converters.productConverters.ProductToProductBindingModel;
import com.example.demo.converters.productConverters.ProductToProductViewModel;
import com.example.demo.converters.productConverters.ProductViewModelToProduct;
import com.example.demo.entities.Sale;
import com.example.demo.viewmodel.SaleViewModel;

@Component
public class SaleViewModelToSale implements 
Converter< SaleViewModel,Sale>{

	private final ProductViewModelToProduct productConveter;
	private final AccountViewModelToAccount accountConverter;
	private final EmployeeViewModelToEmployee employeeConverter;
	
	public SaleViewModelToSale(ProductViewModelToProduct productConveter, AccountViewModelToAccount accountConverter,
			EmployeeViewModelToEmployee employeeConverter) {
		this.productConveter = productConveter;
		this.accountConverter = accountConverter;
		this.employeeConverter = employeeConverter;
	}


	@Nullable
	@Override
	public synchronized Sale convert(SaleViewModel source) {
		if(source==null) {
			return null;
		}

		final Sale sale=new Sale();
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
