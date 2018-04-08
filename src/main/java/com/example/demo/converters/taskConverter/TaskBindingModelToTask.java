package com.example.demo.converters.taskConverter;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.bindingmodel.EmployeeBindingModel;
import com.example.demo.bindingmodel.EventBindingModel;
import com.example.demo.bindingmodel.TaskBindingModel;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Event;
import com.example.demo.entities.Task;

public class TaskBindingModelToTask implements 
Converter<TaskBindingModel, Task>{

	@Override
	public Task convert(TaskBindingModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
