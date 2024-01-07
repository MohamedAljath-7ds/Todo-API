package com.example.demo.Taskrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.TaskModel.TaskModel;

public interface TaskRepo extends JpaRepository<TaskModel, Integer>{

}
