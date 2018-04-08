package com.example.demo.coverters.saleConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.ProductBindingModel;
import com.example.demo.bindingmodel.SaleBindingModel;
import com.example.demo.converters.accountConverters.AccountBindingModelToAccount;
import com.example.demo.converters.employeeConverters.EmployeeBindingModelToEmployee;
import com.example.demo.converters.productConverters.ProductBindingModelToProduct;
import com.example.demo.entities.Product;
import com.example.demo.entities.Sale;

@Component
public class SaleBindingModelToSale implements 
Converter< SaleBindingModel,Sale>{

	private final ProductBindingModelToProduct productConveter;
	private final AccountBindingModelToAccount accountConverter;
	private final EmployeeBindingModelToEmployee employeeConverter;
	
	

	public SaleBindingModelToSale(ProductBindingModelToProduct productConveter,
			AccountBindingModelToAccount accountConverter, EmployeeBindingModelToEmployee employeeConverter) {
		this.productConveter = productConveter;
		this.accountConverter = accountConverter;
		this.employeeConverter = employeeConverter;
	}



	@Nullable
	@Override
	public synchronized Sale convert(SaleBindingModel source) {
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
