package com.example.demo.converters.eventConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.EventBindingModel;
import com.example.demo.entities.Event;

@Component
public class EventBindingModelToEvent implements 
Converter<EventBindingModel, Event>{

	@Override
	public Event convert(EventBindingModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
