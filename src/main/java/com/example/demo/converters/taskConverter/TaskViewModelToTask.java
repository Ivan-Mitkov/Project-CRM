package com.example.demo.converters.taskConverter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Task;
import com.example.demo.viewmodel.TaskViewModel;

@Component
public class TaskViewModelToTask implements 
Converter<TaskViewModel,Task>{

	@Override
	public Task convert(TaskViewModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
