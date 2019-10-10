package com.ust.springboot2.service;

import java.util.List;

import com.ust.springboot2.dto.Task;



public interface TaskService {
	public boolean addTask(Task task);
	public boolean removeTask(int task_id);
	public boolean updateTask(Task task);
	public Task getTask(int task_id);
	public List<Task> getAllTask();

}
