package com.example.demo.converters.eventConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.bindingmodel.EmployeeBindingModel;
import com.example.demo.bindingmodel.EventBindingModel;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Event;

public class EventToEventBindingModel implements 
Converter<Event, EventBindingModel>{

	@Override
	public EventBindingModel convert(Event source) {
		// TODO Auto-generated method stub
		return null;
	}

}
