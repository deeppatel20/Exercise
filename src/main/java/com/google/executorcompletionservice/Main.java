package com.google.executorcompletionservice;

import com.google.executorcompletionservice.service.MultiplyingTask;

import java.util.Comparator;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        MultiplyingTask task1 = new MultiplyingTask(10, 20, "Task1", 4000);
        MultiplyingTask task2 = new MultiplyingTask(30, 40, "Task2", 6000);
        MultiplyingTask task3 = new MultiplyingTask(50, 60, "Task3", 2000);
        MultiplyingTask task4 = new MultiplyingTask(70, 80, "Task4", 1000);

        ExecutorService es = Executors.newFixedThreadPool(4);
        CompletionService<Integer> ecs = new ExecutorCompletionService(es);

        ecs.submit(task1);
        ecs.submit(task2);
        ecs.submit(task3);
        ecs.submit(task4);


      /*  List<Future<Integer>> futureList = new ArrayList<>();
        futureList.add(ecs.submit(task1));
        futureList.add(ecs.submit(task2));
        futureList.add(ecs.submit(task3));
        futureList.add(ecs.submit(task4));*/

        for (int i = 1; i <= 4; i++) {
            try {
                Integer result = ecs.take().get();
                System.out.println("Result = " + result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }


        es.shutdown();


    }
}
