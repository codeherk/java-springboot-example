package com.codeherk.taskapi.config;

import com.codeherk.taskapi.model.Task;
import com.codeherk.taskapi.repo.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class DatabaseLoader {

    private static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);

//    @Bean
    CommandLineRunner initDatabase(TaskRepository repository) {
        Task task1 = new Task("Create Spring Boot Application");
//        Timestamp t = new Timestamp(System.currentTimeMillis());
//        task1.setCreatedTimestamp(t);
//        task1.setUpdatedTimestamp(t);
        Task task2 = new Task("Crush the interview!");
//        t = new Timestamp(System.currentTimeMillis());
//        task2.setCreatedTimestamp(t);
//        task2.setUpdatedTimestamp(t);

        return args -> {
            log.info("Preloading " + repository.save(task1));
            log.info("Preloading " + repository.save(task2));
        };
    }
}