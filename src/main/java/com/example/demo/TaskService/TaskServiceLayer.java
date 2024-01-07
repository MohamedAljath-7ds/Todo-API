package com.example.demo.TaskService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.TaskModel.TaskModel;
import com.example.demo.Taskrepository.TaskRepo;

@Service
public class TaskServiceLayer {

	@Autowired
	private TaskRepo task;
	
	public List<TaskModel> getAllTask(){
		return task.findAll();
	}
	
	public TaskModel SaveTask(TaskModel Task) {
		return task.save(Task);
	}
	
	public TaskModel getByID(int taskid) {
		return task.findById(taskid).get();
	}
	
	public void DeleteTaskbyId(int taskid) {
		task.deleteById(taskid);
	}
	
	
	
}
