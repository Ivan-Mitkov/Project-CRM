package com.example.demo.converters.adressConverters;


import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Adress;
import com.example.demo.viewmodel.AdressViewModel;


@Component
public class AdressViewModelToAdress implements 
		Converter<AdressViewModel, Adress> {

	@Nullable
	@Override
	public synchronized Adress convert(AdressViewModel source) {
		if(source==null) {
			return null;
		}
		final Adress abm=new Adress();
		abm.setId(source.getId());
		abm.setCountry(source.getCountry());
		abm.setCity(source.getCity());
		abm.setStreet(source.getStreet());
		abm.setStreetNumber(source.getStreetNumber());
		abm.setAdditionalAdressInfo(source.getAdditionalAdressInfo());
		
		return abm;
	}

}
