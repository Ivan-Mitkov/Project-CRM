package com.example.demo.converters.eventConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.EventBindingModel;
import com.example.demo.entities.Event;

@Component
public class EventToEventBindingModel implements 
Converter<Event, EventBindingModel>{

	@Override
	public EventBindingModel convert(Event source) {
		// TODO Auto-generated method stub
		return null;
	}

}
