package learn.baiduyun.threadPoolTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * newScheduledThreadPool
 */
public class ThreadPoolExample2 {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newScheduledThreadPool(3); // 可定时任务

        ((ScheduledExecutorService) executor).scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟1S后间隔3S的任务队列模式，name:" + Thread.currentThread().getName());
            }
        }, 1, 3, TimeUnit.SECONDS);

        ((ScheduledExecutorService) executor).schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟3S的任务队列模式，name:" + Thread.currentThread().getName());
            }
        }, 3, TimeUnit.SECONDS);

//        executor.shutdown();  // 定时任务的线程，可以设置条件进行关闭

        System.out.println(56 + 0.);
    }
}
