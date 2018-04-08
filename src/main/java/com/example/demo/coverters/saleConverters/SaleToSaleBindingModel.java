package com.example.demo.coverters.saleConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.SaleBindingModel;
import com.example.demo.converters.accountConverters.AccountToAccountBindingModel;
import com.example.demo.converters.employeeConverters.EmployeeToEmployeeBindingModel;
import com.example.demo.converters.productConverters.ProductToProductBindingModel;
import com.example.demo.entities.Sale;

@Component
public class SaleToSaleBindingModel implements 
Converter< Sale,SaleBindingModel>{

	private final ProductToProductBindingModel productConveter;
	private final AccountToAccountBindingModel accountConverter;
	private final EmployeeToEmployeeBindingModel employeeConverter;
	
	

	public SaleToSaleBindingModel(ProductToProductBindingModel productConveter,
			AccountToAccountBindingModel accountConverter, EmployeeToEmployeeBindingModel employeeConverter) {
		this.productConveter = productConveter;
		this.accountConverter = accountConverter;
		this.employeeConverter = employeeConverter;
	}



	@Nullable
	@Override
	public synchronized SaleBindingModel convert(Sale source) {
		if(source==null) {
			return null;
		}

		final SaleBindingModel sale=new SaleBindingModel();
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
