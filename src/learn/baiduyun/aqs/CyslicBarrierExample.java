package learn.baiduyun.aqs;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CyclicBarrier 锁
 */
public class CyslicBarrierExample {
    final static CyclicBarrier cyclicBarrier = new CyclicBarrier(5);

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            final int num = i;
            Thread.sleep(500);
            executorService.execute(() -> {
                try {
                    test(num);
                } catch (Exception e) {

                }
            });
        }
        executorService.shutdown();
    }

    private static void test(int num) throws BrokenBarrierException, InterruptedException {
        System.out.println(num + "开始执行等待");
        cyclicBarrier.await();
        System.out.println(num + "互相等待结束，继续执行");
    }
}
