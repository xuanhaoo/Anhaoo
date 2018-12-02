package baiduyun.aqs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Semaphore信号量测试
 */
public class SemaphoreExample {

    private final static int threadCount = 20;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(5); // 同时最多允许10个许可

        for (int i = 0; i < threadCount; i++) {
            final int num = i;
            executorService.execute(() -> {
                try {
                    if (semaphore.tryAcquire(2)) { // 尝试获取许可，没有获取到许可则进行丢弃
                        printNum(num);
                        semaphore.release();
                    }
//                semaphore.acquire(); // 获取到1个许可才可以操作
//                printNum(num);
//                semaphore.release();  // 释放1个许可
                } catch (Exception e) {

                } finally {

                }
            });
        }
        executorService.shutdown();

    }
    private static void printNum(int num) throws InterruptedException {
        Thread.sleep(100);
        System.out.println(num);
    }
}
