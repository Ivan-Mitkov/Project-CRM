package com.example.demo.converters.taskConverter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.TaskBindingModel;
import com.example.demo.entities.Task;

@Component
public class TaskToTaskBindingModel implements 
Converter<Task, TaskBindingModel>{

	@Override
	public TaskBindingModel convert(Task source) {
		// TODO Auto-generated method stub
		return null;
	}

}
