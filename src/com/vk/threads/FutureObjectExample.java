package com.vk.threads;

import java.util.concurrent.*;

public class FutureObjectExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            Thread.sleep(3000); // Simulate a long-running task
            return "Hello from Callable!";
        };

        Future<String> future = executor.submit(task);

        // Do other work while the task is running
        System.out.println("Waiting for result...");
        String result = future.get(); // Will block until the task is done
        System.out.println("Result: " + result);
        executor.shutdown();
    }
}
