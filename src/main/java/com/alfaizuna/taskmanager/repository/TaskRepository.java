package com.alfaizuna.taskmanager.repository;

import com.alfaizuna.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

