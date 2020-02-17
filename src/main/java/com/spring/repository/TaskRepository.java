package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}