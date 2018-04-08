package com.example.demo.converters.taskConverter;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Event;
import com.example.demo.entities.Task;
import com.example.demo.viewmodel.EmployeeViewModel;
import com.example.demo.viewmodel.EventViewModel;
import com.example.demo.viewmodel.TaskViewModel;

public class TaskToTaskViewModel implements 
Converter<Task,TaskViewModel>{

	@Override
	public TaskViewModel convert(Task source) {
		// TODO Auto-generated method stub
		return null;
	}

}
