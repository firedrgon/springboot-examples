package com.hong.servlet;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by sheny on 2018/1/2.
 */
public class LongRunningProcess {
    public void run() {
        try {
            int millis = ThreadLocalRandom.current().nextInt(2000);
            String currentThead = Thread.currentThread().getName();
            System.out.println(currentThead + " sleep for " + millis + "milliseconds.");
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
