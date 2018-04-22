package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.TaskService;

@Controller
public class TaskController {
	Logger logger = LoggerFactory.getLogger(TaskController.class);
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
		logger.info("Inside TASK CONTROLLER ");
	}

	@GetMapping("tasks/show")
	public String getAll(Model model) {

		logger.info("All products ");
		return "task/allTasks";
	}
	
	@GetMapping("tasks/add")
	public String getDetail(Model model) {

		logger.info("task form ");
		return "task/taskForm";
	}
}
