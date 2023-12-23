package com.alfaizuna.taskmanager.service;

import com.alfaizuna.taskmanager.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    Task getTaskById(Long id);

    void saveTask(Task task);

    void deleteTask(Long id);
}

