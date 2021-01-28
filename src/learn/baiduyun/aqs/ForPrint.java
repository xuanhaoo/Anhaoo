package learn.baiduyun.aqs;

/**
 * @Author: liangxuanhao
 * @Description: 两个线程循环打印1-100的数，一个线程打印偶数，一个线程打印奇数
 * @Date: 2019年03月13 09:47
 */
public class ForPrint {

    public static void main(String[] args) {
        final ForPrint forPrint = new ForPrint();
        Thread t1 = new Thread(forPrint::demo1);
        Thread t2 = new Thread(forPrint::demo2);
        t1.start();
        t2.start();
    }

    public synchronized void demo1() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
            this.notify();
            try {
               this.wait();
               Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void demo2() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
            this.notify();
            try {
                this.wait();
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
