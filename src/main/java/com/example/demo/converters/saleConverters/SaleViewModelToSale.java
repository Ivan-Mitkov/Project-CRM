package com.example.demo.converters.saleConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.converters.productConverters.ProductViewModelToProduct;
import com.example.demo.entities.Sale;
import com.example.demo.viewmodel.SaleViewModel;

@Component
public class SaleViewModelToSale implements 
Converter< SaleViewModel,Sale>{

	private final ProductViewModelToProduct productConveter;
	

	public SaleViewModelToSale(ProductViewModelToProduct productConveter) {
		this.productConveter = productConveter;
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
		
		return sale;
	}

}
