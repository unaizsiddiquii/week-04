package com;

import java.util.concurrent.TimeUnit;

public class Performance {

    public static boolean longRunningTask() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Task Completed...");
        return true;
    }
}
