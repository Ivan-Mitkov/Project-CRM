package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bindingmodel.AdressBindingModel;
import com.example.demo.entities.Adress;
import com.example.demo.repositories.AdressRepository;
import com.example.demo.services.AdressService;
import com.example.demo.viewmodel.AdressViewModel;

@Service
public class AdressServiceImpl implements AdressService {

	private ModelMapper modelMapper;
	Logger logger=LoggerFactory.getLogger(AdressServiceImpl.class);

	private AdressRepository adressRepository;

	@Autowired
	public AdressServiceImpl(AdressRepository adressRepository, ModelMapper mapper) {
		this.adressRepository = adressRepository;
		this.modelMapper = mapper;
	}

	@Override
	public List<AdressViewModel> getAllAdresses() {
		List<AdressViewModel> allAdresses = new ArrayList<>();

		List<Adress> adresses = adressRepository.findAll();
		for (Adress adress : adresses) {
			AdressViewModel ad = this.modelMapper.map(adress, AdressViewModel.class);
			allAdresses.add(ad);
		}

		return allAdresses;
	}

	@Override
	public void saveAdress(AdressBindingModel adressToSave) {
		logger.info("Inside saving address");
		Adress adress = this.modelMapper.map(adressToSave, Adress.class);
		adress.setCountry(adressToSave.getCountry());
		adress.setCity(adressToSave.getCity());
		adress.setStreet(adressToSave.getStreet());
		adress.setStreetNumber(adressToSave.getStreetNumber());
		adress.setAdditionalAdressInfo(adressToSave.getAdditionalAdressInfo());
		logger.info("Saving address:"+adress.getStreet()+" id: "+adress.getId());
		this.adressRepository.save(adress);
	}

	
}
