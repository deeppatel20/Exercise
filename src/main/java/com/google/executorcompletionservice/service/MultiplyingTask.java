package com.google.executorcompletionservice.service;

import java.util.concurrent.Callable;

public class MultiplyingTask implements Callable {

    int a;
    int b;
    String taskName;
    long sleepTime;

    public MultiplyingTask(int a, int b, String taskName, long sleepTime) {
        this.a = a;
        this.b = b;
        this.taskName = taskName;
        this.sleepTime = sleepTime;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Started task name "+ taskName);
        int result= a*b;
        Thread.sleep(sleepTime);
        System.out.println("Completed task name "+ taskName);
        return result;
    }
}
