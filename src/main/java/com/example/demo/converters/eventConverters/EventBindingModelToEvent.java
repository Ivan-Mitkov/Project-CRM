package com.example.demo.converters.eventConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.bindingmodel.EmployeeBindingModel;
import com.example.demo.bindingmodel.EventBindingModel;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Event;

public class EventBindingModelToEvent implements 
Converter<EventBindingModel, Event>{

	@Override
	public Event convert(EventBindingModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
