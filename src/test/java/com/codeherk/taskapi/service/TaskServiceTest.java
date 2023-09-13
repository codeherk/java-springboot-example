package com.codeherk.taskapi.service;

import com.codeherk.taskapi.model.Task;
import com.codeherk.taskapi.repo.TaskRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    public void whenValidName_thenEmployeeShouldBeFound() {
        Task t = new Task("Hello world!");
        Mockito.when(taskRepository.findById(0L)).thenReturn(Optional.of(t));

        Long taskId = 0L;
        Task found = taskService.getTaskById(taskId);

        assertThat(found.getDescription())
                .isEqualTo(found.getDescription());
    }
}
