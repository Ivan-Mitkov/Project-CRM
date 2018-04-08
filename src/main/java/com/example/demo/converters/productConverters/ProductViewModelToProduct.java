package com.example.demo.converters.productConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Product;
import com.example.demo.viewmodel.ProductViewModel;

@Component
public class ProductViewModelToProduct implements 
Converter< ProductViewModel,Product>{

	@Nullable
	@Override
	public Product convert(ProductViewModel source) {
		if(source==null) {
			return null;
		}

		final Product pbm=new Product();
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
