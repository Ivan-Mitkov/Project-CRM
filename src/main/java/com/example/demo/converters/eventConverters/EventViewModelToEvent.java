package com.example.demo.converters.eventConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Event;
import com.example.demo.viewmodel.EventViewModel;

@Component
public class EventViewModelToEvent implements 
Converter<EventViewModel,Event>{

	@Override
	public Event convert(EventViewModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
