package com.example.demo.converters.productConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.ProductBindingModel;
import com.example.demo.entities.Product;

@Component
public class ProductToProductBindingModel implements 
Converter<Product, ProductBindingModel>{

	@Nullable
	@Override
	public synchronized ProductBindingModel convert(Product source) {
		if(source==null) {
			return null;
		}

		final ProductBindingModel pbm=new ProductBindingModel();
		pbm.setId(source.getId());
		pbm.setCategory(source.getCategory());
		pbm.setName(source.getName());
		pbm.setCode(source.getCode());
		pbm.setDescription(source.getDescription());
		pbm.setListPrice(source.getListPrice());
		pbm.setAvailable(source.isAvailable());
		return pbm;
	}

}
