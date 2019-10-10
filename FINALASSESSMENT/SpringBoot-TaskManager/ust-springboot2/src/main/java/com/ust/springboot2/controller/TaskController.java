package com.ust.springboot2.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.springboot2.dto.Task;
import com.ust.springboot2.dto.TaskResponse;
import com.ust.springboot2.service.TaskService;



@RestController                                               
@RequestMapping("/task")
@CrossOrigin(origins="*")
public class TaskController {

	
	
	
	@Autowired
@Qualifier("jpa")
	private TaskService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
	binder.registerCustomEditor(Date.class,editor);
	}
		

	@GetMapping(path= "/get",produces = MediaType.APPLICATION_JSON_VALUE)            // to produce json data       
	public TaskResponse getTask(@RequestParam("task_id") int task_id) { 
	Task task = service.getTask(task_id);
	TaskResponse  response = new TaskResponse();
		if(task==null) {
		 response.setStatusCode(401);
		 response.setMessage("Failure");
		 response.setDescription("No Data Found");
		}else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found successfully");
			response.setTasks(Arrays.asList(task));
		}
		return response;                             

	}

	@GetMapping(path="/get-all",produces = MediaType.APPLICATION_JSON_VALUE )
	public  TaskResponse getAllTask() {
		List<Task> taskList= service.getAllTask();
		TaskResponse response = new TaskResponse();
		if(taskList==null) {
		 response.setStatusCode(401);
		 response.setMessage("Failure");
		 response.setDescription("No Data Found");
		}else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found successfully");
			response.setTasks(taskList);
		}
		return response;  

	}
	


	@PostMapping(path= "/add" , produces = MediaType.APPLICATION_JSON_VALUE,consumes= MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse addEmployee(@RequestBody Task task) {
		TaskResponse response = new TaskResponse();
		if(service.addTask(task)) {
		 response.setStatusCode(201);
		 response.setMessage("Success");
		 response.setDescription("Data Added Successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added successfully");
		}
		return response;
	}

@PutMapping(path="/update",produces = MediaType.APPLICATION_JSON_VALUE,consumes= MediaType.APPLICATION_JSON_VALUE)
public TaskResponse updateTask(@RequestBody Task task) {
	TaskResponse response = new TaskResponse();
	if(service.updateTask(task)) {
	 response.setStatusCode(201);
	 response.setMessage("Success");
	 response.setDescription("Data Modified Successfully");
	}else {
			response.setStatusCode(401);
		response.setMessage("Failure");
			response.setDescription("Data not modified successfully");
		}	
return response;
}

	@DeleteMapping(path="/remove/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse removeTask(@PathVariable("id") int task_id) {
		TaskResponse response = new TaskResponse();
		if(service.removeTask(task_id)) {
		 response.setStatusCode(201);
		 response.setMessage("Success");
		 response.setDescription("Data Removed Successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not removed successfully");
		}
		return response;

	}
}
