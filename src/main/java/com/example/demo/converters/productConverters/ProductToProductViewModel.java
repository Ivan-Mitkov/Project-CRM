package com.example.demo.converters.productConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.ProductBindingModel;
import com.example.demo.entities.Product;
import com.example.demo.viewmodel.ProductViewModel;

@Component
public class ProductToProductViewModel implements 
Converter<Product, ProductViewModel>{

	@Nullable
	@Override
	public ProductViewModel convert(Product source) {
		if(source==null) {
			return null;
		}

		final ProductViewModel pbm=new ProductViewModel();
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
