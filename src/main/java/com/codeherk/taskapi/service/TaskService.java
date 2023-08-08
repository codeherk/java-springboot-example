package com.codeherk.taskapi.service;

import com.codeherk.taskapi.exception.TaskNotFoundException;
import com.codeherk.taskapi.model.Task;
import com.codeherk.taskapi.repo.TaskRepository;
import com.sun.source.util.TaskListener;
import jdk.jfr.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private static final Logger log = LoggerFactory.getLogger(EventService.class);

    @Autowired
    private TaskRepository repository;

    @Autowired
    private EventService<Task> eventService;

//    public TaskService() {}

    public List<Task> getTasks() {
        return repository.findAll();
    }

    public Task getTaskById(Long id) {
        return repository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
    }


//    public Task createTask(Task newTask) {
//        return repository.save(newTask);
//    }

    public List<Task> createTasks(List<Task> newTasks) {
        eventService.handle(newTasks);
        log.info("saving " + newTasks.size() + " tasks to table");
        return repository.saveAll(newTasks);
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
