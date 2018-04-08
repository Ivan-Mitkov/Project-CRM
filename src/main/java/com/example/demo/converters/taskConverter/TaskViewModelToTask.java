package com.example.demo.converters.taskConverter;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Event;
import com.example.demo.entities.Task;
import com.example.demo.viewmodel.EmployeeViewModel;
import com.example.demo.viewmodel.EventViewModel;
import com.example.demo.viewmodel.TaskViewModel;

public class TaskViewModelToTask implements 
Converter<TaskViewModel,Task>{

	@Override
	public Task convert(TaskViewModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
