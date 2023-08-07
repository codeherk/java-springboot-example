package com.codeherk.taskapi.service;

import com.codeherk.taskapi.exception.TaskNotFoundException;
import com.codeherk.taskapi.model.Task;
import com.codeherk.taskapi.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getTasks() {
        return repository.findAll();
    }

    public Task getTaskById(Long id) {
        return repository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
    }

    public Task createTask(Task newTask) {
        return repository.save(newTask);
    }

    public Task updateTask(Task newTask, Long id) {
        return repository.findById(id)
                .map(Task -> {
                    Task.setDescription(newTask.getDescription());
                    return repository.save(Task);
                })
                .orElseGet(() -> {
                    newTask.setId(id);
                    return repository.save(newTask);
                });
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
