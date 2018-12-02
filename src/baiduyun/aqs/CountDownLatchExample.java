package baiduyun.aqs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch 闭锁测试
 */
public class CountDownLatchExample {


    private static int threadCount = 200;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();
        // 定义闭锁，等待200个线程
        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            final int num = i;
            executorService.execute(() -> {
                try {
                    printNum(num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown(); // 减一，代表一个线程执行完毕
                }
            });
        }
        countDownLatch.await();  // 等待线程执行完毕
        System.out.println("finish");
        // 关闭线程池
        executorService.shutdown();

    }
    private static void printNum(int num) throws InterruptedException {
        Thread.sleep(100);
        System.out.println(num);
    }
}
