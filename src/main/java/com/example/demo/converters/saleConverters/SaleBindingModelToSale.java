package com.example.demo.converters.saleConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.SaleBindingModel;
import com.example.demo.converters.productConverters.ProductBindingModelToProduct;
import com.example.demo.entities.Sale;

@Component
public class SaleBindingModelToSale implements 
Converter< SaleBindingModel,Sale>{

	private final ProductBindingModelToProduct productConveter;

	public SaleBindingModelToSale(ProductBindingModelToProduct productConveter) {
		this.productConveter = productConveter;
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
		
		
		return sale;
	}

}
