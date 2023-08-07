package com.codeherk.taskapi.controller;

import java.util.List;

import com.codeherk.taskapi.model.Task;
import com.codeherk.taskapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

//    Constructors are inferred
//    TaskController(){}


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/tasks")
    List<Task> getTasks() {
        return taskService.getTasks();
    }
    // end::get-aggregate-root[]

    @PostMapping("/tasks")
    Task createTask(@RequestBody Task newTask) {
        return taskService.createTask(newTask);
    }

    // Single task
    @GetMapping("/tasks/{id}")
    Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PutMapping("/tasks/{id}")
    Task updateTask(@RequestBody Task newTask, @PathVariable Long id) {
        return taskService.updateTask(newTask, id);
    }

    @DeleteMapping("/tasks/{id}")
    void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}