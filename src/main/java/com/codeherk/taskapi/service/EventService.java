package com.codeherk.taskapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService<T> {
    private static final Logger log = LoggerFactory.getLogger(EventService.class);
//    public static void handle(Task task){
//        System.out.println("Handling task " + task.getId());
//    }

    @Async("threadPoolTaskExecutor")
    public void handle(List<T> list){
        for(T obj: list) {
            log.info("asynchronously handling " + obj);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("done " + obj);
        }
    }
}
