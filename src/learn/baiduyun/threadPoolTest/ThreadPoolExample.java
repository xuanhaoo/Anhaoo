package learn.baiduyun.threadPoolTest;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 */
public class ThreadPoolExample {


    // 任务线程数量
    static final int threadTask = 10;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
//        ExecutorService executor = Executors.newFixedThreadPool(4); // 线程数量固定的线程池：core = max
//        ExecutorService executor = Executors.newSingleThreadExecutor(); // 单线程，线程池数量只有一个

        for (int i = 0; i < threadTask; i++) {
            final int index = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("This is Task:" + index);
                }
            });
        }

        // 关闭线程池
        executor.shutdown();

    }
}
