package com.example.demo.services;

import java.util.List;

import com.example.demo.bindingmodel.AdressBindingModel;
import com.example.demo.viewmodel.AdressViewModel;

public interface AdressService {

	public List<AdressViewModel> getAllAdresses();

	public void saveAdress(AdressBindingModel adressToSave);

}
