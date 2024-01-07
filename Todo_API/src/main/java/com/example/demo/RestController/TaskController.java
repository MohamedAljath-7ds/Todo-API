package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.TaskModel.TaskModel;
import com.example.demo.TaskService.TaskServiceLayer;


@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	@Autowired
	private TaskServiceLayer taskservice;

	public TaskServiceLayer getTaskservice() {
		return taskservice;
	}

	public void setTaskservice(TaskServiceLayer taskservice) {
		this.taskservice = taskservice;
	}
	
	@PostMapping
	public TaskModel createtask(@RequestBody TaskModel Task) {
		return taskservice.SaveTask(Task);
	}
	
	
	@GetMapping("/{taskid}")
	public TaskModel getTaskById(@PathVariable int taskid) {
		return taskservice.getByID(taskid);
	}
	
	@GetMapping
	public List<TaskModel> getAllTask(TaskModel Task){
		return taskservice.getAllTask();
	}
	
	@PatchMapping("/{taskid}")
	public TaskModel UpdateTask(@PathVariable int taskid, @RequestBody TaskModel Task) {
		
		TaskModel existingTask = taskservice.getByID(taskid);
		if(existingTask != null) {
			existingTask.setUsername(existingTask.username);
			existingTask.setDescription(existingTask.description);
			existingTask.setCompleted(existingTask.completed);
		}else {
			return taskservice.SaveTask(Task);
		}
		return taskservice.SaveTask(Task);
	}
	
	@DeleteMapping("/{taskid}")
	public void deletTask(@PathVariable int taskid) {
	  taskservice.DeleteTaskbyId(taskid);
	}
}

