package com.example.demo.converters.adressConverters;


import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.AdressBindingModel;
import com.example.demo.entities.Adress;


@Component
public class AdressToAdressBindingModel implements 
		Converter<Adress, AdressBindingModel> {

	@Nullable
	@Override
	public synchronized AdressBindingModel convert(Adress source) {
		if(source==null) {
			return null;
		}
		final AdressBindingModel abm=new AdressBindingModel();
		abm.setId(source.getId());
		abm.setCountry(source.getCountry());
		abm.setCity(source.getCity());
		abm.setStreet(source.getStreet());
		abm.setStreetNumber(source.getStreetNumber());
		abm.setAdditionalAdressInfo(source.getAdditionalAdressInfo());
		
		return abm;
	}

}
