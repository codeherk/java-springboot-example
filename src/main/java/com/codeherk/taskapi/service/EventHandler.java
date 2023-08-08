package com.codeherk.taskapi.service;

import com.codeherk.taskapi.model.Task;

public class EventHandler {
//    public static void handle(Task task){
//        System.out.println("Handling task " + task.getId());
//    }
    public static <T> void handle(T obj){
        System.out.println("Handling " + obj.getClass() + " " + obj.toString());
    }
}
