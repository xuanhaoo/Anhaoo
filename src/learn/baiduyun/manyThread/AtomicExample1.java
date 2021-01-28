package learn.baiduyun.manyThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.LongAdder;

public class AtomicExample1 {

    // 请求总数
    public static int clientTotal = 5000;

    // 同时的并发请求
    public static int threadTotal = 200;


//    public static AtomicInteger count = new AtomicInteger(0);
      public static LongAdder count = new LongAdder();
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
        for (int i = 0; i < clientTotal; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (Exception e) {

                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        System.out.println("count:" + count);

    }

    private static void add() {
//        count.incrementAndGet();
        count.increment();
    }
}
