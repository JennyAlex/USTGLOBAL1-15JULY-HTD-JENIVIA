package com.ust.springboot2.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.springboot2.dto.Task;
import com.ust.springboot2.repository.TaskRepository;

@Service("jpa")
public class TaskServiceJpaImpl implements TaskService {
	@Autowired
	TaskRepository repository;

	@Override
	public boolean addTask(Task task) {
		Date task_start_date=new Date();
		task.setTask_end_date(task_start_date);
		repository.save(task);
		return true;
	}

	@Override
	public boolean removeTask(int task_id) {
		repository.deleteById(task_id);
		return true;
	}

	@Override
	public boolean updateTask(Task task) {
		Date task_end_date= new Date();
		task.setTask_end_date(task_end_date);
		
		repository.update(task.getTask_end_date(), task.getTask_id());
		return true;
	}

	@Override
	public Task getTask(int task_id) {
		return repository.findById(task_id).get();

	}

	@Override
	public List<Task> getAllTask() {
		return repository.findAll();
	}

}
